import java.util.Scanner;
public class Y0111 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      
//      System.out.printf("%d + %d = %d\n",100, 200, 100+200);
//      System.out.printf("%d / %d = %.1f\n",100, 200, 100/200.0);
//      
//      int a=10; 
//      String a2 = Integer.toBinaryString(a);
//      
//      System.out.println(a2);
//      
//      if (a <10) {
//         System.out.println("10���� �۱���");
//      }
//      System.out.println("�����̹Ƿ� ���� ������ �Ⱥ��̰���?");
//      System.out.println("���α׷� ��");
//
//      
//      Scanner scr = new Scanner(System.in);
//      
//      System.out.println("�Ǽ��� �Է��Ͻÿ�");
//      double b1 = scr.nextDouble();
//      //float b = scr.nextFloat();
//      
//      if (a > 10.0) {
//         System.out.println(a + "�� 10���� ũ��");
//      }
//      else if (a==10) {
//         System.out.println(a + "�� 10 �̴�.");
//      }
//      else 
//         System.out.println(a + "�� 10���� �۴�");
//         
//      
//      
//      System.out.println();
      
//      page 184, 185, 190, 191, 192 ���� Ǯ��
//      // ���� ���� 11 �ܼ� if ���� Ȱ���� ������ ����
//      Scanner scr = new Scanner(System.in);
//      int num1 = scr.nextInt();
//      System.out.println("ù��° ���� �Է��ϼ��� : ");
//      System.out.println("�����ڸ� �Է��ϼ��� : ");
//      
      
      // �ϳ��� ���ڸ� �Է¹޴´�, J �� java ���, D �� database ���, �׿ܴ� none ���
      
//      Scanner scr = new Scanner(System.in);
//      System.out.println("���� �ϳ��� �Է��ϼ���");
//      char chr1 = scr.next().charAt(0);
//      
//
//      switch(chr1) {
//      case 'j' :
//         System.out.println("Java");
//      break;
//      
//      case 'd' :
//         System.out.println("Database");
//      break;
//      
//      default :
//         System.out.println("none");
//      break;
//      }
//      
//      scr.close();
//      
//      
      
//      //page 194 �ǽ� 6-1
//      
//      for(int i = 0; i < 5 ; i++) {
//         System.out.println("�ȳ� for��");   
//      }
//      
//      // page 205 ���� Ǯ��� 6-4
//      int sum = 0;
//      for(int i=1 ; i<12346 ; i++) {
//         sum += i;
//      }
//      System.out.println("�հ� : " + sum);
//      
//         
//      // page 206 
//      int sum1 = 0;
//      for (int i1 = 1; i1 <= 100 ; i1++) {
//         if(i1%3==0) {
//            sum1 += i1;
//         }
//         
//      }
//      System.out.println("1���� 100���� 3�� ����� �հ�" + sum1);
//      
//      
//      // 1~10���� ���� ����(random �Լ�)
//      int rdm = (int)(Math.random()*10)+1;
//      
//      for (int i2=1;i2<=10;i2++) {
//         System.out.println(rdm + " ");
//      }
//      
//      
      // page 230
//      for(;;) ���ѷ��� for��
      
      //page215 ����Ǯ��� 6-7
      
//      System.out.println("page215 ����Ǯ��� 6-7");
//      for (int i3 = 1 ; i3 <=9 ; i3++) {
//         for(int k1 = 2 ; k1 <=9 ; k1++) {
//            
//            System.out.print(k1 + "*" +i3 +"="+(k1*i3)+ "\t");
//         }
//         
//         System.out.println();
//      
//         
//         
//         
//      }

// 1�� 9��
      // 1�� 4���� 1�� 
      // 2�� 3���� 3��
      // 3�� 2���� 5��
      // 4�� 1���� 7�� 
      // 5�� 0���� 9�� 
      // 6�� 1���� 7��
      // 7�� 2���� 5��
      // 8�� 3���� 3��
      // 9�� 4���� 1��
      // ��i ����  ��j
      
//      for (int i=0 ; i < 9 ; i++) {
//         if (i<5) {
//            for(int j =0 ; j<4-i ; j++) {
//               System.out.print(" ");
//            }
//            for (int j=0;j<i*2+1;j++) {
//               System.out.print("*");   
//            }
//         }
//         else {
//            for(int j = 0 ; j<i-4 ; j++) {
//               System.out.print(" ");
//            }
//            for (int j=0;j<17-i*2 ; j++) // j�� ���� ���ϴ¹� �������� �����ؼ� ������ �ۼ�
//            System.out.print("*");
//            
//         }
//      System.out.println();
//      }
      
      

