import java.util.Scanner;

public class Y0108 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		Scanner tmp = new Scanner(System.in);
//		// 0107 ���� 
//		System.out.println("�Է�");
//		
//		int a = tmp.nextInt();
//		char b = tmp.next().charAt(0);
//		
//		switch (b) {
//		case('+'):
//		System.out.println("charAt���� ǥ���� �� �ִ�." +a);
		
		
		
//		}
		
		
		
		
		// 70~100������ ���� ���� ����
		
//		int a = (int)(Math.random()*31)+70; // 0~1�̸� 0~31 70~100
		
		// 10~61
//		int a = (int)(Math.random()*52)+10; // �ʱⰪ�� ���ϰ�, �ִ밪�� �ּҰ��� ������ +1 ��ŭ ���Ѵ�.
		
		// �����ϳ� �Է¹޾�, ������ 20�̻��̸�, ���� ��(3)������ ������. ������ 2��. �ִ�3�ױ��� ������.
//		int a = tmp.nextInt();
//		String b =(a>=20)?"����":"�̼�";
//		System.out.println(b);
		
		
		
		
		//0 2 4 6 8
//		for(int i=0;i<=8;i+=2) {
//			System.out.print(i);
//		}
		
		

		//for �� ����
//		for(int i=1;i<=100;i++){ // �ݺ�. 1���� 100����
//			if(i%5==0 && i%6==0) { // ����. 5�� 6�� ������� �����Ѵ�.
//				System.out.println(i); // ����. ���
//			}
//		}
//		
//		// 1���� 100������ ��. ���ո� ���
//		int sum =0;
//		for (int m=1;m<=100;m++) {
//			sum = sum+m;
////			System.out.println(m);
////			System.out.println(sum);
//		}
//		System.out.println(sum);
//
//		// 1���� 100���� �߿��� ¦�������ϱ�, for if ��ø ���
//		int sum2=0;
//		for (int m2=1;m2<=100;m2++) {
//			if(m2%2==0) {
//				sum2=sum2+m2;
//				//System.out.println(m2);
//				//System.out.println(sum2);
//			}		
//		}
//		System.out.println(sum2);
//		
//		
//		
//		// * �� 5���� 3�� �����. for, if ��ø
//			
//		for (int m3=1;m3<=15;m3++) { 
//			System.out.print("*");
//			if (m3%5==0) {
//				System.out.println();
//			}
//			
//		}
//		
		// ������ ���� �ܼ� �Է� > n*9���� 1�������
//		Scanner tmp7 = new Scanner(System.in);
//		
//		System.out.println("�ܼ��� �Է��ϼ���");
//		int m4 = tmp.nextInt();
//		for (int m5=9;m5>=1;m5--) {
//			System.out.println(m4*m5);
//		}
//		
//		tmp.close();
//		

//
//		//����1
//		System.out.println("����1");
//		System.out.printf("5/3= %.2f", 5/3.0);
//		//����2
//		System.out.println("����2");
//		System.out.println("Ű�� �Է��ϼ���");
//		Scanner tmp = new Scanner(System.in);
//		double d= tmp.nextDouble();
//		
//		if (d<160)
//			System.out.println("small");
//		else if(d<170)
//			System.out.println("medium");
//		else
//			System.out.println("large");
//		
//		
//			
//		//����3
//		System.out.println("����3");
//		int n1 = 50, n2 =100;
//		int n3=(n1>n2)?n1:n2;
//		//String b3 =(n1>n2)? "n1":"n2";
//		System.out.println(n3);
//		
//		//����4
//		
//		System.out.println("����4");
//		Scanner tmp2 = new Scanner(System.in);
//		System.out.println("���̸� �Է��ϼ���");
//		int age = tmp2.nextInt();
//		if (age>=20) {
//			System.out.println("Ű�� �Է��ϼ���");
//
//			double d2= tmp2.nextDouble();
//			
//			if (d2<165)
//				System.out.println("S");
//			else if(d2<175)
//				System.out.println("M");
//			else
//				System.out.println("L");
//			
//		}
//		else {
//			System.out.println("Ű�� �Է��ϼ���");
//			double d2= tmp2.nextDouble();
//			
//			if (d2<160)
//				System.out.println("S");
//			else if(d2<170)
//				System.out.println("M");
//			else
//				System.out.println("L");
//			
//		}
//			
//		
//		// ����5
//		System.out.println("����5");
//		for (int i=1;i<=50;i++) {
//			System.out.println(i);
//		}
//		
//		System.out.println("����5-1");
//		for (int i=1;i<=50;i++) {
//			if(i%6==0)
//			System.out.println(i);
//		}
//		
//		System.out.println("����5-2");
//		int sum=0;
//		for (int i=1;i<=50;i++) {
//			sum = sum+i;
//		}
//		System.out.println(sum);
//		
//		System.out.println("����5-3");
//		int o = (int)(Math.random()*50)+1; 
//		System.out.println(o);
//
//
//		System.out.println("����6");
//		int a =10, b=20;
//
//		System.out.println("������ �Է�");
//		String b4 = tmp.next();
//
//		
//		switch (b4) {
//		case "+":
//			System.out.printf(a + "+" + b + "=" + (a+b));
//		break;
//		
//		case "-":
//			System.out.printf(a + "-" + b + "=" + (a-b));
//		break;
//		
//		case "*":
//			System.out.printf(a + "*" + b + "="+ (a*b));
//		break;
//		
//		case "/":
//			System.out.printf(a + "/" + b + "=" + ((float)a/b));
//		break;
//		}
		
		
		
		
		
		
//		// ��ø for �� �̿�. �ٱ� for �� ���� �����Ѵ�.
//		for (int i=2;i<=9;i++) {
//			for (int j=1;j<=9;j++)
//				System.out.printf("%d*%d=%d\n", i,j,i*j);
//		}
		
