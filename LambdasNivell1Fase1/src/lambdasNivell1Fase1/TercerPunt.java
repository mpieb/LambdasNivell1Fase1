package lambdasNivell1Fase1;

import java.util.ArrayList;
import java.util.List;

public class TercerPunt {
    
    //Declaració de llista
    private List<String> llista;
    
    //Constructor de llista
    public TercerPunt(){
    
    llista = new ArrayList<>();
    llista.add("Romul");
    llista.add("Manela");
    llista.add("Pere");
    llista.add("Pomul");
    
    }
    
    /*Mètode de clase, retorna una llista de totes les cadenes que contenen
      la lletra 'o' i imprimeix el resultat per consola.
    */
    public void tercerPunt(){
    
    //Stream
    llista.stream().filter(n -> n.contains(String.valueOf('o'))).forEach(System.out::println);
    
    }
    
}

