public class Main {
    public static void main(String[] args) {
        int[] sale = {45, 17, 35, 40, 51, 23, 54, 88, 4, 77};
        SalesManages sales = new SalesManages(sale);
        int maxSale = sales.max();
        print(maxSale);
    }

    public static void print(int value) {
        System.out.println("max sale: " + value);
    }

}
