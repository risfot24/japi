package japi.lang.object;

public class EqualsDemo2 {
  public static void main(String[] args) {
	  Person p1 = new Person("800101-1555555");
	  
	  Person p2 = new Person("800101-1555555");
	  String result = "";
	  //String result; //스태틱 메소드 내부라서 지역변수가 스태틱화  되었다.
	  result = (p1 == p2) ?  "p1과 p2는 같은 사람" : "p1과 p2는 다른 사람" ;
	  System.out.println("(p1 ==p2) 에 대한 결과 값 : " + result);
	  
	  result = (p1.equals(p2)) ? "p1과 p2는 같은 사람" : "p1과 p2는 다른 사람" ;
	  System.out.println("(p1.equals(p2)) 에 대한 결과 값 : " + result);
	  
	
   }
}

class Person{
	 private String ssn; //주민 번호
	 public Person(String ssn){
		 this.ssn = ssn;
		 
		 
	 }
	 //Alt + shift + s
	 
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	//ALT + SHIFT + S
		//generate hashcode() and equals()


	@Override
	public boolean equals(Object obj) {
		/*  
		   Object 는 모든 데이터 타입을 의미하기 때문에
		   반드시 주민번호를 갖고 있는 Person 인지를
		   확인해야 주민번호 일치여부를 따질 수 있기 때문에
		   객체캐스팅 연산자 instanceof 를 사용한다.
		  이런 기능을 Validation 유효성체크라고 한다.
		  * */
		if(obj != null && obj instanceof Person ){
			return ssn == ((Person)obj).ssn;  //원 답
		
			//자동으로 캐스팅이 안된다..
			//그러면 object 형태로 비교가 가능 하지가 않나??
			//
			
			// java.lang.Object 의 객체 캐스팅은
			// ((객체타입)obj)... 의 형태로 이뤄진다.
		}else{
			return false;
			
		}
		
	}
	
	
	
}
