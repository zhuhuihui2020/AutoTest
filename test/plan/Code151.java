package plan;

import java.util.ArrayList;
import java.util.List;

public class Code151 {
    public static String reverseWords(String s) {
        s=s.trim();
        String[] strs=s.split("\\s+");
        StringBuilder sb=new StringBuilder();
        int left=0;
        int right=strs.length-1;
        while (left<right){
            String str=strs[left];
            strs[left]=strs[right];
            strs[right]=str;
            left++;
            right--;
        }
        for(int i=0;i<strs.length;i++){
            sb.append(strs[i]);
            if(i<strs.length-1){
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public static String rev(String str){
        char[] arr=str.toCharArray();
        int left=0;
        int right=arr.length-1;
        while(left<right){
           char c=arr[left];
           arr[left]=arr[right];
           arr[right]=c;
           left++;
           right--;
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        reverseWords("      111  ");
    }
}
