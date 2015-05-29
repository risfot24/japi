package japi.util.vector.answer;

import java.util.Vector;

public class GradeServiceImp1 implements GradeService {
	/*
	 �޼ҵ帶�� �����ϴ� �ټ��� ��(�л��� �������̳�)�� �ʿ��ѵ�,
        �ѱ����� ������ �÷����� �ʵ忡 �����ؾ� �ڴ�.
        �ʵ忡 �����ؾ� �޼ҵ���� ���� ���� �� �� �����ϱ�.
        
        �ϴ� ���߿� �ʵ带 ������ �ִ�.. vo ���� �ξ� �δ�����
	 * */
	 private Vector<GradeVO>vc = new Vector<GradeVO>();
	 //->grade.getName[]( ) 
	 //������ ������ �ȵ�����... ���ڱ�� �μ� �� ������ �Ҽ��� �ִ�.
	 //�Ķ���ͷ� ���� �༮�� �޾ƿû����� ... �����°��� �ٲ��� ���Ѵ�..
	 GradeVO grade = new GradeVO();
	
	
	

	/*
	 * 1-input() // �л����� ������ �Է� �޴� ���ΰ�.. �׷� �Է¹޾Ƽ�
                                ������ ������ �ʿ��ϰڴµ�... �迭�� ���� ������
                                 �����ϴ� �����ε� �ѹ� �����ϸ� �߰��� �ø� �� ������
                                 �������� Ȯ���ϴ� �÷����� �����ؾ߰ڱ�.
                                  �׷��� ���� ���� �ƴ� �� ���� ���̴� ���Ϳ� �־����.
	 * 
	 */    //String ���� vector �� �����ߴµ� GradeVO ������ ���ٳ־ �ȴ�..
	@Override
	public void input(GradeVO vo) {
		vc.add(vo);
	
	}
     //2-print() // ��� �ϴ� ���ΰ�? �׷� vo��ü�� toString() �����;���, 
	
	//�������� �����ұ� �ʵ�� ���� �ұ�??
	@Override
	public void print() {
		System.out.println(vc.toString());
		//���Ϳ� �ִ� �༮�� �������°��̾ƴ϶�..
		
	}
	/*
	 * 3-searchGradeByHak()
           // �й����� ������ ��ȸ�ϴ� ����̱�
           // �й��� ���� �� �л����Ը� �����ϹǷ�
           // ���ϰ��� String ���״� ������ for loop + ���ο� if �� �غ��߰ڴ�.

     * */ 
	@Override
	public String searchGradeByHak(String hak) {
		  //for �� �ȿ� ���������� �����ߴ���..
		  // ���ϵǴ� ��ġ�� ������ �޶� ������ ����.
		  // ���� for�� ������ ���������� ���߰ڴ�.
		
		String msg = ""; //���������ϱ� �ʱ�ȭ
		
		  for(int i= 0 ; i < vc.size(); i++ ){
			/*
			 * myHak �� ���Ϳ��� i ��° ��ҿ��� �й���
			 * �����Ͽ� ���� ����.. Ÿ���� String
			 */
			  
			String myHak = vc.elementAt(i).getHak();
			
			/*�Ķ���ͷ� �޾ƿ� hak�� ���Ϳ� ����ִ�
			 * myHak �� ��ġ�ϴ��� ���θ� üũ�ϴ� ����
			 */
			System.out.println("�Ķ���� ���� : "+hak);
			System.out.println("���� ���� : "+myHak);
			if(hak.equalsIgnoreCase(myHak)){
				/* 
				System.out.println("������ "+ (i+1) +"��° ��Ҵ�" 
					       +vc.elementAt(i));*/
				msg = hak;
				System.out.println(msg);
				break;
			}else{
				msg = "��ȸ�ϴ� �й��� �����ϴ�.";
			  System.out.println(msg);
			}
			
		  }
		return msg;
	}
    /*
     4-searchGradeByName()
           // �̸����� ������ȸ�ε� ���ϰ��� ������ ���� ����
           // �������� String �� ó���ϰԲ� ����Ǿ���.
           // ���ϰ��� �ϳ� �� ������ �� for loop + if �����ۿ���
           // ���� ��� ��·����� ������ �װ� ��� �ڴ�.
	  
	 * */   
	@Override
	public Vector<String> searchGradeByName(String name) {
		//String msg = ""; //���������ϱ� �ʱ�ȭ
		Vector<String> local = new Vector<String>();
		
		  for(int i= 0 ; i < vc.size(); i++ ){
			/*
			 * myHak �� ���Ϳ��� i ��° ��ҿ��� �й���
			 * �����Ͽ� ���� ����.. Ÿ���� String
			 */
			  
			String myname = vc.elementAt(i).getName();
			
			/*�Ķ���ͷ� �޾ƿ� hak�� ���Ϳ� ����ִ�
			 * myHak �� ��ġ�ϴ��� ���θ� üũ�ϴ� ����
			 */
			
			if(name.equalsIgnoreCase(myname)){
				/* 
				System.out.println("������ "+ (i+1) +"��° ��Ҵ�" 
					       +vc.elementAt(i));*/
				local.add(name);
			}else{
				local.add(" ");
			}
			
		  }
		return local;
	
	}
	
	/*
	 5-descGradeTotal()
           // ���������ΰ�����
           // Collections.sort ���� �ȴٴµ� ���� �׶� ó���ؾ߰ڴ�.
	 
	 
	 * */

	@Override
	public void descGradeTotal() {
		// TODO Auto-generated method stub
		
	}

	/*
	  6-ascGradeTotal()
           // ���������̸� Arrays.sort �� ���� �ǰڱ�..
	* */
	@Override
	public void ascGradeTotal() {
		// TODO Auto-generated method stub
		
	}

}
