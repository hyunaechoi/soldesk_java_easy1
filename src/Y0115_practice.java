import java.util.Scanner;
public class Y0115_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   //���� ����
		   //1. 1~10������ �Ѱ��� ����ض�.(while)
		System.out.println();
		   System.out.println("����1 1~10���� �� ��");
		   int mul1=1, i1=1;
		   while(i1>=10) {
			   //mul1=mul1*i1;
			   mul1*=i1;
		   }
		   System.out.println(mul1);
		   
		   
		   //2. �������� ¦���ܸ� ����ϸ鼭 �ش�Ǵ� ���� ��������
		   //(2���� 2*2, 4���� 4*4, 6���� 6*6, 8���� 8*8)����ض�.(break)
		   System.out.println();
		   System.out.println("����2 ������ ¦���� ���");
		   for (int i = 2 ; i<=9 ; i+=2) {
			   for (int j = 1; j<=9 ; j++) {
				   System.out.println(i + "*"+j+"="+i*j);
				   
				   if (i==j) {
					   break;
				   }
				   
			   }
		   }
		   
		   //3. main�Լ��� ���� adder, exp �Լ��� �ۼ��ض�.
		   		System.out.println();
	          System.out.println("����3 ����");
	          int result=adder(10,20);    //�� ���� �� ���

	          System.out.println("result : "+result);

	          System.out.println(exp(3.5));   //3.5�� ������ �� ���

	          
//	          4. ���� ������ ������ �����ϸ�, ���� ���̸� ����ؼ� ��ȯ�ϴ� �޼ҵ带 ������.
//
//	          (�ΰ��� ��������) (�޼ҵ���� ���Ƿ� �ش�.)
//
//	          4.1) ����� main���� �ϱ�!
//
//	          4.2) ����� �޼ҵ�ȿ��� �ϱ�!
	          System.out.println();
	          System.out.println("����4 ����");
	          Scanner tmp = new Scanner(System.in);
	          System.out.print("������ �Է� : ");
	          double a = tmp.nextDouble();
	          
	          double j = a*2*3.14;
	          System.out.println("���� ���� : "+j);
	          
	          //4-1 ����� ���ο���
	          System.out.println("���� 4-1");
	          System.out.println(mul2(a));
	          
	          // 4-2 ����� �޼ҵ忡��
	          System.out.println("���� 4-2");
	          mul1(a);
	          
	          
//	      	5. 	1  3  5  7  9  �̷��� ����� 2���� �迭 ����ض�.
//
//	    	11 13 15 17 19 
	          System.out.println();
	          System.out.println("���� 5��");
	          int n5=1;
	          int array51[][] = new int[2][5];
	          for (int i5=0 ; i5 <2; i5++) {
       	  
	        	  for(int j5=0; j5<5; j5++) {
	        		  array51[i5][j5]=n5;
	        		  n5+=2;
	        		  System.out.printf("%2d\t", array51[i5][j5]);
	        	  }
	        	  System.out.println();
	          }
	          
	        	  int array5[][] = {{1,3,5,7,9},{11,13,15,17,19}};
	          for (int i5=0 ; i5<array5.length ; i5++) {
	        	  for (int j5=0 ; j5<array5[i5].length ; j5++) {
	        		  System.out.print(array5[i5][j5]+", ");
	        	  }
	        	  System.out.println();
	          }
	          

	    	 

//	    	6. ���ڿ� a�� ��C++��, b�� ��, JAVA���� �ʱ�ȭ�ض�.
//
//	    	6-1) ���ڿ� a�� ���̸� ����ض�.
//
//	    	6-2) a,b�� ���ڿ��� �����ض�.
//
//	    	6-3) �ε��� 3���� ������ ����ض�.
//
//	    	6-4) JAVA�� ��C#������ �����ض� 
//
//	    	6-5) ,�� �������� ���ڿ��� �и��ض�.
	          System.out.println();
	          System.out.println("���� 6��");
	          
	          String a6 = "C++", b6=", JAVA";
	          
	          System.out.println("6-1 : "+a6.length());
	          
	          
	          String c = a6.concat(b6);
	          System.out.println("6-2 : "+ c);
	          
	          
	          
	          
	          System.out.print("6-3 : ");
	          for(int i6 =3; i6<c.length();i6++) {
	        	  System.out.print(c.charAt(i6));
	          }
	          System.out.println();
	          
	          System.out.println("6-3 : "+c.substring(3,c.length()));
	          System.out.println("6-3 : "+a6.concat(b6).substring(3,a6.concat(b6).length()));
	          
	          
	          System.out.println("6-4 : "+c.replace("JAVA", "C#"));
	          
	          
	          String d[] = c.split(",");
	          for (String e:d) {
	        	  System.out.println("6-5 : "+e);
	          }
	          for (int i65 = 0; i65 < d.length ; i65++) {
	        	  System.out.println("6-5 : "+ d[i65]);
	          }
	          
	}
	
	//����3
	static int adder(int a, int b) {
		int sum = a+b;
		return sum;
	}
	static double exp(double a) {
		double b= a*a;
		return b;
	}
	//����4-1 ����� ���ο���
	static double mul2(double a) {
		double j = a*2*3.14;
		return j;
	}
	// ����4-2 ����� �޼ҵ忡��
	static void mul1(double a) {
        double j = a*2*3.14;
        System.out.println("���� ���� : "+j);
	}
	




}
