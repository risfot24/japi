package japi.util.hashMap;

import java.util.HashMap;
import java.util.Map;

public class MemberServiceImp1 implements MemberService {

	/*회원가입 기능을 하는 메소드
	 * HashMap 으로 해야 id 값을 가지고 password 를 호출하겠구나!!
	 * 키 스트링 값을 가지고 해야하기 때문에..?? ,키 값을 가지고 저장되는 기능은 HashMap 밖에 없다..
	 * 
	 * */
	MemberVO vo = new MemberVO();
	Map<String,Object> map = new HashMap<String, Object>();//클래스 에서 선언해야 하는게 메소드 들이 공유해야 하기때문에
    //인터페이스를 맵 타이프 로 hashMap을 생성했습니다.
   
	
	//haspmap 은 단추로 되어 있는 주소로 되어있다?  //들어가는 String 값이 주소를 가지고 있다..
	@Override
	public void join(String id, String password, String name, int age,
			String addr) {
		//조인 끝!
		/*
		 * 이 패턴은 DB 에 저장하는 패턴과 일치 한다.
		 * 즉!, 값을 활용하면서 오염되거나 변질될 수 있기에
		 * 가장 먼저 순수값을 DB에 저장하고 본다.
		 * */
		
		//오염되기전에 db에 빨리 집어넣는다.
		vo.setAddr(addr);
		vo.setAge(age);
		vo.setId(id);   // ID가 ..
		vo.setName(name);
		vo.setPassword(password); // 패스워드 가 키값?
		/*
		 * 1. 첫번째 에러 유형
		 * map.put(vo.getId() , vo.getPassword());
		 * 
		 */
	    
		
		
		
		
		
		map.put("id", vo.getId());// " "상수화..//멀 리턴할지 몰라서 object 형태로 준다. //상수풀 갖고올 키값을 묶어놓는다.
	                                           //static은 물고 당긴다.. 그래서 좀..아니다.. 스태틱은 메모리 점유율이 높다.
	       //String type으로  id를 주는것이 스태틱보다 메모리 점유가 적다.
	    map.put("password", vo.getPassword()); //" " 식별
	    map.put("name", vo.getName());
	    map.put("age", String.valueOf(vo.getAge()));
	    //키 와 벨류 패턴에서 벨류값으로 String 으로 통일시켜라
	    //int 타입으로 들어온 age 를 String 타입으로 변환하였다.
	    map.put("addr", vo.getAddr());
	     /*
	      * 2. 두번째 에러 유형
	      * map.put("age", vo.getAge());
	      */
	    
	    
	    
	}
	/*회원가입 후 로그인 기능을 하는 메소드
	 * 별다른 말이 없으니까..
	 * 로그인 성공, 실패 메시지까지 여기에서 마감지어야 함.
	 * 
	 * */
	
	@Override
	public void login(String id, String password) {
		/*
		 * 3. 세번째 에러 유형
		 * met.get(id) => 파라미터 유형은 반드시 String으로 해야 함.
		 * 
		 */
		
		
		if (map.get("id").equals(id) && map.get("password").equals(password) ) {
			System.out.println("환영합니다."+vo.getAddr()+"에 사는"+vo.getAge()+"세 "+vo.getName()+"님 ...");
			
		} else if(!(map.get("id").equals(id) && map.get("password").equals(password)) ) {
             System.out.println("비번이 다릅니다. 다시 입력해주세요.");
			
		}
		
	}
	
	// 출력문 예시
		// 입력하신 ID 는 존재하지 않거나 , 일치하지 않습니다.
		// 비번이 다릅니다. , 다시 입력하세요.
		// 환영합니다. 서울시에 사는 20세 홍길동님 ... 

}
