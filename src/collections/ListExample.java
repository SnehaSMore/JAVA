package collections;

import java.util.ArrayList;

public class ListExample {


		public static void main(String[] args) {
			ArrayList <Integer> list=new ArrayList<Integer>();
			list.add(34);
			list.add(23);
			list.add(42);
			list.add(22);
			list.add(20);
			System.out.println(list);
			list.set(0,88);//update
			System.out.println(list);
			list.remove(1);//delete or remove
			System.out.println(list);
}
}
