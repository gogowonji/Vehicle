package car;

public class Car implements Movable {

	public void speedUp(int amount) 
	{
		System.out.println("�ӵ��� " + amount + "km/h�� ���Դϴ�.");
	}
	
	public void speedDown(int amount)
	{
		System.out.println("�ӵ��� " + amount + "km/h�� ����ϴ�.");
	}
	
	public void TurnLeft() 
	{
		System.out.println("��ȸ�� �մϴ�");
	}
	
	public void TurnRight() 
	{
		System.out.println("��ȸ�� �մϴ�");
	}
}
