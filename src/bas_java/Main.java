package bas_java;

public class Main {

	public static void main(String[] args) {

		System.out.println(categorieDefilm("Star Wars"));
		System.out.println(categorieDefilm("Blanche neige"));
		System.out.println(categorieDefilm("Indiana Jones"));
		System.out.println(categorieDefilm("La petite sirene"));
		System.out.println(categorieDefilm("aaaaaaaaa"));
		
	}
	
	public static String categorieDefilm(final String film) {
		var resultat = switch(film) {
		case "Star Wars" -> "Science fiction";
		case "Blanche neige" , "La petite sirene" -> "Disney";
		case "Indiana Jones" -> {
			String categorie = "Aventure";
			yield categorie;
		}
		default -> "Inconnu";
		};
		return resultat;
		
	}
	
//	public static void commentLaMeteo(final String meteo) {
//		switch(meteo) {
//		case "soleil" -> System.out.println("Beau temps");
//		case "nuage" -> System.out.println("Couvert");
//		case "pluie" -> System.out.println("Mauvais temps");
//		default -> System.out.println("Je ne sais pas");
//		} 
//		
//	}

	

}
