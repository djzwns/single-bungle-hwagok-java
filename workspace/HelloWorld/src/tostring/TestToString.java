package tostring;

import java.io.FileInputStream;
import java.util.Scanner;

public class TestToString {

	public static void main(String[] args)
	{
		String str = "Test";
		System.out.println(str);
		Integer il = new Integer(100);
		System.out.println(il.toString());
		
//		try
//		{
//			FileInputStream file = new FileInputStream("a.txt");
//			System.out.println("file open");
//			file.close();
//		} catch(Exception e)
//		{
//			System.out.println(e.getMessage());
//		}
		
//		System.out.println("알파벳 입력 후 [Enter] 를 누르세요.");
//		int i;
//		try
//		{
//			while ((i = System.in.read()) != -1)
//			{
//				System.out.print((char)i);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름");
		String name = scanner.nextLine();
		System.out.println(name);
		
		System.out.println("학번");
		int num = scanner.nextInt();
		System.out.println(num);
	}
}

class ToStringClass
{

	@Override
	public String toString() {
		return "ToStringClass []";
	}
	
	
}