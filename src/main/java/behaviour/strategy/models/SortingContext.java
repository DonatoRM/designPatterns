package behaviour.strategy.models;

public class SortingContext {
    private SortingStrategy strategy;

    public void setStrategy(SortingStrategy strategy) {
        this.strategy = strategy;
    }

    public void sortingData(int[] data) {
        strategy.sort(data);
    }
}
