# KnapsackProblemSolver
KnapsackProblemSolver is a Spring Boot-based web application that solves the Fractional Knapsack Problem, a popular algorithmic problem in optimization. This application takes user input (item values, weights, and knapsack capacity) via a user-friendly web interface and calculates the maximum possible value that can be carried in the knapsack.

# Features:
Fractional Knapsack Algorithm Implementation: Efficiently calculates the maximum value that can fit into the knapsack using the greedy approach.

User-Friendly Web Interface: Input item values, weights, and knapsack capacity directly through an interactive HTML page.

Dynamic Backend: The backend logic is implemented in Java with Spring Boot, ensuring fast and reliable calculations.

REST API Support: Exposes a RESTful endpoint for solving the knapsack problem programmatically.

Responsive Design: Designed for optimal usability across devices.

Cross-Origin Support: Allows seamless integration with external applications.

![output](https://github.com/user-attachments/assets/3968a452-e886-4bcc-af12-d458401fa1ef)

# Technologies Used:
Backend: Java, Spring Boot
Frontend: HTML, CSS, JavaScript
Build Tool: Maven
API Testing: Postman
Deployment: Local server using Spring Boot

# How It Works:
1. Users input the total number of items, their respective values, weights, and the knapsack capacity via a web form.
2. The backend computes the maximum value using the Fractional Knapsack algorithm:
     Sorts items based on their value-to-weight ratio.
     Adds items to the knapsack, prioritizing higher ratios until the capacity is reached.
3. The result is displayed on the web page, showing the maximum total value achievable.
