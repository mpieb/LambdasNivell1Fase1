package lambdasNivell1Fase1;

import java.util.ArrayList;
import java.util.List;

public class SegonPunt {
   
   //Declaració de llista
    private List<Integer> nombres;
    
    //Constructor de llista
    public SegonPunt(){
        
        nombres = new ArrayList<>();
        nombres.add(1);
        nombres.add(2);
        nombres.add(13);
        nombres.add(22);
    
    }

   /* Mètode de clase, retorna una cadena separada per comes basada en una llista 
      de nombres enters, cada nombre va precedit per la lletra 'e' si el nombre 
      és parell, i precedit de la lletra 'o' si el nombre és senar.
      Per exemple, si la llista d´entrada és (3, 44), la sortida hauria de ser
      'o3', 'e44' i imprimeix les dades per consola.
   */ 
   public void segonPunt() {
    
   //Stream
   nombres.stream().map(n -> n %2 == 0? "e" + n : "o" + n).forEach(System.out::println);
           
   }

}
