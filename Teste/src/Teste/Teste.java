package Teste;

import java.util.Scanner;

public class Teste {

	public static void main(String [] args) {

	Scanner in = new Scanner(System.in);
	
	int num1 = 0;
	int num2 = 0;
	int total;
	
	System.out.println("Digite um numero: ");
	num1 = in.nextInt();
	System.out.println("Digite um numero: ");
	num2 = in.nextInt();

	total = num1 + num2;
	
	if (num1 == num2) {
		System.out.println("Os números digitados são identicos");
	}else {
		System.out.println("Os números digitados são diferentes");
	}
	 
	System.out.println("O total da soma é "+total);
	}

}
