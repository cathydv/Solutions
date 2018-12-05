package Four;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxValue {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList list = new ArrayList<Integer>();
		
		System.out.println("Enter a sequence of numbers ending with a 0: " );
		Integer number = sc.nextInt();
		while(number.intValue() != 0 ) {
			list.add(number);
			number = sc.nextInt();
		}
		
		System.out.println("The largest integer is: " + max(list));
		
	}
	
	public static Integer max(ArrayList<Integer> list) {
		if(list.size()== 0) 
			return null;
		
		Integer max = list.get(0);
		for(int i = 0; i< list.size(); i++) {
			if(list.get(i) > max)
				max = list.get(i);
		}
		return max;
	}

}
