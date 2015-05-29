package japi.lang.object;

/*import java.lang.Object ; 선언하지 않아도 디폴트로  import 로 되어잇음*/
public class ToStringDemo {
	public static void main(String[] args) {
		Card card1 = new Card("spade", 7);
		Card card2 = new Card("heart", 2);
		System.out.println(card1.toString());
		System.out.println(card2.toString());
		
		/*
		 * java.lang.Object의 toString 은 해시코드(객체 주소값)을
		 * 리턴하므로 , toString()을 오버라이딩해서
		 * 원하는 결과를 얻어오도록한다..
		 * 
		 */
		
	}

}


//한 java파일에 두개 이상의 클래스가 있어도 되나....
//반드시  public 은 하나여야 한다.
class Card{
	String kind;
	int number;
	
	
	public Card(){
		//this.kind = "아이이";
		  this("",0); //이렇게 한의도 생성자 오버로딩 을 할려고
	}

    /*생성자 오버로딩을 쉽게 하는방법  
     * 디폴드 생성자를 CTRL + SPACE 생성 시킨후
     * 생성자 호출 예약어인 this(파라미터 갯수와 타입을 코딩)
     * 하시면 자동 생성 된다.
     * 또한 디폴트 생성자를 호출하더라도
     * 파라미터가 있는 생성자까지 호출되므로,
     * 생성자 파라미터 내용까지 알 필요없이 코딩 간편해진다.
     * */
	public Card(String string, int i) {
		this.kind = string;
		this.number = i;
		
	}
	//getter, setter 는 필요시만 만들면 됩니다.
	//ctrl + space 에서 toString을 한다..

	
	
	@Override
	public String toString() { //hashcode 주소값
		//String ims = "";
		
		return "해당 해시코드 : "+this.hashCode()+"카드 : "+this.kind +"넘버 : "+this.number ;
	}
	
	
	
	
}

