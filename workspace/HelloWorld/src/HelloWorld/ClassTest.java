package HelloWorld;

public class ClassTest {
	public int iValue = 0;
	private int iPrivateValue = 100;
	
	public String toString()
	{
		return String.format("iVal = %d\nipVal = %d", iValue, iPrivateValue);
	}
}
