package japi.lang.string;
/*
 * java.lang.String 에 속한 메소드
 * 두개의 문자열을 합친다.
 */
public class ConcatDemo {
	
	public static void main(String[] args) {
		// + 연산자 사용시 //파라미터를 수정할수가 없다.. 
		String str1 = "자바";
		String str2 = "API 학습중..";
		String str3 = str1 + str2 ;
	    
		
		
		System.out.println("+ 연산자 사용 결과 : "+ str3);
		
		//concat()사용시 //파라미터를 수정할 수가 있다.
	    String str4 = "concat() 사용시 : 헬로우, ";
	    System.out.println(str4.concat("자바월드 .."));
	   System.out.println(str1.concat(str3).concat(str2));
	    
	}

}
