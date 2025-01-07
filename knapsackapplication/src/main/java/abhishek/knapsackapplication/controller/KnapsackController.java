package abhishek.knapsackapplication.controller;

import abhishek.knapsackapplication.service.KnapsackService;
import abhishek.knapsackapplication.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/knapsack")
@CrossOrigin(origins = "*")
public class KnapsackController {

    @Autowired
    private KnapsackService knapsackService;

    @PostMapping("/max-value")
    public double getMaxKnapsackValue(@RequestBody KnapsackRequest request) {
        return knapsackService.getMaxValue(request.getItems(), request.getCapacity());
    }

    public static class KnapsackRequest {
        private Item[] items;
        private int capacity;

        public Item[] getItems() {
            return items;
        }

        public void setItems(Item[] items) {
            this.items = items;
        }

        public int getCapacity() {
            return capacity;
        }

        public void setCapacity(int capacity) {
            this.capacity = capacity;
        }
    }
}
