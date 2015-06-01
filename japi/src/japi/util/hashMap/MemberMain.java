package japi.util.hashMap;

import java.util.Scanner;
//은지 로그인
public class MemberMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		/*
		System.out.println("아이디를 입력해주세요");
		String id = scan.next();
		System.out.println("비번을 입력해주세요");
		String password = scan.next();
		
		System.out.println("이름을 입력해주세요");
		String name = scan.next();
		
		System.out.println("나이를 입력해주세요.");
		int age = scan.nextInt();
		System.out.println("주소를 입력해주세요.");
		String addr = scan.next();
		*/
		/*
		 * 객체를 작성해서 완성시켜주세요.
		 * 객체를 생성하는 이유는 단 한가지 !! .... 객체가 불러오는 메소드를 활용하기 위해서.
		 *  
		 */
		MemberService service = new MemberServiceImp1();
		String id = "hong";
		String password = "pass";
		String name = "홍길동";
		int age = 20;
		String addr = "서울시";
		
		service.join(id, password, name, age, addr); // 조인 끝
		
		
		System.out.println("회원가입이 되었습니다.");
		System.out.println("로그인을 해주세요");
		
		System.out.println("ID를 입력해주세요");
		id = scan.next();
		System.out.println("비번을 입력해주세요.");
		password = scan.next();
		/*
		 * 객체가 호출하는 메소드
		 */
		service.login(id, password);
		
		
	}

}
