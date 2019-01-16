package Main;

class Contagem {
	
	// Construtor
	
	Contagem(){

		System.out.println("Estamos contando");
	}
	
	// overload - mesmo nome e assinaturas diferentes
	
	void imprime(int j, int i) {
	    
		System.out.println(j / i);
	}
    void imprime(int j, int i, int o) {
	    
		System.out.println((j / i)*o);
	}
}


public class Contas {
	
	public static void main(String []args) {
	
		new Contagem().imprime(8,4);
		new Contagem().imprime(8,4,9);
		
    }
}
