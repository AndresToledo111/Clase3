/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hijo;

import padre.Vehiculo;

/**
 *
 * @author patri
 */
public class Motocicleta extends Vehiculo{
    private boolean esDeUnPasajero;

    public Motocicleta(boolean esDeUnPasajero, int canRuedas, String patente) {
        super(canRuedas, patente);
        this.esDeUnPasajero = esDeUnPasajero;
    }

    public boolean isEsDeUnPasajero() {
        return esDeUnPasajero;
    }

    public void setEsDeUnPasajero(boolean esDeUnPasajero) {
        this.esDeUnPasajero = esDeUnPasajero;
    }

    @Override
    public String toString() {
        return "Motocicleta{" + "esDeUnPasajero=" + esDeUnPasajero + '}';
    }
    
    public Motocicleta(int canRuedas, String patente) {
        super(canRuedas, patente);
    }
    
    @Override
    public void desplazarce(){
        System.out.println("la moto se está moviendo");
    }
    
}
