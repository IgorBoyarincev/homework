public class SalesManages {
    protected int[]sales;
    public SalesManages(int[]sales){
       this.sales=sales;
    }
    public int max(){
        int max=-1;
        for(int sale:sales){
            if(sale>max){
                max=sale;
            }
        }
        return max;
    }
}
