package leetcode;

import java.util.ArrayList;
import java.util.List;

//杨辉三角
//对角线
public class Code118_2 {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list=new ArrayList<>();
        ArrayList<Integer> array;
        for(int i=0;i<numRows;i++){
            array=new ArrayList<>();
            for(int j=0;j<i+1;j++){
                if(j==0||i==j){
                    array.add(1);
                }else{
                    array.add(list.get(i-1).get(j)+list.get(i-1).get(j-1));
                }
            }
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
