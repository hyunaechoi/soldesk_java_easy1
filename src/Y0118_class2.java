class Circle{
	private int r;
	private String name;
	//Circle class ������ ��밡��
	
	double area() { // �޼ҵ� (�Լ�)
		return 3.14*r*r;
	}
	void show() { // �޼ҵ� (�Լ�) 
		System.out.println(name);
	}
}
public class Y0118_class2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle cir = new Circle();
//		cir.r = 10; // private�̱� ������ ���� �߻�
		
		System.out.println(cir.area());
		cir.show();
	}
	
	

}
