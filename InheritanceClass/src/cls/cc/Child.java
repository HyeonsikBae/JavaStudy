package cls.cc;

public class Child extends Parent{
	
	public Child() {
		//super : 부모 클래스의 reference(point) < 맨위에 적어 ^~^
		//this : 자기 자신의 reference
		//부모클래스에 기본생성자 없으면 이거 에러남;
		System.out.println("Create Child");
	}
	
	public Child(int num) {
		super(num);//Parent 생성자로 접근! // 기본 생성자로 접근할 때는 생략 가능
	}
	//지금 생성자 두개 만들었잖아. 이게 오버로드야
	public void func() {
		name = "호호";
	}
}