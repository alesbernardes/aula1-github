package Main;

class Quadrados{
	
	public int direita, esquerda;
	
	public int areaTotal() {
		return direita * esquerda;
	}
	
	//verifica se é um quadrado
	
	public boolean isQuadrado() {
		if (direita==esquerda)
			return true;
		return false;
	}
	
}

public class Quadrado {
	
	public static void main (String args[]) {
		
		Quadrados quad = new Quadrados();
		
		quad.direita = 10;
		quad.esquerda = 15;
		
		System.out.println(quad.areaTotal());
		System.out.println(quad.isQuadrado());
		
        Quadrados quad2 = new Quadrados();
		
		quad2.direita = 100;
		quad2.esquerda = 100;
		
		System.out.println(quad2.areaTotal());
		System.out.println(quad2.isQuadrado());
		
		
	}
}
