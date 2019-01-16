package Teste5;

import java.util.Scanner;

public class Teste5{

public static void main(String [] args){

	Scanner in = new Scanner(System.in);

	int num;

	System.out.println("Digite um valor");
	num = in.nextInt();
	
	switch (num){
		case  10:
			System.out.println("Valor maior que 10");
			break;	
		case  5:
			System.out.println("Valor menor que 10");
			break;	
		default:
			break;
}


}
}
