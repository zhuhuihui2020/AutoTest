package leetcode;
//汉明距离
//目前不对
public class Code461 {
    public static int hammingDistance(int x, int y) {
        String x1=Integer.toBinaryString(x);
        System.out.println(x1);
        String y1=Integer.toBinaryString(y);
        System.out.println(y1);
        int count=0;
        for (int i=0;i<8;i++){
            if (x1.charAt(i)!=y1.charAt(i)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        hammingDistance(1,4);
    }
}
