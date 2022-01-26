public class SortingContext {
    Sorter sortStrategy;

    public void setSortStrategy(Sorter sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public void execute(int[] array) {
        sortStrategy.sort(array);
    }
}
