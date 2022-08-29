public class Main {
    public static void main(String[] args) {

        int[] sales = {45, 17, 35, 40, 51, 23, 54, 88, 4, 77};
        SalesManages sale = new SalesManages(sales);
        int maxSale = sale.max();
        print(maxSale);

    }

    public static void print(int value) {
        System.out.println(value);

    }

}
