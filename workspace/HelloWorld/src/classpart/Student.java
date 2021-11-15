package classpart;

public class Student {

	private static int id = 0;
	private int studentID;
	private String studentName;
	private int grade;
	private String address;
	private MyDate birth;
	
	public Student(String name, int grade, String address)
	{
		this.studentID = id++;
		this.studentName = name;
		this.grade = grade;
		this.address = address;
		this.birth = new MyDate();
		this.birth.setDate(1600, 6, 12);
	}
	
	public void setBirth(int year, int month, int day)
	{
		this.birth.setDate(year, month, day);
	}
	
	public String toString()
	{
		return String.format("ID: %d\nName: %s\nGrade: %d\nAddress: %s\nbirth: %s", studentID, studentName, grade, address, birth);
	}
}
