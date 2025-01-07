package abhishek.knapsackapplication.service;

import java.util.Arrays;
import java.util.Comparator;

import org.springframework.stereotype.Service;

import abhishek.knapsackapplication.model.Item;

@Service
public class KnapsackService {

    public double getMaxValue(Item[] items, int capacity) {
        double[][] ratio = new double[items.length][2];

        for (int i = 0; i < items.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = (double) items[i].getValue() / items[i].getWeight();
        }

        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        double maxTotalValue = 0;

        for (int i = items.length - 1; i >= 0; i--) {
            int index = (int) ratio[i][0];
            if (capacity >= items[index].getWeight()) {
                maxTotalValue += items[index].getValue();
                capacity -= items[index].getWeight();
            } else {
                maxTotalValue += ratio[i][1] * capacity;
                break;
            }
        }

        return maxTotalValue;
    }
}
