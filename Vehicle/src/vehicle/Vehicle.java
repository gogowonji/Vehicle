package vehicle;

abstract class Vehicle {
	
	int speed;
	abstract double getkilosPerLiter();
	public void printSpeed()
	{
		System.out.println("���� �ӵ��� " + speed + "�Դϴ�.");
	}
}
