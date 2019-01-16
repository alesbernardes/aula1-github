package application;

import java.util.Locale;
import java.util.Scanner;

import enties.Conta;



public class AberturaConta {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
	
		Conta contas;
		
		System.out.println("Entre com o numero da conta: ");
		int numero = sc.nextInt();
		System.out.println("Entre com o nome :");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.println("Tem deposito inicial ? S/N ");
		char resposta = sc.next().charAt(0);
				
		if (resposta == 's' || resposta == 'S') {
		
			System.out.println("Entre com o deposito inicial: ");
			double inicialDeposito = sc.nextDouble();
			
			contas = new Conta(numero, nome, inicialDeposito);
			
		}else {
			
			contas = new Conta(numero, nome);
			
		}
		
		System.out.println("Dados da Conta");
		System.out.println();
		System.out.println(contas);
		System.out.println();
		System.out.println("Entrre com o valor para deposito :");
		double depositoValor = sc.nextDouble();
		contas.deposito(depositoValor);
		System.out.println("Valor do deposito atualizado:");
		System.out.println(contas);
		
		System.out.println("Entrre com o valor para saque :");
		double retiradaValor = sc.nextDouble();
		contas.saque(retiradaValor);
		System.out.println("Valor atualizado:");
		System.out.println(contas);
		sc.close();
	}

}
