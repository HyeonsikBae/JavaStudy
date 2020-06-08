package main;

import java.util.ArrayList;

import dto.MemberDTO;

public class main {

	public static void main(String[] args) {
		/*
		
			Collection : 수집
						
				List : 목록
				              데이터의 관리를 유동적으로 할 수 있는 배열
				      
					ArrayList (==Vector)
						배열처럼 사용할 수 있는 목록
						선형구조
						검색 속도가 빠르다
						index number로 관리
						
					LinkedList
				   		빈번하게 추가, 삭제 되는 경우 적합
			
				Map
			
					HashMap
						Key, Value로 관리
						Key로 접근
						key 값에 대한 중복 허용하지 않음.
						Tree 구조
						
					TreeMap
						HashMap특징 + Sorting기능 추가

		*/
		
		/*
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		
		//데이터 추가
			//마지막에 추가
			arrList.add(3);
			arrList.add(5);
			arrList.add(6);
			arrList.add(7);
			
			//정석1
			Integer int1 = new Integer(10);
			arrList.add(int1);
			//정석2
			arrList.add(new Integer(20));
			
			System.out.println(arrList.toString());
		
		
			//넣고 싶은 위치에 추가
			arrList.add(1, 56); //(index, value)
		
		//데이터 삭제
		arrList.remove(3); //(index)
		//arrList.remove(); //Object

		System.out.println(arrList.toString());
		
		//데이터 크기
		int len = arrList.size();
		System.out.println("size of arrList : "+len);
		
		//데이터 검색
		int find = arrList.indexOf(56);
		System.out.println("Index of value \"56\" : "+find);
		System.out.println(arrList.get(find));
		
		int index = -1;
		for(int i=0;i<arrList.size();i++) {
			Integer value = arrList.get(i);
			if(value == 56) {
				index = i;
				break;
			}
		}
		System.out.println("Index of value \"56\" : "+index);
		
		//데이터 수정
		
		Integer updateData = new Integer(100);
		arrList.set(3, updateData); //(index, 수정할 객체값)
		
		//데이터 산출
		Integer get1 = arrList.get(3);
		System.out.println("index[3] value of arrList : "+get1);
		for(int i=0;i<arrList.size();i++) {
			Integer n = arrList.get(i);
			System.out.print(n+"\t");
		}
		System.out.println();
		for(Integer integ : arrList) {
			System.out.print(integ+"\t");
		}
		*/
		
		ArrayList<String> example = new ArrayList<String>();
		
		example.add("졸라");
		example.add("배");
		example.add("고프다");
		System.out.println(example.toString());
		
		int tempIndex = example.indexOf("고프다");
		System.out.println("고프다 인덱스 : " + tempIndex);
		
		String tempValue = example.get(tempIndex);
		System.out.println("고프다 인덱스 값 : " + tempValue);
		
		example.set(tempIndex, "배고프다");
		System.out.println(example.toString());
		
		//example.remove(example.indexOf("배"));
		example.remove("배");
		System.out.println(example.toString());
		
		example.add(1, "뒤지게");
		System.out.println(example.toString());
		
		/*
		ArrayList<MemberDTO> memberList = new ArrayList<MemberDTO>();
		
		MemberDTO dto1 = new MemberDTO(101,"길동");
		//추가
		
		
		memberList.add(dto1);

		memberList.add(new MemberDTO(102,"지매"));
		memberList.add(1,new MemberDTO(103,"춘향"));
		*/
		//삭제
//		memberList.remove(2);
		
//		memberList.remove(dto1);
		
		//검색
		/*
		String findName = "춘향";
		int findIndex=-1;
		for(int i=0;i<memberList.size();i++) {
			MemberDTO mem = memberList.get(i);
			if(findName.equals(mem.getName())) {
				findIndex = i;
				break;
			}
		}
		System.out.println(memberList.get(findIndex).toString());
		
		
		memberList.add(new MemberDTO(104,"춘향"));
		memberList.add(new MemberDTO(105,"춘향"));
		memberList.add(new MemberDTO(106,"춘향"));
		
		ArrayList<MemberDTO> findList = new ArrayList<MemberDTO>();
		
		String findName2="춘향";
		
		for(int i=0;i<memberList.size();i++) {
			MemberDTO mem = memberList.get(i);
			if(findName2.equals(mem.getName())) {
				findList.add(mem);
			}
		}
		
		for(MemberDTO mem : findList) {
			System.out.println(mem.toString());
		}
		*/
		/*
		//수정
		int find = -1;
		for(int i=0;i<memberList.size();i++) {
			MemberDTO mem = memberList.get(i);
			if(mem.getName().equals("춘향")) {
				find = 1;
				break;
			}
		}
		memberList.set(find, new MemberDTO(104,"춘향"));
		for(MemberDTO mem : memberList) {
			System.out.println(mem.toString());
		}
		*/
		/*
		//출력
		for(int i=0;i<memberList.size();i++) {
			System.out.println(memberList.get(i));
		}
		
		for(MemberDTO mem : memberList) {
			System.out.println(mem.toString());
		}*/
	}
}