package japi.util.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
	public static void main(String[] args) {
		/*
		// ArrayList list = new ArrayList();
		  도 문법에 틀리진 않지만 컬렉션 타입들은
		  인터페이스 타입으로 선언한다.
		  List를 import 할 때 주의점은
		  이클립스 제안들 중 위에 있는 java.awt.List 를 선택하면 안됨.
		  두번째 util 패키지 선택바람
		* */
		
		List<String> list = new ArrayList<String>();
		
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			//String string = (//String) it.next();
			System.out.print(it.next()+"\t");
			
		}
		
		
		
	}

}
