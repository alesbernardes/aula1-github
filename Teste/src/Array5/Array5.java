package Array5;

import java.util.Scanner;
public class Array5{

public static void main (String [] args){
	
	String [] produtos = new String [5];
	int [] array = new int [5];
	
	Scanner in = new Scanner(System.in);	
	
	System.out.println("Digite produtos de 1 a 5");
	
	for ( int x = 0; x < array.length; x++){
	
		System.out.println("Digite o "+x+"º valor");
		array[x] = in.nextInt();
				
	} 
	
	produtos[0]= "Café";
	produtos[1]= "Leite";
	produtos[2]= "Pão";
	produtos[3]= "Queijo";
	produtos[4]= "Presunto";
	
	
	for ( int y = 0; y < array.length; y++){
		
		int prod = array[y];
		System.out.println(produtos[prod]);
		
	}	
}
}