package Test;

import java.awt.FlowLayout;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JavaTest {

	public static void main(String[] args) {
		
//		// 1�� ����
//		Scanner sc = new Scanner(System.in);
//		System.out.print("�� ������ �Է� : ");
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		System.out.print("���� : " +(num1+num2));
//		
//		
//		// 2�� ����
//		Circle[] c = new Circle[5];
//		for (int i =0; i<c.length ; i++) {
//			System.out.print((1+i)+"��° ������ �Է� : ");
//			double r = sc.nextDouble();
//			c[i] = new Circle(r);
//		}
//		for (int i =0; i<c.length ; i++) {
//			System.out.println("���� : "+c[i].area());
//		}
		
		// 3�� ����
//		
//		Num nb = new Num();
//		nb.add(7); 
//		nb.add(-1); 
//		nb.add(20); 
//		nb.add(5); // 4�� ���ڸ� �Է�
//		System.out.println("Sum = " + nb.getSum());   // 4�� ������ �հ�
//		System.out.println("Max = " + nb.getMax());   // 4�� ���� �� �ִ밪
//
//		
		
//		// 4 ��
//		HashMap<String, Integer> h= new HashMap<String, Integer>();
//		
//		h.put("name1", 1);
//		h.put("name2", 2);
//		h.put("name3", 3);
//
//		System.out.println(h.get("name1")); //Ű�� �������� ���� �ҷ�����.
		
		// 5 ��
		
		JFrame j = new JFrame();
		j.setTitle("Dial");
		j.setVisible(true);
		j.setSize(200,200);
		j.setLayout(new FlowLayout());
		JButton btn1 = new JButton("1");
		JButton btn2 = new JButton("2");
		JButton btn3 = new JButton("3");
		JButton btn4 = new JButton("4");
		JButton btn5 = new JButton("5");
		JButton btn6 = new JButton("6");
		JButton btn7 = new JButton("7");
		JButton btn8 = new JButton("8");
		JButton btn9 = new JButton("9");
		
		j.add(btn1);
		j.add(btn2);
		j.add(btn3);
		j.add(btn4);
		j.add(btn5);
		j.add(btn6);
		j.add(btn7);
		j.add(btn8);
		j.add(btn9);
		
		// 6 �� ����
		
		Student s = new Student("jack", "123", 20);
		s.show();
		
		
	}
	
	
}
// 2�� ����
class Circle{
	private double r;
	Circle(double r){
		this.r = r;
	}
	double area() {
		return 3.14*r*r;
	}
}


//3�� ����
class Num{
	// �Էµ� ������ �հ� �Է� ���� �� �ִ� ���� ���ϴ� Num 
	
	int[] ary = new int[4];
	int hap=0;
	int sum=0;
	int c=0;
	int max;
	
	Num(){
		int n = 0;
	}
	Num(int n){
		n = 0;
	}
	
	void add(int n) { // �޼ҵ�
		hap += n;
	}
	
	int getSum() {
		
		for (int i =0 ; i < ary.length ; i++) {
			sum += ary[i];
		}
		return sum;
		
	}
	int getMax() {
		for (int i =0 ; i < ary.length ; i++) {
			if(max < ary[i]) {
				max = ary[i];
			}
		}
		return max;
		
	}
	
}


// 6�� ����
class Student{
	String name;
	String sid;
	int age;
	Student(String name, String sid, int age){
		this.name = name;
		this.sid = sid;
		this.age = age;
		
	}
	void show() {
		System.out.println(name+" "+sid+" "+age);
	}
}

