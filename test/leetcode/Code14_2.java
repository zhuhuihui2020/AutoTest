package leetcode;
//最长公共前缀--纵向扫描,稍微改进一下
public class Code14_2 {
    public static String longestCommonPrefix(String[] strs) {
        for (String str :strs) {
            if(str.equals("")){
                return "";
            }
        }
        if(strs.length==1){
            return strs[0];
        }
        int minIndex=0;
        for (int i=0;i<strs.length-1;i++){
            if(strs[i+1].length()<strs[minIndex].length()){
                minIndex=i+1;
            }
        }
        StringBuilder str=new StringBuilder();
        int j=0;
        //截取的长度使用i+1即可
        for(int i=0;i<strs[minIndex].length();i++){
            j=0;
            while (j<= strs.length-1){
                //改进这里，不用substring了，用charAt
                if(strs[minIndex].charAt(i)==(strs[j].charAt(i))){
                    j++;
                }else {
                    //这个break，是停止了之后的字符对于前缀的判断，因为已经有字符不满足该前缀了
                    break;
                }
            }
            //这个break，是停止了对最短字符串的截取
            if(j!= strs.length){
                break;
            }else {
                str.append(strs[minIndex].charAt(i));
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        String[] strs=new String[]{"a","a","aabc","aa","acc"};
        System.out.println("公共前缀："+longestCommonPrefix(strs));
    }
}
