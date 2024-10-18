package testP1;

import java.util.ArrayList;
import java.util.List;

public class part4 {
	public static List<Integer> arrangeList(int n) {
        List<Integer> arrangeList = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            if(arrangeList.get(i)>arrangeList.get(i+1)) {
            	arrangeList.add(i);
            	arrangeList.add(i+1);
            }
        }

        return arrangeList;
    }
}
