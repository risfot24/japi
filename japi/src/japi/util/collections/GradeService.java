package japi.util.collections;

import java.util.Vector;

public interface GradeService {
/* vo 객체를 input으로 담는것이다,,...vo객체를 벡터에 저장하는 기능
 * 
 */
	
	public void input(GradeVO vo);// vo : GradeVO
	public void print();
	
	/*학번을 이용해서 성적표 출력 ==> complete*/
	public String searchGradeByHak (String hak); //hak : String
	
	/*
	 * 이름을 이용한 성적표출력인데 동명이인 케이스까지 
	 * 리턴값을 벡터로 받아야 한다.
	 * 
	 */
	
	//public String searchGradeByName(String name); // name : String
	public Vector<String> searchGradeByName(String name);
	public void descGradeTotal();
	public void ascGradeTotal();
	
}
