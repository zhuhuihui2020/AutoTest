package plan;

/**
 * 给你一个字符串 s ，仅反转字符串中的所有元音字母，并返回结果字符串。
 *
 * 元音字母包括 'a'、'e'、'i'、'o'、'u'，且可能以大小写两种形式出现不止一次。
 */
public class Code345 {
    public String reverseVowels(String s) {
        int left=0;
        int right=s.length()-1;
        char[] arr=s.toCharArray();
        while (left<right){
            while(left<right&&!isYuan(arr[left])){
                left++;
            }
            while (left<right&&!isYuan(arr[right])){
                right--;
            }
            if(left<right){
                swap(arr,left,right);
                left++;
                right--;
            }
        }
        return new String(arr);
    }

    public boolean isYuan(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
            return true;
        }
        return false;
    }

    public void swap(char[] arr,int left,int right){
        char c=arr[left];
        arr[left]=arr[right];
        arr[right]=c;
    }
}
