package lambdasNivell1Fase1;

import java.util.ArrayList;
import java.util.List;

public class PrimerPunt {
    
    //Declaració de llista
    private List<String> llista;
    
    //Constructor de llista
    public PrimerPunt() {
        
        llista = new ArrayList<>();
        llista.add("Albert");
        llista.add("Ana");
        llista.add("Xesca");
        llista.add("Ada");
    
    }
    
    /*Mètode de clase, que reotrna totes les cadenes que comencen amb la 
      lletra 'a'(Majúscula) i tenen exactament tres lletres. 
      Imprimeix el resultat per consola.
    */ 
    public void primerPunt(){
    
    //Stream
    llista.stream().filter(n -> n.startsWith("A")).filter(n -> n.length()==3).forEach(System.out::println);
    
    }

}