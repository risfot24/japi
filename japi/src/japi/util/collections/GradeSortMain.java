package japi.util.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GradeSortMain {
 
	public static void main(String[] args) {
		List<GradeVO> grades = new ArrayList<GradeVO>();
		
		GradeVO g1 = new GradeVO("2015", "ȫ�浿", 90,80, 70);
		GradeVO g2 = new GradeVO("2014", "��浿", 20,60, 70);
		GradeVO g3 = new GradeVO("2013", "��浿", 100,60, 70);
		GradeVO g4 = new GradeVO("2012", "���浿", 85,65, 70);
		
		grades.add(g1);
		grades.add(g2);
		grades.add(g3);
		grades.add(g4);
		/*
		 * anonymous ������ ó�� : �� �� ���� ���� �����ڴ�.
		 */
		//grades.add(new GradeVO("2014","�ֱ浿" , 90,90,90); �ѹ��Ҵ��ϰ� �ٷ� �����°�!!
		
		
		
		System.out.println("�̸� �������� ����");
		Collections.sort(grades , new NameAscCompareImp1());
		for(GradeVO grade : grades){
			System.out.println(grade);
		}
		
		System.out.println("�̸� �������� ����");
		Collections.sort(grades, new NameDescCompareImp1());
		for(GradeVO grade : grades){
			System.out.println(grade);
		}
		
		System.out.println("���� �������� ����");
		Collections.sort(grades , new TotalAscCompareImp1());
		for(GradeVO grade : grades){
			System.out.println(grade);
		}
		
		System.out.println("���� �������� ����");
		Collections.sort(grades, new TotalDescCompareImp1());
		for(GradeVO grade : grades){
			System.out.println(grade);
		}
		

	}

}
