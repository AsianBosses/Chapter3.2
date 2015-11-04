public class Car{
	private String color;
	private int horsePower;
	private int engineSize;

	public String getColor(){
		return color;
	}

	public void setColor(String color){
		this.color = color;
	}

	public int getHorsePower(){
		return horsePower;
	}

	public void setHorsePower(int horsePower){
		this.horsePower = horsePower;
	}
	public int getEngineSize(){
		return engineSize;
	}
	public void setEngineSize(int engineSize){
		this.engineSize = engineSize;
	}
	public Car(){
		this.color = "No color yet";
		this.horsePower = 0;
		this.engineSize = 0;
	}
	public Car(String newColor, int newHorsePower, int newEngineSize){
		this.color = newColor;
		this.horsePower = newHorsePower;
		this.engineSize = newEngineSize;
	}

	public void to_String(){
		System.out.println("Car color is: " + color);
		System.out.println("Horse power is: " + horsePower);
		System.out.println("Engine Size is: " + engineSize + "\n");
	}
}
