package book;

public class Book {
	private static int _id = 0;
	private int id;
	private String title;
	private String author;
	
	public Book(String title, String author)
	{
		// _id = read.id();
		this.id = _id++;
		this.title = title;
		this.author = author;
	}
	
	protected void finalize() throws Throwable 
	{
		// write.id(_id);
	}
	
	public String toString()
	{
		return String.format("id: %d ===============\ntitle: %s\nauthor: %s\n---------------------", id, title, author);
	}
}
