package cyc2018.string;

/**
 * 给定一个包含大写字母和小写字母的字符串 s ，返回 通过这些字母构造成的 最长的回文串 。
 *
 * 在构造过程中，请注意 区分大小写 。比如 "Aa" 不能当做一个回文字符串。
 */
public class Code409 {
    public static int longestPalindrome(String s) {
        int[] arr=new int[52];
        int length=s.length();
        for(int i=0;i<length;i++){
            char c=s.charAt(i);
            //'A'的ascii码为65，'a'的ascii码为97
            if(c>=97){
                arr[s.charAt(i)-'a']++;
            }else {
                arr[s.charAt(i)-'A'+26]++;
            }
        }
        //记录单数，最后计算最长回文串的时候，只能算一个最大的数--不对，单数可以取双数的值，不是只能取最大值
        int danshu=0;
        //记录双数，最后计算最长回文串的时候，可以都算上
        int shuangshu=0;
        boolean flag=false;
        for(int i=0;i<52;i++){
            //偶数直接加上
            if(arr[i]!=0&&arr[i]%2==0){
                shuangshu+=arr[i];
            }else if(arr[i]%2==1){
                //奇数把双数的数值加上
                flag=true;
                danshu+=arr[i]-1;
            }
        }
        if(flag){
            return shuangshu+danshu+1;
        }else{
            return shuangshu+danshu;
        }
    }

    public static void main(String[] args) {
//        System.out.println(longestPalindrome("civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth"));
//        System.out.println(longestPalindrome("qqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM"));
//        System.out.println(longestPalindrome("qqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm"));
        System.out.println(longestPalindrome("qqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnm"));
    }
}
