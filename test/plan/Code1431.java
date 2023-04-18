package plan;

import java.util.ArrayList;
import java.util.List;

public class Code1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list=new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            list.add(isMax(candies,candies[i]+extraCandies));
        }
        return list;
    }

    public boolean isMax(int[] candies,int count){
        for(int i=0;i<candies.length;i++){
            if(candies[i]>count){
                return false;
            }
        }
        return true;
    }
}
