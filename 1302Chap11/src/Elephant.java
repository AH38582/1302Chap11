
public class Elephant extends Animal {
//	location: String, lastSeen: java.util.Date, gender: String
	private String location, gender, breed;
	private java.util.Date lastSeen;

//	default constructor
	public Elephant() {
		super();
		setName("Elephant");
		setBreed("African Savanna Elephant");
		setGender("F");
		setWeight(4000);
		setHeight(7);
	}

//	convenience constructor
//	height: double, weight: double, name: String, breed: String
	public Elephant(double height, double weight, String name, String breed) {
		setHeight(height);
		setWeight(weight);
		setName(name);
		setBreed(breed);
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public java.util.Date getLastSeen() {
		return lastSeen;
	}

	public void setLastSeen(java.util.Date lastSeen) {
		this.lastSeen = lastSeen;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	
//	makeNoise(): String, override
	@Override
	public String makeNoise() {
		return "elephant noise";
	}

	// toString: String, override
	@Override
	public String toString() {
		return String.format("""
				%sBreed: %s
				Gender: %s
				Location: %s
				Last seen: %s
				""".formatted(super.toString(), getBreed(), getGender(), getLocation(), getLastSeen()));
	}

}
