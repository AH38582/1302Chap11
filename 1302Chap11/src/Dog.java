// 	Dog ---> Animal
public class Dog extends Animal {
//	hadRabiesShot boolean, lastShot java.util.Date, breed String
	private boolean hadRabiesShot;
	private java.util.Date lastShot;
	private String breed;
	
//	Default constructor
	public Dog() {
		super(); // here to remind that static member is incremented in Animal class
		setHeight(3);
		setWeight(2);
		setName("Dog");
		setBreed("Golden Retriever");
	}
	
//	convenience constructor
//	height, weight, name, breed
	public Dog(double height, double weight, String name, String breed) {
		setHeight(height);
		setWeight(weight);
		setName(name);
		setBreed(breed);
	}
	
//	get/set methods
	public boolean isHadRabiesShot() {
		return hadRabiesShot;
	}
	public void setHadRabiesShot(boolean hadRabiesShot) {
		this.hadRabiesShot = hadRabiesShot;
	}
	public java.util.Date getLastShot() {
		return lastShot;
	}
	public void setLastShot(java.util.Date lastShot) {
		this.lastShot = lastShot;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	
//	toString(): String, @override
	
	@Override
	public String toString() {
		return String.format("""
				%sBreed: %s
				Had rabies shot: %b
				Last shot: %s
				""".formatted(super.toString(), getBreed(), isHadRabiesShot(), getLastShot()));
	}
	
	@Override
	public String makeNoise() {
		return "bark";
	}
	
}

