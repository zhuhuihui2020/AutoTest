package leetcode;

import java.util.ArrayList;
import java.util.List;

//杨辉三角
public class Code118 {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list=new ArrayList<>();
        ArrayList<Integer> array=new ArrayList<>();
        array.add(1);
        list.add(array);
        if(numRows==1){
            return list;
        }
        for(int i=1;i<numRows;i++){
            array=new ArrayList<>(i);
            array.add(1);
            for(int j=1;j<i;j++){
                array.add(list.get(i-1).get(j)+list.get(i-1).get(j-1));
            }
            array.add(1);
            list.add(array);
        }
        return list;
    }

    public static void main(String[] args) {
        int num=4;
        List<List<Integer>> list = generate(num);
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(list.get(i).get(j) + "  ");
            }
            System.out.println();
        }
    }
}
