package Teste2;

import java.util.Scanner;

public class Teste2{

public static void main(String [] args){

      double nota1, nota2, nota3, nota4;
      
	Scanner in = new Scanner(System.in);

	System.out.println("Digite nota1");
	nota1 = in.nextDouble();
	System.out.println("Digite nota2");
	nota2 = in.nextDouble();
	System.out.println("Digite nota3");
	nota3 = in.nextDouble();
	System.out.println("Digite nota4");
	nota4 = in.nextDouble();
	
	double Soma = nota1 + nota2 + nota3 + nota4;
	double media = Soma / 4;
	
	
	int cont=0;
	while (cont<10) {
		
		if (media < 6 ){
			System.out.println("Sua media é "+media+" você esta reprovado");
		}else{
			System.out.println("Sua media é "+media+" você esta Aprovado");
		}
		cont += 1;
	}
  }
}