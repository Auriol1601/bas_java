package bas_java;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<String> nomsDeslangages = Arrays.asList("Java","PHP","Javascript", "C#");
		for(String nomDUnLangage : nomsDeslangages)  {
			String resultat = nomDUnLangage.toUpperCase();
			System.out.println(resultat);
		}
				
	}	

}
	
