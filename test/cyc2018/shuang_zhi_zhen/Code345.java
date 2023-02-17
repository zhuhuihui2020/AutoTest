package cyc2018.shuang_zhi_zhen;

/**
 * 给你一个字符串 s ，仅反转字符串中的所有元音字母，并返回结果字符串。
 *
 * 元音字母包括 'a'、'e'、'i'、'o'、'u'，且可能以大小写两种形式出现不止一次。
 */
public class Code345 {
    public static String reverseVowels(String s) {
        char[] array=s.toCharArray();
        int left=0;
        int right=array.length-1;
        while (left<right){
            while (left<right&&!isYuanyin(array[left])){
                System.out.println(array[left]);
                left++;
            }
            while (left<right&&!isYuanyin(array[right])){
                System.out.println(array[right]);
                right--;
            }
            swap(array,left,right);
            if(left<right){
                left++;
                right--;
            }
        }
        return new String(array);
    }

    public static boolean isYuanyin(char c){
//        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
//            return true;
//        }
//        return false;
        return "aeiouAEIOU".indexOf(c)>=0;
    }

    public static void swap(char[] array,int left,int right){
        System.out.println("111"+array[left]);
        System.out.println("111"+array[right]);
        char tmp=array[left];
        array[left]=array[right];
        array[right]=tmp;

    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));
    }
}
