package japi.util.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*���Ϳ��� ����ȭ �κ� �� ���� �� ���� �Դ�..*/
/*
 java.util.ArrayList �� �޼ҵ���
 add() �� Vector �� �����ϴ�.
  
 */
//�ٸ� �÷��� �������̽��� for�� ���µ�
// arraylist , vector �� 

public class Addarlist {
	public static void main(String[] args) {
		/*
		 * ���ʹ� ���������� String �� ���.
		 * �ӵ��� ������ ����ȭ�� �����Ѵ�.
		 * ArrayList �� ���������� StringBuffer �� ����Ѵ�.
		 * ����ȭ ���� ����.
		 * 
		 */
		ArrayList<String> lists = new ArrayList<String>();
		
		//�׸� �߰�
		lists.add("����");
		lists.add("�λ�");
		lists.add("�뱸");
		
		/*
		 * ��� 1. .literator()�̿�
		 * 
		 */
		
		Iterator<String> it = lists.iterator();
		
		while (it.hasNext()) {
			//String string = (//String) it.next();
			//printf �� ����մϴ�.
			System.out.printf("%s",it.next());
			//�� �������� %s�� String Ÿ���� �ǹ��մϴ�.
			//�ڿ� ���� %s �� value �Դϴ�.
		}
		System.out.println();
		/*
		 * 
		 * ��� 2. listIterator() �̿�
		 */
		ListIterator<String> it2 = lists.listIterator();
		
		while (it2.hasNext()) {
			//String string = (//String) it2.next();
			System.out.printf("%s",it2.next());
			
		
		}
		System.out.println();
		/*
		 * ��� 3. previous() �̿�
		 * */
		while (it2.hasPrevious()) {
			//String string = (//String) it2.next();
			// �޼ҵ� ���� �ٲ� �κ� üũ
			System.out.printf("%s", it2.previous());  //next()�ϸ� ��ã�´�. NoSuchElementException
			// �� �޼ҵ�� ListIterator ������ ��밡��
			
		}
		
		// ��ü ��Ҹ� �� ���� �Է�
		// List �������̽��� java.util �Դϴ�.
		List<String> list2 = new ArrayList<String>();
		// �������̽� <���ʸ�> ��������  = new �����Ѱ�ü<���ʸ�>();
		// �����Դϴ�.
		
		list2.addAll(lists); // ����, �λ�, �뱸 �� �����ؼ� ���� ���� ����
		
		/*
		 * ��� 4. Ȯ�� for ��
		 * �ݷ����� �ε����� ���� ������ ���� �־����� �ʴ�
		 * ������°� ���� ������ Ȯ�� for ���� ��� ���ȴ�.
		 * 
		 * 
		 */ 
		
		for(String s : list2){
			System.out.printf("%s",s);
			
		}
		System.out.println();
		
		//�˻� ����� ���� ������ �߰� (���̰� �߰�...)
		list2.add("����");
		list2.add("��õ");
		list2.add("����");
		
		//�ε��� �� �ٸ���  (Ȯ��), �ּҰ��� �ٸ��⶧����.. �ߺ�����
		/*
		 * ��� 5. �˻��ؼ� ���
		 * 
		 */
		
		Iterator<String> it3 = list2.iterator();
		String str;
		while (it3.hasNext()) {
			//String string = (//String) it3.next();
		str = it3.next();
		System.out.printf("%s",str);
		
		
		}
		
		System.out.println();
		
		//������ �ڷ� �Է� ����.. �� �ߺ����� �����
		list2.add("��õ");
		list2.add("��õ");
		list2.add("��õ");
		
		Iterator<String> it4 = list2.iterator();
		while (it4.hasNext()) {
			//String string = (//String) it4.next();
			System.out.printf("%s",it4.next());
			//����� printf ����
			// 10���� ���ڰ��� %d �� d �� deciaml �� �����Դϴ�.
			
		}
		System.out.println();
		
		
	}
	

}
