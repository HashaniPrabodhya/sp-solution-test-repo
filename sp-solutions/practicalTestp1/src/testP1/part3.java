package testP1;

import java.util.ArrayList;
import java.util.List;

public class part3 {
	
	 
	 public static List<Integer> generateFibonacci(int n) {
	        List<Integer> fibList = new ArrayList<>();
	        fibList.add(0);
	        fibList.add(1);
	       

	        for (int i = 2; i < n; i++) {
	            int nextNumber = fibList.get(i - 1) + fibList.get(i - 2);
	            fibList.add((int) nextNumber);
	        }

	        return fibList;
	    }
}
