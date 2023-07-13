package plan;

import java.util.*;

/**
 * 给你一个下标从 0 开始、大小为 n x n 的整数矩阵 grid ，返回满足 Ri 行和 Cj 列相等的行列对 (Ri, Cj) 的数目。
 *
 * 如果行和列以相同的顺序包含相同的元素（即相等的数组），则认为二者是相等的。
 */
public class Code2352 {
    public int equalPairs(int[][] grid) {
        int count=0;
        List<StringBuilder> list=new ArrayList<>();
        for(int i=0;i<grid[0].length;i++){
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<grid[0].length;j++){
                sb.append(grid[i][j]);
                sb.append(",");
            }
            list.add(sb);
        }
        List<StringBuilder> list1=new ArrayList<>();
        for(int i=0;i<grid[0].length;i++){
            StringBuilder sb1=new StringBuilder();
            for(int j=0;j<grid[0].length;j++){
                sb1.append(grid[j][i]);
                sb1.append(",");
            }
            for(int t=0;t<list.size();t++){
                if(sb1.toString().equals(list.get(t).toString())){
                    count++;
                }
            }
        }
        return count;
    }
}
