package japi.lang.object;
/*
 * java.lang.Object 의 메소드
 * equals() : 같이 같은지 여부를 체크
 * 인스턴스 변수의 해시코드 값 (힙 주소값) 을 비교하는 메소드 이다.
 * 
 */


public class EqualsDemo {
	public static void main(String[] args) {
		Temp t1 = new Temp(10); //이거 작성하고 10을 읽자마자.
		Temp t2 = new Temp(10); //이거 작성하고 10을 읽자마자.
		
		//result 가 지역변수 이기 때문에
		// 반드시 !!!!!! 초기화 를 해야한다.
		//call stack 에 값이 없으면 들어가지를 못한다.
		
		String result ="";
		/* if(){}else{} 이 형태는 하드코딩으로 익숙해지셔야 합니다. */
		/*if(t1.equals(t2)){
			System.out.println("t1 과 t2 의 값이 같다.");
			
		}else{
			System.out.println("t1과 t2의 값이 다르다.");
			System.out.println(t1.equals(t2));
		}*/
		
		
	 
	   /*
	      삼항연산자는 if-else 를 대체하는 구문이다.
	    구성은 (조건식) ? "참인경우" : "거짓인경우" ;
	   
	   * */
		result = ( t1.equals(t2)) ? "t1과 t2의 값이 같다 " :"다르다" ;
		
		System.out.println("생성자를 통해 생성된 참조변수 값의 비교 : "+ result);
	    
		t2 = t1 ;   //값을 할당하는것이 아니라... 주소값을 할당하는것이다..
		             //이미 String 도 주소값을 참조하기때문에 서로 다르다는것을 알수가있다.
		System.out.println("참조변수 사이의 할당된 연산 이후 값의 비교 : "+result);
	}

}
class Temp{
	int num;
	public Temp(int num) {  //객체를 만들어야 힙에 저장될수있는 여지가 잇는데..
		this.num = num;
		 //선언했어도 hashcode를 가지고 있기때문에 오류는 나지는 않는다.
		/*
		 * 
		 * 상기 형태는 힙에 저장된 인스턴스 변수에
		 * 일단에 생성자로 와서 콜스택에 있다가.
		 * 콜 스택에 있는 num 지역변수에 할당된 값을
		 * 인스턴스 변수에 넘겨주고 로컬(지역)변수 자신은
		 * 사라지는 시나리오로 진행된다.
		 */
		
		/*
		 temp(생성자 메소드)라는 지역에 오게 되서 지역에 잇는 지역변수가 필드(인스턴스) 영역에 잇는 변수로 복사 되고..
		 temp 라는 지역은 사라지게 된다..
		 
		 * */
	}
}
