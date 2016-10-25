package StockPrice;

/**
 * Created by knoma on 10/17/16.
 */
public class StockPrice {

    public static void main(String[] args) {
        int[] stockPricesYesterday = {10, 7, 5, 8, 11,9};

        int profit = getMaxProfit(stockPricesYesterday);
        System.out.println(profit);
        System.out.println(getMaxProfitBrutForce(stockPricesYesterday));
        System.out.println(getMaxProfitOptimal(stockPricesYesterday));
    }

    private static int getMaxProfit(int[] stockPricesYesterday) {

        int profit = 0;
        int minStockPrice = Integer.MAX_VALUE;

        for (int i = 0; i < stockPricesYesterday.length; i++) {
            profit = Math.max(profit, stockPricesYesterday[i] - minStockPrice);
            minStockPrice = Math.min(minStockPrice, stockPricesYesterday[i]);
        }


        return profit;
    }

    private static int getMaxProfitBrutForce(int[] array){

        int maxProfit =0;

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length; j++) {
                int max = Math.max(i, j);
                int min = Math.min(i, j);

                int earlier = array[min];
                int later = array[max];

                int potenaialProfit = later - earlier;
                maxProfit = Math.max(maxProfit,potenaialProfit);
            }
        }
        return maxProfit;
    }

    private static int getMaxProfitOptimal(int[] array){
        if (array.length < 2){
            throw new IllegalArgumentException("no enough data");
        }

        int minPrice = array[0];
        int maxProfit = array[1] - minPrice;

        for (int i = 1; i < array.length; i++) {
            int current = array[i];

            int potentialProfit = current - minPrice;

            maxProfit = Math.max(maxProfit, potentialProfit);
            minPrice = Math.min(minPrice, current);

        }
        return maxProfit;
    }
}
