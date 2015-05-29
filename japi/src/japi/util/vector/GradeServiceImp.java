package japi.util.vector;

import java.util.Vector; 

public class GradeServiceImp implements GradeService{

	private Vector<GradeVO> grades = new Vector<GradeVO>();
	
	@Override
	public void input(GradeVO vo) {
		
		
	}

	/*
	 * ����ǥ�� ����ϴ� �޼ҵ�
	 * vo.toString() ���� ó�� �����ϰ� ����.
	 * (non-Javadoc)
	 * @see japi.util.vector.GradeService#print()
	 */
	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}/*
	
	   �й����� �˻��ϴ� ����� ���� �޼ҵ�
	*/
	// ���ʹ� size() �� limit

	@Override
	public String searchGradeByHak(String hak) {
		// TODO Auto-generated method stub
		 //GradeVO vo = new GradeVO();
		 //���ʹ� size() �� limit �� ǥ���� 
		 // Ȯ��� for���� ���ǽ� Ÿ�� ��(Ÿ�� ��
		
		String result = "";
		for(GradeVO vo : grades){  
			 if(vo.getHak().equalsIgnoreCase(hak)){
				 result = vo.toString();
			 }else{
				 result = "��ȸ�� �й��� �ش��ϴ� �л��� �����ϴ�.";
			 }
		 }
		
		
		
		
		return result;
	}
	/*
	 * �̸����� ������ �˻��ؼ� ����ϴ� �޼ҵ�
	 * 
	 * (non-Javadoc)
	 * @see japi.util.vector.GradeService#searchGradeByName(java.lang.String)
	 */

	
	@Override
	public Vector<String> searchGradeByName(String name) {
		Vector<String> vc = new Vector<String>();
		//���ͳ� ��Ÿ �÷��� ����� �ϰ� �Ǹ�..
		//���ͷ����� �ƴϸ� Ȯ�� for ������ ó���Ѵ�.
		//�ֳĸ� Ȯ�� for���� �ε���
		/*
		 * grades�� �� �� �ִ� ������ ����ʵ忡 �����Ͽ�
		 * ���� Ŭ���� ������ �޼ҵ���� ���� �����ϱ� ������
		 * 
		 * 
		 */
		for(GradeVO vo : grades){
			if(vo.getName().equalsIgnoreCase(name)){
				/*
				 * �Ķ���ͷ� �Ѿ�� �̸��� ������ VO ��ü��
				 * ã�Ƽ� sTRING ���·� ���͸� �����Ѵ�.
				 * �� VC �� String Ÿ���̶��� ���� �ϼ��� !!
				 * GradeVO Ÿ���� �ƴմϴ�.
				 */
				vc.add(vo.toString());
			}
		}
		
		return vc;  //���ϰ��� ���� ������ ������ �����̴�.
	}
	/*
	    ���� ���� �������� ������������ ���Ľ�Ű�� �޼ҵ�
	*
	*/

	@Override
	public void descGradeTotal() {
		// TODO Auto-generated method stub
		
	}
	/*
	 * 
	 * 
	 * (non-Javadoc)
	 * @see japi.util.vector.GradeService#ascGradeTotal()
	 */

	@Override
	public void ascGradeTotal() {
		// TODO Auto-generated method stub
		
	}
	

}
