package plan;

/**
 * 给你字符串 s 和整数 k 。
 *
 * 请返回字符串 s 中长度为 k 的单个子字符串中可能包含的最大元音字母数。
 *
 * 英文中的 元音字母 为（a, e, i, o, u）。
 */
//超出时间限制--改进一下--再优化一下
public class Code1456_3 {
    public static int maxVowels(String s, int k) {
        int length=s.length();
        if(length<=k){
            return getCount(s,0,length-1);
        }
        int left=0;
        int right=k-1;
        int res=getCount(s,left,right);
        left++;
        right++;
        int tmp=res;
        while (right<length){
            tmp+=isTrue(s.charAt(right))-isTrue(s.charAt(left-1));
            res=Math.max(tmp,res);
            if(res==k){
                return res;
            }
            left++;
            right++;
        }
        return res;
    }

    public static int getCount(String s,int left,int right){
        int count=0;
        for(int i=left;i<=right;i++){
            if("aeiouAEIOU".indexOf(s.charAt(i))>=0){
                count++;
            }
        }
        return count;
    }

    public static int isTrue(char c){
        return "aeiouAEIOU".indexOf(c)>=0?1:0;
    }

    public static void main(String[] args) {
        String s="tryhard";
        int k=4;
        System.out.println(maxVowels(s,4));
    }

}
