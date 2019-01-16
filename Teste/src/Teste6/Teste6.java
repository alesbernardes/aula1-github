package Teste6;

public class Teste6 {
	
	public static void main(String [] args) {
		
		labelForI:
			
			for (int i = 0; i < 10 ; i++) {
			if (i==5)
				break;
			    System.out.println(i);
			    
			for (int j=0 ;j <10 ; j++) {
				System.out.println(j);
				if(j==9 && i==3) 
					break labelForI;
				
			}
		}
		
	}

}
