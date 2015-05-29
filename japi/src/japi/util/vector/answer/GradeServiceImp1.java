package japi.util.vector.answer;

import java.util.Vector;

public class GradeServiceImp1 implements GradeService {
	/*
	 메소드마다 공유하는 다수의 값(학생이 여러명이나)이 필요한데,
        한군데에 저장할 컬렉션을 필드에 선언해야 겠다.
        필드에 선언해야 메소드들이 값을 공유 할 수 있으니까.
        
        하는 도중에 필드를 쓸수가 있다.. vo 보다 훨씬 부담적게
	 * */
	 private Vector<GradeVO>vc = new Vector<GradeVO>();
	 //->grade.getName[]( ) 
	 //변수는 접근이 안되지만... 포자기로 싸서 다 포함을 할수가 있다.
	 //파라미터로 들어온 녀석을 받아올뿐이지 ... 나가는것은 바꾸지 못한다..
	 GradeVO grade = new GradeVO();
	
	
	

	/*
	 * 1-input() // 학생별로 성적을 입력 받는 것인가.. 그럼 입력받아서
                                저장할 공간이 필요하겠는데... 배열이 다중 변수를
                                 저장하는 공간인데 한번 생성하면 추가로 늘릴 수 없으니
                                 동적으로 확장하는 컬렉션을 선택해야겠군.
                                  그런데 내가 지금 아는 건 벡터 뿐이니 벡터에 넣어야지.
	 * 
	 */    //String 으로 vector 를 선언했는데 GradeVO 형으로 갖다넣어도 된다..
	@Override
	public void input(GradeVO vo) {
		vc.add(vo);
	
	}
     //2-print() // 출력 하는 것인가? 그럼 vo객체의 toString() 가져와야지, 
	
	//지역변수 선언할까 필드로 선언 할까??
	@Override
	public void print() {
		System.out.println(vc.toString());
		//벡터에 있는 녀석을 가져오는것이아니라..
		
	}
	/*
	 * 3-searchGradeByHak()
           // 학번으로 성적을 조회하는 기능이군
           // 학번은 오직 한 학생에게만 존재하므로
           // 리턴값이 String 일테니 벡터의 for loop + 내부에 if 를 해봐야겠다.

     * */ 
	@Override
	public String searchGradeByHak(String hak) {
		  //for 문 안에 지역변수를 선언했더니..
		  // 리턴되는 위치와 영역이 달라서 에러가 났다.
		  // 따라서 for문 밖으로 지역변수를 빼야겠다.
		
		String msg = ""; //지역변수니까 초기화
		
		  for(int i= 0 ; i < vc.size(); i++ ){
			/*
			 * myHak 은 벡터에서 i 번째 요소에서 학번을
			 * 리턴하여 닮은 변수.. 타입은 String
			 */
			  
			String myHak = vc.elementAt(i).getHak();
			
			/*파라미터로 받아온 hak과 벡터에 닮겨있는
			 * myHak 이 일치하는지 여부를 체크하는 로직
			 */
			System.out.println("파라미터 학점 : "+hak);
			System.out.println("마이 학점 : "+myHak);
			if(hak.equalsIgnoreCase(myHak)){
				/* 
				System.out.println("벡터의 "+ (i+1) +"번째 요소는" 
					       +vc.elementAt(i));*/
				msg = hak;
				System.out.println(msg);
				break;
			}else{
				msg = "조회하는 학번이 없습니다.";
			  System.out.println(msg);
			}
			
		  }
		return msg;
	}
    /*
     4-searchGradeByName()
           // 이름으로 성적조회인데 리턴값이 벡터인 것을 보니
           // 복수계의 String 을 처리하게끔 설계되었군.
           // 리턴값이 하나 든 여러개 든 for loop + if 구성밖에는
           // 벡터 요소 출력로직이 없으니 그걸 써야 겠다.
	  
	 * */   
	@Override
	public Vector<String> searchGradeByName(String name) {
		//String msg = ""; //지역변수니까 초기화
		Vector<String> local = new Vector<String>();
		
		  for(int i= 0 ; i < vc.size(); i++ ){
			/*
			 * myHak 은 벡터에서 i 번째 요소에서 학번을
			 * 리턴하여 닮은 변수.. 타입은 String
			 */
			  
			String myname = vc.elementAt(i).getName();
			
			/*파라미터로 받아온 hak과 벡터에 닮겨있는
			 * myHak 이 일치하는지 여부를 체크하는 로직
			 */
			
			if(name.equalsIgnoreCase(myname)){
				/* 
				System.out.println("벡터의 "+ (i+1) +"번째 요소는" 
					       +vc.elementAt(i));*/
				local.add(name);
			}else{
				local.add(" ");
			}
			
		  }
		return local;
	
	}
	
	/*
	 5-descGradeTotal()
           // 내림차순인가보다
           // Collections.sort 쓰면 된다는데 배우면 그때 처리해야겠다.
	 
	 
	 * */

	@Override
	public void descGradeTotal() {
		// TODO Auto-generated method stub
		
	}

	/*
	  6-ascGradeTotal()
           // 오름차순이면 Arrays.sort 을 쓰면 되겠군..
	* */
	@Override
	public void ascGradeTotal() {
		// TODO Auto-generated method stub
		
	}

}
