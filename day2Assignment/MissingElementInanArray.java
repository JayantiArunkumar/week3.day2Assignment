package week3.day2Assignment;

import java.util.ArrayList;
import java.util.List;

public class MissingElementInanArray {

	public static void main(String[] args) {
		//{1,2,3,4,7,6,8};
		
		List list1=new ArrayList();
		List list2=new ArrayList();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(7);
		list1.add(6);
		list1.add(8);
		for(int i=1;i<=8;i++)
			list2.add(i);
		list2.removeAll(list1);
		System.out.println("The missing element is: "+list2);
		
		
	}

}
