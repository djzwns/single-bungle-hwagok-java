package polymorphism;

public class Human extends Animal 
{
	public Human(String name)
	{
		super(name);
	}
	
	@Override
	public void move()
	{
		System.out.println(String.format("%s (��)�� �ѹ��ѹ� �ȴ´�.", getName()));
	}
}
