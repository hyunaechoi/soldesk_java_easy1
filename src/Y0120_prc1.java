// �θ��� �⺻ �����ڰ� �켱�ȴ�.
// super(����)�� �Է��ϸ�, �⺻ �����ں��� �켱�ȴ�.
class Book103{
	Book103(){
		System.out.println("Book Ŭ���� $�⺻$ ������");
	}
	
	Book103(String a){
		this(); // this�� �ڽ��� class�� ����Ų��. class Book103�� ó������ �ٽ� ȣ��.
		System.out.println("Book Ŭ���� %�߰�% ������ "+a);
	}
}


class ComputerBook extends Book103{
	
	ComputerBook(String a){
		super(a); // �θ��� �߰� ������ ���� ȣ��
		System.out.println("ComputerBook Ŭ���� $�⺻$ ������");
	}
}

public class Y0120_prc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ComputerBook sedan1 = new ComputerBook("�� �ڹ�");
		
	}

}
