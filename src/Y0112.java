import java.util.Scanner;
public class Y0112 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//p176 if�� ��ø ����
		//p191 5��
		// �Է��� ���� ������� �������� 0���� �⤩���ϴ� ���α׷��� ��øif���� ����ؼ� �ۼ��Ͻÿ�
		
//		Scanner scr = new Scanner(System.in);
		
//		System.out.println("���� �Ǵ� ��� �Ǵ� 0�� �Է��ϼ���");
//		double num1 = scr.nextDouble();
//		
//		if (num1>=0) {
//			if(num1!=0)
//				System.out.println("���");
//			
//			System.out.println("0");
//		}
//		else {
//			System.out.println("����");
//		}
			
		
		/*
		//p178 ���� 5-2 
		Scanner scr = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		int score = scr.nextInt();
		if (score >= 70) { // 70 �� �̻� ����
			
			if (score >=95) {
				System.out.println("A+");
			}
			if (score >= 90) {
				System.out.println("A");
			}
			else if(score >=85) {
				System.out.println("B+");
			}
			else if(score >=80) {
				System.out.println("B0");
			}
			else if(score >=75)
				System.out.println("C+");
			
			else
				System.out.println("C0");
		}
		else { // 70�� �̸��� �������� ����
			if (score >=65) {
				System.out.println("D+");
			}
			else if(score >=60) {
				System.out.println("D");
			}
			else			
			System.out.println("F");
		}
		*/
		
		
		//3. ��ø �ݺ���(for, do while)���� 5�ܺ��� 9�ܱ��� ���
		
//		System.out.println("����3-1 ��ø �ݺ��� ������ 5�ܺ��� 9�� ���");
//		for(int a = 5; a < 10 ; a++) {
//			
//			for(int b=1; b < 10 ; b++) {
//				System.out.println(a+"x"+b+"="+(a*b));
//			}
//		
//		}
		
//		System.out.println("����3-2 ��ø �ݺ��� ������ 5�ܺ��� 9�� ���"); // �̰� �� �ȵǴ��� ���� �ȵ�.
//		int b=1;
//		for(int a = 5; a < 10 ; a++) {
//			
//			while (b<10) {
//				System.out.println(a+"x"+b+"="+(a*b));
//				b++;
//			}
//			
//		}
		
		

		 /*

		//4. while���� �̿��ؼ� 1���� 100���� ���� �� 5�ǹ���� ������ ���
		int sum =0, i3=1;
	
		while (i3 <=100) {
			if(i3%5==0) {
				sum=sum+i3;
				System.out.println("sum = "+sum);
			}
			i3 ++;
		}
		
		
*/
		
		
		
		//page 254 ���� 17 ���ϴ� ����� �հ� ���ϴ� ����
/*
		Scanner num2 = new Scanner(System.in);
		System.out.println("����1�� �Է��ϼ���");
		int sum3 = num2.nextInt();
		System.out.println("����2�� �Է��ϼ���");
		int sum4 = num2.nextInt();
		System.out.println("����� �Է��ϼ���");
		int multiple1 = num2.nextInt();
		//����1�� ����2���� n ����� �հ�
		
		int sum5=0;
		for ( int z = sum3 ; z <= sum4 ; z++) {
			if (z%multiple1==0) {
				sum5+=z;
//				System.out.println(z);// ����
//				System.out.println(sum5); //����
			}
			System.out.println(sum5);
			
		}
		num2.close();
*/
		
		//5. while, random()�� �̿��ؼ� (x,y)���·� ����ϴµ� x+y���� 5�̸� ������ ���ߴ� �ڵ带 �ۼ�. 
		// 5�� �ƴϸ� ���� ��� �߻���Ű����� (x,y ������ 1���� 5����)
/*
		while(true) {
			int x = (int)(Math.random()*5)+1;
			int y = (int)(Math.random()*5)+1;
			int sum = x+y;
			System.out.println(sum); //�����
			if (sum==5) {
				break;
			}
			
		}
*/	
		
