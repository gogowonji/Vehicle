package car;

public interface Movable {
	public void speedUp(int amount); //�ӵ� ���̱� 
	public void speedDown(int amount); //�ӵ� ���߱�
	final int speed = 100; //�ӵ� ����
	static void printSpeed()
	{
		System.out.println("���� �ӵ��� " + speed);
	}
}
