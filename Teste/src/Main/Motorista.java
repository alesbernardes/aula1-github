package Main;
import java.util.Scanner;

public class Motorista {

	public static void main(String args[]) {
		
		Prova pvr = new Prova();
		
		Scanner in = new Scanner (System.in);
		
		System.out.println("Digite o ano atual");		
		pvr.AnoAtual = in.nextInt();
		
		System.out.println("Digite o ano de nascimento");		
		pvr.AnoNasc = in.nextInt();
		
		boolean calculo = pvr.Habilitado(); 
		
		if (calculo=true) { 	
		   System.out.print("Você tem "+ pvr.Idade() + " anos e pode dirigir");}
		else {
		System.out.print("Você tem "+ pvr.Idade() +" anos e não pode dirigir");}
	}
}
		
	
	
	

