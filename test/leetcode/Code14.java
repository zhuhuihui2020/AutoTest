package leetcode;

public class Code14 {
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
//        StringBuffer str=new StringBuffer();
        //将StringBuffer换成StringBuilder，性能更高
        StringBuilder str=new StringBuilder();
        int j=0;
        //截取的长度使用i+1即可
        for(int i=0;i<strs[minIndex].length();i++){
            str.append(strs[minIndex].charAt(i));
            j=0;
            while (j<= strs.length-1){
                if(str.toString().equals(strs[j].substring(0,i+1))){
                    j++;
                }else {
                    //这个break，是停止了之后的字符对于前缀的判断，因为已经有字符不满足该前缀了
                    break;
                }
            }
            //这个break，是停止了对最短字符串的截取
            if(j!= strs.length){
                break;
            }
        }
        //如果判断到了最后，j等于数组长度，说明最短的那个字符串，刚好就是最长的前缀；不然就不是，就相当于多判断了一次，所以需要往前截取一个字符
        if(j==strs.length){
            return str.toString();
        }else {
            return str.substring(0,str.length()-1);
        }
    }

    public static void main(String[] args) {
        String[] strs=new String[]{"a","a","aabc","aa","acc"};
        System.out.println("公共前缀："+longestCommonPrefix(strs));
    }
}
