import java.util.Scanner;
public class Y0114 {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		double aray[] = {10.1,20,30,40,50.1};
		
		double sum=0;
		for(double i : aray) {
			sum+=i;
			
		}
		System.out.println(sum);
*/		
/*		
		//5.1) 3�� 3�� �迭�� 0~8���������� �ʱ�ȭ�ض�.
		int array2[][] = new int[3][3];
		int a =0;
		for (int i = 0 ; i<3 ; i++) {
			for (int j=0 ; j<3 ; j++) {

				array2[i][j] += a;
				System.out.print(array2[i][j]+ " ");
				
				a++;
			}
			System.out.println();
		}
		
*/		
		
/*		
		//5.2) 2�� 3�� �迭�� a~f�������ڷ� �ʱ�ȭ�ض�.
		char array3[][] = new char [2][3];
		char cha = 'a';
		
		for (int i = 0 ; i<array3.length ; i++) {
			for (int j=0 ; j<array3[i].length ; j++) {

				array3[i][j] += cha;
				System.out.print(array3[i][j]+ " ");
				
				cha++;
			}
			System.out.println();
		
		}*/



		
//		1. 3�� 4���������� �迭�� �����Ͽ�  0~9 ������������ �����ϰ� �����Ѵ�.
//
//		������ 2���� �迭�� ���� ����ض�.
//
//		������) 5 4 1 5
//
//		          0 5 3 5
//
//		          7 8 1 4
//
//		���� 48 
/*		
		int array[][] = new int[3][4];
		int sum =0;
		for (int i = 0 ; i<array.length ; i++) {
			for (int j=0 ; j<array[i].length ; j++) {

				array[i][j] += (int)(Math.random()*10);
				System.out.print(array[i][j]+ " ");
				sum+=array[i][j];

			}
			
			System.out.println();
		
		}
		System.out.println("����" + sum);
*/		
		
//		page 314 �غ��� �ǽ�9-10 �޼ҵ� ȣ��
		// ��ǻ�� ó���� void main �ڵ���� �����Ѵ�.
		// �żҵ� class�� void main ���� ���� �ִٰ� �ؼ�, ���� ���۵��� �ʴ´�.
		// �޼ҵ� class : Ŀ�� ����� , void main : Ŀ�� �ֹ� 


	
		
		
		//page 321 9-13
		int hap;
		hap = plus(100,200); // �Լ� ȣ�� 
		System.out.println("100 �� 200�� plus �޼ҵ��  : "+hap);
		
		
		
		//���ǽǽ�1
		System.out.println("����");
		pro(52);
		pro(23);
		System.out.println("��");
		
		
		//���� �ǽ�2
		double k = 164.5;
		pr(123,156.6);
		pr(125,k);
		show();
		
		
		
		//���� �ǽ�3
		System.out.println("���� ���� : "+area(5.5));
		System.out.println("���� �ѷ� : "+round(3.2));
		//���� : 3.14 * �� * ��
		//�ѷ� : 3.14 * 2 * ��
		
		
		
		
		String array[][] = {{"book","å"},
							{"water","��"},
							{"note","��Ʈ"}};
			
		
		Scanner tmp = new Scanner(System.in);
		
		for (int i =0 ; i<array.length ; i++) {
				
			System.out.println(array[i][0] + "�̶��� ?");
			String mean = tmp.nextLine();
				
			if (mean.equals(array[i][1])) {
				System.out.println("�����Դϴ�.");
			}
			else {
				System.out.println("�����Դϴ�.");
			}
				
		}
		
		//////////////////////////////���� �Ļ� ���� main
		
		meter1(176); // �Լ� ȣ�� 1
		
		
		System.out.println(meter2(176)); // �Լ� ȣ�� 2
		
		double a; // ������� ������ �ٷ� ����.
		a = meter2(176); // �Լ� ȣ�� 3
		System.out.println(a);
		
		
		//����� main���� ���� method���� ���� �����ؾ� �Ѵ�.
		//method���� ����ϸ� method�� ��ȯ���� void�� ����� main���� ȣ�⸸ �Ѵ�.: �Լ� ȣ�� 1
		//main���� ����ϸ� ��ȯ���� �����ϰ�, method���� return : �Լ� ȣ�� 2
		//
		
		
		//�޼ҵ� ����1
		total(1,10);
		total(1,100);
		
		
		//�޼ҵ� ���� 1-1
		System.out.println(total1(1,10));
		System.out.println(total1(1,100));
		
		
		//���������� ��������
		//�������� : �޼��� �ȿ���, �������� : �޼��� �ۿ���
		//������������ ���������� �켱������ ����
		//������������ ���������� �켱���� ����.
		
		
		func1();
		System.out.println(tt);
		
		
		
