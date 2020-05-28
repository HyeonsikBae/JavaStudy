
public class mainClass {
	public static void main(String[] args) {
		allocParam(1,4,4,3,7,8,6);
		func("함수 호출 성공!",4,8,9,5,4,8,4,7);
	}
	static void allocParam(int...num) {
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		System.out.println("합계 : " + sum);
	}
	static void func(String str, int...num) {
		System.out.println(str);
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		System.out.println("합계 : " + sum);
	}
}
/*
static void allocParam(int...num)
						 가변인수, 점은 꼭 세개!
*/