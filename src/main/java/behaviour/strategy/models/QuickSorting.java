package behaviour.strategy.models;

public class QuickSorting implements SortingStrategy {
    private int partition(int[] data, int low, int high) {
        int pivot = data[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (data[j] < pivot) {
                i++;
                int temp = data[i];
                data[i] = data[j];
                data[j] = temp;
            }
        }
        int temp = data[i + 1];
        data[i + 1] = data[high];
        data[high] = temp;
        return i + 1;
    }

    private void quickSort(int[] date, int low, int high) {
        if (low < high) {
            int pivot = partition(date, low, high);
            quickSort(date, low, pivot - 1);
            quickSort(date, pivot + 1, high);
        }
    }

    @Override
    public void sort(int[] data) {
        quickSort(data, 0, data.length - 1);
    }
}
