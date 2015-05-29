package japi.lang.stringBuffer;
/*
 * 
 * StringBuffer 클래스
 *   -String 클래스 와 차이점은 인스턴스 생성시
 *      문자열을 바꿀 수 있고 없고에 있다.
 */
/*
 * java.lang.StringBuffer 의 메소드인
 * append() 는 파라미터로 들어온 String ㄱ밧을
 * 원래 문자열의 뒹에 붙인다.
 * 
 */




public class AppendDemo {
	
	public static void main(String[] args) {
		StringBuffer buf = new StringBuffer();
		StringBuffer buf1 = new StringBuffer("A B C");
		//StringBuffer buf2 = new StringBuffer("D E F");
		StringBuffer buf2 = buf1.append("D E F");
		String msg;
		//concat 과 다르다 concat은 서로다르게 생성된 두개를 붙이는것과
		// buffer은 있는것을 가지고추가한것이다...
	
	
	    if(buf ==buf2){
	    	msg = "buf1 == buf2 ";
	    }else {
	    	msg = "buf1 != buf2"; // !=은 같지 않다는 연산자.
	    }
	    
	    System.out.println(msg);
	    System.out.println(buf1.toString());
	    System.out.println(buf2.toString());
	    /*
	     * buf2 는 새롭게 생성되어 전달된 객체가 아니며
	     * buf1 이 내부적으로 수정되어 전달 받음으로써
	     * 동일한 주소값을 참조한다.
	     * 
	     * StringBuffer 클래스는 String 클래스외  다르게 
	     * 무분별하게 객체 생성을 하지 않는다.
	     * 그리고 , 직접 수정할 수 있는 가변성의 특징이 있다,
	     * 그러므로 빈번한 문자열 수정 작업이 필요한 경우
	     * String 클래스 보다 StringBuffer 클래스가 더 유용하다
	     * 
	     * 사용례 : 카톡에서 문자를 보낼 대 어느정도 쓰다가
	     * 다시 지우고 제작성해서 보내는 경우가 대표적이다.
	     * 즉 buffer 에 저장시켯다가 사용자가 보내려고 엔터를
	     * 누르는 작업이 buffer 에서 객체를 생성시켜서
	     * 보내는 시나리오로 진행된다..
	     */
	     buf2.append("ddsd");
	     System.out.println(buf2.toString());
		
	     //자바에서는 내부에서 완전한 스트링형태의 자료형을 가진건 String밖에 없대요
	     // 그래서 StringBuffer안에 들어오는 데이터들은 가지고 있다가.
	     
	
	}

}
