package japi.util.collections;

import java.util.Comparator;

public class NameDescCompareImp1 implements Comparator<GradeVO> {
    /*
     * 
     * �̸����� �������� ����
     */
	
	
	@Override
	public int compare(GradeVO first, GradeVO second) {
		
		return second.getName().compareTo(first.getName());
	}

}
