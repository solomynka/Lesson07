package lesson7;


public class Su_27 extends Plane implements Strike, Stealth, Turbo {


	double speed;
	String colour;

	
	public Su_27(double height, double width, double weight, double speed, String colour) {
		super(height, width, weight);
		this.speed = speed;
		this.colour = colour;
	}

	public double getSpeed() {
		return speed;
	}

	public String getColour() {
		return colour;
	}
		

	@Override
	void startingEngines() {
		System.out.println("До польоту залишилось " + (Math.random() * 66 + 20) + " секунд");

	}

	@Override
	void takeoff() {
		System.out.println("Літак пролетить " + (Math.random() * 1000) + " км");
	}

	@Override
	void landing() {
		System.out.println("Літак іде на посадку");

	}

	@Override
	public void turboAcceleration() {
		System.out.println("Турбо швидкість " + (Math.random() * 2000) + " км/год");
	}

	@Override
	public void stealthTech() {
		System.out.println("Літак невидимий протягом " + (Math.random() * 500) + " сек");
	}

	@Override
	public void strikeNuclear() {
		System.out.println("Боєголовок скинуто: " + ((int) ( Math.random() * 10 )));
	}

	@Override
	public void moveDown() {
		super.moveDown();
	}

	@Override
	public void moveUp() {
		super.moveUp();
	}

	@Override
	public void moveRight() {
		super.moveRight();
	}

	@Override
	public void moveLeft() {
		super.moveLeft();
	}
	
	

}