/*		
		// �ݺ��� ������ ����
		// 1~99���� ������
		//2�� ��� �Ǵ� 3�� ��� ���(�ݺ��� �ϳ� ���)
		System.out.println("�ݺϹ� for");
		for (int a=1 ; a<100 ; a++) { //�ݺ���
			if (a%2==0 || a%3==0) { //���ǹ�
				System.out.println("2��� �Ǵ� 3�� ��� ���"+a);
			}
		}
		
		
		System.out.println("\n�ݺ��� while");
		int b=1;
		while (b<100) { //�ݺ���
			if (b%2==0 || b%3==0) { //���ǹ�
				System.out.println("2��� �Ǵ� 3�� ��� ���"+b);
			}
		b++;
		}
*/		
/*
		int n=-1;
		do { // do while���� ������ 1���� ����ȴ�. 1�� ���� ���� ���ǿ� �´��� Ȯ���ϰ� �ݺ��Ѵ�.
			System.out.println(n);
			n++;
		}while(n>0);
*/
		
/*		
		//1~100���� do while
		int i = 1;//�ʱⰪ
		do {
			System.out.println(i);
			i++; // ������
		}while(i<=100); // ���ǽ�
		
*/		

		
/*		// page 242 ��Ǯ 7-2. �ǽ� 7-2�� do-while ������ �ٲ㺸�� 1���� 10���� �� ���
		int i=1, sum=0;
		do {
			sum+=i;
			i++;
			
			System.out.println(sum);

		}while (i<=10);
*/
		

/*
		// page 248 ��Ǯ 7-4. 
		// �ǽ� 7-9���� ����� for���� while ������ �ٲ㼭 �ۼ��϶�
		// �ǽ� 7-9 1~100�� �տ��� ���ʷ� 1000�� �Ѵ� ���� ���
		int hap =0;
		int i =1;
		while(i<=100) {
			hap +=i;
			i++;
			System.out.println("hap : "+ hap); //����
			System.out.println("i : "+i); //����
			
			if (hap >=1000) {
				break;
			}
			
		}
		System.out.println("1~100�� �տ��� ���ʷ� 1000�� �Ѵ� ��ġ��? " + i);
		
*/		
		
/*		
		// page 248 �ǽ� 7-10 continue �� ����
		int sum =0, i;
		
		for (i =1;i<=100;i++) {
			if(i%3==0) {
				System.out.println("i : "+i);
				
				continue;
			}
			
			sum+=i;
			System.out.println("sum : "+sum);
		}
		System.out.println("1~100������ ��(3�� ��� ����):"+sum);
		
*/		
		
		
		
		
/*		
		int answer =18;
		Scanner tmp = new Scanner(System.in);
		int count =0;
		
		for(count = 1 ; ; count++) {
			
		
			System.out.println("���ڸ� �Է��ϼ���");
			int num = tmp.nextInt();
			
			
			if (answer > num) {
				System.out.println(num +" ���� Ů�ϴ�.");
			}
			else if(answer < num) {
				System.out.println(num +" ���� �۽��ϴ�.");
			}
			else {
				System.out.println("�����Դϴ�.");
				break;
			}
		}
		
		System.out.println("�� "+count+"ȸ �õ� �߽��ϴ�.");
		// ����� �� �ۼ�(����) > �ݺ� ���� �ۼ�(�ٱ���) > ������ ��¹� ��ġ Ȯ��
*/		
		
/*
		int answer2 =18;
		Scanner tmp2 = new Scanner(System.in);
		int count2 =0;
		while(true) {
			count2+=1;
			System.out.println("���ڸ� �Է��ϼ���");
			int num2 = tmp2.nextInt();
			
			
			if (answer2 > num2) {
				System.out.println(num2 +" ���� Ů�ϴ�.");
			}
			else if(answer2 < num2) {
				System.out.println(num2 +" ���� �۽��ϴ�.");
			}
			else {
				System.out.println("�����Դϴ�.");
				break;
			}
		}
		System.out.println("�� "+count2+"ȸ �õ� �߽��ϴ�.");
		// ����� �� �ۼ�(����) > �ݺ� ���� �ۼ�(�ٱ���) > ������ ��¹� ��ġ Ȯ��
		
*/
		
