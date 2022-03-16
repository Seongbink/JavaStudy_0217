package a18_컬렉션;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("가", "김준일");
		hashMap.put("나", "김준이");
		hashMap.put("다", "김준삼");
		hashMap.put("라", "김준사");
		hashMap.put("마", "김준오");
		
		System.out.println(hashMap);
		System.out.println();
		System.out.println(hashMap.get("다"));
		System.out.println(hashMap.containsValue("김준사"));
		System.out.println(hashMap.remove("라"));
		System.out.println(hashMap);
		System.out.println(hashMap.replace("마", "김준육"));
		System.out.println(hashMap);
		
		

	}

}
