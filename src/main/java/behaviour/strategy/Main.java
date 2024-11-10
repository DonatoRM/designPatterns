package behaviour.strategy;

import behaviour.strategy.models.BubbleSorting;
import behaviour.strategy.models.QuickSorting;
import behaviour.strategy.models.SelectionSorting;
import behaviour.strategy.models.SortingContext;

import java.util.Arrays;

public class Main {
    public static void main() {
        SortingContext context = new SortingContext();

        int[] data = {64, 34, 25, 12, 22, 11, 90};

        context.setStrategy(new BubbleSorting());
        context.sortingData(data);
        System.out.printf("Datos ordenados con Burbuja: %s\n", Arrays.toString(data));

        data = new int[]{64, 34, 25, 12, 22, 11, 90};

        context.setStrategy(new SelectionSorting());
        context.sortingData(data);
        System.out.printf("Datos ordenados por Selección: %s\n", Arrays.toString(data));

        data = new int[]{64, 34, 25, 12, 22, 11, 90};

        context.setStrategy(new QuickSorting());
        context.sortingData(data);
        System.out.printf("Datos ordenados con Rápido: %s\n", Arrays.toString(data));

    }
}