/*		
		Scanner tmp = new Scanner(System.in);
		// �빮�� uppercase A-Z 89-114 / lowercase a-z 97-122 / number 0-9 48-057
		//page 254 uppercase lowercase number
		
		System.out.println("�ѹ��� �Է�");
		char chara1 =tmp.next().charAt(0);
		
		int charach=(int)chara1;
		
		System.out.println("�Է¹��� �ƽ�Ű�ڵ�� "+charach+" �Դϴ�.");
		
		for (int i=97; i<=charach ; i++) { // 97���� ���� �Է��� ����(charach)�� �ƽ�Ű�ڵ���� �ݺ�
			for(int j=i;j<charach ; j++) { // (i=98)���� �ƽ�Ű�ڵ� ���� �Է��� ������ �ƽ�Ű�ڵ�-1���� 1�� ����
//				System.out.println(i + "" + j); ���ظ� ����
				System.out.print("�ƽ�Ű�ڵ� : "+j); // �ƽ�Ű�ڵ� ǥ��
				char chara2=(char)j; // �ƽ�Ű�ڵ�=���� j�� ���� chara2�� ����ȯ
				System.out.println(" ���� : "+chara2); // chara2�� ���
				break; // j ����
			}
			
		}System.out.println(); // 1�� ���� 
		
*/		
/*
		String str;
		do {
			System.out.println("�ѹ��ڿ� �Է�");
			str = tmp.next();
			if(str.equals("exit")) {
				System.out.println("���α׷� ����");
			}
			else {
				System.out.println(str);
			}
				
		}while(!str.equals("exit")); // "exit"�� �ƴϸ� ���ڿ��� �Է¹޾� ���
		
		tmp.close();


*/		
/*		
		// ����
		// �ǽ� 7-6 
		Scanner scn = new Scanner(System.in);
		int menu;
		do {
			System.out.println("�ֹ��Ͻðڽ��ϱ�?\n");
			System.out.print("1ī���, 2īǪġ��, 3�Ƹ޸�ī��, 4�׸���ų���� =>");
			
			menu = scn.nextInt();
			switch (menu) {
			case 1 : {
				System.out.println("ī��� �ֹ��߽��ϴ�.");
				break;
			}
			case 2:{
				System.out.println("īǪġ�� �ֹ��߽��ϴ�.");
				break;
			}
			case 3:{
				System.out.println("�Ƹ޸�ī�� �ֹ��߽��ϴ�.");
				break;
			}
			case 4:{
				System.out.println("�ֹ��Ͻ� Ŀ�� �غ��ϰڽ��ϴ�.");
				break;
			}
			default : 
				System.out.println("�߸� �ֹ��߽��ϴ�.");
			}
			
		}while(menu!=4);
		
		// page 243 ��Ǯ 7-3
		// �ǽ� 7-6���� ����� switch case�� if�� �ٲٱ�
		
		Scanner scn2 = new Scanner(System.in);
		int menu2;
		do {
			System.out.println("�ֹ��Ͻðڽ��ϱ�?");
			System.out.print("1ī���, 2īǪġ��, 3�Ƹ޸�ī��, 4�׸���ų���� =>");
			menu2 = scn.nextInt();
			if (menu2==1) {
				System.out.println("ī��� �ֹ��߽��ϴ�.");
			}
			else if (menu2==2){
				System.out.println("īǪġ�� �ֹ��߽��ϴ�.");
			}
			else if (menu2==3){
				System.out.println("�Ƹ޸�ī�� �ֹ��߽��ϴ�.");
			}
			else if (menu2==4){
				System.out.println("�ֹ��Ͻ� Ŀ�� �غ��ϰڽ��ϴ�.");
			}
			else
				System.out.println("�߸� �ֹ��߽��ϴ�.");
		}while(menu2!=4);
*/		
		
