package leetcode;

import java.util.ArrayList;
import java.util.List;
//杨辉三角
public class Code118_3 {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>();
        ArrayList<Integer> row=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            //精髓
            /**
             * list.add(int index,object o)
             * 向指定位置添加对象，后面添加的对象依次向后添加。
             * list.add(object o)
             * 在不指定位置的情况下插入到list的末尾。
             */
            row.add(0,1);
            for(int j=1;j<row.size()-1;j++){
                row.set(j,row.get(j)+row.get(j+1));
            }
            res.add(new ArrayList<>(row));
        }
        return res;
    }

    public static void main(String[] args) {
        int num=5;
        List<List<Integer>> list = generate(num);
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(list.get(i).get(j) + "  ");
            }
            System.out.println();
        }
    }
}
