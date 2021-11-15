package book;

import java.util.ArrayList;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Book[] library = {
//				new Book("트렌드 코리아 2022", "김난도, 이준영, 이향은"),
//				new Book("거꾸로 읽는 세계사", "유시민"),
//				new Book("작은 별이지만 빛나고 있어", "소윤"),
//				new Book("주식투자 절대원칙", "박영옥"),
//				new Book("인생의 답은 내 안에 있다", "김이섭"),
//		};
		
		ArrayList<Book> library = new ArrayList<Book>();
		library.add(new Book("트렌드 코리아 2022", "김난도, 이준영, 이향은"));
		library.add(new Book("거꾸로 읽는 세계사", "유시민"));
		library.add(new Book("작은 별이지만 빛나고 있어", "소윤"));
		library.add(new Book("주식투자 절대원칙", "박영옥"));
		library.add(new Book("인생의 답은 내 안에 있다", "김이섭"));
		
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
