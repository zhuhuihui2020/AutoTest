package plan;

import java.util.*;

/**
 * 给你一个字符数组 chars ，请使用下述算法压缩：
 *
 * 从一个空字符串 s 开始。对于 chars 中的每组 连续重复字符 ：
 *
 *     如果这一组长度为 1 ，则将字符追加到 s 中。
 *     否则，需要向 s 追加字符，后跟这一组的长度。
 *
 * 压缩后得到的字符串 s 不应该直接返回 ，需要转储到字符数组 chars 中。
 * 需要注意的是，如果组长度为 10 或 10 以上，则在 chars 数组中会被拆分为多个字符。
 *
 * 请在 修改完输入数组后 ，返回该数组的新长度。
 *
 * 你必须设计并实现一个只使用常量额外空间的算法来解决此问题。
 */
public class Code443 {
    public static int compress(char[] chars) {
        int write=0;
        int left=0;
        for(int read=0;read<chars.length;read++){
            if (read==chars.length-1||chars[read]!=chars[read+1]){
                int length=read-left+1;
                chars[write++]=chars[read];
                String s=Integer.toString(length);
                if(length>1){
                    for(int i=0;i<s.length();i++){
                        chars[write++]=s.charAt(i);
                    }
                }
                left=read+1;
            }
        }
        return write;
    }

    public static void main(String[] args) {
//        char[] chars=new char[]{'a','a','b','b','c','c','c'};
//        char[] chars=new char[]{'a'};
        char[] chars=new char[]{'a','b','b','b','b','b','b','b','b','b','b','b','b'};
//        char[] chars=new char[]{'a','a','a','b','b','a','a'};
        System.out.println(compress(chars));
    }
}
