package leetcode;

import java.util.Stack;

//买卖股票的最佳时机1（只能一次买入，一次买出）
//借助栈这个数据结构，其实也不用借助，只需要维护一个最小的price就行了
public class Code121_2 {
    public static int maxProfit(int[] prices) {
        Stack<Integer> stack=new Stack();
        int maxNum=0;
        stack.push(prices[0]);
        for(int i=1;i<prices.length;i++){
            if(stack.get(0)>prices[i]){
                stack.pop();
                stack.push(prices[i]);
            }else{
                int num=prices[i]-stack.peek();
                if(num>maxNum){
                    maxNum=num;
                }
            }
        }
        return maxNum;
    }

    public static void main(String[] args) {
        int[] prices=new int[]{7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
