package Array;

public class Array{

	public static void main(String []args){

		int [] gravar = new int [10];
		
		System.out.printf("%s%10s\n", " _______", "________");
		System.out.printf("%s%10s\n", "|Indice "  ,"| Valores|");
		System.out.printf("%s%10s\n", "|-------","|--------|");
		
		for (int i = 0;i <= 9; i++){
				System.out.printf("|%5d%3s%7d |\n", i, " |", gravar[i]);
		}
			System.out.printf("%s%10s\n", "|-------" ,"|--------|");
	}
}



