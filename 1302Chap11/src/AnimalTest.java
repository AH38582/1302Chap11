
public class AnimalTest {

	public static void main(String[] args) {
		Animal a1 = new Animal();
		System.out.println(a1);
		System.out.println(a1.makeNoise());
		System.out.println();
		
		Dog d1 = new Dog();
		System.out.println(d1);
		
		Dog doberman = new Dog(24.0, 60, "Dog", "Doberman");
		doberman.setHadRabiesShot(true);
		
		System.out.println(doberman);
		System.out.println(doberman.makeNoise());
		
		Elephant ase = new Elephant();
		ase.setLocation("Africa");
		System.out.println(ase);
		System.out.println(ase.makeNoise());
		
		
		System.out.println(Animal.getNumOfAnimals());
	}

}
