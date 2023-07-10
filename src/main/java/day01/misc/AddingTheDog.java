package day01.misc;

public class AddingTheDog {

	// Attributes
	private boolean hasDots;
	private String color;

	// Constructor
	public AddingTheDog(boolean hasDots, String color) {
		this.hasDots = hasDots;
		this.color = color;
	}

	// Getters and setters
	public boolean hasDots() {
		return hasDots;
	}

	public void setHasDots(boolean hasDots) {
		this.hasDots = hasDots;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// Main method to create Dog objects
	public static void main(String[] args) {
		// Create two Dog objects
		AddingTheDog dog1 = new AddingTheDog(true, "purple");
		AddingTheDog dog2 = new AddingTheDog(true, "blue");

		// Print the attributes of each Dog
		System.out.println("Dog 1:");
		System.out.println("Has Dots: " + dog1.hasDots());
		System.out.println("Color: " + dog1.getColor());

		System.out.println("Dog 2:");
		System.out.println("Has Dots: " + dog2.hasDots());
		System.out.println("Color: " + dog2.getColor());
	}

}
