package japi.util.hashMap;

import java.util.HashMap;
import java.util.Map;

public class MemberServiceImp1 implements MemberService {

	/*ȸ������ ����� �ϴ� �޼ҵ�
	 * HashMap ���� �ؾ� id ���� ������ password �� ȣ���ϰڱ���!!
	 * Ű ��Ʈ�� ���� ������ �ؾ��ϱ� ������..?? ,Ű ���� ������ ����Ǵ� ����� HashMap �ۿ� ����..
	 * 
	 * */
	MemberVO vo = new MemberVO();
	Map<String,Object> map = new HashMap<String, Object>();//Ŭ���� ���� �����ؾ� �ϴ°� �޼ҵ� ���� �����ؾ� �ϱ⶧����
    //�������̽��� �� Ÿ���� �� hashMap�� �����߽��ϴ�.
   
	
	//haspmap �� ���߷� �Ǿ� �ִ� �ּҷ� �Ǿ��ִ�?  //���� String ���� �ּҸ� ������ �ִ�..
	@Override
	public void join(String id, String password, String name, int age,
			String addr) {
		//���� ��!
		/*
		 * �� ������ DB �� �����ϴ� ���ϰ� ��ġ �Ѵ�.
		 * ��!, ���� Ȱ���ϸ鼭 �����ǰų� ������ �� �ֱ⿡
		 * ���� ���� �������� DB�� �����ϰ� ����.
		 * */
		
		//�����Ǳ����� db�� ���� ����ִ´�.
		vo.setAddr(addr);
		vo.setAge(age);
		vo.setId(id);   // ID�� ..
		vo.setName(name);
		vo.setPassword(password); // �н����� �� Ű��?
		/*
		 * 1. ù��° ���� ����
		 * map.put(vo.getId() , vo.getPassword());
		 * 
		 */
	    
		
		
		
		
		
		map.put("id", vo.getId());// " "���ȭ..//�� �������� ���� object ���·� �ش�. //���Ǯ ����� Ű���� ������´�.
	                                           //static�� ���� ����.. �׷��� ��..�ƴϴ�.. ����ƽ�� �޸� �������� ����.
	       //String type����  id�� �ִ°��� ����ƽ���� �޸� ������ ����.
	    map.put("password", vo.getPassword()); //" " �ĺ�
	    map.put("name", vo.getName());
	    map.put("age", String.valueOf(vo.getAge()));
	    //Ű �� ���� ���Ͽ��� ���������� String ���� ���Ͻ��Ѷ�
	    //int Ÿ������ ���� age �� String Ÿ������ ��ȯ�Ͽ���.
	    map.put("addr", vo.getAddr());
	     /*
	      * 2. �ι�° ���� ����
	      * map.put("age", vo.getAge());
	      */
	    
	    
	    
	}
	/*ȸ������ �� �α��� ����� �ϴ� �޼ҵ�
	 * ���ٸ� ���� �����ϱ�..
	 * �α��� ����, ���� �޽������� ���⿡�� ��������� ��.
	 * 
	 * */
	
	@Override
	public void login(String id, String password) {
		/*
		 * 3. ����° ���� ����
		 * met.get(id) => �Ķ���� ������ �ݵ�� String���� �ؾ� ��.
		 * 
		 */
		
		
		if (map.get("id").equals(id) && map.get("password").equals(password) ) {
			System.out.println("ȯ���մϴ�."+vo.getAddr()+"�� ���"+vo.getAge()+"�� "+vo.getName()+"�� ...");
			
		} else if(!(map.get("id").equals(id) && map.get("password").equals(password)) ) {
             System.out.println("����� �ٸ��ϴ�. �ٽ� �Է����ּ���.");
			
		}
		
	}
	
	// ��¹� ����
		// �Է��Ͻ� ID �� �������� �ʰų� , ��ġ���� �ʽ��ϴ�.
		// ����� �ٸ��ϴ�. , �ٽ� �Է��ϼ���.
		// ȯ���մϴ�. ����ÿ� ��� 20�� ȫ�浿�� ... 

}
