package Notas;
import java.util.Scanner;
public class Notas {

	public static void main (String[] args) {
 
    Scanner imput = new Scanner (System.in);
	
	String [] nome  = new String [2]; 
	int [] idade = new int[2];

       
	 for (int i=0; i < idade.length; i++){

	   System.out.println("Digite seu nome: ");
	   nome [i] = imput.nextLine();
	   System.out.println("Digite sua idade: ");
	   idade [i] = imput.nextInt();
	  

	 }

	for (int j=0; j < idade.length;j++){
	 
		System.out.println("Nome: "+ nome[j]);
	    System.out.println("Idade: "+idade[j]);

	}
}
}
		