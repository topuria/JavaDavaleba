package demo1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		System.out.println("სახელების უნიკალური კოლექცია");
		Set<String> names = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("ჩაწერე სახელი");
		String name = sc.nextLine();
		names.add(name);
		while (!name.equals("Q")) {
			System.out.println("ჩაწერე სახელი/'Q' დაწერე გასათიშად");
			name = sc.nextLine();
			names.add(name);
		}
		names.remove("Q");
		System.out.println(names.toString());
	}
}
