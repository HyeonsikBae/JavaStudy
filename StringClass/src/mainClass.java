
public class mainClass {

	public static void main(String[] args) {
		
		/*
		 * String : wrapper class
		 * 문자열 저장, 편집, 정보 취득
		 */
		
		String str;
		//String : Class명
		//str : Object(객체), instance(주체)==class의 변수
		
		str = "깔깔깔";
		
		String stra = new String("ㅎㅇ");
		//new로 선언한 객체는 힙 내에 저장 됨.
		
		String strb = "ㅎㅇ";
		//""로 선언한 객체는 힙 내 스트링 풀에 저장 됨.
		//""로 선언한 여러 객체가 내용이 같으면 힙 내 같은 메모리 공유함.
		
		String str1 = "ㅎㅇ";
		String str2 = "반갑";
		
		//문자열 결합
		String str3 = str1 + str2;
		String str4 = str1.concat(str2);
		System.out.println(str3 + "\n" + str4);
		
		//비교
		//str5 와 str6 은 같은 힙 (스트링 풀).
		//str7은 다른 힙.
		String str5 = "hello";
		String str6 = "hello";
		String str7 = new String("hello");
		//==로 비교하려면 같은 메모리여야 하고,
		//equls로 비교하려면 내용이 같으면 된다.
		if(str5.equals(str6)) {
			System.out.println("비교성공1");
		}
		if(str5==str6) {
			System.out.println("비교성공2");
		}
		if(str5.equals(str7)) {
			System.out.println("비교성공3");
		}
		if(str5==str7) {
			System.out.println("비교성공4");
		}
		
		//indexOf : 첫 지정 문자의 위치
		//lastIndexOf : 마지막 지정 문자의 위치
		
		char charArr[] = {'A','B','C'};
		String str8 = "ABCDEFGABCD";
		int n1 = str8.indexOf("D");
		System.out.println(n1);
		int n2 = str8.lastIndexOf("D");
		System.out.println(n2);
		
		//int형 array length 확인.
		int Array[] = {1,2,3};
		System.out.println(Array.length);
		//String length 확인. 이 때 length는 함수이기 때문에 ()가 들어간다.
		System.out.println(str8.length());
		
		//replace
		//("a", "b") 모든 a를 b로 교체한다.
		String str9 = "A0B00C";
		String replaceStr9 = str9.replace("0", "Z");
		System.out.println(replaceStr9);
		
		String poo = "푸 푸 푸주푸 푸푸 푸주 푸푸푸 주후 주후푸 주후후 푸주홍";
		String re1Poo = poo.replace(" ", "");
		System.out.println(re1Poo);
		
		/*
		 
		//split
		token을 활용해 문자열을 자른다.
		aaa-bbb-ccc 에서 -가 토큰이다. - 말고 다른 것들도 사용하나, 안 되는 것들도 있다.
		
		저장매체 : 파일, database(Oracle)
		
		홍길동
		24
		2001/10/12
		180
		
		보다는
		
		홍길동-24-2001/10/12-180 이 토큰을 이용해 필요한 데이터를 잘라오기 좋다.
		
		("-") -를 기준으로 split 한다.
		*/
		
		String str10 = "홍길동-24-2001/10/12-180";
		String splitArr[] = str10.split("-");
		for(int i=0;i<splitArr.length;i++) {
			System.out.println(splitArr[i]);
		}
		
		//substring
		//범위를 통해 문자열 취득
		//(a, b) a부터 b 전까지의 인덱스를 불러온다.
		//(a) 라고 하면 a부터 끝까지 불러온다.
		String str11 = "asdfwqafasd";
		String subStrFir = str11.substring(0,4);
		System.out.println(subStrFir);
		String subStrSec = str11.substring(4);
		System.out.println(subStrSec);
		
		//toUpperCase : 모든 문자를 대문자로
		//toLowerCase : 모든 문자를 소문자로
		
		String str12 = "asdfasdfhj";
		String strUpper = str12.toUpperCase();
		String strLower = strUpper.toLowerCase();
		System.out.println(strUpper);
		System.out.println(strLower);
		
		//trim : 앞뒤 공백을 없애주는 함수
		
		String str13 = "           하하하하하         ";
		String strTrim = str13.trim();
		System.out.println(strTrim);
		
		//valueOf
		//문자열 -> 숫자로
		//숫자 -> 문자열로
		
		int num1 = 123123;
		long num2 = 456456L;
		double num3 = 789789.789;
	
		String num1Str = String.valueOf(num1);
		String num2Str = String.valueOf(num2);
		String num3Str = String.valueOf(num3);
		
		//int num = 1;
		//String str = num + "";  << 이게 더 편함; 
		
		
		System.out.println(num1Str + num2Str + num3Str);
		System.out.println(num1 + num2 + num3);
		
		// contains : 탐색
		String str14 = "서울시 강남구";
		boolean bool = str14.contains("서울");
		System.out.println(bool);
		
		//charAt : 배열처럼 해당 인덱스의 글자 받는것
		//String str = "hello";   ==  char Array[] = {'h','e','l','l','o'};

		String str15 = "가나다라마바사아";
		char ch = str15.charAt(3);
		System.out.println(ch);
		
	}
}
