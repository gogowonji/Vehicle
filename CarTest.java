package car;

public class CarTest {

	public static void main(String[] args)
	{
		/*
		Car c1 = new Car();
		c1.speedUp(50);
		c1.speedDown(30);
		
		Movable m = new Car();
		m.speedUp(); //�Ұ���
		m.TurnLeft(); //�Ұ���
		*/
		
		Movable m = new Car();	// ��ü�� ������� ������ ���â ��	
		//Car c = m;	�Ұ���		
		Car c = (Car)m;			
		Car c1 = new Car();		
		//Movable m = c;	�Ұ���		
		//Movable m = (Movable)c;	�Ұ���
	
	}
}
