package car;

public class Car implements Movable {

	public void speedUp(int amount) 
	{
		System.out.println("속도를 " + amount + "km/h로 높입니다.");
	}
	
	public void speedDown(int amount)
	{
		System.out.println("속도를 " + amount + "km/h로 늦춥니다.");
	}
	
	public void TurnLeft() 
	{
		System.out.println("좌회전 합니다");
	}
	
	public void TurnRight() 
	{
		System.out.println("우회전 합니다");
	}
}
