package leetcode;
//加一
public class Code66_2 {
    public static int[] plusOne(int[] digits) {
        int index= digits.length-1;
        while (index>=0){
            digits[index]++;
            if(digits[index]!=10){
                return digits;
            }else {
                digits[index]=0;
            }
            index--;
        }
        if(index==-1&&digits[0]==0){
            int[] newArray=new int[digits.length+1];
            newArray[0]=1;
            digits=newArray;
        }
        return digits;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{1,2,3,4};
        int[] array=plusOne(nums);
        for (int i:array){
            System.out.println(i);
        }
    }
}
