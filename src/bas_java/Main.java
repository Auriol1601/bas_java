package bas_java;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    
    public static void main(String[] args) {
        Set<String> motsCles = new LinkedHashSet<String>();
        motsCles .add("Cabane");
        motsCles .add("Cabane");
        motsCles .add("Muraille");
        
        for(String motCle : motsCles) {
            System.out.println(motCle);
        }
    }
    
}