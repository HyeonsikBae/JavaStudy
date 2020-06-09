package main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
			HashMap : 사전
					-> key : value -> 1pair == web에선 json
					
					Tree 구조
					
					List : 선형 구조
					
			TreeMap : HashMap + Sorting(Key 값을 기준으로)
			
			
		 */
		/*
		HashMap<Integer, String> hMap = new HashMap<Integer, String>();
		//추가
		hMap.put(1, "김밥");
		hMap.put(2, "치즈김밥");
		hMap.put(3, "참치김밥");
		System.out.println(hMap);
		
		//획득
		String value = hMap.get(1);
		System.out.println(value);
		
		//삭제
		String val = hMap.remove(1); // 삭제하는 데이터를 val에 저장
		System.out.println(hMap);
		
		//검색
		//있는지 없는지
		boolean b = hMap.containsKey(1);
		System.out.println(b);
		//값
		b = hMap.containsValue("참치김밥");
		System.out.println(b);
		
		//수정
		System.out.println(hMap.get(2));
		hMap.replace(2, "5");
		System.out.println(hMap.get(2));
		
		
		hMap.put(1, "김밥");
		hMap.put(2, "치즈김밥");
		
		//모두 출력 -- 이터레이터 필요
		Iterator<Integer> it = hMap.keySet().iterator();
		while(it.hasNext()){
			Integer _key = it.next();
			System.out.print(_key);
			String _value = hMap.get(_key);
			System.out.println(_value);
		}
		
		/*
		Map<Integer, String> map = new HashMap<Integer, String>();
		TreeMap<Integer, String> tMap = new TreeMap<Integer, String>(map);
		*/
		/*
		HashMap<String, String> hMap2 = new HashMap<String, String>();
		hMap2.put("apple", "사과");
		hMap2.put("banana", "바나나");
		hMap2.put("Chinese", "주홍");
		hMap2.put("orange", "오렌지");
		
		String value2 = hMap2.get("Chinese");
		System.out.println(value2);
		
		Iterator<String> it2 = hMap2.keySet().iterator();
		
		while(it2.hasNext()) {
			String _key2 = it2.next();
			String _value2 = hMap2.get(_key2);
			System.out.println("key : " +_key2 + "\tvalue :" + _value2);
		}
		HashMap<String, String> newhMap2 = new HashMap<String, String>(hMap2);
		System.out.println(newhMap2);
		
		System.out.println("===========================================");
		
		TreeMap<String, String> treeMap = new TreeMap<String, String>(hMap2);
		System.out.println(treeMap);
		
		Iterator<String> trKey = treeMap.keySet().iterator();
		while(trKey.hasNext()) {
			String _key3 = trKey.next();
			String _value3 = treeMap.get(_key3);
			System.out.println(_key3 + "\t" + _value3);
		}
		
		System.out.println("===========================================");
		Iterator<String> trKey2 = treeMap.descendingKeySet().iterator();
		while(trKey2.hasNext()) {
			String _key3 = trKey2.next();
			String _value3 = treeMap.get(_key3);
			System.out.println(_key3 + "\t" + _value3);
		}
		*/
		
		HashMap<Integer, MyData> dMap = new HashMap<Integer, MyData>();
		//추가
		dMap.put(1, new MyData(1,"마라주홍"));
		dMap.put(2, new MyData(2,"얼류주홍"));
		dMap.put(3, new MyData(3,"쇠스주홍"));
		dMap.put(4, new MyData(4,"중궈주홍"));
		System.out.println(dMap);
		
		//삭제
		dMap.remove(4);
		System.out.println(dMap);
		
		//검색
		System.out.println(dMap.get(2));
		
		//수정
		dMap.replace(1, new MyData(5, "푸주홍"));
		System.out.println(dMap);
		
		//출력
		Iterator<Integer> dIt = dMap.keySet().iterator();
		while(dIt.hasNext()) {
			Integer key = dIt.next();
			MyData value = dMap.get(key);
			System.out.println(value);
		}
		
	}
}