/*
      
      int i =1;
      while(i<=5) {
         System.out.println(i);
         i++;
      }
   
      
//      while(true) {} // ���� ���� = for(;;)
      
      // 0~10���� ¦�� ���
      int i6 =0;
      while(i6<=10) {
         if(i6%2==0) {
            System.out.println(i6);   
         }
         i6++;
      }
      
      
      
      for(int i61=0; i61<=10; i61++) {
         if(i61%2==0) {
            System.out.println(i61);
         }

      }
*/
      
//      Scanner scr = new Scanner(System.in);
//      System.out.println("���� ���� �Է��ϼ���");
//      int i62 = scr.nextInt();
//      
//         for(int i63 = 1 ; i63 <10 ; i63++)
//            System.out.println(i62*i63);
//      
//      scr.close();
      
      //1~100���� ���� while ��
      
//      int i71 = 1, sum1=0;
//      while (i71<=100) {
//         sum1 = sum1+i71;
//         System.out.println("i71 : " + i71);
//         System.out.println("sum1 : " + sum1);
//      
//         i71++;
//         
//      }
//      System.out.println(sum1);
      
      Scanner scr = new Scanner(System.in);
//      System.out.println("�̸��� �Է��ϼ���.");
//      String name = scr.next();
//      if(name.equals("ȫ�浿")) {
//         System.out.println("�ƹ����� �ƹ����� �θ��� ���ϰ�");
//      }
//      else {
//         System.out.println("ȫ�浿�� �ƴϱ���");
//      }
      
//      while(true) {
//         System.out.println("�̸� �Է�");
//         String name = scr.next();
//         if(name.equals("����")) {
//            break;
//         }
//         System.out.println(name); // break �Ǹ� ������� ����.
//      }
//      
//      scr.close();
      
      
      
//      // �����Լ��� 1~6���� ��� 6�̸� ����
//      while(true) {
//         int rdm = (int)(Math.random()*6)+1;
//         if(rdm==6) {
//            System.out.println("6�̴� ����");
//            break;
//         }
//         System.out.println(rdm + "�̴�.");
//         
//      }
      /*
      int sum = 0, num1 = 100;
      Scanner scr7 = new Scanner(System.in);
      
      while(num1!=0) {
         System.out.println("�Է��ض�");
         num1 = scr7.nextInt();
         
         sum = sum + num1;
         System.out.println(sum + " 0�̸� ������.");
         
      }
      System.out.println(sum);
      */
      
      
      
      // 1��
      // �� ���� ������ �Է��Ͽ� ��� ����ϴ� ���α׷�
      // (����� �Ҽ��� ���� ù��¥������ ��� ��°��) : 70 80 ��� 75.0
      /*
      System.out.println("����1 ������ �Է��ϼ���");
      Scanner scr8 = new Scanner(System.in);
      float scr81 = scr8.nextFloat();
      
      System.out.println("����2 ������ �Է��ϼ���");
      float scr82 = scr8.nextFloat();
      
      System.out.println("������ �� : " +  (scr81+scr82));
      System.out.printf("���� ��� : %.1f", (scr81+scr82)/2.0 );
      */
      
      //2��
      // �ð��� ���� ������ �ݾ� �������ִ� ���α׷�
      //(�� �ݾ��� 10�������� ����, �ð��� ���� ������ �Է¹ޱ�)
      //14�ÿ� ��Ʈ�� �湮�ϰ� ���� ������ 3�� ���ϸ� 5%�� ����
      //18�ÿ� ��Ʈ�� �湮�ϰ� ���� ������ 5�� ���ϸ� 10%�� ����
      //20�ÿ� ��Ʈ�� �湮�ϰ� ���� ������ 10�� ���ϸ� 20%�� ����
      Scanner scr8 = new Scanner(System.in);
      System.out.println("�湮�ð��� �Է��ϼ���");
      int time = scr8.nextInt();
      
      System.out.println("���� ������ �Է��ϼ���");
      int count = scr8.nextInt();
      
      double money = 100000; // �� �ݾ�
      
      if (time==14 && count<=3 ) {
         money = money * 0.95;
      }
      else if (time==18 && count<=5) {
         money = money * 0.90;
      }
      else if (time==20 && count<=10) {
         money = money * 0.85;
      }
      else {
         System.out.println("���� ����");
      }
      
      System.out.println("���� : " + money);
   
      
   }

}