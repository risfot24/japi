package japi.util.vector;

import java.util.Vector;

public class GradeMain {

	public static void main(String[] args) {
		
		GradeService ga = new GradeServiceImp();
		
		GradeVO vo1 = new GradeVO();
		vo1.setEng(80);
		vo1.setHak("1501");
		vo1.setKor(95);
		vo1.setMath(80);
		vo1.setName("홍길동");
		
		GradeVO vo2 = new GradeVO();
		vo1.setEng(80);
		vo1.setHak("1502");
		vo1.setKor(95);
		vo1.setMath(80);
		vo1.setName("김길동");
		
		GradeVO vo3 = new GradeVO();
		vo1.setEng(95);
		vo1.setHak("1503");
		vo1.setKor(95);
		vo1.setMath(80);
		vo1.setName("김길동");
		
		GradeService service = new GradeServiceImp();
		
		service.input(vo1);
		service.input(vo2);
        service.input(vo3);
        
        System.out.println("1501번의 성적 조회 :"+service.searchGradeByHak("1501"));
         //컬렉션 내부의 <클래스타입> 을 제네릭 이라고 칭함.
        // 특별한 기능을 말하는 것은 아니고 컬렉션 내부에서
        // 타입 캐스팅을 한다라고 간단하게 정리하셔도 무방함.
        
        Vector<String> vc = service.searchGradeByName("김길동");
        for(int i=0 ; i < vc.size() ; i++){ //nullPointerExcepion 이시면 그줄에가셔서 점 앞에 있는것이 널이라고 생각하셔라!
        	System.out.println(vc.elementAt(i));
        }
		
	}

}
