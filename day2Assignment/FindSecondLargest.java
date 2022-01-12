package week3.day2Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		//{3,2,11,4,6,7};
		
		List list=new ArrayList();
		list.add(3);
		list.add(2);
		list.add(11);
		list.add(4);
		list.add(6);
		list.add(7);
		Collections.sort(list);
		int size = list.size();
		Object object=list.get(size-2);
		System.out.println("The second Largest element is : "+object);
		
	}

}
