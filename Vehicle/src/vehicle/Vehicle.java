package vehicle;

abstract class Vehicle {
	
	int speed;
	abstract double getkilosPerLiter();
	public void printSpeed()
	{
		System.out.println("현재 속도는 " + speed + "입니다.");
	}
}
