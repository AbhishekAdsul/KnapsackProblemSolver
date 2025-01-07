document.addEventListener("DOMContentLoaded", () => {
    const itemsContainer = document.getElementById("items-container");
    const addItemButton = document.getElementById("add-item");
    const knapsackForm = document.getElementById("knapsack-form");
    const resultParagraph = document.getElementById("result");

    let itemCount = 0;

    addItemButton.addEventListener("click", () => {
        itemCount++;
        const itemDiv = document.createElement("div");
        itemDiv.innerHTML = `
            <label for="item-${itemCount}-value">Item ${itemCount} Value:</label>
            <input type="number" id="item-${itemCount}-value" required>
            <label for="item-${itemCount}-weight">Item ${itemCount} Weight:</label>
            <input type="number" id="item-${itemCount}-weight" required>
        `;
        itemsContainer.appendChild(itemDiv);
    });

    knapsackForm.addEventListener("submit", async (e) => {
        e.preventDefault();

        const capacity = document.getElementById("capacity").value;
        const items = [];

        for (let i = 1; i <= itemCount; i++) {
            const value = document.getElementById(`item-${i}-value`).value;
            const weight = document.getElementById(`item-${i}-weight`).value;
            items.push({ value: parseInt(value), weight: parseInt(weight) });
        }

        const response = await fetch("http://localhost:8080/api/knapsack/max-value", {
            method: "POST",
            headers: { "Content-Type": "application/json" },
            body: JSON.stringify({ items, capacity: parseInt(capacity) }),
        });

        const maxValue = await response.json();
        resultParagraph.textContent = `Maximum Total Value: ${maxValue}`;
    });
});
