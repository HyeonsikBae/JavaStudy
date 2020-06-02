package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class main {
	public static void main(String[] args) {
		ArrayList<String> food = new ArrayList<String>();

		String food1 = "라볶이";
		String food2 = "치킨"; //...?
		String food3 = "라면";
		String food4 = "김밥";

		food.add(food1);
		food.add(food2);
		food.add(food3);
		food.add(food4);
	

		//Output >> [라볶이, 치킨, 라면, 김밥]
		//분식 사이에 치느님이라니... 삭제해주자.. 1번 인덱스..
		food.remove("치킨");
		food.set(2,"돈까스");
		food.add(1,"냉면");
		//Output >> [라볶이, 라면, 김밥]
		//인덱스가 앞으로 하나씩 당겨진 걸 확인할 수 있다.
		//food.set(4,"냉면");
		System.out.println(food);
		  System.out.println(food.indexOf("라면"));
		  Iterator<String> iter = food.iterator(); // iterator 로 값을 순차접근
		  
		  while(iter.hasNext())   //다음 값이 존재하는지 확인
		  System.out.print(iter.next()); // 다음값 가져오기
		  
		  food.clear();
		  boolean real = food.isEmpty();
		  System.out.println(real);

	}
}
