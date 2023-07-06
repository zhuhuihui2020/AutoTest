package plan;

import javax.lang.model.element.NestingKind;
import java.util.*;

/**
 * 如果可以使用以下操作从一个字符串得到另一个字符串，则认为两个字符串 接近 ：
 *
 *     操作 1：交换任意两个 现有 字符。
 *         例如，abcde -> aecdb
 *     操作 2：将一个 现有 字符的每次出现转换为另一个 现有 字符，并对另一个字符执行相同的操作。
 *         例如，aacabb -> bbcbaa（所有 a 转化为 b ，而所有的 b 转换为 a ）
 *
 * 你可以根据需要对任意一个字符串多次使用这两种操作。
 *
 * 给你两个字符串，word1 和 word2 。如果 word1 和 word2 接近 ，就返回 true ；否则，返回 false 。
 */
//其实本质的问题，是要判断出所有的字母的个数集合是不是都完全匹配
//不仅要判断个数集合，还需要判断一下字母的种类集合是不是一样
//因为操作1和2都是针对"现有"字符，所以字符种类不一样，怎么都换不过去
//这个写的不对
public class Code1657_wrong {
    public boolean closeStrings(String word1, String word2) {
        List list1=new ArrayList<>();
        List list2=new ArrayList<>();
        Map<Character,Integer> map1=new HashMap<>();
        Map<Character,Integer> map2=new HashMap<>();
        int length1=word1.length();
        int length2=word2.length();
        if(length1!=length2){
            return false;
        }

        char str;
        for(int i=0;i<length1;i++){
            str=word1.charAt(i);
            map1.put(str,map1.getOrDefault(str,0)+1);
        }
        Iterator iterator1=map1.keySet().iterator();
        while (iterator1.hasNext()){
            Character c= (Character) iterator1.next();
            System.out.println("c:"+c);
            list1.add((int)c);
            list1.add(map1.get(c));
        }
        System.out.println("qqqqqqqq");
        Collections.sort(list1);
        System.out.println("2222222222");

        for(int i=0;i<length2;i++){
            str=word2.charAt(i);
            map2.put(str,map2.getOrDefault(str,0)+1);
        }
        Iterator iterator2=map2.keySet().iterator();
        while (iterator2.hasNext()){
            Character c=(Character) iterator2.next();
            list2.add((int)c);
            list2.add(map2.get(c));
        }
        Collections.sort(list2);
        for(int i=0;i<list1.size();i++){
            System.out.println(list1.get(i));
        }
        System.out.println("-----------");
        for(int i=0;i<list1.size();i++){
            System.out.println(list2.get(i));
        }
        return list1.equals(list2);
    }
}
