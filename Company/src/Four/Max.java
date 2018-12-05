package Four;

import java.util.ArrayList;
import java.util.Scanner;

public class Max {
	
	
	
	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		System.out.println("Enter a sequence of numbers: ");
		while(sc.hasNextInt()) {
			list.add(sc.nextInt());
		}
		
		System.out.println("Largest int is:" + max(list));
	}
	
	public static Integer max(ArrayList<Integer> list) {
		if(list.size()== 0)
			return null;
		
		Integer max = list.get(0);
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i) > max )
				max = list.get(i);
		}
		return max;
	}

}
