package bas_java;

public class Main {

	public static void main(String[] args) {
		//int somme = Main.addition(2, 7);
		//System.out.println(somme);
		
		Main.chiffreEgalAZero(3);
		Main.meteo("soleil");

		
	}
	
	
	//public static int addition(final int entier1, final int entier2) {
		
		//return entier1 + entier2;
	//}
	
	
	public static void chiffreEgalAZero(final int valeur) {
		
		if(valeur == 0) {
			System.out.println("L'entier passé en parametre vaut 0");
			
		} else {
			System.out.println("L entier passé en paramètre est différent de 0");
		}
		
	}
	
//	public static void meteo(final boolean beauTemps) {
//		if(beauTemps) {
//			System.out.println("Je vais à la plage");
//		} else {
//			System.out.println("Je vais au cinéma");
//		}
//		
//	}
	
//    public static void meteo(final boolean beauTemps) {
//    	if(!beauTemps) {
//    		System.out.println("Le temps n' est pas beau");
//    	}
//    }
	
	public static void meteo(final String temps) {
		if(temps.equals("soleil")) {
			
			System.out.println("Je vais à la plage");
			
		}
	}
	

}
