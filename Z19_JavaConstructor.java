
public class Z19_JavaConstructor {

	public static void main(String[] args) {
		
	// Special method that is called when an object is instantiated (created)

		Human human1 = new Human("Whiskey", 20, 10);
		Human human2 = new Human("Rick",15,35 );
		System.out.println(human1.name);
		
		human1.eat();
		human2.drinking();
		
	}

}
