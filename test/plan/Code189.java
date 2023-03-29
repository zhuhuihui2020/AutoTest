package plan;

import java.util.HashMap;

/**
 * 给定一个整数数组 nums，将数组中的元素向右轮转 k 个位置，其中 k 是非负数。
 */
//使用map存一下下标和值
// 数组长度为7，下标是6，k=3
// 0-->3
// 6-->2
// 5-->1
public class Code189 {
    public void rotate(int[] nums, int k) {
        int length=nums.length;
        //取余，数组轮转到数组的长度又回到原位置了
        int kk=k%length;
        //kk=0,说明不用轮转
        if(kk==0){
            return;
        }
        //键为下标，值为数组元素
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<length;i++){
            if(i+kk<length){
                map.put(i+kk,nums[i]);
            }else {
                map.put(kk-(length-i),nums[i]);
            }
        }
        for(int i=0;i<length;i++){
            nums[i]=map.get(i);
        }
    }
}
