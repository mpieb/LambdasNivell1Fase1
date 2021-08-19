package lambdasNivell1Fase1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NewMain {

    public static void main(String[] args) {
        
        //Instanciació de clases i crida a mètodes de la clase
        PrimerPunt app = new PrimerPunt();
        app.primerPunt();
        System.out.println();
        
        SegonPunt app2 = new SegonPunt();
        app2.segonPunt();
        System.out.println();
        
        TercerPunt app3 = new TercerPunt();
        app3.tercerPunt();
        System.out.println();
        
        QuartPunt app4 = new QuartPunt();
        app4.quartPunt();
        System.out.println();
        
        
        /* Cinque punt:
           Instanciació d´una llista amb els mesos de l´any i desprès 
           sortida de dades per consola, mitjançant una expressió lambda
        */
        List<String> mesos = new ArrayList<>(
	Arrays.asList("Gener", "Febrer", "Març", "Abril", "Maïg", "Juny", "Juliol", "Agost", "Setembre", "Octubre","Novembre", "Desembre"));
        mesos.forEach( (n) -> { System.out.println(n); });
        System.out.println();
        
        SisePunt app5 = new SisePunt();
        app5.sisePunt();
        
    }
    
}
