class Profile{
	private int age1 ;   // private �� �ٸ� class���� ���� �Ұ���
	int age ;  // �ʵ� ����
	String name ; // �ʵ�(����) ����
	
	void show() { // �޼ҵ� ����
		System.out.println(age+" "+name); // �޼ҵ� ����
	}
	
	
}

public class Y0118_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Profile p1=new Profile(); // �ν��Ͻ�(��ü) ���� :p1
		p1.age = 30; // �ν��Ͻ��� �ʵ带 �ʱ�ȭ
//		p1.age1 = 30; // private �� �ٸ� class���� ���� �Ұ���
		p1.name = "����"; 
		p1.show(); // �ν��Ͻ��� �޼ҵ�(�Լ�) ȣ��
		
	}

}
