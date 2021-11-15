package polymorphism;

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		moveAnimal(new Tiger("È£¶û"));
		moveAnimal(new Human("ÈÞ-¸Õ"));
	}
	
	public static void moveAnimal(Animal animal)
	{
		animal.move();
	}
}
