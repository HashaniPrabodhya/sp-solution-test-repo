package testP1;

import java.util.ArrayList;
import java.util.List;

public class part1 {

	public static int sumUsingForLoop(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
	
	public static int sumUsingWhileLoop(List<Integer> numbers) {
        int sum = 0;
        int index = 0;
        while (index < numbers.size()) {
            sum += numbers.get(index);
            index++;
        }
        return sum;
    }
	
	public static int sumUsingRecursion(List<Integer> numbers) {
		
		int sum=0;
		return sum;
		
	}
	
	
}
