package arrays;

import java.util.Arrays;

public class SingleArrayCopy {

	public static void main(String[] args) {
		
		int first[]= {1,2,3};
		int second[]=first;
		System.out.println(Arrays.toString(second));
		first[0]++;
		System.out.println(Arrays.toString(first));
		System.out.println(Arrays.toString(second));

	}

}
