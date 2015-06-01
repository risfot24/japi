package japi.util.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GradeSortMain {
 
	public static void main(String[] args) {
		List<GradeVO> grades = new ArrayList<GradeVO>();
		
		GradeVO g1 = new GradeVO("2015", "홍길동", 90,80, 70);
		GradeVO g2 = new GradeVO("2014", "김길동", 20,60, 70);
		GradeVO g3 = new GradeVO("2013", "장길동", 100,60, 70);
		GradeVO g4 = new GradeVO("2012", "문길동", 85,65, 70);
		
		grades.add(g1);
		grades.add(g2);
		grades.add(g3);
		grades.add(g4);
		/*
		 * anonymous 생성자 처리 : 단 한 번만 쓰고 버리겠다.
		 */
		//grades.add(new GradeVO("2014","최길동" , 90,90,90); 한번할당하고 바로 끝내는것!!
		
		
		
		System.out.println("이름 오름차순 정렬");
		Collections.sort(grades , new NameAscCompareImp1());
		for(GradeVO grade : grades){
			System.out.println(grade);
		}
		
		System.out.println("이름 내림차순 정렬");
		Collections.sort(grades, new NameDescCompareImp1());
		for(GradeVO grade : grades){
			System.out.println(grade);
		}
		
		System.out.println("총점 오름차순 정렬");
		Collections.sort(grades , new TotalAscCompareImp1());
		for(GradeVO grade : grades){
			System.out.println(grade);
		}
		
		System.out.println("총점 내림차순 정렬");
		Collections.sort(grades, new TotalDescCompareImp1());
		for(GradeVO grade : grades){
			System.out.println(grade);
		}
		

	}

}
