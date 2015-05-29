package japi.lang.string;

/*
 * java.lang.String
 *  == 은 객체의 레퍼런스 벨류(hash code table)을 비교한것.
 *  문자열에 대한 비교는 반드시 equals() 메소드를 이용.
 *  new 를 이용하면 heap 영역에 새로운 메모리를 할당하고
 *  hashcode 를 생성한다.
 * 
 */

/*
 * String 에 있는것을 가져와서 
 * 
 */
public class EqualsDemo {

	public static void main(String[] args) {
		
		//String 값을 리터럴 생성한 경우
		String str1 = "abc";
		String str2 = "abc";
		
		String result1 = (str1 == str2)? "1-2번과 동일 " :"1-2번과 다름 ";
		String result2 = (str1.equals(str2))? "1-2번과 동일 " :"1-2번과 다름 ";
		
		//아까 오브젝트 레퍼런스 equals ------------------------
		//생각
		
		System.out.println("str1 == str2 인 경우 : "+result1 );
		System.out.println("str1.equals(str2)"+result2 );
		
		
		//-----------------------------------------
		System.out.println("----------------------------------");
		String str3 = new String("abc");
		String str4 = new String("abc");
		
		String result3 = (str3 == str4)? "3-4번과 동일 " :"3-4번과 다름 ";
		String result4 = (str3.equals(str4))? "3-4번과 동일 " :"3-4번과 다름 ";
		
		System.out.println("str3 == str4 인 경우 : "+result3 );
		System.out.println("str3.equals(str4)"+result4 );
		/*
		 * result3 의 결과가 다름으로 나온 이유
		 * - String 클래스 이용하여 String 인스턴스를 생성한 경우에는
		 * - new 연산자에 의해 메모리 할당이 이뤄지기 때문에
		 * - 항상 새로운 String 인스턴스가 생성된다.
		 * 
		 * 
		 * - 그래서, String 타입은 생성자로 객체를 생성하지않고,
		 * 리터럴로 생성한다, 힙에 생성이 안된다.. , new로 생성 하지마세용?~
		 */
		
		
		/*
		 * 모든 클래스파일(*.class)에는 constant pool 이라는
		 * 상수풀이 있어서, 클래스내에 사용되는 모든 리터럴과
		 * 상수들이 저장되어 있다.
		 * 등록하고자 하는 문자열이 상수풀에 이미 존재하는경우에는
		 * 그 문자열의 주소값을 반환한다.
		 */
		//상수풀 static,  new string 에서나오는 영역은 힙영역
		System.out.println(str3.hashCode());  //해쉬코드 값은 랜덤으로
		System.out.println(str4.hashCode());
		//System.out.println(str4.);
		
		
		//명확한 설명은 다음에..
		
		
		System.out.println("----------------------------------");
		String str5 = new String("abc");
		String str6 = "abc";
		
		String result5 = (str5 == str6)? "5-6번과 동일 " :"5-6번과 다름 ";
		String result6 = (str5.equals(str6))? "5-6번과 동일 " :"5-6번과 다름 ";
		
		System.out.println("str5 == str6 인 경우 : "+result5 );
		System.out.println("str5.equals(str6)"+result6 );
	}
	
	
	
	
	/* new 로 할경우 계속 힙에 할당하기 때문에... 메모리 효율성이 적다...
	 * 
	 * 
	 */
}
