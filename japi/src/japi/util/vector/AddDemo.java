package japi.util.vector;

import java.util.Vector;

/*

java.util.Vector 의 메소드인
add() 는 벡터에 값을 할당하는 기능을 한다.

*/
public class AddDemo {
	
   public static void main(String[] args) {
	  String[] chatt = new String[3];
	  String id = "admin";
	  int age = 27;
	  Boolean male = true;
	  //<String> 을 지우면 object를 넣는 다고 생각하면된다..
	  Vector vec = new Vector<>();
	  String tom = new String("admin");
	  Boolean gender = new Boolean(false);
	  
	  vec.add(new String("admin"));
	  vec.add(String.valueOf(23)); 
	  vec.add(String.valueOf(gender));
	  //주의 !!!
	  // 벡터는 length()를 사용하지 않고
	  // size() 를 요소의 숫자를 표현하는데 사용합니다.
	  
	  for(int i= 0 ; i < vec.size(); i++ ){
		  System.out.println("벡터의 "+ i+"번째 요소는" +vec.elementAt(i));
	  }
	  
	   
}

}
