package leetcode;
//反转字符串
public class Code344 {
    public static void reverseString(char[] s) {
        for(int i=0;i<s.length/2;i++){
            char tmp;
            tmp=s[i];
            s[i]=s[s.length-i-1];
            s[s.length-i-1]=tmp;
        }
    }

    //双指针
    public static void reverseString2(char[] s) {
        int left=0;
        int right=s.length-1;
        while(left<right){
            char tmp;
            tmp=s[left];
            s[left]=s[right];
            s[right]=tmp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        char[] s=new char[]{'h','e','l','l','o'};
        reverseString2(s);
        for(char c:s){
            System.out.println(c);
        }
    }
}
