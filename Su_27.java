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
		System.out.println("�� ������� ���������� " + (Math.random() * 66 + 20) + " ������");

	}

	@Override
	void takeoff() {
		System.out.println("˳��� ��������� " + (Math.random() * 1000) + " ��");
	}

	@Override
	void landing() {
		System.out.println("˳��� ��� �� �������");

	}

	@Override
	public void turboAcceleration() {
		System.out.println("����� �������� " + (Math.random() * 2000) + " ��/���");
	}

	@Override
	public void stealthTech() {
		System.out.println("˳��� ��������� �������� " + (Math.random() * 500) + " ���");
	}

	@Override
	public void strikeNuclear() {
		System.out.println("��������� �������: " + ((int) ( Math.random() * 10 )));
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
