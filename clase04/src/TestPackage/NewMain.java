/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestPackage;

import hijo.Camioneta;
import hijo.Motocicleta;
import java.util.ArrayList;
import java.util.List;
import padre.Vehiculo;

/**
 *
 * @author patri
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Vehiculo> vs = new ArrayList<>();
        Motocicleta m = new Motocicleta(true, 3, "pichí");
        Camioneta c = new Camioneta(3, "ljfhasyidfa");
        vs.add(c);
        vs.add(m);
        
        //
        
        List<Motocicleta> motocicletas = new ArrayList<>();
        motocicletas.add(m);
        

        // TODO code application logic here
//        Vehiculo dsf = Vehiculo();
//        System.out.println(" la wea que voy a mostrar es "+m.desplazarce());
//        m.desplazarce();
    }

}
