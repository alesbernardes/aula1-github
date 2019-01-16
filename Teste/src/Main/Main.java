package Main;

class Calculo{
	
	void soma(int num1, int num2) {
		
		System.out.print(num1 + num2);
		
	}
}

public class Main {
    
	public static void metodos() {
		System.out.print("Eu sou um metodo");
	}
	
	
	
	public static void main(String args[]){
		
		metodos();
		
		Calculo cal = new Calculo();
		cal.soma(5, 25);
		
		
	
	
		Mobile mobile;
		mobile = (new Mobile());
		mobile.volume = 5;
		mobile.ligado = true;
		
	}
}
