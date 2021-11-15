package classpart;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student lee = new Student("이순신", 0, "전남");
		Student kim = new Student("김유신", 0, "경상도");
		lee.setBirth(1994, 2, 4);
		kim.setBirth(1999, 8, 8);
		System.out.println(lee);
		System.out.println(kim);
	}

}
