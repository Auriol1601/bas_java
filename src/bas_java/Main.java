package bas_java;

import java.util.HashMap;
import java.util.Set;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
    	
    	Map<Bloc, Integer> quantiteBloc = new HashMap<Bloc, Integer>();
    	quantiteBloc.put(new Mur(1,1,1,true),4);
    	quantiteBloc.put(new Mur(1,1,1,false),4);
    	
    	Set<Bloc> cles = quantiteBloc.keySet();
    	for(Bloc cle : cles) {
    		Integer valeur = quantiteBloc.get(cle);
    		System.out.println(cle.getClass().getName() + " : " + valeur);
    	} 
    	
    }
    
}