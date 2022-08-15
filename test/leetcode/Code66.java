package leetcode;

import java.util.ArrayList;

//加一
//这个做法会报错NumberFormatException: For input string: "9876543210"
public class Code66 {
    public static int[] plusOne(int[] digits) {
        if(digits[0]==0){
            return new int[]{1};
        }
        StringBuilder sb=new StringBuilder();
        for(int i:digits){
            sb.append(i);
        }
        int num=Integer.parseInt(sb.toString())+1;
        System.out.println(num);
        ArrayList list=new ArrayList();
        //除数
        int chushu=10;
        //余数
        int yushu=0;
        while (num>0){
            yushu=num%chushu;
            num=num/chushu;
            list.add(yushu);
        }
        int[] newArray=new int[list.size()];
        for(int i= 0;i<list.size();i++){
            newArray[i]=(int)list.get(list.size()-i-1);
        }
        return newArray;
    }

    public static void main(String[] args) {
        plusOne(new int[]{9,8,7,6,5,4,3,2,1,0});
    }
}
