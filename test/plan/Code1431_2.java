package plan;

import java.util.ArrayList;
import java.util.List;

public class Code1431_2 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list=new ArrayList<>();
        int n=candies.length;
        int maxCandies=0;
        for(int i=0;i<n;i++){
            maxCandies=Math.max(maxCandies,candies[i]);
        }
        for(int i=0;i<n;i++){
            list.add(candies[i]+extraCandies>=maxCandies);
        }
        return list;
    }

}
