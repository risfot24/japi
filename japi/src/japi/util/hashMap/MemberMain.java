package japi.util.hashMap;

import java.util.Scanner;
//���� �α���
public class MemberMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		/*
		System.out.println("���̵� �Է����ּ���");
		String id = scan.next();
		System.out.println("����� �Է����ּ���");
		String password = scan.next();
		
		System.out.println("�̸��� �Է����ּ���");
		String name = scan.next();
		
		System.out.println("���̸� �Է����ּ���.");
		int age = scan.nextInt();
		System.out.println("�ּҸ� �Է����ּ���.");
		String addr = scan.next();
		*/
		/*
		 * ��ü�� �ۼ��ؼ� �ϼ������ּ���.
		 * ��ü�� �����ϴ� ������ �� �Ѱ��� !! .... ��ü�� �ҷ����� �޼ҵ带 Ȱ���ϱ� ���ؼ�.
		 *  
		 */
		MemberService service = new MemberServiceImp1();
		String id = "hong";
		String password = "pass";
		String name = "ȫ�浿";
		int age = 20;
		String addr = "�����";
		
		service.join(id, password, name, age, addr); // ���� ��
		
		
		System.out.println("ȸ�������� �Ǿ����ϴ�.");
		System.out.println("�α����� ���ּ���");
		
		System.out.println("ID�� �Է����ּ���");
		id = scan.next();
		System.out.println("����� �Է����ּ���.");
		password = scan.next();
		/*
		 * ��ü�� ȣ���ϴ� �޼ҵ�
		 */
		service.login(id, password);
		
		
	}

}
