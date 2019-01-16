package Main;

class overload{
	
	void imprime(int i, String j) {
		System.out.println(i + j);
	}

	void imprime(double i, String j, int v) {
		System.out.print(i + j + v);
	}
}


public class Sobrecarga {
	
	public static void main(String []args){
		
		new overload().imprime(1, " alessandro ");
		new overload().imprime(23, " alessandro ", 7);
		
	}
}
