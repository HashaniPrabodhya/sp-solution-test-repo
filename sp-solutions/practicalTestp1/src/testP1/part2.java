package testP1;

import java.util.ArrayList;
import java.util.List;

public  class part2 {
	
	    public static <Integer> List<Integer> combineAlternating(List<Integer> list1, List<Integer> list2) {
	        List<Integer> combined = new ArrayList<>();
	        int size1 = list1.size();
	        int size2 = list2.size();
	        int maxSize = Math.max(size1, size2);

	        for (int i = 0; i < maxSize; i++) {
	            if (i < size1) {
	                combined.add(list1.get(i));
	            }
	            if (i < size2) {
	                combined.add(list2.get(i));
	            }
	        }
			return combined;
	    }
	}

