package Main;

public class Run {

	public static void main(String[] args) {
		
		Runnable r1 = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Estudando Lambda");
			}
		};	
		
		// Fun��o Lambda
		
		Runnable r2 = () -> System.out.println("Estudando Lambda 2");
		

		r1.run();
		r2.run();
		
		
	}
}