//		//���� i : 2~9 ���� k : 1~9���� ���
//		for (int i=2;i<=9;i++) {
//			for (int k=1;k<=9;k++)
//				System.out.printf("%d %d\n", i,k);
//		}
		
		
		// ���� �ﰢ�� �����1
		// for ������ �׸� �׸���, �ٱ� for���� ��, ���� for���� ��
		
		//���� 1
//		for(int i=0; i<3 ; i++) {
//			for(int j=0;j<3;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		//����2 �� for�� 2���� for�� 1���� if�� 1���� ������
//		for(int i=1; i<=9 ; i++) {
////			for(int j=0;j<3;j++) {
////				System.out.print("*");
////			}
//			System.out.println("*");
//			if (i%3 == 0)
//				System.out.println();
//		}
		

		
		
		
		
//		//���� 2 for�� ��ø �̿� �� 5�� 2��
//		for(int i=0;i<5;i++) {
//			for(int j=0;j<5;j++)
//				System.out.print("*");
//			System.out.println();
//		}
	
		//���� �࿭ �� ����Ҷ�, ��i�� �������� ��j�� ǥ���Ѵ�.
//		0�� 0�� ���ذ� ������ 1�� 1���� ����
//		* 1�� 1�� ���� ��� i 1 j 1
//		** 2�� 2�� ���� ��� i 2 j 12
//		*** 3�� 3�� ���� ��� i 3 j 123
//		**** 4�� 4�� ���� ��� i 4 j 1234
//		***** 5�� 5�� ���� ��� i 5 j 12345
//		for(int i=1; i<=5; i++) {
//			for (int j=1; j<i+1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//				
//		}
		
		// �����ﰢ�� �����2
//	     * 	1�� �� ����4 ��1
//	    **	2�� �� ����3 ��2
//	   ***	3�� �� ����2 ��3
//	  ****	4�� �� ����1 ��4
//	 *****	5�� �� ����0 ��5 
		// ���� ���� j=1; j<5-i; j++ // �� ���� j=1 ; j<i+1; j++
		
//		1�� 5���� ��� 	 i = 1 		// j = 5  
//		2i�� 4,5j ��� 	 i = 2 		// j = 4 ,5  >> i 2 ; j = 6-2 =4 , 6-1, 5 
//		3god 3,4,5 ��	 i = 3 		// j = 3 ,4,5 >> j = 1; j =  
//		2�� 2,3,4,5 �� 	 i = 4 		// j = 2 ,3,4,5 >> j = 1 ; j = 5-j ; j++ 
//		1�� 1,2,3,4,5 �� 	 i = 5 		// j = 1 ,2,3,4,5 >> j = 5 ; j
//		i = i +1 
//		j = 6-i : i1 j5 / i2 j4 / i3 j3 / i4 j2 / i5 j1 / i6 j0
	
//		for (int i=1; i<6; i++) {
//			for (int j=1; j<6-i; j++) {
//				System.out.print(" ");
//			}
//			for (int j=1; j<i+1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//				
//		}

		// �����ﰢ�� �����2
//	     * 	1�� �� ����4 ��1
//	    **	2�� �� ����3 ��2
//	   ***	3�� �� ����2 ��3
//	  ****	4�� �� ����1 ��4
//	 *****	5�� �� ����0 ��5 
		
//    ****	6�� �� ����1 ��4	
//	   ***	7�� �� ����2 ��3
//	    **	8�� �� ����3 ��2
//	     * 	9�� �� ����4 ��1
		//
		
		
//		for (int i=1; i<10; i++) {
//			if (i < 6) {
//				for (int j=1; j<6-i; j++) {
//					System.out.print(" ");
//				}
//			
//				for (int j=1; j<i+1; j++) {
//					System.out.print("*");
//				}
//			}
//			else {
//				for (int j=1; j<i-4; j++) {
//					System.out.print(" ");
//				}
//			
//				for (int j=1; j<11-i; j++) {
//					System.out.print("*");
//				}
//				
//			}
//
//			System.out.println();
//		}
		
//    1				�� 1 ���� 4 ���ڰ��� 1
//   123			�� 2 ���� 3 ���ڰ��� 3
//  12345			�� 3 ���� 2 ���ڰ��� 5
// 1234567			�� 4 ���� 1 ���ڰ��� 7
//123456789			�� 5 ���� 0 ���ڰ��� 9
		
