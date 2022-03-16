package a18_컬렉션;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<Integer>();
		ArrayList<String> strList = new ArrayList<String>();
		
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(5);
		
		strList.add("a");
		strList.add("b");
		strList.add("c");
		strList.add("d");
		strList.add("e");
		strList.add("f");
		
		System.out.println(intList.size());
		System.out.println(strList.size());
		
		for(int i = 0; i < intList.size(); i++) {
			System.out.println(intList.get(i));
		}
		System.out.println();
		for(int i = 0; i < strList.size(); i++) {
			System.out.println(strList.get(i));
		}
		
		System.out.println();
		for(int num : intList) {
			System.out.println(num);
		}
		
		System.out.println();
		for(String str : strList) {
			System.out.println(str);
		}
		
		strList.set(2, "q");
		strList.set(3, "q");
		strList.set(4, "q");
		
		System.out.println();
		for(String str : strList) {
			System.out.println(str);
		}

		strList.remove(strList.size()-1);
		System.out.println();
			System.out.println(strList);
		
		
		strList.remove(strList.size()-1);
		System.out.println();
			System.out.println(strList);
		
		
		strList.remove(strList.size()-1);
		System.out.println();
			System.out.println(strList);
		
		
	}

}
