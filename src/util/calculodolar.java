package util;

public class calculodolar {

	
	public static final double dolar = 3.10;
	
	public static double CalculaDolar(double quantidade) {
		
		double qtddolar = (dolar * quantidade);
		
		double iof = (qtddolar * 6) /100;
		
		double varfinal = qtddolar - iof;
		
		return varfinal;
		
	}
	
}
