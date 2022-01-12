package week3.day2Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		int[] input={14,12,13,11,15,14,18,16,17,19,18,17,20};
		//List list1=Arrays.asList(input);
		List list1=new ArrayList();
		list1.add(14);
		list1.add(12);
		list1.add(13);
		list1.add(11);
		list1.add(15);
		list1.add(14);
		list1.add(18);
		list1.add(16);
		list1.add(17);
		list1.add(19);
		list1.add(18);
		list1.add(17);
		list1.add(20);
		int size= list1.size();
		
		Set set=new LinkedHashSet();
		List list2=new ArrayList();
		for(int i=0;i<size;i++)
			if(!set.add(list1.get(i)))
				list2.add(list1.get(i));
				
		
		System.out.println(set);
		
		System.out.println("The duplicate elements in the given array  are "+list2);
		
		
		
		
		
	}

}
