package japi.util.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 ���׸�(generics)
  - �÷����� ������ ���
  - ��� ������ ������ Ÿ���� �ٷ� �� �ֵ��� �Ϲ�ȭ�� Ÿ��
  -   �Ű������� Ŭ������ �޼ҵ带 �ۼ��ϴ� ���
         �÷��� Ŭ�������� Ÿ�� �Ķ���ͷ� ���Ǵ� ���ڴ� �ٸ� ���� ��
         ȥ���� ���ϱ� ���� �Ϲ������� ������ ���� ǥ����.
      E : Element Set<E> set
      T : Type Set<T> set
      V : value
      K : key Map<K,V>   
 * 
 */
   /*
       ���׸��� ���������� Ÿ�Կ� ���ؼ��� ����� �� �ִ�.
       �⺻ ������ Ÿ�Կ����� ����� �� ����.
       Ŭ������ ������ ���� ������ Ÿ���� �������� �ʰ�
       �ν��Ͻ��� ������ �� ������ Ÿ���� �����ϴ� ���
   
   * */
public class GenericSyntax {  //SET �� ����Ÿ���̰� ���� ��ȯ Ÿ���� E Ÿ���� �Ѵ�..
     public <E> Object test(Set<E> map){
    	 return null;
     }
     public <K,V> void test2(){
    	 Map<K,V> map = new HashMap<K,V>(); //���ϰ��� �������� ������ �ִ°��̴�.
    	 
     }
	
}
