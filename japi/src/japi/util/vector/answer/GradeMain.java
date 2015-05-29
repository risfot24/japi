package japi.util.vector.answer;

import java.util.Vector;

public class GradeMain {
    public static void main(String[] args) {
		GradeService service = new GradeServiceImp1();
		
		// 일일이 setter 만들기가 귀찮다.
		// 생성자로 한 번에 만들어야지...
		GradeVO g1 = new GradeVO("1111","홍길동",70,80,90); //홍길동 , 1111 바꿔서
		GradeVO g2 = new GradeVO("2222","김길동",75,90,40);
		GradeVO g3 = new GradeVO("3333","김길동",65,80,90);
		
		service.input(g1);
		service.input(g2);
		service.input(g3);
		
		service.print();
		/*
		 * 성적표 성적표 [학번 : , 이름 : , 국어 :0, 영어 : 0, 수학0]
		 * 이 나오더라..
		 * 결과를 보니까 grade를 출력은 하는데 , 벡터에 들어있는 녀석이 아니라..
		 * 그냥 Null 값이 더라.
		 * 그럼 벡터에 있는 grade를 가져오는 방법 ?
		 */
		
		
		String dummy = "1111";
		service.searchGradeByHak("1111");
		//service.searchGradeByName("")
	    Vector<String> temp = new Vector<String>();
	    temp = service.searchGradeByName("김길동");
	    System.out.println(temp.toString());
    
    
    }
}
