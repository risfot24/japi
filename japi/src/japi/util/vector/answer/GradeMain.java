package japi.util.vector.answer;

import java.util.Vector;

public class GradeMain {
    public static void main(String[] args) {
		GradeService service = new GradeServiceImp1();
		
		// ������ setter ����Ⱑ ������.
		// �����ڷ� �� ���� ��������...
		GradeVO g1 = new GradeVO("1111","ȫ�浿",70,80,90); //ȫ�浿 , 1111 �ٲ㼭
		GradeVO g2 = new GradeVO("2222","��浿",75,90,40);
		GradeVO g3 = new GradeVO("3333","��浿",65,80,90);
		
		service.input(g1);
		service.input(g2);
		service.input(g3);
		
		service.print();
		/*
		 * ����ǥ ����ǥ [�й� : , �̸� : , ���� :0, ���� : 0, ����0]
		 * �� ��������..
		 * ����� ���ϱ� grade�� ����� �ϴµ� , ���Ϳ� ����ִ� �༮�� �ƴ϶�..
		 * �׳� Null ���� ����.
		 * �׷� ���Ϳ� �ִ� grade�� �������� ��� ?
		 */
		
		
		String dummy = "1111";
		service.searchGradeByHak("1111");
		//service.searchGradeByName("")
	    Vector<String> temp = new Vector<String>();
	    temp = service.searchGradeByName("��浿");
	    System.out.println(temp.toString());
    
    
    }
}
