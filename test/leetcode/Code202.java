package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
//快乐数
//用集合
public class Code202 {
    public static boolean isHappy(int n) {
        HashSet<Integer> set=new HashSet<>();
        int sum=0;
        int chushu=10;
        while (sum!=1){
            sum=0;
            ArrayList<Integer> clist=new ArrayList<>();
            while (n!=0){
                int yushu=n%chushu;
                n=n/10;
                clist.add(yushu);
            }
            for(int i=0;i<clist.size();i++){
                sum+=Math.pow(clist.get(i),2);
            }
            if(sum==1){
                return true;
            }
            if(!set.add(sum)){
                return false;
            }
            n=sum;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }
}