package leetcode;

public class Code171 {
    public int titleToNumber(String columnTitle) {
        char[] chars=columnTitle.toCharArray();
        int num=0;
        int sum=0;
        for(int i=chars.length-1;i>=0;i--){
            int k=(int)(Math.pow(26,num));
            sum=(chars[i]-'A'+1)*k+sum;
            num++;
        }
        return sum;
    }
}
