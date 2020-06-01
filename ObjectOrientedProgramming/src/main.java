import myclass.TV;
import student.Student;

public class main {

	public static void main(String[] args) {
		
		/*
		OOP (Object Oriented Programming)
		
		처리 중심 -> 설계 중심
		
		
		
		TV 2대 -> 각각에 필요한 변수들이 TV 수인 2만큼 필요
		...TV가 많아지면 배열 메모리 할당도 바꿔야 하고 변수도 넣어주고......ㅠ
		String name[] = new String[2]; // 삼성, LG
		inc channel[] = new int[2]; // 채널
		boolean power[] = new boolean[2]; // ON/OFF
		
				
				
		class MyClass{	class 설계
			
			변수(멤버변수) : 접근지정 가능(외부, 내부.. ㅇㅎ 접근제어자)
			
			함수(메소드) : 처리
		
		}
		
		클래스명 변수(instance) = new 클래스명();
		ex) MyClass cls = new MyClass(); > 동적할당하는거임 ㅎㅎ
			>> cls는 stack에,  new로 할당된 건 heap에..
			>> MyClass cls = null; 라고 하면 주소값 0으로 초기화 하는거임
		
		 */
		
		/*
		TV tv1 = new TV();	//	tv1 = instance( 주체 ) or Object( 객체 ) : 메모리상에 존재하는 요소
		tv1.setInput("주홍티비", 200, true);
		tv1.method();
		TV tv2 = new TV();
		tv2.setInput("티비주홍", 201, false);
		tv2.method();
		
		TV arrTv[] = new TV[3]; // 이건 arrTV1, arrTV2, arrTV3 세개 변수 선언한거랑 같은
		
		//arrTv[0].setInput("삼성",1,true); // 이거 안됨.. 위에서 배열만 동적할당 했으니
		
		for(int i=0;i<arrTv.length;i++) {
			arrTv[i] = new TV();
		} // <<<동적 할당!!!!!
		
		arrTv[0].setInput("AAA", 25, true); // 이제 됨 ㅎㅎㅎㅎㅎㅎㅎ
		arrTv[1].setInput("bbb", 20, true); // 이제 됨 ㅎㅎㅎㅎㅎㅎㅎ
		arrTv[2].setInput("ccc", 15, true); // 이제 됨 ㅎㅎㅎㅎㅎㅎㅎ
		
		arrTv[1].setPower(false);
		
		for(int i=0;i<arrTv.length;i++) {
			arrTv[i].method();
		} 
		*/
		
		String student[][] = {
				{"일번", "15", "30", "40", "50"},
				{"이번", "23", "60", "70", "40"},
				{"삼번", "26", "30", "70", "80"}
		};
		
		Student student2 = new Student();
		
		student2.setName("푸주홍");
		student2.setAge(82);
		student2.setKor(4);
		student2.setEng(2);
		student2.setMath(15);
		
		
	
	}
}
