public class Statistic {
    protected int[] sales;

    public Statistic(int[] sales) {
        this.sales = sales;
    }

    public int cuttedAverage() {
        int min = 1000000;
        int max = -100;
        int sum = 0;
        for (int sale : sales) {
            if (min > sale) {
                min = sale;
            } else if (max < sale) {
                max = sale;
            }
            sum += sale;
        }
        int result = (sum - max - min) / (sales.length - 2);
        return result;
    }
}
