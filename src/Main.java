public class Main {
    public static void main(String[] args) {

        long[] sales = {10, 20, 30, 100, 7, 45, 5};

        SalesManager salesManager = new SalesManager(sales);

        long max = salesManager.max();
        long min = salesManager.min();
        long sum = salesManager.sum();

        for (int i = 0; i < sales.length; i++) {
            System.out.print(sales[i] + ", ");
        }
        System.out.println("\n Максимальный: " + max);
        System.out.println("Средний " +
                "без учета минимального " +
                "и макимального: " + (sum - max - min) / (sales.length - 2));
    }
}
