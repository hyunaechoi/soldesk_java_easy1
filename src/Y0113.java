import java.util.Scanner;
public class Y0113 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		// ����� ���ÿ� �迭 ����
		int a[] = new int[10];
		
		a[0] = 10;
		a[1] = 40;
		a[2] = 50;
		
		// �迭 �ʱ�ȭ1
		int b[]= {1,2,3,4,5};
		
		// �迭 �ʱ�ȭ2
//		int c[] = new int {1,2,3,4,5};
		
		
		int a1[] = new int[10];
		int a2[] = {10,40,50}; // ���� ���Ǵ� �迭 �ʱ�ȭ ���
		int i;
		for(i=0 ; i<3 ; i++) {
			System.out.println("�迭 �ʱ�ȭ �� �Է��ϼ���");
			Scanner tmp = new Scanner(System.in);
			a1[i]= tmp.nextInt();
			
			System.out.println(a2[i]); // a2 �迭 ���
		}
		System.out.println(a1[i]);
		
*/
/*		
		// �Ǽ� 5�� �Է¹޾Ƽ� ��� ���(�迭)
		
		double a3[] = new double[5];
		int sum =0;
		Scanner tmp1 = new Scanner(System.in);
		for(int i2 = 0; i2 <5 ; i2++) {
			System.out.println((i2+1)+"�� �Ǽ��� �Է��ϼ���");
			a3[i2] = tmp1.nextDouble();
			
			sum +=a3[i2];			
		}
		System.out.println("��� : " + sum/5.0);
		tmp1.close();
*/		
/*		
		// page 274 �迭 ����� ���� �˾Ƴ��� �ǽ� 8-6
		// page 298 6�� ���� 
		// �ǽ� 8-3�� ���� �Ͽ� �Է��� ���� 4���� �հ�� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		// �� ��� while������ �ۼ��Ѵ�.
		
		double a4[] = new double[4];
		double sum2=0, multi1 =1;
		Scanner tmp2 = new Scanner(System.in);
		int i3=0;
		while(i3<4) {
			System.out.println((i3+1)+"��° ���ڸ� �Է��ϼ���");
			a4[i3]= tmp2.nextDouble();
			
			sum2 += a4[i3];
			multi1 *= a4[i3];
			i3++;
			
		}
		
		
		System.out.println("�� :"+sum2 +" �� :"+ multi1);
		
		tmp2.close();
		
*/		


/*		
		//����Ʈ �ο� �迭 ����
		// 5�� ����Ʈ ����
		// 5������ ������ �ѿ�
		
		int man1[] = new int[5];
		
		Scanner tmp = new Scanner(System.in);
		int sum = 0;
		
		for (int layer = 0 ; layer <5 ; layer++) {
			
			System.out.println((layer+1) + "�� ������ �ο��� �Է��ϼ���");
			man1[layer] = tmp.nextInt();
			sum+= man1[layer];
		
			
		}
		System.out.println("�� �ο� " + sum +"��");
		
		tmp.close();
*/
/*		
		// 1 2 3 5 8 13 21 34 55 89 .. (�Ǻ���ġ ������ �迭�� �ۼ�) 
		
		
		int aray[] = new int[10];
		aray[0] = 1;
		aray[1] = 2;
		System.out.print(aray[0]+" "+aray[1]+" ");
		
		for (int i=0 ; i<8 ; i++) {
			aray[i+2]= aray[i] + aray[i+1];
			
			System.out.print(aray[i+2]+" ");
		}
		
//		for (int i=0 ; i<10 ; i++) {
//			System.out.println(aray[i]+" ");
//		}

*/
/*
		// ����1.	1~10���� ���� ���ض�. (for, while, do~while)
		//1-1
		int sum=0;
		for(int i=1; i<=10; i++) {
			sum+=i;
		}
		System.out.println(sum);
		
		// 1-2
		int sum2=0, i=1;
		while(i<=10) {
			
			sum+=i;
			i++;
		}
		System.out.println(sum);
		
		
		//1-3
		int i=1, sum=0;
		do {
			sum +=i;
			i++;
			
		}while (i<=10);

		System.out.println(sum);
		
		
		//2.while���� �̿��Ͽ� ������ ������ �Է¹ް� ��� ����ض�. 
		//(0�� �ԷµǸ� �Է��� ����ȴ�.)����.

		Scanner tmp = new Scanner(System.in);
		
		int count=1, sum=0;
		while (true) {
			System.out.println("������ �Է��ϼ���");
			int m = tmp.nextInt();
			sum +=m;
			System.out.println("��� : "+ (sum/(double)count));
			
			if (m==0) {
				System.out.println("���� �˴ϴ�.");
				break;
			}
			count++;
		}
		
		//3. ���� while���� ���� �������� �����ϰ� �������� 
		// 2���� �������� �ٲ��.
//		int i=1, sum=0;
//		while( i<10){
//		i=i+2;
//		sum +=i;
//		}
//		System.out.println(sum);
//		3.1) while(true)�� break�� ����Ͽ� �ٲ��.
//	    3.2) do~while��, continue�� ����Ͽ� �ٲ��.

		
		int i=1, sum=0;
		while (true) {
			i=i+2;
			sum +=i;
			
			if (i=>10) {
				break;
			}
		}System.out.println(sum);
	
		
		int i=1, sum=0;
		do {
			
			i+=2;
			if(i%2==0) {
				continue;
			}
			sum += i;
			
		}while (i<=10); // i �� 10����
		System.out.println(sum);
		
		
		//4-1) 10���� ���ڸ� ������ �迭 a�� �����ϰ� �����ض�.
		
		char a[] = new char[10];
		
		int b[] = {0,1,2,3,4};
		
		String c[] = {"java", "c", "c++"};
		
		int d[] = new int[10];
		
*/		
		
