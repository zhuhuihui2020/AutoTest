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

//解法不对，因为存在["a","a","a","b","b","a","a"]的数组，这种时候，前面的a和后面的a是两组
public class Code443_wrong {
    public static int compress(char[] chars) {
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<chars.length;i++){
            char c=chars[i];
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int length=0;
        int index=0;
        Iterator<Map.Entry<Character,Integer>> iterator=map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Character,Integer> entry=iterator.next();
            int num=entry.getValue();
            char c=entry.getKey();
            chars[index++]=c;
            length++;
            int yushu=num;
            if(num>1){
                List<Integer> list=new ArrayList<>();
                while (num!=0){
                    yushu=num%10;
                    num=num/10;
                    list.add(yushu);
                    length++;
                }
                for(int i=list.size()-1;i>=0;i--){
                    String s=String.valueOf(list.get(i));
                    chars[index++]=s.charAt(0);
                }
            }
        }
        return length;
    }

    public static void main(String[] args) {
        char[] chars=new char[]{'a','b','b','b','b','b','b','b','b','b','b','b','b','c','c','c','d'};
//        char[] chars=new char[]{'a'};
//        char[] chars=new char[]{'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        System.out.println(compress(chars));
    }
}
