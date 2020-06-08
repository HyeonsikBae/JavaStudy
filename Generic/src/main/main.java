package main;

public class main {

	public static void main(String[] args) {
		
		/*
			Generic : template
					    자료형의 변수
					    Object 삽입도 가능>>>
					  같은 클래스에서 다양한 자료형 사용하고싶을 때 쓰는 요소
		
		
		
		 */
		Box<Integer> box = new Box<Integer>(3);
		System.out.println(box.getTemp());
		box.setTemp(5);
		System.out.println(box.getTemp()+1);
		
		Box<String> sBox = new Box<String>("??");
		System.out.println(sBox.getTemp());
		sBox.setTemp("dd");
		System.out.println(sBox.getTemp()+1);
		
		BoxMap<Integer, String> bMap = new BoxMap<Integer, String>(3,"삼");
		System.out.println("Key : "+bMap.getKey()+"\n"+"Value : "+bMap.getValue());
		
	}
}

class Box<T>{	//	<T> : Generic
	
	T temp;
	
	public Box(T temp){
		this.temp = temp;
	}
	public void setTemp(T temp) {
		this.temp = temp;
	}
	public T getTemp() {
		return temp;
	}	
}

class BoxMap<Key, Value>{
	
	private Key key;
	private Value value;
	
	public BoxMap(Key key, Value value) {
		this.key = key;
		this.value = value;
	}

	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}

	public Value getValue() {
		return value;
	}

	public void setValue(Value value) {
		this.value = value;
	}
	
}