//		for (int i =1 ; i <6 ; i++) { // �� ���� ����
//			for(int j= 1; j<6-i; j++) { // ���� ���� ���� ����
//				System.out.print(" ");
//			}
//			int n=1; // ǥ�� ���� n�� 1�� �ʱ�ȭ
//			for(int j=1; j < i*2 ; j++ ) { // ���� ���� ���� : 2,4,6,8,10 �̸� ����
//				System.out.print(n++); // 1�� ����ϰ� ���� �����ڷ� +1 �� �����ؼ� for�� �ݺ��Ͽ� ���
//			}
//			System.out.println();
//				
//		}
		
//		for (int a=2; a<10; a++) {
//			for(int b=1; b<10; b++) {
//				System.out.println(a+ "*" +b+ "=" + a*b);
//			}
//			System.out.println();
//		}
		
//				2*1=2	3*1=3	4*1=4	5*1=5	6*1=6	7*1=7	8*1=8	9*1=9	
//				2*2=4	3*2=6	4*2=8	5*2=10	6*2=12	7*2=14	8*2=16	9*2=18	
//				2*3=6	3*3=9	4*3=12	5*3=15	6*3=18	7*3=21	8*3=24	9*3=27	
//				2*4=8	3*4=12	4*4=16	5*4=20	6*4=24	7*4=28	8*4=32	9*4=36	
//				2*5=10	3*5=15	4*5=20	5*5=25	6*5=30	7*5=35	8*5=40	9*5=45	
//				2*6=12	3*6=18	4*6=24	5*6=30	6*6=36	7*6=42	8*6=48	9*6=54	
//				2*7=14	3*7=21	4*7=28	5*7=35	6*7=42	7*7=49	8*7=56	9*7=63	
//				2*8=16	3*8=24	4*8=32	5*8=40	6*8=48	7*8=56	8*8=64	9*8=72	
//				2*9=18	3*9=27	4*9=36	5*9=45	6*9=54	7*9=63	8*9=72	9*9=81
		
//		for (int a=1; a<10; a++) {
//			for(int b=2; b<10; b++) {
//				System.out.print(b+ "*" +a+ "=" + a*b +"	");
//			}
//			System.out.println();
//		}


//		for(int i=1; i<=5; i++) {
//			for (int j=5; j>0; j--) {
//				if(j>i) {
//					System.out.print(" ");
//				}
//					
//				else {
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}
		
		
		// �Ƕ�̵� �����
//	     *
//	    ***
//	   *****
//	  *******
//	 *********
//5�� 7��
//123 4 567
//12 345 67
//1 23456 7
// 1234567 
//
//		
//		
//		for(int i=1; i<=5;i++) { // �� ǥ��
//			for(int j = 5; j > i; j--) { // ���� ����
//				System.out.print(" ");
//			}
//			for (int j = 1 ; j < 2*i ; j++) { // ����� 
//				System.out.print("*");
//			}
//		System.out.println();
//		}
//			
//	
		//��Ÿ for �� ? for���ȿ� ������ ���� ���ÿ� �ʱ�ȭ�ؼ� ����� �� �ִ�.

//		for(int i=1,k=1;i<=9;i++,k++) {
//			System.out.println(i*k);
//		}
		
		
		// for�� ���� �ʱ�ȭ �Ǿ� �ִٸ�, for������ �ٽ� �ʱ�ȭ�� �ʿ䰡 ����.
//		int i=0 ;
//		for(;i<10;i++) {
//			System.out.println(i);
//		}
		
//		for(;;) {} //���� ����. ������ ���α׷� �����̴�. �߸��� �ڵ��̴�. �̸� ���߱� ���ؼ��� �͹̳���Ʈ ��ư�� ������ �Ѵ�.
//		break : ���ѷ����� ������ ���� ����ڴ� break �̴�.
		
		// p.229 ��������
		
//		Scanner tmp = new Scanner(System.in);
//		int a = tmp.nextInt();
//		System.out.println("������ �Է��ϼ���" + a+"\n");
//		//�Է��� ������ ������ ������ 4���� �׿� "�߸� �Է�"switch case �̿� 
//
//
//		switch(a) {
//		case 2 :
//			for(int n=1;n<10;n++) {
//				System.out.println("2��\n"+ 2*n);
//			}
//			break;
//			
//		case 3 :
//			for(int n=1;n<10;n++) {
//				System.out.println(3*n);
//				}
//			break;
//			
//		case 4 :
//			for(int n=1;n<10;n++) {
//				System.out.println(4*n);
//			}
//			break;
//		
//		default:
//		System.out.println("�߸� �Է�");
//		break;
//		
//		}
//		tmp.close();
//		
		
		
		//p.231 
		
		
//		1		1�� 1��
//		12		2�� 12
//		123		3	123
//		1234
//		12345
		
		
	
		for (int a=1; a<=5; a++) {
	
			for (int b=1; b<=a; b++) {
			System.out.print(b);
			}
			
			System.out.println();
		}
		
	}

			//jdbc 2�� ���߼� 



}
