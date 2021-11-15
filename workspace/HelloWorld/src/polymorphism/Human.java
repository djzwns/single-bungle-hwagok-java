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
		System.out.println(String.format("%s (ÀÌ)°¡ ¶Ñ¹÷¶Ñ¹÷ °È´Â´Ù.", getName()));
	}
}
