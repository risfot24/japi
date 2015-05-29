package japi.lang.wrapper;
/*
 * JDK 1.5 (자바버전 5)부터 도입된 오토박싱(autoboxing) 기능으로
 * 반환값이 기본할일 경우와 wrapper class 이면...
 * 서로 차이가 없다.
 * 그래서 parseInt() 와 valueOf() 가 차이가 없다.
 */



public class ParseIntDemo {
	
	public static void main(String[] args) {
		//리터럴 값을 기본형으로 캐스팅시 변환 방법
		// 즉 String => int
		
		int num1 = Integer.parseInt("200");
		int num2 = Integer.parseInt("200");
		int result = num1 + num2 ;
		System.out.println(result);
		
		
		
		//기본형을 참조형으로 형변환하는 경우 (캐스팅 생략 가능)
		Integer num3 = (Integer)result;
		System.out.println("기본형을 참조형으로 형변환 결과 : "+num3);
		
		int num4 = 2 + num3 ;
		
		System.out.println("참조형과 기본형간의 연산결과 : "+ num4);
		/*
		 * num5 는 java.lang.NumberFormatException : 이 발생한다.
		 * 이경우라면 문자값을 숫자형으로 형변환 을 시도 했는지 여부를
		 * 고민하고 디버깅 해야한다.
		 * 
		 */
		
		//아... String으로 받은것을 int형으로 바꿈으로서의 출력
		//String s = "dkdkdk";
		//int num5 = Integer.parseInt(s);
		//System.out.println(num5);
		//System.out.println(Integer.parseInt(s));
		
		
		
		
		
	}

}
