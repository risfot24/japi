package japi.util.collections;

import java.util.Comparator;

public class TotalAscCompareImp1 implements Comparator<GradeVO>{

	@Override
	public int compare(GradeVO first, GradeVO second) {
		
		return (first.getTotal() < second.getTotal()) ? 
				-1 : (first.getTotal() > second.getTotal()) ?
						  1 : 0 ;
	
	     //꺽세만 다 바꿔주면 total 도 구해진다.
	
	}

}
