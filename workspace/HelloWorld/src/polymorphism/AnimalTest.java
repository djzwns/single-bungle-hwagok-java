package polymorphism;

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		moveAnimal(new Tiger("ȣ��"));
		moveAnimal(new Human("��-��"));
	}
	
	public static void moveAnimal(Animal animal)
	{
		animal.move();
	}
}
