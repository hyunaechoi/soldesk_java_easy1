
public class Hello_world {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		System.out.println("Hello world");
//		System.out.println(10);
//		System.out.println(3.14);
//		//print ln �� ln�� ���� �����̴�
//		System.out.println("���ڴ�" +20000+ "���̴�");
//		
//		System.out.printf("10\n");
//		System.out.printf("%d\n", 10);
		/*
		printf���� ���� ����
		%d ����
		%f �Ǽ�, �Ҽ��� ���� �ڸ� ������ ǥ��
		%.2f �Ǽ�, �Ҽ��� ���ڸ� ������ ǥ��
		%s ���ڿ�
		%c ����
		*/
		
//		System.out.printf("%d\n", 10);
//		System.out.printf("%f\n", 3.14);
//		System.out.printf("%c\n", 'A');
//		System.out.printf("%s\n", "kkk");
//		System.out.printf("%d\n", 100+100);
//		System.out.printf("%d\n%d\n", 100, 200);
//		System.out.printf("%d\n%.2f\n", 100, 3.14);
//		//System.out.printf("%.1f", 0.5);
//		
//		System.out.printf("%d/%d = %.1f\n", 100,200,0.5);
//		
//		int num1=100, num2=200;
//		System.out.println(num1 + "/" + num2+ "=" + ((float)num1/num2));

		/*char name;
		int age;
		float eye;*/
		
		/*
		System.out.printf("%s, %d, %.1f, %c\n","kkk",34,1.0,'A');
		
		int age = 34;
		double leg = 180.1;
		String name = "kkk";
		char score = 'A';
		
		System.out.printf("%d %.1f %s %c\n", age, leg, name, score);
		
		double eng=100, kor=95;
		//int eng=100, kor=95;
		//�Ҽ��� ù°�ڸ� ���� ��� ����� ���� int�� double�� ������.
		//�Ǵ� int�� �״�� ����ϰ� �Ʒ��� ���� �ٲ� �� ����.
		//System.out.printf("%.1f", (eng+kor)/2.0);
		//����(eng+kor)�� ����(2)�� ������ ������ ���´ٰ� �����Ǿ� �ֱ� ������ �Ǽ�(%.1f) ����� ����.
		//����(eng+kor)�� �Ǽ�(2.0)�� �������� �����Ͽ�, �Ǽ�(%.1f)�� ǥ�õǵ��� ����
		System.out.printf("%.1f", (eng+kor)/2);
		*/
//		
//		int a = 30;
//		double b = 30; // �ڷ��� �Ǽ�
//		//float�� �Ҽ��� �Ʒ� 9�ڸ�
//		//double�� float�� �ι� �Ҽ��� �Ʒ� 18�ڸ�
//		System.out.println(a);
//		System.out.println(b);
//		String c = "tom";
//		
//		System.out.println(c + "�� " + a +"��"); //println�� ���ڿ��� +�� �̿��ؼ� ���
//		System.out.printf("%s�� %d��", c, a); //printf�� ���� ���ڸ� �̿��ؼ� ������ ���
		System.out.printf("%d\n",123);
		System.out.printf("%5d\n",123); // 5�ڸ��� Ȯ�� �� ������ ���� XX123
		System.out.printf("%-5d\n",123); // 5�ڸ��� Ȯ�� �� ���� ���� 123XX
		System.out.printf("%05d\n",123); // 5�ڸ��� Ȯ���ؼ� 0���� ä��� ������ ����
		System.out.printf("%f\n",123.45);
		System.out.printf("%7.1f\n",123.45); // 7�ڸ� Ȯ�� �� ������ �����ϵ�, �Ҽ��� 1�ڸ�����
		System.out.printf("%7.3f\n",12345.45); // 7�ڸ� Ȯ�� �� ������ �����ϵ�, �Ҽ��� 3�ڸ�����
		
//		����
//		���� 70, ���� 80, ���� 90 ���� �ʱ�ȭ(=������ ���� �Է�. null�� ���� �־)�ؼ� 
//		������ ������ ������ ���
		
//		int han=70, eng=80, math=90;
//		System.out.println("���� : "+han+" ���� : "+eng+" ���� : "+math+" ���� : "+(han+eng+math));
		
//		int a;
//		System.out.println("%d",a); ���� �� �Է¾��ϰ� ����ϴ� ����� �־��µ�..

//		int a=(int)123.123f; // a=123 ���� ���ϴ� �ڷᰪ �տ� �ڷ����¸� �ۼ��ؼ� ���.
//		float b=100;
//		
//		System.out.println(a);
//		System.out.println(b);
//	
//		int a,b ;
//		float c, d ;
//		a = 100;
//				b= a;
//		System.out.println(b);
//	
////		123.00 �Ҽ����� �ڸ����� ���Եȴ�.
//		float 4byte, int 4byte
		
//		int a=10, b =20;
////		float r=a/b;
//		float r=a/(float)b;
//		System.out.printf("%f\n\n\n\n",r);
//	
//	
//	// ���� ����� ���������� ������ ��µȴ�.
//		// �Ǽ��� �ϳ��� ���� �Ǽ��� �ȴ�.
//		System.out.println(1+2.0);
//		System.out.println(2/(float)3);
//		System.out.println((float)10/3);
//		System.out.println(10.0/3);
//		
		int a=2, b=3, c=4;
		int r1,r2,r3;
		float r4;
		
		r4=a*b/(float)c;
		
		System.out.println(r4);
		//double(8byte, �Ҽ����Ʒ� 18�ڸ�)�� float(4byte, �Ҽ��� �Ʒ� 9�ڸ�)�� �Ҽ���(�迭)�� �ι�� ���´ٴ� �ǹ� �Դϴ�.
	
		r3=c%b;	//������ ������
		System.out.println(r3);
		
		//�ƽ�Ű�ڵ� ���� https://ko.wikipedia.org/wiki/ASCII
		
		char ch ='a';
		char ch1 = 97; // a�� �ƽ�Ű�ڵ�(10����)�� 97��. 
		
		System.out.println(ch);
		System.out.println((int)ch);
		System.out.println(ch1);
	
		ch1=(char)(ch+1); // a�� ���� ����ȯ
		// ���� ����ȯ �ϴٰ� ȥ�� ����� �ִµ� � ��Ȳ�̾����� ����� �ȳ���..
		
		char ch2=90; // �ƽ�Ű�ڵ� 90�� Z
		System.out.println(ch2);
		
		boolean t,f ; // �ο��� ��1 ����0�� ����
		
		f=(10==20);
		System.out.println(f);
		
		
		System.out.println(10);
		System.out.printf("%d\n", 10);
		System.out.printf("%.6f\n", Math.PI);
		System.out.printf("%.1f\n", 3.45);
		System.out.printf("%.10f\n",3.4);
		int n=10,m=20;
		System.out.printf("%d�� %d�� ���� %d �Դϴ�.",n,m,n+m);
		String name= "ȫ�浿", address="33-44";
		
		int age = 30;
		
		
		System.out.println("���� �̸��� "+name+"�Դϴ�.");
		System.out.println("�� ���̴� "+age+"�� �̰�, �ּҴ� "+address+"���� �Դϴ�.");
		
		
	
	
	
	
	}

}