/*		
		int i=0;
		do {
			System.out.println(i);
			i+=2;
		}while(i<=8);
*/		
		
/*		
		//1~20���� ��(do~while)
		
		int i=1,sum8=0;
		
		do {
			sum8+=i;
			i++;

		}while(i<=20);
		System.out.println("sum :"+sum8);
*/			
		
		// �ݺ��� ���� : 1~10������ �� �� 30�� �ʰ��Ǹ� ���߰� 30�� �ʰ��ϴ� �� ���.
/*		//for��
		int i=1, sum=0;
		
		for(i=1;i<=10;i++) {
			sum+=i;
			if(sum>=30) {
				break;
			}
			
		}
		System.out.println(sum);
*/		
		
/*		
		//while
		int i=1, sum=0;
		while(i<=10) {
			
			sum+=i;
			i++;
			if(sum>=30) {
				break;	
			}
			
		}
		System.out.println(sum);
*/
		
//		//do while
//		int i=1, sum=0;
//		do {
//			sum+=i;
//			i++;
//			if(sum>=30) {
//				break;
//			}
//			
//		}while(i<=10);
//		System.out.println(sum);
		

//		//0~9���� �� �� ¦
//		int num=0;
//		while(num<=9) {
//			num++;
//			if(num%2==0) { //¦��
//				continue; // �ݺ������� ���ư���.
//			}
//			else {
//				System.out.println(num);
//			}
//		}
//		
//		System.out.println("for��");
//		
//		for(int num2=0; num2 <=9 ; num2++){
//			if(num2%2==0) {
//				continue;
//			}
//			else {
//				System.out.println(num2);
//			}
//					
//		}
		
		
		//page 264 �迭
		//�迭�� ����ϴ� ���� : ������ �ڵ带 ¥�� ����. �ϰ�ó��. 
		
//		int [] ary = new int[4]; //0~3���� ary ��� ���� �迭. �������� �ε��� ary
//		//���������� �迭�� ���ÿ� ����
//		//int�� 1���� 4����Ʈ 4���̹Ƿ� �� 16����Ʈ
//		
//		int ary_test[]; // ���� �迭 ����
//		ary_test = new int[4]; // �迭 ũ�� ����
//		
//		System.out.println(ary_test[3]);
		
		
//		// page 269 �ǽ� 8-3
//		Scanner s = new Scanner(System.in);
//		int[] ary = new int[4];
//		int i, sum = 0;
//		for(i=0;i<=3;i++) {
//			System.out.println((i+1)+"��° ���ڸ� �Է��ϼ��� : ");
//			System.out.print("aa[" +i+ "]��° ���ڸ� �Է��ϼ��� : ");
//			ary[i] = s.nextInt();
//			sum +=ary[i];
//			
//		}
//	//	sum = ary[0]+ary[1]+ary[2]+ary[3];
//		System.out.println("�հ� : "+sum);
//		
		
		
		
		
//		//����1. ���� 5���� ������ �迭 ������ ���� ���ÿ�
//		int[] ary1 = new int[5]; // index 0~4����
//		
//		//����2. �Ǽ� 10���� ������ �迭
//		float[] ary2 = new float[10]; // index 0~9����
//		
//		//����3. �迭 ��Ҽ��� 3���� int�� �迭
//		int[] ary3 = new int[3]; // index 0~3����
//		
//		//����4. �ε����� �ִ밪�� 4�� char�� �迭
//		char[] ary4 = new char[5]; // index 0~4����
		
		
		
