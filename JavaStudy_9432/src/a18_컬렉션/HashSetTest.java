package a18_컬렉션;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> strSet = new HashSet<String>();
		strSet.add("강성빈");
		strSet.add("강성비");
		strSet.add("강성민");
		strSet.add("강성미");
		
		System.out.println(strSet);
		
		strSet.remove("강성민");
		
		System.out.println(strSet);
		
		Iterator<String> ir = strSet.iterator();
		while(ir.hasNext()) {
			String str = ir.next();
			if(str.equals("강성미")){
			System.out.println(str);
		}
	 }
		
	}

}