/*		
		// 1~100���� �� 5�� ����̰� 10�� ���
		// while do while for
		
		System.out.println("while");
		int i=1;
		while (i <= 100) {
			if(i%5==0 && i%10==0) {
				System.out.println(i);
			}
			i++;
		}
		
		
		
		System.out.println("do-while");
		int i2=1;
		do {
			if(i2%5==0 && i2%10==0) {
				System.out.println(i2);
			}
			
			i2++;
			
		}while(i2 <= 100);
		
		
		
		System.out.println("for");
		for(int i3=1; i3<=100; i3++) {
			if(i3%5==0 && i3%10==0) {
				System.out.println(i3);
			}
		}
		
		
*/
		
/*		
		// ���� 5�� �Է��ؼ� ���� ū ���� ���
		Scanner tmp = new Scanner(System.in);
		int a[] = new int[5];
		
		int big =0;
		
		for (int i=0; i<a.length; i++) { //a�迭 ���� ��ŭ
			System.out.println((i+1)+"��° ������ �Է��ϼ��� �� 5��");
			a[i] = tmp.nextInt();
			

			
			if (big < a[i]) {
				big = a[i];
			}
//			System.out.println("����ū�� : "+big);

			
		}
		System.out.println("����ū�� : "+big);
		
		
*/	
		
/*		
		//for each Ȱ��
		String str[] = {"��ǻ��", "���","DB"};
		
		// for each �� 
		// for(�ڷ��� �ڷ���_�̸� : �迭 �̸�)
		for(String s:str) {
			System.out.println(s);
		}
		
		// for each �� Ȱ��
		int sum=0;
		int aray[] = {1,2,3,4,5};
		for (int i:aray) {
			sum+=i;
			System.out.println(sum);
			
		}
		
		
		
	
*/		
		//page 276 int a[][] =new int[���][����]
//		int aray[][] = new int[2][2]; //2�� 2��
//		aray[0][0] =5;
//		aray[0][1] =8;
//		aray[1][0] =6;
//		aray[1][1] =2;
		
		
/*		
		int aray[][] = new int[][] {{5,8},{6,2}};
		for (int i=0 ; i<2 ; i++) {
			for(int j=0;j<2;j++)
			{
				System.out.print(aray[i][j]);
			}
			System.out.println();
		}
*/
/*
		//page 278 �ǽ� 8-8
		int a[][] = new int[3][4];
		int val =1;
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				a[i][j]
			}
		}
*/		
		//����
		//page 296 2��
		
		//page 297 4�� 50��
		//page 299 8��

		// 6���� ���� ����
		//���� 10�� �Է¹޾� �迭�� ������ ��
		//5�� ��� ������ ���
		
		
		//for each Ȱ��
//		String str[] = {"��ǻ��", "���","DB"};
		
		// for each �� 
		// for(�ڷ��� �ڷ���_�̸� : �迭 �̸�)
//		for(String s:str) {
//			System.out.println(s);
//		}
		/*
		int aray[] = new int[3];
		Scanner tmp = new Scanner(System.in);
		
		for (int i:aray) { // i�� �迭�� �� ������ ? 

			System.out.println("���� �Է�");
			aray[i] = tmp.nextInt();
		
			
			if(aray[i]%5==0) {
				System.out.println("�Է°��� 5�� ��� : "+ aray[i]);
			}
			
		}
		
		*/
		
		//2���� �迭. �Ǽ� �Է¹޾Ƽ� ���
/*		
		Scanner tmp = new Scanner(System.in);
		
		double a[][] = new double[2][3];
		
		for(int i=0 ; i<2 ; i++) {
			for(int j=0; j<3 ; j++) {
				System.out.println(i+"��"+j+"�� ���� �Է��ϼ���");
				a[i][j] = tmp.nextDouble();
			
			}			
		}
		for(int i=0 ; i<2 ; i++) {
			for(int j=0; j<3 ; j++) {
		
				System.out.println(i+"��"+j+"��"+a[i][j]);
			}
		}
		
*/
		//int a[][]=new int[3][2];
		/// 1,2,3,4,5,6 ���� �ʱ�ȭ page 279
		
