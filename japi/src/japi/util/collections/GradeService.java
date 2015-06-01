package japi.util.collections;

import java.util.Vector;

public interface GradeService {
/* vo ��ü�� input���� ��°��̴�,,...vo��ü�� ���Ϳ� �����ϴ� ���
 * 
 */
	
	public void input(GradeVO vo);// vo : GradeVO
	public void print();
	
	/*�й��� �̿��ؼ� ����ǥ ��� ==> complete*/
	public String searchGradeByHak (String hak); //hak : String
	
	/*
	 * �̸��� �̿��� ����ǥ����ε� �������� ���̽����� 
	 * ���ϰ��� ���ͷ� �޾ƾ� �Ѵ�.
	 * 
	 */
	
	//public String searchGradeByName(String name); // name : String
	public Vector<String> searchGradeByName(String name);
	public void descGradeTotal();
	public void ascGradeTotal();
	
}
