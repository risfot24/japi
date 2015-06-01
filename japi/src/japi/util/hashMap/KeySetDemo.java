package japi.util.hashMap;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//import java.util.*;
//참조한것을 가져온다는것 넓어지면서 속도가 느려지겟죠!!!
 
public class KeySetDemo {   

	public static void main(String[] args) {
		//String object를 생각하는것을
		
		/*
		 * Map 에 값을 입력하는 경우 => 1가지만 존재
		 * 
		 * */
		
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("김연아", new Integer(98));
		map.put("아사다 마오", new Integer(66));   
		map.put("소트니 코바", new Integer(10));
		
		/*
		 * Gof 의 디자인 패턴 중에서
		 * Iterator 패턴이라고 불리우는
		 * Map 에서 값을 추출하는 정규화된 패턴이다.
		 * 
		 */
		
		/*
		 * 맵에서 키값과 벨류값의 맵핑 현황을 전부 출력할때는
		 * entrySet() 사용
		 * keySet() 사용
		 * 단, 어느 경우든지 Set 이용
		 * 이유는.. 컬렉션에서 
		 * 인터페이스는 Set , List , Map 세가지 대표적인데 ...
		 * Set 과 Map 은 인덱스 값이 없어서 상호 호환이 잘되고
		 * Set 은 중복값 제거 기능이 있어서
		 * Map 에서 키값으로 중복이 없어야 하는 부분과도 일치해
		 * Set 을 통해 킥값, 혹은 키 + 벨류값을 출력하는데 쓰인다.
		 * 참고로 맵은 Iterator 을 사용하기 위함이다.
		 * 
		 */
		
		//Set set = map.keySet();
	  
	    /*
	     * Map 에서 값을 출력하는 경우는 3가지인데..
	     * 첫번째는 키 + 벨류 형태로 함께 출력하는 경우
	     * entrySet() + Iterator 패턴 사용 
	     * 20년전에 제임스 고슬링이 만들어서 튜토리얼 에 명시만 하엿고... 후에...
	     * 디자인 패턴은 Gof (갱스터 4인방) 이라는 사람들이 만들었다
	     * 
	     */
		
		     //Iterator<String> it = set.iterator();//object로 받아서 에러??
		  Set set = map.entrySet();   
		Iterator it = set.iterator();
		while (it.hasNext()) {
			// String string = (// String) it.next();
			
			Map.Entry e = (Map.Entry)it.next();
			// 제너릭을 사용하지 않고 모든 타입을 다 받겠다.
			// Entry는 이너 클래스 요소를 뜻함, Map에 있는 요소중 key, value 요소
			
			System.out.println("참가자 : "+e.getKey()+", 점수 : "+e.getValue());
			
		}
		/*
	     * Map 에서 값을 출력하는 경우는 3가지인데..
	     * 두번째는 키 형태로 함께 출력하는 경우
	     * keySet() 사용 
	      
	     */
		set = map.keySet();
		System.out.println("참가자 명단 : "+set); //set을 안붙었다..
	
	   
		/*
	     * Map 에서 값을 출력하는 경우는 3가지인데..
	     * 세번째는 벨류(값) 형태로 함께 출력하는 경우
	     * Collaction 사용 
	     
	     */
		//Collection 에서 이클립스 제안 중에서 java.util.Collection 선택
		Collection values = map.values();
	    it = values.iterator();
	   
	   int total = 0 ;
	   
	   while (it.hasNext()) {
		//String string = (//String) it.next();
		Integer i = (Integer) it.next();
		total += i.intValue();
		   
		 }
		
	   System.out.println("총점 : " + total);
	   //Set 도 List 계열의 클래스처럼 요소의 갯수를 size() 를한다.
	   System.out.println("평균 : " + total/set.size());
	   
	   System.out.println("총점 : " + Collections.max(values));  //Collection 이 아니다.
	   System.out.println("총점 : " + Collections.min(values));
		
		
		
	}

}