		//���� ������ ���������� ���ȴ�.
		int aa =0;
		in();
		System.out.println(aa);
		
		
		//page 328
		
		
		int a99=10;
		
		func1(a99);
		System.out.println("func1() ���� �� a99 �� : " + a99);
		
		System.out.println(multi1(2,10));
		
		
		
		int a98[] = new int[7];
		Scanner tmp99 = new Scanner(System.in);
		
		//���� 7�� �Է�
		for (int b99=0 ; b99 <7 ; b99++) {
			System.out.println("���� 7�� �Է�");
			a98[b99] = tmp99.nextInt();
			
		}
		System.out.println(big99(a98));
		//�Ű������� �迭���϶�
		//�迭�� ȣ���Ҷ� �迭�� ������ȴ�. �迭 �ε����� ������ �ȵȴ�.
		//�迭�� �����Ҷ��� �ε�������
		
		
		/////////////////////////////
		
		
		//�������� �����ڷ� �Ʒ��� �ۼ�
		//10�� ū�� 20�� ū�� �������ǿ����ڷ� ���
		// 10�� ũ�� 10��ũ��
		// 20�� ũ�� 20��ũ��.
		
		// ���̸� ? �ڰ� ����. �����̸� :�ڰ� ����
		String intiger =(20>10)?"20�� ũ��":"10�� ũ��";
		System.out.println(intiger);
		
		
		
		
		System.out.println(big97(5.5,6.5));
		
		
		System.out.println("�Ǽ� 2���� �Է¹����� 2���� ū ���� ����Ѵ�");
		System.out.println("�޼ҵ� ȣ���� �̿��� �Է°� ��");
		System.out.println("�޼ҵ�� ���׿����ڸ� �̿��ϰ� �ִ�.");
		double src99 = tmp99.nextDouble();
		double src98 = tmp99.nextDouble();
		System.out.println(big97(src99,src98));
		
		
		// �ǽ�
//		Scanner tmp = new Scanner(System.in);
		System.out.println("+ �Ǵ� -�� �Է��ϼ���");
		char c99 = tmp.next().charAt(0);
		System.out.println("1������ �Է��ϼ���");
		int a88 = tmp.nextInt();
		System.out.println("2������ �Է��ϼ���");
		int b88 = tmp.nextInt();
		
		cal(c99,a88,b88);
		
		// ���� �Է¹޾� ����ϴ� �Լ�
		// �Լ����� in
		
		System.out.println("���� �Է¹޾� ����ϴ� �Լ�");
		System.out.println("1�� ������ �Է��ϼ���");
		int i23= tmp.nextInt();
		System.out.println("2�� ������ �Է��ϼ���");
		int i24 = tmp.nextInt();
		
		in22(i23,i24);
		
