
public class mainClass {

	public static void main(String[] args) {
		/*
		
		형식
		return자료형 함수명 (매개변수){
			처리문;
			return 값;
		}
		
		return자료형 종류 : char String int int[] double void
		
		 */
		int num1 = 3;
		String str = "후후";
		double num2 = 5.5;
		function1();
		function2(num1);
		function3(str,num2);
		int returnValue = function4(num2); // Call by Value
		System.out.println(returnValue);
		char ch = 'e';
		int chASCII = getASCIIcode(ch);
		System.out.println(chASCII);
		
		int arr[] = {1,2,3,4,5};
		arrProcess(arr); // Call by Address
		
		int n1 = 1;
		int n2 = 2;
		int n3 = 3;
		CallbyValue(n1,n2,n3);
		System.out.println("n1 = "+n1);
		System.out.println("n2 = "+n2);
		System.out.println("n3 = "+n3);
		//실행 후 결과는 n1 = 1, n2 = 2, n3 = 3
		
		int Arr[] = {1,2,3};
		CallbyAddress(Arr);
		System.out.println("n1 = "+Arr[0]);
		System.out.println("n2 = "+Arr[1]);
		System.out.println("n3 = "+Arr[2]);
		//실행 후 결과는 n1 = 2, n2 = 4, n3 = 6
		
		
	}
	static void function1() {
		System.out.println("호출 1 ");
	}
	static void function2(int num) {
		System.out.println("호출 2 "+num);
	}
	static void function3(String str, double d) {
		System.out.println("호출 3 "+str+d);
	}
	static int function4(double d) {
		System.out.println("호출 4 " + d);
		return (int)d;
	}
	static int getASCIIcode(char c) {
		return (int)c;
	}
	static void arrProcess(int arr[]) {
		for(int i=0;i<5;i++) {
			System.out.println("arr["+i+"] = "+arr[i]);
		}
	}
	static void CallbyValue(int n1, int n2, int n3) {
		n1 *= 2;
		n2 *= 2;
		n3 *= 2;
		System.out.println("n1 = "+n1);
		System.out.println("n2 = "+n2);
		System.out.println("n3 = "+n3);
	}
	static void CallbyAddress(int arr[]) {
		for(int i=0;i<3;i++) {
			arr[i] *= 2;
			System.out.println("n"+i+" = "+arr[i]);
		}
	}

}
