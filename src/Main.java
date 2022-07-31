import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] sales = {10, 20, 30, 0, -5, 45, 5};

        for (int i = 0; i < sales.length; i++) {
            System.out.print(sales[i] + ", ");
        }
        System.out.println("\n" + Arrays.stream(sales).max());
    }
}
