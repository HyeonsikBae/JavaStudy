package overload;

public class mainClass {

	public static void main(String[] args) {
		/*
		
		Over Load : 메소드명은 같고, 매개변수의 자료형이나 인수 개수가 다른 것.
		
		image drawing -> 투명(RGBA), 불투명 (RGB)
		
		imageDraw(int r, int g, int b, int a);
		imageDraw(int r, int g, int b);
		
		ex)
		parseInt에도 parseInt(String s) 와 parseInt(String s, int radix)가 매개변수가 다르다.
		
		!!!!!return type 정의된 경우엔 안된다!!!!!
		파이썬은 되지만, 자바는 안돼....
		메소드가 끝난고 리턴되기 때문에 구분을 못하기 때문이다 :)
		그리고 파이썬은 리턴값이 여러개래....
		
		!!!!!매개변수의 가인수가 달라도 자료형이 같으면 안돼!!!!!
		동일 메소드에 매개변수가 하나는 int a 다른 메소드는 int b라고 해도 안돼
		같은 int 형이거든..
		
		 */
	
		int num1 = Integer.parseInt("1010",2);
		int num2 = Integer.parseInt("1010",8);
		int num3 = Integer.parseInt("1010");
		System.out.println(num1+"\n"+num2+"\n"+num3);
		
		/*
		
		signed byte 의 범위 : -128 ~ 127
		unsigned byte 의 범위 : 0 ~ 255
		
		 */
		
		funcName();
		funcName('d');
		funcName(3);
		funcName('d',3);
		funcName(3,'d');
		
	}
	static void funcName(){
		System.out.println("Call the funcName Method");
	}
	static void funcName(char c) {
		System.out.println("Call the funcName(char c) Method");
	}
	static void funcName(int i) {
		System.out.println("Call the funcName(int i) Method");
	}
	static void funcName(char c, int i) {
		System.out.println("Call the funcName(char c, int i) Method");
	}
	static void funcName(int i, char c) {
		System.out.println("Call the funcName(int i, char c) Method");
	}
}
