package challenge;

public class Student {
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private float avg;
	
	public Student()
	{
		name = "";
		kor = eng = mat = 0;
	}
	
	public Student(String name)
	{
		this.name = name;
		kor = eng = mat = 0;
	}
	
	public Student(String name, int kor, int eng, int mat)
	{
		this.name = name;
		kor = eng = mat = 0;
		if (setScore(kor, eng, mat) == false)
		{
			System.out.println("점수 입력 실패");
		}
	}
	
	public boolean setScore(int kor, int eng, int mat)
	{
		if (kor > 100 || eng > 100 || mat > 100)
			return false;
		
		if (kor < 0 || eng < 0 || mat < 0)
			return false;
		
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		
		this.avg = (kor + eng + mat) / 3.0f;
		
		return true;
	}
	
	public String getName() { return this.name; }
	public int getKor() { return this.kor; }
	public int getEng() { return this.eng; }
	public int getMat() { return this.mat; }
	
	@Override
	public String toString()
	{
		return String.format("== %s =========\n국어: %d\n영어: %d\n수학: %d\n평균: %f\n=================", name, kor, eng, mat, avg);
	}
}
