package challenge;

import java.util.ArrayList;
import java.util.Scanner;

//1. �߰� 2. �˻� 3. ���� 4. ������� 5. ����
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
			System.out.print("�̸�:");
			String name = scanner.nextLine();
			
			System.out.print("���� ����:");
			int kor = Integer.parseInt(scanner.nextLine());
			
			System.out.print("���� ����:");
			int eng = Integer.parseInt(scanner.nextLine());
			
			System.out.print("���� ����:");
			int mat = Integer.parseInt(scanner.nextLine());
			
			Student s = new Student(name);
			if (!s.setScore(kor, eng, mat))
				return;
			
			students.add(s);
			System.out.println("�л� ��� �Ϸ�!!");
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public void search()
	{
		System.out.print("��ȸ�� �л� �̸� �Է�: ");
		String name = scanner.nextLine();
		
		students.forEach(s -> {
			if (name.equals(s.getName())) {
				System.out.println(s);
			}
		});
		
		System.out.println("�л� ��ȸ �Ϸ�");
	}
	
	public void remove()
	{
		System.out.println("������ �л� �̸� �Է�: ");
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
			System.out.println("��ϵ��� ���� �л��Դϴ�.");
			return;
		}
		
		students.remove(delIndex);
		System.out.println("�л� ���� �Ϸ�");
	}
	
	public void scoreInfo()
	{
		if (students.size() <= 0) {
			System.out.println("��ϵ� �л��� �����ϴ�.");
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
			System.out.println("-- �л� ���� ���α׷� -----");
			System.out.println(" 1. ���");
			System.out.println(" 2. ��ȸ");
			System.out.println(" 3. ����");
			System.out.println(" 4. �������");
			System.out.println(" 5. ����");
			System.out.println("----------------------");
			System.out.print("�Է�: ");	
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
