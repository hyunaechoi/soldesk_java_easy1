package Test;

import java.util.Scanner;

public class Worker {
	private int sid;
	private String name;
	private String dep;
	private String address;
	private String birthday;
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	public static void main(String[] args) {
		Worker wk = new Worker();
		System.out.println("<��� ���� ���� ���α׷�>");
		System.out.println("1. ������� �Է�");
		System.out.println("2. ������� ���� ��ȸ");
		System.out.println("3. ���α׷� ����");
		Scanner sc = new Scanner(System.in);
		int num=0;
		System.out.print("��ȣ �Է� : ");
		num = sc.nextInt();
		
		do {
			if(num == 1 ) {		//"1. ������� �Է�")
				System.out.print("��� : ");
				int sid = sc.nextInt();
				wk.setSid(sid);
				System.out.print("�̸� : ");
				String name = sc.next();
				wk.setName(name);
				System.out.print("�μ� : ");
				String dep = sc.next();
				wk.setName(dep);
				System.out.print("�ּ� : ");
				String address = sc.next();
				wk.setName(address);
				System.out.print("���� : ");
				String brithday = sc.next();
				wk.setName(brithday);
			}
			else if(num == 2) {	//"2. ������� ���� ��ȸ"
				System.out.println("�˻��ϰ��� �ϴ� ����� ��� : ");
				System.out.println(wk.getSid());
				System.out.println(wk.getName());
				System.out.println(wk.getDep());
				System.out.println(wk.getAddress());
				System.out.println(wk.getBirthday());
				
			}
			else if(num == 3) {	//("3. ���α׷� ����");
				System.out.println("���α׷� ����");
				break;
			}
		}while(true);
		
		
	}



}
