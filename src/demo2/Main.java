package demo2;

import java.util.Scanner;


interface Sumable {
	int sum(int x, int y);
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Sheiyvane pirveli ricxvi");
		int a = sc.nextInt();
		System.out.println("Exla meore");
		int b = sc.nextInt();
		Sumable sum1 = (int x, int y) -> x + y;
		int realSum = sum1.sum(a, b);
		System.out.println("Sum: " + realSum);
	}
}