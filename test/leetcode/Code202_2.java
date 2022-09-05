package leetcode;
//快乐数
//快慢指针判断是否循环
public class Code202_2 {
    public static boolean isHappy(int n) {
        int slow=n;
//        int fast=getNext(n);
//        while (fast!=1&&fast!=slow){
//            slow=getNext(slow);
//            fast=getNext(getNext(fast));
//        }
        int fast=n;
        do{
            slow=getNext(slow);
            fast=getNext(getNext(fast));
        }while (fast!=1&&fast!=slow);
        return fast==1;
    }

    public static int getNext(int n){
        int sum=0;
        while (n!=0){
            sum=sum+(int)Math.pow(n%10,2);
            n=n/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
}
