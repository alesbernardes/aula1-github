package Main;

class Fatorial{

	int largura, altura;
	
	Fatorial(int j, int i){
		
		largura = j;
		altura = i;
		
	}
	void imprimir () {
		System.out.println("A largura é "+ largura +" a altura é "+ altura);
	}
	
	int fat (int n) {
		if(n <= 1 )
			return 1;
		int r = fat (n-1)*n;
		return r;
	}
	
}


public class recursiva {
	public static void main (String []args) {
		System.out.print(new Fatorial().fat(5));
		
		Fatorial f = new Fatorial(250,120);
		
	}

}
