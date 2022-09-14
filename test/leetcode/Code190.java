package leetcode;
//颠倒二进制位

/**
 * 二进制：以0b开头（零和b）的数表示二进制
 *
 * 八进制：以"0"(零)开头的数表示八进制
 *
 * 十进制：平时表示的方法便是十进制
 *
 * 十六进制：以0x开头的数便是十六进制
 */

/**
 * java中求方函数pow(double a, double b)-->平方pow(x,2) 立方pow(x,3)
 * 开方函数sqrt(double a)
 * 绝对值函数abs(x)
 */
public class Code190 {
    // you need treat n as an unsigned value
    public static int reverseBits(int n) {
        String x=Integer.toBinaryString(n);
        StringBuilder sb=new StringBuilder(x);
        sb.reverse();
        System.out.println(sb);
        int sum=0;
        int beishu=32-sb.length();
        boolean flag=true;
        if(sb.charAt(0)=='1'){
            System.out.println("111");
            flag=false;
            for (int i=1;i<sb.length();i++){
                if(sb.charAt(i)=='0'){
                    sb.replace(i,i+1,"1");
                }else {
                    sb.replace(i,i+1,"0");
                }
            }
            for(int i=sb.length()-1;i>0;i--){
                if(sb.charAt(i)=='0'){
                    sb.replace(i,i+1,"1");
                    break;
                }else {
                    sb.replace(i,i+1,"0");
                }
            }
        }
        System.out.println("sb:::"+sb);
        if(sb.toString().equals("1")){
            return -2147483648;
        }
        for(int i=sb.length()-1;i>0;i--){
            int num=(sb.charAt(i)=='1')?1:0;
            sum+=Math.pow(2,beishu++)*num;
            System.out.println("sum:"+sum);
        }
        return flag?sum:(-sum);
    }

    public static void main(String[] args) {
        //二进制：以0b开头（零和b）的数表示二进制
        System.out.println(reverseBits(0b00000000000000000000000000000001));
//        System.out.println(reverseBits(0b11111111111111111111111111111101));
    }
}
