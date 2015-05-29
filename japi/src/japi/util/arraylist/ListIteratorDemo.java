package japi.util.arraylist;

import java.util.ArrayList;

import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

	  public static void main(String[] args) {
		  List<String> list = new ArrayList<String>();
			
			list.add("1");
			list.add("2");
			list.add("3");
			list.add("4");
			list.add("5");
		  
			ListIterator<String> it = list.listIterator(list.size());
		  /*
		   * �ٷδ� �ȳ����ϱ�...
		   * Java API �� ����
		   * Java.util.List ���������� ListIterator �� ����
		   * listIterator()
		   * listIterator(int index)
		   * �ΰ��� ���°� �ִµ�...
		   * �Ķ���Ͱ� ���� ���� �������� �� �� ������ ������
		   * ����� �ǰ�, �Ķ����(list.size)�� ������
		   * �� �Ķ���Ͱ� �ε��� ��Ȱ�� �ؼ� �ٷ� ���������� ��µȴ�.
		   * ����, �Ķ���Ͱ� �ִ� ���¸� ��õ��.
		   */
			
			
			
			System.out.println("������ ���");
		  /*
		   * 
		   * ��Ŭ���� �������� �ڵ� ���� ��Ű��
		   * �Ʒ� ���ǽĿ� it.hasNext() �� �����˴ϴ�.
		   * ���� ����� ���ؼ��� hasPrevious() ��� �ٲ��ش�.
		   */
		  
		  while (it.hasPrevious()) {
			//String string = (//String) it.next();
			System.out.print(it.previous()+" ");
		}
		  
		  
	}
}
