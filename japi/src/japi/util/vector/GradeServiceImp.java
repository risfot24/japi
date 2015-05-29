package japi.util.vector;

import java.util.Vector; 

public class GradeServiceImp implements GradeService{

	private Vector<GradeVO> grades = new Vector<GradeVO>();
	
	@Override
	public void input(GradeVO vo) {
		
		
	}

	/*
	 * 성적표를 출력하는 메소드
	 * vo.toString() 으로 처리 예상하고 있음.
	 * (non-Javadoc)
	 * @see japi.util.vector.GradeService#print()
	 */
	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}/*
	
	   학번으로 검색하는 기능을 가진 메소드
	*/
	// 벡터는 size() 로 limit

	@Override
	public String searchGradeByHak(String hak) {
		// TODO Auto-generated method stub
		 //GradeVO vo = new GradeVO();
		 //벡터는 size() 로 limit 를 표시함 
		 // 확장된 for문은 조건식 타입 이(타입 참
		
		String result = "";
		for(GradeVO vo : grades){  
			 if(vo.getHak().equalsIgnoreCase(hak)){
				 result = vo.toString();
			 }else{
				 result = "조회된 학번에 해당하는 학생이 없습니다.";
			 }
		 }
		
		
		
		
		return result;
	}
	/*
	 * 이름으로 성적을 검색해서 출력하는 메소드
	 * 
	 * (non-Javadoc)
	 * @see japi.util.vector.GradeService#searchGradeByName(java.lang.String)
	 */

	
	@Override
	public Vector<String> searchGradeByName(String name) {
		Vector<String> vc = new Vector<String>();
		//벡터나 기타 컬렉션 출력을 하게 되면..
		//이터레이터 아니면 확장 for 문으로 처리한다.
		//왜냐면 확장 for문은 인덱스
		/*
		 * grades를 쓸 수 있는 이유는 멤버필드에 선언하여
		 * 같은 클래스 내부의 메소드들이 값을 공유하기 때문에
		 * 
		 * 
		 */
		for(GradeVO vo : grades){
			if(vo.getName().equalsIgnoreCase(name)){
				/*
				 * 파라미터로 넘어온 이름과 동일한 VO 객체를
				 * 찾아서 sTRING 형태로 벡터를 저장한다.
				 * 즉 VC 는 String 타입이란것 주의 하세요 !!
				 * GradeVO 타입이 아닙니다.
				 */
				vc.add(vo.toString());
			}
		}
		
		return vc;  //리턴값은 성적 정보를 저장한 벡터이다.
	}
	/*
	    종합 점수 기준으로 내림차순으로 정렬시키는 메소드
	*
	*/

	@Override
	public void descGradeTotal() {
		// TODO Auto-generated method stub
		
	}
	/*
	 * 
	 * 
	 * (non-Javadoc)
	 * @see japi.util.vector.GradeService#ascGradeTotal()
	 */

	@Override
	public void ascGradeTotal() {
		// TODO Auto-generated method stub
		
	}
	

}
