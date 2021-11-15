package classpart;

public class MyDate {
	private int year;
	private int month;
	private int day;
	
	public void setYear(int year)
	{
		this.year = Math.max(0, Math.min(9999, year));
	}
	
	public void setMonth(int month)
	{
		this.month = Math.max(1, Math.min(12, month));
	}
	
	public void setDay(int day)
	{
		int maxDay = 30;
		switch(month)
		{
		case 1: case 3: case 5: case 7: 
		case 8: case 10: case 12:
			maxDay = 31; 
			break;
		case 2:
			maxDay = 28;
			break;
		}
		this.day = Math.max(1, Math.min(maxDay, day));
	}
	
	public void setDate(int year, int month, int day)
	{
		setYear(year);
		setMonth(month);
		setDay(day);
	}
	
	public void setDate(int month, int day)
	{
		setMonth(month);
		setDay(day);
	}
	
	public String toString()
	{
		return String.format("%d-%d-%d", year, month, day);
	}
}
