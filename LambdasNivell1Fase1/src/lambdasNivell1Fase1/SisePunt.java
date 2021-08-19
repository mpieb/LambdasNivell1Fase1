package lambdasNivell1Fase1;

import java.util.ArrayList;
import java.util.List;

public class SisePunt {
    
    //Declaració llista
    private List<String> llista;

    //Constructor llista
    public SisePunt(){
    
    llista = new ArrayList<>();
    llista.add("Gener");
    llista.add("Febre");
    llista.add("Març");
    llista.add("Abril");
    llista.add("Maïg");
    llista.add("Juny");
    llista.add("Juliol");
    llista.add("Agost");
    llista.add("Setembre");
    llista.add("Octubre");
    llista.add("Novembre");
    llista.add("Desembre");
    
    }
    
    /*Mètode per imprimir la llista amb una expressió lambda*/
    public void sisePunt() {
        
        //Lambda
        llista.forEach( (n) -> { System.out.println(n); });
    
    }
    
}
