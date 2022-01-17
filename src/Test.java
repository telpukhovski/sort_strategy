import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] array = new int[]{28, 17, 5, 16, 3, 9};
        int[] array1 = new int[]{12, 1, 231, 32, 3214};
        SortingContext context = new SortingContext();
        context.setSortStrategy(new SelectionSort());
        context.execute(array);
        context.setSortStrategy(new BubbleSort());
        context.execute(array1);
    }
}