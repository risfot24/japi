package japi.util.vector;

import java.util.Vector;

public class GradeMain {

	public static void main(String[] args) {
		
		GradeService ga = new GradeServiceImp();
		
		GradeVO vo1 = new GradeVO();
		vo1.setEng(80);
		vo1.setHak("1501");
		vo1.setKor(95);
		vo1.setMath(80);
		vo1.setName("ȫ�浿");
		
		GradeVO vo2 = new GradeVO();
		vo1.setEng(80);
		vo1.setHak("1502");
		vo1.setKor(95);
		vo1.setMath(80);
		vo1.setName("��浿");
		
		GradeVO vo3 = new GradeVO();
		vo1.setEng(95);
		vo1.setHak("1503");
		vo1.setKor(95);
		vo1.setMath(80);
		vo1.setName("��浿");
		
		GradeService service = new GradeServiceImp();
		
		service.input(vo1);
		service.input(vo2);
        service.input(vo3);
        
        System.out.println("1501���� ���� ��ȸ :"+service.searchGradeByHak("1501"));
         //�÷��� ������ <Ŭ����Ÿ��> �� ���׸� �̶�� Ī��.
        // Ư���� ����� ���ϴ� ���� �ƴϰ� �÷��� ���ο���
        // Ÿ�� ĳ������ �Ѵٶ�� �����ϰ� �����ϼŵ� ������.
        
        Vector<String> vc = service.searchGradeByName("��浿");
        for(int i=0 ; i < vc.size() ; i++){ //nullPointerExcepion �̽ø� ���ٿ����ż� �� �տ� �ִ°��� ���̶�� �����ϼŶ�!
        	System.out.println(vc.elementAt(i));
        }
		
	}

}
