package lesson7;

public abstract class Plane extends Air—ontrol{

	private double height;
	private double width;
	private double weight;
	
	

	public Plane(double height, double width, double weight) {
		super();
		this.height = height;
		this.width = width;
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
	}

	public double getWeight() {
		return weight;
	}

	abstract void startingEngines();

	abstract void takeoff();

	abstract void landing();
}