		System.out.println(in23(i23,i24));
	}
		
			
	
		
	//page 321 9-13
	
	static int plus(int v1, int v2) { //���� : static(�����Ѵٴ� �ǹ�) ��ȯ�� �Լ���(�ŰԺ���)
		int result;
		result = v1+v2;
		return result;
	}
	
	//���ǽǽ�1
	//void�� ��ȯ���� ����. ����Ҷ�, ��ȯ���� �ʿ� ����. void�� ����ִ� �� �ǹ��Ѵ�.
	 static void /*int*/ pro(int age) {
		System.out.println("�ȳ�");
		System.out.println("���̴� "+age+"�̴�");
	}
	 
	 // ���ǽǽ�2
	 //public�� ����
	public static void pr(int  id, double ki) {
		System.out.println(id);
		System.out.println("Ű"+ki);
	}
	
	//��ȯ���̶� �ް����� ���¶� ���ƾ� �Ѵ�.
	public static void show() {
		System.out.println("�׷� �̸�");
	}
	
	
	//���� �ǽ�3
	public static double area(double r) {
		// ����
		return r*r*3.14;
	}
	
	static double round(double r) {
		return r*2*3.14;
	}
	
	/*
	 * �̿����Կ��� �亯
page 313
System.out.printf() �� �޼ҵ� �Դϴ�.
� ���� ���ִ� ����� �޼ҵ��� �����Ͻø� �˴ϴ�.

�ǽ��ߴ� ��������
(������ �Է¹޾� �հ� ��ȯ, ���� ��¹�, Ű ��¹�, �� ����, ���� ���ϱ�)

�޼ҵ带 ������ 
public static void main(���� �Լ�)�� ��� ���(��ü)�� �� �ۼ��ߴ� ����

�޼ҵ带 ��� ��
public static void main(���� �Լ�)�� public static void [�޼ҵ��]���� ������
���(��ü:���)�� ȣ���ؼ� ����Ѵٴ� ���� �Դϴ�.





1) public(����) static(����)�� ������ static�� ���� �ε� �������� �ֳ���?
�亯 :  �� ���ǿ��� �����մϴ�.
public(����) static(����)��
�Լ� ��ü�� �����ϰڴ�.
public�� �ݴ� ���� private
�ٸ� ��Ű�� �Ǵ� �ٸ� �ҽ����Ͽ� �Լ��� �����ϰڴ�.


2) �Լ�:function�� �޼���:method �� �ް����ϴ�. 
page 313 TIP�� ����.
�ٸ� ������ �޼ҵ带 �Լ�(��� �θ���. ������ �������ڸ�, Ŭ���� �ȿ� �����ؾ� �ϴ� �Լ��� �޼ҵ��� �ϴµ�, JAVA�� �Լ��� ������ Ŭ���� �ȿ� �����ϱ� ������ �ᱹ ��� �Լ��� �޼ҵ尡 �Ǵ� ���̴�.

���ɽð�
	 */
	
	
	
	// 
	public static void/*��ȯ��*/ meter1 (int n){
		System.out.println(n/100.0);
		
	}
	
	public static double/*��ȯ��*/ meter2(int n) {
		return n/100.0;
	}
	
	
	
	

	// �޼ҵ� ����1
	public static void total(int n, int m){
		int sum=0;
		for (int a=n ; a <=m ; a++) {
			sum+=a;
		}
		System.out.println(sum);
			
	}
	
	// �޼ҵ� ����1-1
	public static int total1(int n, int m) {
		int sum =0;
		for (int a=n ; a <=m ; a++) {
			sum+=a;
		}
		return sum;
	}
	
	static int tt =100;
	
	static void func1() {
		int tt = 200;
		System.out.println(tt);
	}
	
	
	static void in() {
		int aa =10;
		System.out.println(aa);
	}
		
	
	static void func1(int a99) {
		a99 = a99+1;
		System.out.println("���� ���� a99�� : "+ a99);
	}
	
	static int multi1(int a, int b) {
		int mul=1;
		for (int c=1 ; c<=b ; c++) {
			mul=mul*a;
		}
		return mul;	
	}
	
	
	//���翡 ���� �迭 �޼ҵ�
	//�迭�� �����Ҷ��� �ε�������
	static int big99 (int array[]) {
		int max = 0;
		for (int i = 0 ; i < array.length ; i++) {
			if(max < array[i]) {
				max=array[i];
			}
			
		}
		return max;
	}
	
	static String big97 (double a, double b) {
		// ���̸� ? �ڰ� ����. �����̸� :�ڰ� ����
		String n =(a>b)?"�տ� ���� ũ�� : "+a:"�ڿ� ���� ũ�� : "+b;
		return n;
	}
	

	static void cal(char a, int b, int c) {

		switch (a) {
		case '+' : 
			System.out.println(b+"" +a+""+c +"="+(b+c)); 
			break;
		
		
		case '-' : 
			System.out.println(b+"" +a+""+c+"="+(b-c)); 
			break;
		
			
			
		}
	}
	
	static void in22(int a, int b) {
		System.out.println("���� 1 : "+a);
		System.out.println("���� 2 : "+b);
	}
	
//	�������� abc �� ����Ͻø鼭
//	�ڵ带 �߰��߰� ����鼭 ����������
//
//	���� �״�� ���ϱ�
//	a1~99���� �þ�� ����
	
	static String/*���� ���´� ��ȯ���� ���缭 �ۼ�*/ in23(int a, int b) {
		Scanner tmp = new Scanner(System.in);
		a= tmp.nextInt();
		b= tmp.nextInt();

		String str = "���� 1 : " +a + " ���� 2 : " +b;
		return str;
	}
}



