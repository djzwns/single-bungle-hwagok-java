package book;

import java.util.ArrayList;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Book[] library = {
//				new Book("Ʈ���� �ڸ��� 2022", "�賭��, ���ؿ�, ������"),
//				new Book("�Ųٷ� �д� �����", "���ù�"),
//				new Book("���� �������� ������ �־�", "����"),
//				new Book("�ֽ����� �����Ģ", "�ڿ���"),
//				new Book("�λ��� ���� �� �ȿ� �ִ�", "���̼�"),
//		};
		
		ArrayList<Book> library = new ArrayList<Book>();
		library.add(new Book("Ʈ���� �ڸ��� 2022", "�賭��, ���ؿ�, ������"));
		library.add(new Book("�Ųٷ� �д� �����", "���ù�"));
		library.add(new Book("���� �������� ������ �־�", "����"));
		library.add(new Book("�ֽ����� �����Ģ", "�ڿ���"));
		library.add(new Book("�λ��� ���� �� �ȿ� �ִ�", "���̼�"));
		
		library.forEach(book -> System.out.println(book));
		
//		for(int i = 0; i < library.length; ++i)
//		{
//			System.out.println(library[i]);
//		}
		
//		// enhanced for loop
//		for (Book book: library)
//		{
//			System.out.println(book);
//		}
	}

}
