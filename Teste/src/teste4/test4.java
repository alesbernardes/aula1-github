package teste4;

import java.util.Scanner;

public class test4{

public static void main(String [] args){

	Scanner in = new Scanner(System.in);
	
	int num1, num2, opcao;
	double Valor = 0;

	do{
		System.out.println("	 ");
		System.out.println("	Calculadora	  ");
		System.out.println("----------------------");
		System.out.println("1 - Soma ");
		System.out.println("2 - Subtração ");
		System.out.println("1 - Multiplicação ");
		System.out.println("1 - Divisão ");
		System.out.println("0 - Sair ");
		System.out.println("----------------------");
		opcao = in.nextInt();
		
		if (opcao != 0 ){

		    System.out.print("Digite o primeiro valor ");
		    num1 = in.nextInt();
		    System.out.print("Digite o segundo valor ");
		    num2 = in.nextInt();	

		   if ( opcao==1 ){
			Valor = num1 + num2;
		   }else{
		      if (opcao ==2){
			Valor = num1 - num2;
			}else{
			   if (opcao ==3){
				Valor = num1 * num2;
			   }else{
				if (opcao == 4){
					Valor = num1 / num2;
				}
		
		         }

		         }
		   }
		   
		   for (int i=1;i < 3; ++i) {
			   System.out.println("O resultado é : "+ Valor);
		   }
		}
				

		}while (opcao != 0);

		}

}




