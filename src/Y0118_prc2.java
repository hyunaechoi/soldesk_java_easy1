import java.util.Scanner;
public class Y0118_prc2 {

	//���� 7��
	static void pr(int array[], int a) {
		
		for (int i =0 ; i<a ; i++) {
			int j=array[i]/a, k;
			System.out.println("score/a = "+j);
			for(k=0 ; k<j ; k++) {
				System.out.print("#");
			}
			System.out.println();

		}
		
		
	}
	
	//���� 8��
	static String show(char a, int b) {
		System.out.println("���� �������� ���ڿ� ���");
		String str="";
		for(int c=0; c<b ; c++ ) {
			str+=a;
		}
		return str;
	}
	
	static String show2(String a, int b) {
		System.out.println("���ڿ��� �̾� ���̱�");
		String str="";
		for(int c=0; c<b ; c++ ) {
			str=str.concat(a);
		}
		return str;
	}
	public static void main(String[] args) {
//		7. �ټ� ���� ������ ����� �迭�� ���� ���� #��� (#�� 5���� �ϳ��� ����ϸ� ���� ������ ������. pr�Լ��� �ۼ�
//
//		main(){
//			int score[]=new int[] {58, 60, 86, 90, 84};
//			pr(score, 5) }

		int score[]=new int[] {58, 60, 86, 90, 84};
		pr(score, 5);
		
				 

//		8. ���� main�Լ��� ���� ��ȯ���� String������ �ְ� ����ض�.
//		main(){
		
//			System.out.println(show(��$�� , 10));
		System.out.println(show('$', 10));
		// ��¥��°��� ���ظ���.

		System.out.println(show2("$", 10));
		// ���� ��� �ۼ�
		
//		9. �����δ� �������, ��ճ׿䡱��� ���ڿ��� str�� ������ ��,
//		","�� �������� ���ڿ��� �����غ���, �ε��� 6�� �ִ� �� ���ڸ� ���, �����δ¡� ���
		
		Scanner tmp = new Scanner(System.in);
		String str = "���δ� �������, ��ճ׿�";
		String str2[] = str.split(",");
		
		for (String s:str2) {
			System.out.println(s);	
		}
		
		
		System.out.println(str.substring(6,7));
		
		
		if(str.contains("���δ�")) {
			System.out.println("���δ�");
		}
		

		   //���ڿ� ����
//			length ���̺�
//			replace ���ڿ� ��ü
//			substring ���ڿ� ����
//			split ���ڿ� �и�
//			trim �յ� ���� ����
//			compareTo ���ڿ� ��
//			contains ���ڿ� ���� Ȯ��
//			concat �� ���ڿ��� ���ڿ� ����
		
		
		
	}

}
