package challenge;

import java.util.ArrayList;
import java.util.Scanner;

//1. 추가 2. 검색 3. 삭제 4. 성적출력 5. 종료
public class StudentManager {
	
	private ArrayList<Student> students;
	private Scanner scanner;
	
	public StudentManager()
	{
		students = new ArrayList<Student>();
		scanner = new Scanner(System.in);
	}

	public void add()
	{
		try
		{
			System.out.print("이름:");
			String name = scanner.nextLine();
			
			System.out.print("국어 점수:");
			int kor = Integer.parseInt(scanner.nextLine());
			
			System.out.print("영어 점수:");
			int eng = Integer.parseInt(scanner.nextLine());
			
			System.out.print("수학 점수:");
			int mat = Integer.parseInt(scanner.nextLine());
			
			Student s = new Student(name);
			if (!s.setScore(kor, eng, mat))
				return;
			
			students.add(s);
			System.out.println("학생 등록 완료!!");
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public void search()
	{
		System.out.print("조회할 학생 이름 입력: ");
		String name = scanner.nextLine();
		
		students.forEach(s -> {
			if (name.equals(s.getName())) {
				System.out.println(s);
			}
		});
		
		System.out.println("학생 조회 완료");
	}
	
	public void remove()
	{
		System.out.println("삭제할 학생 이름 입력: ");
		String name = scanner.nextLine();
		
		int delIndex = 0;
		for (delIndex = 0; delIndex < students.size(); ++delIndex)
		{
			if (name.equals(students.get(delIndex).getName()))
			{
				break;
			}
		}
		
		if (delIndex >= students.size())
		{
			System.out.println("등록되지 않은 학생입니다.");
			return;
		}
		
		students.remove(delIndex);
		System.out.println("학생 삭제 완료");
	}
	
	public void scoreInfo()
	{
		if (students.size() <= 0) {
			System.out.println("등록된 학생이 없습니다.");
			return;
		}
		
		for (Student s: students)
		{
			System.out.println(s);
		}
	}

	public void run()
	{		
		int num = 0;
		boolean exit = false;
		
		while (!exit)
		{
			System.out.println("-- 학생 관리 프로그램 -----");
			System.out.println(" 1. 등록");
			System.out.println(" 2. 조회");
			System.out.println(" 3. 삭제");
			System.out.println(" 4. 성적출력");
			System.out.println(" 5. 종료");
			System.out.println("----------------------");
			System.out.print("입력: ");	
			try
			{
				num = Integer.parseInt(scanner.nextLine());
				switch (num)
				{
				case 1: 
					add();
					break;
				case 2:
					search();
					break;
				case 3:
					remove();
					break;
				case 4:
					scoreInfo();
					break;
				case 5:
					exit = true;
				}
			}
			catch (Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
	}
}
