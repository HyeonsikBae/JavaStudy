package overload;

public class mainClass {

	public static void main(String[] args) {
		/*
		
		Over Load : �޼ҵ���� ����, �Ű������� �ڷ����̳� �μ� ������ �ٸ� ��.
		
		image drawing -> ����(RGBA), ������ (RGB)
		
		imageDraw(int r, int g, int b, int a);
		imageDraw(int r, int g, int b);
		
		ex)
		parseInt���� parseInt(String s) �� parseInt(String s, int radix)�� �Ű������� �ٸ���.
		
		!!!!!return type ���ǵ� ��쿣 �ȵȴ�!!!!!
		���̽��� ������, �ڹٴ� �ȵ�....
		�޼ҵ尡 ������ ���ϵǱ� ������ ������ ���ϱ� �����̴� :)
		�׸��� ���̽��� ���ϰ��� ��������....
		
		!!!!!�Ű������� ���μ��� �޶� �ڷ����� ������ �ȵ�!!!!!
		���� �޼ҵ忡 �Ű������� �ϳ��� int a �ٸ� �޼ҵ�� int b��� �ص� �ȵ�
		���� int ���̰ŵ�..
		
		 */
	
		int num1 = Integer.parseInt("1010",2);
		int num2 = Integer.parseInt("1010",8);
		int num3 = Integer.parseInt("1010");
		System.out.println(num1+"\n"+num2+"\n"+num3);
		
		/*
		
		signed byte �� ���� : -128 ~ 127
		unsigned byte �� ���� : 0 ~ 255
		
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
