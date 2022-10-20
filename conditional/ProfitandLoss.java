package tasl4;

public class ProfitandLoss {
    static  int Profit (int costprice, int sellingprice) {
        int profit = (sellingprice - costprice);
        return profit;
    }
    static  int Loss (int sellingprice , int costprice) {
        int Loss = (costprice - sellingprice);
        return Loss;
    }
    public static void main(String[] args) {
         int costprice = 500;
         int sellingprice = 700;
         if ( sellingprice == costprice)
             System.out.println("No profit nor Loss");
         else if (sellingprice > costprice)
             System.out.println(Profit(costprice, sellingprice)+ " you can book ur Profit");
         else
             System.out.println(Loss(costprice, sellingprice)+"Loss");
         }
}
