package lambdasNivell1Fase1;

import java.util.ArrayList;
import java.util.List;

public class QuartPunt {
    
    //Declaració de llista 
    private List<String> llista;
    
    //Constructor de llista
    public QuartPunt(){
    
    llista = new ArrayList<>();
    llista.add("Pomul");
    llista.add("Pitu");
    llista.add("Peco");
    llista.add("Tabola");
    
    }
    
    /*Mètode de clase, d´una llista de strings retorna els elements amb més de
      cinc caràcters. Imprimeix el resultat per consola.
    */
    public void quartPunt(){
        
    //Stream
    llista.stream().filter(n -> n.length()>=5).forEach(System.out::println);

    }
    
}






    

