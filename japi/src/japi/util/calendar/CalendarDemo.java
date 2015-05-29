package japi.util.calendar;

import java.util.Calendar;

/*패키지이름은 소문자로 햇어도 클래스이름은 구분자에 대문자를 줘야한다.
 * java.util.Calendar
 * 
 */

public class CalendarDemo {
	
	public static void main(String[] args) {
		 String[] month = {"1월","2월","3월","4월",
				 "5월","6월","7월","8월",
				 "9월","10월","11월","12월",};
		 
		 //Calendar.getInstance() 은 내부적으로
		 // 스태틱이 싱글톤 패턴으로 객체를 생성하는 방식이다.
		 // 여러개의 인스턴스를 생성하지 않도록 방지하려는
		 // 목적에서 코딩되었다.
		 
		 Calendar date = Calendar.getInstance();
		 
		 System.out.print("첫번째 날짜 : ");
		 System.out.println(date.get(Calendar.YEAR)+"년");
		 
		 //아래의 3은 무슨 의미일까요??
		 
		 System.out.println((Calendar.MONTH+3)+"월");
		 System.out.println(date.get(Calendar.DATE)+"일");
		 System.out.println();
		 
		 System.out.print("두번째 날짜 : ");
		 System.out.println(date.get(Calendar.YEAR)+"년");
		 // API 에는 calendars is JANUARY which is 0 되어 있으므로
		 // 아래 식처럼 월을 구할 때만 1을 더해야 한다.
		 System.out.print(date.get(Calendar.MONTH + 1 )+"월");
		 System.out.print(date.get(Calendar.DATE)+ "일");
		 
		 System.out.println();
		
		 
		 //-------------------------------------------------------
		 System.out.println("날짜 : ");
		 System.out.println(date.get(Calendar.YEAR)+"년");
		 System.out.println(date.get(Calendar.MONTH)+"월");
		 System.out.println(date.get(Calendar.DATE)+ "일");
		 
		 System.out.println("시간: ");
		 System.out.println(date.get(Calendar.HOUR)+"시");
		 System.out.println(date.get(Calendar.MINUTE)+"분");
		 System.out.println(date.get(Calendar.SECOND)+ "초");
		 
		 System.out.println("=== 1일 후 ===");
		 date.add(Calendar.DATE, +1);
		 date.add(Calendar.MONTH,+1);
		 
		 //System.out.println("현재의 달 ");
		 /*
		  * 출력된 결과값 : java.util.GregorianCalenar 이 출력되므로
		  * 오버라이딩이 필요하다.
		  * 
		  */
		 
		 System.out.print(date.get(Calendar.YEAR)+"년");
		 System.out.print(date.get(Calendar.MONTH)+"월"+" ");
		 System.out.print(date.get(Calendar.DATE)+ "일"+"\n");
		  
		 System.out.print("시간: "+" ");
		 System.out.print(date.get(Calendar.HOUR)+"시"+" ");
		 System.out.print(date.get(Calendar.MINUTE)+"분"+" ");
		 System.out.print(date.get(Calendar.SECOND)+ "초"+"\n");
		 
		// System.out.println(date);
		 String a = toString(date);
		 System.out.println(a);
		 
		 System.out.println("=== 7일 전 ===");
		 date.add(Calendar.DATE, -7);
		 //System.out.println(date);
		a = toString(date);
		 System.out.println(a);
		 
		 System.out.println("특정시간으로 셋팅");
		 
		 date.set(Calendar.HOUR,22);
		 date.set(Calendar.MINUTE,30);
		 date.set(Calendar.SECOND,20);
		 
		 System.out.println("수정된 시간 출력");
		 System.out.println(Calendar.HOUR + "시");
		 System.out.println(Calendar.MINUTE + "분");
	     
		 
		 
	}

	public static String toString(Calendar date) {
		 
		
		return date.get(Calendar.MONTH)+"월" + date.get(Calendar.DATE)+"일"+ date.get(Calendar.YEAR)+"년";
	     //여기서 +3 도 다르다.
	}

	

}

//칼렌더의 먼스에는 +1을 해야한다,,