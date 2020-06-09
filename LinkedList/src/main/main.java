package main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		/*
			ArrayList : 검색. 대입에 좋아	== Vector
			
		
		 */
		
		/*
		List<String> elist = new ArrayList<String>();
		List<String> alist = new LinkedList<String>();
		//List는 Interface, ArrayList와 LinkedList는 Class
		 */
		
		
		ArrayList<String> alist = new ArrayList<String>();
		alist.add("a");
		alist.add("b");
		alist.add("c");
		
		LinkedList<String> blist = new LinkedList<String>(alist);
		System.out.println(blist);
		
		if(blist.isEmpty()) {
			//blist.size==0 과 같음
		}
		
		//맨 앞에 Element 추가
		 blist.addFirst("0");
		 
		 //맨 뒤에  Element 추가
		 blist.addLast("1");
		 
		 System.out.println(blist);
		 
		 
		 Iterator<String> it;
		 it = blist.iterator();
		 
		 
		 
		 while(it.hasNext()) {
			 String valueString = it.next();
			 System.out.println("it : ");
		 }
		 
	}

}
