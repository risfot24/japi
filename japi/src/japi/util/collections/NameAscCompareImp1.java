package japi.util.collections;

import java.util.Comparator;

public class NameAscCompareImp1 implements Comparator<GradeVO>{

	/*
	 * 
	 * �̸����� �������� ����
	 * ��,��, ��....
	 * A , B, C ...
	 * 
	 */
	
	
	@Override
	public int compare(GradeVO first, GradeVO second) {
		
		return first.getName().compareTo(second.getName());
	      /*
	       * �ڿ� �Ķ���Ϳ� �ִ� �� ���ڿ� ���ؼ� 
	       * �ձ��ڰ� ���� ������ ���ڶ�� �� ���ں��� �����ض�.
	       * 
	       * �ε��� ������ �Ѱ��̴�...
	       */
	  
	}

}
