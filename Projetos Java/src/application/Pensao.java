package application;

import java.util.Locale;
import java.util.Scanner;

import enties.Quartos;

public class Pensao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Quartos [] quartos = new Quartos [10];
		
		System.out.println("Digite o numero de estudantes de 1 a 10:");
		int estudantes = sc.nextInt();

		for (int i = 0; i < estudantes; i++) {
			
			System.out.println();
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.nextLine();
			
			System.out.print("Room: ");
			int room = sc.nextInt();
			
			quartos[room] = new Quartos(nome, email);
		
	   	}
		
		   System.out.println();
		   System.out.println("Busy rooms:");
		   
		   for (int i=0; i<10; i++) {
		      if (quartos[i] != null) {
		             System.out.println(i + ": " + quartos[i]);
		      }
		   }
		      
		
		sc.close();
    	
 
	}
}
