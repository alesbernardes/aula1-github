package Main;

class Calculando{
	
	void somar(int num1,int num2) {
		System.out.print(num1 + num2);
	}
	
}

public class Soma {

	public static void main(String []args) {
		
		Calculando cal = new Calculando();
	 
		System.out.println("A soma dos numeros é: "); 
		cal.somar(5,10);
		
		
	}
	
	
}
