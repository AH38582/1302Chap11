
public class Animal {
//	height double, weight double, name String
	private double height, weight;
	private String name;

//	Default constructor
	public Animal() {
		setHeight(1);
		setWeight(1);
		setName(" ");
	}

//	Convenience constructor
//	height, weight, name
	public Animal(double height, double weight, String name) {
		this();
		setHeight(height);
		setWeight(weight);
		setName(name);
	}

//	get/set methods
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	makeNoise():String
	public String makeNoise() {
		return "growl";
	}
	

//	toString(): String, override
	
	@Override
	public String toString() {
		return String.format("""
				Animal name: %s
				Height: %.1f
				Weight: %.1f
				""".formatted(getName(), getHeight(), getWeight()));
	}

}
