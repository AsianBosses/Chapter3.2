import javax.swing.JOptionPane;

/*
Create a Car Class with color, horse power, engine size, and make as instance variable

Including getter and setter methods, toString, constructor with no parameter 

and with parameters (all local variables that matching instance variables)

Create another class named CarDriver that instantiate three car objects from Car class 

and call all the methods from car class.
 */
public class Car {
	private String color;
	private int horsePower;
	private int engineSize;
	private static int count = 0;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}

	public int getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(int engineSize) {
		this.engineSize = engineSize;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Car.count = count;
	}

	public Car() {
		this.color = "No color yet";
		this.horsePower = 0;
		this.engineSize = 0;

	}

	public Car(String newColor, int newHorsePower, int newEngineSize) {
		this.color = newColor;
		this.horsePower = newHorsePower;
		this.engineSize = newEngineSize;
		count++;
	}

	public void to_String() {
		System.out.println("Car color is: " + color);
		System.out.println("Horse Power is: " + horsePower);
		System.out.println("Engine Size is: " + engineSize + "\n");
	}

	public boolean equals(Car anotherCar) {
		if ((this.color.equalsIgnoreCase(anotherCar.color)) && this.horsePower == anotherCar.horsePower
				&& this.engineSize == anotherCar.engineSize) {
			JOptionPane.showMessageDialog(null, "Car1 equals Car2");
			return true;
		} else {
			JOptionPane.showMessageDialog(null, "Car1 does NOT equal Car2");
			return false;
		}
	}
}
