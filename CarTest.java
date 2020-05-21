package car;

public class CarTest {

	public static void main(String[] args)
	{
		/*
		Car c1 = new Car();
		c1.speedUp(50);
		c1.speedDown(30);
		
		Movable m = new Car();
		m.speedUp(); //불가능
		m.TurnLeft(); //불가능
		*/
		
		Movable m = new Car();	// 객체를 사용하지 않으면 경고창 뜸	
		//Car c = m;	불가능		
		Car c = (Car)m;			
		Car c1 = new Car();		
		//Movable m = c;	불가능		
		//Movable m = (Movable)c;	불가능
	
	}
}
