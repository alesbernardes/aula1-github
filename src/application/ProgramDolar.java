package application;

import java.util.Locale;
import java.util.Scanner;

import util.calculodolar;

public class ProgramDolar {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a quantidade de dolares: ");
		
		double quantidade = sc.nextDouble();
		double total = calculodolar.CalculaDolar(quantidade);
		
		System.out.println(total);
		
		sc.close();
	}

}
