package polymorphism;

public class Tiger extends Animal
{
	public Tiger(String name)
	{
		super(name);
	}
	
	@Override 
	public void move()
	{
		System.out.println(String.format("%s (��)�� ������ �޸���.", getName()));
	}
}