//		// �Ǽ� 3�� �Է��ؼ� ���
//		Scanner tmp = new Scanner(System.in);
//		float[] num = new float[3];
//		for (int i=0; i<3 ; i++) {
//			System.out.println(i+ "��° �Ǽ��� �Է��ϼ���. ��3��");
//			num[i] = tmp.nextFloat();
//			System.out.println(num[i]);
//		}
		
		// page 297 ��������1�� > 296 �迭�� ����
		
		// page 270 ���� Ǯ��� 8-1
		// �ǽ� 8-3�� �����Ͽ� ���� 4���� �ƴ϶� 10���� �Է¹޵��� �غ���.
		// ���� for ���� while������ �����غ���
		
//		Scanner tmp = new Scanner(System.in);
//		System.out.println("for�� �迭�� ��");
//		int[] aray = new int[10];
//		int num, sum = 0;
//		for (num =0 ; num <10; num++) {
//			System.out.println((num+1)+ " ��° ������ �Է��ϼ���. ��10��");
//			aray[num] = tmp.nextInt();
//			sum+=aray[num];
//		}
//		System.out.println("���� : " +sum);
//		
//		System.out.println("while�� �迭�� ��");
//		int[] aray1 = new int[10];
//		int num1=0, sum1=0;
//		while(num1<10) {
//			System.out.println((num1+1)+" ��° ������ �Է��ϼ���. ��10��");
//			aray1[num1]=tmp.nextInt();
//			sum1+=aray1[num1];
//			num1++;
//		}
//		System.out.println("���� : " +sum1);
//		
//		
//		System.out.println("do-while�� �迭�� ��"); 
//		//do�� while�� �������� �ʴ��� �ּ� 1���� �����Ѵ�. ���� while�� ������ �����Ҷ����� �ݺ��ȴ�.
//		int[] aray2 = new int[10];
//		int num2=0, sum2=0;
//		do {
//			System.out.println((num2+1)+" ��° ������ �Է��ϼ���. ��10��");
//			aray2[num2]=tmp.nextInt();
//			sum2+=aray2[num2];
//			num2++;
//		}while(num2<10);
//		System.out.println("���� : " +sum2);
		
		
//		int aray[] = {10,20,30}; // �ʱ�ȭ �Ҷ��� �ε��� ũ�⸦ �������� �ʴ´�.
//		for(int i=0; i<3; i++) {
//			System.out.println("�ε��� "+i+"�� �� : "+ aray[i]);
//		}
//		int aray2[] = new int[] {10,20,30,40}; // �ʱ�ȭ�Ҷ��� �ε��� ũ�⸦ �������� �ʴ´�.
//		int aray3[] = new int[5]; // �ʱ�ȭ ���� �������� �ε��� ũ�⸦ �����Ѵ�.
		
		
		// page 297 ����3 1,4
		// page 273 �ǽ�8-5
		
		int []aa = new int[100];
		int bb[] = new int[100];
		int i;
		
		for (i=0;i<100;i++) {
			aa[i]=i*2;
		}
		for (i=0;i<100;i++) {
			bb[i]=aa[99-i];
		}
		
		System.out.println("bb[0]�� "+bb[0]+", bb[99]�� "+bb[99]+" �Էµ�");		
		
		System.out.println("�ǽ� 8-5�� while��");
		int []aa1 = new int[100];
		int bb1[] = new int[100];
		int i1=0;
		
		while(i1<100) {
			aa1[i1]=i1*2;
			i1++;
		}
		while(i1<100) {
			bb1[i1]=aa1[99-i1];
			i1++;
		}
		System.out.println("bb1[0]�� "+bb1[0]+", bb1[99]�� "+bb1[99]+" �Էµ�");	
		
		
		System.out.println("�ǽ� 8-5�� do-while��");
		int []aa2 = new int[100];
		int bb2[] = new int[100];
		int i2=0;
		do {
			aa2[i2]=i2*2;
			i2++;
		}while(i2<100);
		
		do {
			bb2[i2]=aa2[99-i2];
			i2++;
		}while(i2<100);
		System.out.println("bb2[0]�� "+bb1[0]+", bb2[99]�� "+bb2[99]+" �Էµ�");	
			
		
	}

}













