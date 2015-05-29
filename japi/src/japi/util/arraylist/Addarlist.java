package japi.util.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*벡터에서 동기화 부분 만 빼고 다 가져 왔다..*/
/*
 java.util.ArrayList 의 메소드인
 add() 는 Vector 와 동일하다.
  
 */
//다른 컬렉션 인터페이스는 for문 쓰는데
// arraylist , vector 는 

public class Addarlist {
	public static void main(String[] args) {
		/*
		 * 벡터는 내부적으로 String 을 사용.
		 * 속도는 느리고 동기화를 지원한다.
		 * ArrayList 는 내부적으로 StringBuffer 을 사용한다.
		 * 동기화 지원 안함.
		 * 
		 */
		ArrayList<String> lists = new ArrayList<String>();
		
		//항목 추가
		lists.add("서울");
		lists.add("부산");
		lists.add("대구");
		
		/*
		 * 출력 1. .literator()이용
		 * 
		 */
		
		Iterator<String> it = lists.iterator();
		
		while (it.hasNext()) {
			//String string = (//String) it.next();
			//printf 를 사용합니다.
			System.out.printf("%s",it.next());
			//위 예문에서 %s는 String 타입을 의미합니다.
			//뒤에 값은 %s 의 value 입니다.
		}
		System.out.println();
		/*
		 * 
		 * 출력 2. listIterator() 이용
		 */
		ListIterator<String> it2 = lists.listIterator();
		
		while (it2.hasNext()) {
			//String string = (//String) it2.next();
			System.out.printf("%s",it2.next());
			
		
		}
		System.out.println();
		/*
		 * 출력 3. previous() 이용
		 * */
		while (it2.hasPrevious()) {
			//String string = (//String) it2.next();
			// 메소드 영어 바뀐 부분 체크
			System.out.printf("%s", it2.previous());  //next()하면 못찾는다. NoSuchElementException
			// 이 메소드는 ListIterator 에서만 사용가능
			
		}
		
		// 전체 요소를 한 번에 입력
		// List 인터페이스는 java.util 입니다.
		List<String> list2 = new ArrayList<String>();
		// 인터페이스 <제너릭> 참조변수  = new 구현한객체<제너릭>();
		// 패턴입니다.
		
		list2.addAll(lists); // 서울, 부산, 대구 를 복사해서 집어 넣은 상태
		
		/*
		 * 출력 4. 확장 for 문
		 * 콜렉션은 인덱스에 대한 조건이 굳이 주어지지 않는
		 * 출력형태가 많기 때문에 확장 for 문이 즐겨 사용된다.
		 * 
		 * 
		 */ 
		
		for(String s : list2){
			System.out.printf("%s",s);
			
		}
		System.out.println();
		
		//검색 명령을 위한 데이터 추가 (더미값 추가...)
		list2.add("광주");
		list2.add("인천");
		list2.add("대전");
		
		//인덱스 도 다르고  (확실), 주소값도 다르기때문에.. 중복가능
		/*
		 * 출력 5. 검색해서 출력
		 * 
		 */
		
		Iterator<String> it3 = list2.iterator();
		String str;
		while (it3.hasNext()) {
			//String string = (//String) it3.next();
		str = it3.next();
		System.out.printf("%s",str);
		
		
		}
		
		System.out.println();
		
		//동일한 자료 입력 가능.. 즉 중복값을 허용함
		list2.add("인천");
		list2.add("인천");
		list2.add("인천");
		
		Iterator<String> it4 = list2.iterator();
		while (it4.hasNext()) {
			//String string = (//String) it4.next();
			System.out.printf("%s",it4.next());
			//참고로 printf 에서
			// 10진수 숫자값은 %d 로 d 는 deciaml 의 약자입니다.
			
		}
		System.out.println();
		
		
	}
	

}
