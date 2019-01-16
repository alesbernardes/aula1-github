package Array3;

public class Array3{

public static void main(String [] args){

	int [] array = {1,5,6,7,8};

	System.out.printf("%s%8s \n", "Indice", "Valores");
	for (int i = 0; i < array.length; i++)
		System.out.printf("%5d%8d%\n", i, array[i]);
	
}
}