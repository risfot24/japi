package japi.util.vector;

import java.util.Vector;

/*
 * java.util.Vector 의 메소드인
 * addElement() 는 기본적으로 add() 와 동일하다.
 * 
 */
    //칸막이가 없는 큰 상자.

public class AddElementDemo {
	 public static void main(String[] args) {
		String[] heros = {"iron", "thor","hulk", "hawk"} ;
		
		Vector<String> avengers = new Vector<String>();
	     //벡터에 배열의 요소를 저장 addElement()
		/*
		for(String i : heros){
			
			
		}
		*/
		for(int i = 0 ; i< heros.length ; i++){
			avengers.addElement(heros[i]);
		}
		
		//토르가 존재하는 지 체크 contains() 를 사용한다.
		
		String thor = "thor";
		if(avengers.contains(thor)){
			int idx = avengers.indexOf(thor);
			System.out.println("토르는 "+ idx+"번째에 있습니다.");
		}else{
			System.out.println("토르는 없습니다.");
		}
		
		/*
		 * 
		 * 첫번째 멤버(요소) 삭제
		 * 벡터의 인덱스도 0 부터 시작한다. 0 이 골 첫번째 요소임
		 * 
		 * 
		 */
		//System.out.println(avengers);
		avengers.removeElementAt(0);
		
		System.out.println("삭제후 멤버 위치 인덱스 변화");
		
		for(int i =0 ; i<avengers.size(); i++){
			System.out.println("Avengers 의 "+(i+1)+ "번째 멤버는 "+
		  avengers.elementAt(i));
		}
		System.out.println(avengers);
		System.out.println(avengers.size());
	   
	 }

}
