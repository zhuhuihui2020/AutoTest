package leetcode;
//买卖股票的最佳时机1（只能一次买入，一次买出）
//暴力解法--超出时间限制
public class Code121 {
    public static int maxProfit(int[] prices) {
        int maxNum=0;
        for(int i=0;i<prices.length-1;i++){
            for(int j=i+1;j<prices.length;j++){
                if(prices[j]-prices[i]>maxNum){
                    maxNum=prices[j]-prices[i];
                }
            }
        }
        return maxNum;
    }

    public static void main(String[] args) {
        int[] prices=new int[]{7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }
}
