package practice11;

import java.util.*;

class Exercise11_2 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(3);
		list.add(6);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(7); //362227
		
		HashSet set = new HashSet(list); // 3627
		TreeSet tset = new TreeSet(set); // 2367
		Stack stack = new Stack(); 
		stack.addAll(tset); 
		while (!stack.empty())
			System.out.println(stack.pop()); //7632
	}
}