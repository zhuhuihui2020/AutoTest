package plan;

import java.util.HashSet;
import java.util.Set;

/**
 * 假设有一个很长的花坛，一部分地块种植了花，另一部分却没有。可是，花不能种植在相邻的地块上，它们会争夺水源，两者都会死去。
 *
 * 给你一个整数数组  flowerbed 表示花坛，由若干 0 和 1 组成，其中 0 表示没种植花，1 表示种植了花。
 * 另有一个数 n ，能否在不打破种植规则的情况下种入 n 朵花？能则返回 true ，不能则返回 false。
 */
public class Code605_2 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        Set<Integer> set=new HashSet<>();
        int length=flowerbed.length;
        for(int i=0;i<length;i++){
            if(flowerbed[i]==1){
                set.add(i);
                if(i+1<length){
                    set.add(i+1);
                }
                if(i-1>=0) {
                    set.add(i - 1);
                }
            }
        }
        int count=0;
        for(int i=0;i<length;i++){
            if(!set.contains(i)){
                count++;
                set.add(i);
                if(i+1<length){
                    set.add(i+1);
                }
                if(i-1>=0) {
                    set.add(i-1);
                }
            }
            if(count>=n){
                return true;
            }
        }
        return false;
    }
}
