package systemclass;

import java.util.Scanner;

class maths {
	int a1, b1;

	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first value ");
		a1 = sc.nextInt();
		System.out.println("enter second value ");
		b1 = sc.nextInt();
		sc.close();
	}

	void output() {
		int sum = a1 + b1;
		System.out.print("addition of two numbers is : " + sum);
	}
}

public class System2 {

	static maths obj = new maths();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System2.obj.input();
		System2.obj.output();

	}
}
