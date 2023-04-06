package plan;

/**
 * 给定一个字符串 s ，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
 */
public class Code557_2 {
    public String reverseWords(String s) {
        String[] strArr=s.split(" ");
        for(int i=0;i<strArr.length;i++){
            char[] c=rev(strArr[i]);
            strArr[i]=new String(c);
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<strArr.length;i++){
            sb.append(strArr[i]);
            if(i<strArr.length-1){
                sb.append(" ");
            }
        }
        return new String(sb);
    }

    public static char[] rev(String str){
        char[] arr=str.toCharArray();
        int left=0;
        int right=arr.length-1;
        while (left<right){
            char tmp=arr[left];
            arr[left]=arr[right];
            arr[right]=tmp;
            left++;
            right--;
        }
        return arr;
    }
}
