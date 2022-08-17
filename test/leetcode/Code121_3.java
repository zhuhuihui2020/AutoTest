package leetcode;
//买卖股票的最佳时机1（只能一次买入，一次买出）
//不借助stack，只需要维护一个最小的price就行了
public class Code121_3 {
    public static int maxProfit(int[] prices) {
        int minPrice=Integer.MAX_VALUE;
        int maxNum=0;
        for(int price:prices){
            if(minPrice>price){
                minPrice=price;
            }else if(price-minPrice>maxNum){
                maxNum=price-minPrice;
            }
        }
        return maxNum;
    }

    public static void main(String[] args) {
        int[] prices=new int[]{7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
