package job;

public class Warrior {
	
	//�ʵ� or �������
	int hp;
	int mp;
	
	//����Ʈ ������ (�ۼ����� ���� ���, �ڵ� ������)
	public Warrior(){
		
		System.out.println("���� ��ü�� ����!");
		
	}
	
	//���� ���Ӱ� �ۼ��� ������
	public Warrior(int hp, int mp) {
		
		this.hp = hp;
		this.mp = mp;
		
	}
	
	//���۵�
	//�޼ҵ� (method) = �Լ�
	
	public void attack() {
		System.out.println("�����߽��ϴ�!");
	}
	
	
}
