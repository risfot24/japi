package japi.util.hashMap;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//import java.util.*;
//�����Ѱ��� �����´ٴ°� �о����鼭 �ӵ��� ����������!!!
 
public class KeySetDemo {   

	public static void main(String[] args) {
		//String object�� �����ϴ°���
		
		/*
		 * Map �� ���� �Է��ϴ� ��� => 1������ ����
		 * 
		 * */
		
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("�迬��", new Integer(98));
		map.put("�ƻ�� ����", new Integer(66));   
		map.put("��Ʈ�� �ڹ�", new Integer(10));
		
		/*
		 * Gof �� ������ ���� �߿���
		 * Iterator �����̶�� �Ҹ����
		 * Map ���� ���� �����ϴ� ����ȭ�� �����̴�.
		 * 
		 */
		
		/*
		 * �ʿ��� Ű���� �������� ���� ��Ȳ�� ���� ����Ҷ���
		 * entrySet() ���
		 * keySet() ���
		 * ��, ��� ������ Set �̿�
		 * ������.. �÷��ǿ��� 
		 * �������̽��� Set , List , Map ������ ��ǥ���ε� ...
		 * Set �� Map �� �ε��� ���� ��� ��ȣ ȣȯ�� �ߵǰ�
		 * Set �� �ߺ��� ���� ����� �־
		 * Map ���� Ű������ �ߺ��� ����� �ϴ� �κа��� ��ġ��
		 * Set �� ���� ű��, Ȥ�� Ű + �������� ����ϴµ� ���δ�.
		 * ����� ���� Iterator �� ����ϱ� �����̴�.
		 * 
		 */
		
		//Set set = map.keySet();
	  
	    /*
	     * Map ���� ���� ����ϴ� ���� 3�����ε�..
	     * ù��°�� Ű + ���� ���·� �Բ� ����ϴ� ���
	     * entrySet() + Iterator ���� ��� 
	     * 20������ ���ӽ� ������ ���� Ʃ�丮�� �� ��ø� �Ͽ���... �Ŀ�...
	     * ������ ������ Gof (������ 4�ι�) �̶�� ������� �������
	     * 
	     */
		
		     //Iterator<String> it = set.iterator();//object�� �޾Ƽ� ����??
		  Set set = map.entrySet();   
		Iterator it = set.iterator();
		while (it.hasNext()) {
			// String string = (// String) it.next();
			
			Map.Entry e = (Map.Entry)it.next();
			// ���ʸ��� ������� �ʰ� ��� Ÿ���� �� �ްڴ�.
			// Entry�� �̳� Ŭ���� ��Ҹ� ����, Map�� �ִ� ����� key, value ���
			
			System.out.println("������ : "+e.getKey()+", ���� : "+e.getValue());
			
		}
		/*
	     * Map ���� ���� ����ϴ� ���� 3�����ε�..
	     * �ι�°�� Ű ���·� �Բ� ����ϴ� ���
	     * keySet() ��� 
	      
	     */
		set = map.keySet();
		System.out.println("������ ��� : "+set); //set�� �Ⱥپ���..
	
	   
		/*
	     * Map ���� ���� ����ϴ� ���� 3�����ε�..
	     * ����°�� ����(��) ���·� �Բ� ����ϴ� ���
	     * Collaction ��� 
	     
	     */
		//Collection ���� ��Ŭ���� ���� �߿��� java.util.Collection ����
		Collection values = map.values();
	    it = values.iterator();
	   
	   int total = 0 ;
	   
	   while (it.hasNext()) {
		//String string = (//String) it.next();
		Integer i = (Integer) it.next();
		total += i.intValue();
		   
		 }
		
	   System.out.println("���� : " + total);
	   //Set �� List �迭�� Ŭ����ó�� ����� ������ size() ���Ѵ�.
	   System.out.println("��� : " + total/set.size());
	   
	   System.out.println("���� : " + Collections.max(values));  //Collection �� �ƴϴ�.
	   System.out.println("���� : " + Collections.min(values));
		
		
		
	}

}
