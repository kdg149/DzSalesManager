public class Main {
    public static void main(String[] args) {

        long[] sales = {10, 20, 30, 100, 7, 45, 5};

        SalesManager salesManager = new SalesManager(sales);

        long average = salesManager.average();

        for (int i = 0; i < sales.length; i++) {
            System.out.print(sales[i] + ", ");
        }
        System.out.println("\n Обрезанный средний  " + average);
    }
}
