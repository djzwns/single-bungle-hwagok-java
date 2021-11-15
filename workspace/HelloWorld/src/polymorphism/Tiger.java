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
		System.out.println(String.format("%s (이)가 빠르게 달린다.", getName()));
	}
}