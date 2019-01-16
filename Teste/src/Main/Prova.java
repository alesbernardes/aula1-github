package Main;

class Prova {
		
		public int AnoAtual, AnoNasc;
		
		
		public int Idade() {
			
			return AnoAtual - AnoNasc;
    		}
			
		public boolean Habilitado() {	
			
			int Hoje = Idade();
			if (Hoje < 18) 
				return false;
			return true;
    	     }
	}

