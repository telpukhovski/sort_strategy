import org.junit.Assert;

import java.util.Arrays;

public class SortingContext {
    Sorter sortStrategy;

    public void setSortStrategy(Sorter sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public void execute(int[] array) {
        sortStrategy.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
