package japi.lang.math;

import java.util.Scanner;

/*
 * 
 * java.lang.Math에 속한
 * random() 메소드 난수를 생성시키는 기능을 한다.
 * 
 */


public class RandomDemo {

	  public static void main(String[] args) {
		  int com = (int) (Math.random()*5)+1 ;
		  /*
		   * 위 예제에서 5는 limit 값이고 1은 begin 값이다.
		   * 따라서 위 예제는 1부터 5까지 난수(랜덤숫자)를
		   * 발생시키라는 구문이다.
		   */
		  
		  //회원 관리 할때에... 구분을 줄때 유용하게 난수가 쓰인다..
		  //1 admin , 2 user?
		  
		  
		  int myVal;
		  Scanner scan = new Scanner(System.in);
		  int i = 0;
		  
		  while(true){
			  i++;
			  System.out.println("1부터 5까지 숫자 맞추기 입니다, ");
			  System.out.println("현재는 "+i+ "번째 시도 입니다. ");
			  myVal = scan.nextInt();
			  if(myVal == com){
				  System.out.println("컴퓨터가 발생한 숫자 : "+com);
				  System.out.println("빙고 정답입니다.");
			      break;
			    
			  }
			  if(i == 3){
				  System.out.println("실패했습니다.");
			      break;
			  }
		  }
		  
	}
}