//		int a[][] = {{1,2,3},{4,5,6}};
		

////		int a[][] = new int[3][2];
//		for (int i=0 ; i<a.length ; i++) {
//			for (int j=0; j<=a.length ; j++) {//?
//				System.out.println(a[i][j]);
//			}
//		}
		
		
//		int b[][]= {{1,2,3,4},
//					{5,6,7,8}}; 
		//12345678�� 2�� 4���� �ʱ�ȭ
		
		
//		int c[][]=new int[4][2];
		// 4�� 2�� �迭 ����
		
		// ����. �迭 b�����͸� �迭c�� ����. 
		// ��ġ�� �ٸ�(2�� 4����, 4�� 2���� ��ȯ) 
		// �迭�� ���� Ȯ���Ͽ� ����
/*		
		for(int i=0; i<2;i++) {
			for(int j=0; j<4 ; j++) {
				c[j][i]=b[i][j];
			}
		} // b�� �迭 ���� c�� �迭�� �Է�  
		for (int j=0; j<4; j++) {
			for (int i=0; i<2; i++) {
				System.out.print(c[j][i]+" ");
			}
			System.out.println();
		} // c�� �迭�� ���
*/			
/*		
		// 2���� �迭 2�� 3�� �����Ͽ�
		// ������ �Է¹޴´�
		// �Է��� ������ ���� ���
		
		int d[][] = new int[2][3];
		Scanner tmpd= new Scanner(System.in);
		int sum =0;
		for(int i=0; i<2;i++) {
			for(int j=0; j<3 ; j++) {
				System.out.println("������ �Է��ϼ���");
				int e = tmpd.nextInt();
				d[i][j]= e;
			}
				
		}
		for(int i=0; i<2;i++) {
			for(int j=0; j<3 ; j++) {
				sum+=d[i][j];
			}
				
		}
		System.out.println(sum);
*/		
/*		
		String s[][] = {{"Java"},
						{"c","C++"},
						{"html","css","Python"}};
		
		//2���� �迭 �϶�
		//�� > �迭��.length
		//�� > �迭��[��].length
		
		
		
		for(int i=0; i<s.length ;i++) {
			for(int j=0 ; j<s[i].length; j++) {
				System.out.print(s[i][j]+ " ");
			}
			System.out.println();
		}
*/		
		//page 290 20�� ���� Ǯ��
		
		// 7����
		// 2.0 4.0
		// 6.0 8.0
		/*
		double array[][] = new double [2][2];
		double count =2.0;
		for (int i=0 ; i<array.length ; i++) {
			for(int j=0 ; j<array[i].length ; j++) {
				
				array[i][j] = count;
				System.out.print(array[i][j]+ " ");
				
				count+= 2; 
			}
			System.out.println();
		}
		
		*/
		//			   01234567
		String str3 = "���� �ִµ���~ �������� ���� ����";
		String z[] = str3.split("~");
		
		for (String s:z) {
			System.out.println(s);
		}
		
//		String z2=str3.substring(4,7); //4���� 7�̸�(6����)
//		System.out.println(z2);
		
//		String z3=str3.replace("����", "����");
//		System.out.println(z3);
		
		//���� ���� ���� ���� ������ ����
/*		
		String str6= "������ ������";
		String str7=str6.concat(" ������ �����"); 
		//���ڿ� ����
		System.out.println(str7);
*/		
//		Scanner tmp7 = new Scanner(System.in);
//		System.out.println("1�� ���ڿ��� �Է��ϼ���");
//		String str7 = tmp7.next();
//		System.out.println("2�� ���ڿ��� �Է��ϼ���");
//		String str8 = tmp7.next();
//		
//		if (str7.length() < str8.length()) {
//			System.out.println(str8);
//		}
//		else
//			System.out.println(str7);
		
//		length ���̺�
//		replace ���ڿ� ��ü
//		substring ���ڿ� ����
//		sprilt ���ڿ� �и�
//		trim �յ� ���� ����
//		compareTo ���ڿ� ��
//		contains ���ڿ� ���� Ȯ��
//		concat �� ���ڿ��� ���ڿ� ����
		
/*		
		String a1= "apple";
		String b2= "banana";
		System.out.println(a1.compareTo(b2));
		if(a1.compareTo(b2)>0) { 
			//���ڿ� a1�� ���ڿ� b2�� ù��° ������ �ƽ�Ű���� ����.
			//a1.compareTo(b2) �� a�� �ƽ�Ű��ũ��, b�� �ƽ�Ű��ũ�� �� ��
			//a1-b2�� �ƽ�Ű�ڵ� ���� �ǹ��Ѵ�.
			System.out.println(a1);
			
		}
		else
			System.out.println(b2);
*/		
		//page 344 �������� 1��
/*		
		length() : ���ڿ� ����
		startWith() : ���� ���ڿ�c
		indexOf() : a
		lastIndexOf() :b
		replace() : d
		substring : 
		split : g 
		
		
		
		
*/		
	}

}
