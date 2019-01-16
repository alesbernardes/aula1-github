package course;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your full name:");
		String nome = sc.next();
		System.out.println("How many bedrooms are tere in hour houses?");
		int bd = sc.nextInt();
		System.out.println("Enter product price:");
		double pr = sc.nextDouble();
		System.out.println("Enter your last name, age and heigtht same line");
		String dad = sc.next();
		int age = sc.nextInt();
		double heigth = sc.nextDouble();
		
		System.out.println(nome);
		System.out.println(bd);
		System.out.println(pr);
		System.out.println(dad);
		System.out.println(age);
		System.out.println(heigth);
		
		
		

		
		sc.close();
	}

}
