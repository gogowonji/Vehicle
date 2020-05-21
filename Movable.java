package car;

public interface Movable {
	public void speedUp(int amount); //속도 높이기 
	public void speedDown(int amount); //속도 낮추기
	final int speed = 100; //속도 설정
	static void printSpeed()
	{
		System.out.println("현재 속도는 " + speed);
	}
}
