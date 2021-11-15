package HelloWorld;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello World");
		System.out.println("Test asdfasdf");
		int level = 10;
		System.out.println(String.format("my level is %d.", level));
		long ldata = 1000L;
		double ddata = 10.00001;

		String istr = Integer.toString(level);
		String lstr = Long.toString(ldata);
		String dstr = Double.toString(ddata);
		
		double dd = Double.parseDouble(dstr);
		long ll = Long.parseLong(lstr);
		int ii = Integer.parseInt(istr);
		
		System.out.println(String.format("parse int: %s\nparse double: %s\nparse long: %s", istr, dstr, lstr));
		
		ClassTest test = new ClassTest();
		test.iValue = 10;
		System.out.println(test);
		
		TestInClass ti = new TestInClass();
		ti.dd = 10;
		
	}

}

class TestInClass
{
	int dd;
}
