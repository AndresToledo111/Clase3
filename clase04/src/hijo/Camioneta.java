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
public class Camioneta extends Vehiculo{
    private int kilosSoportados;

    public int getKilosSoportados() {
        return kilosSoportados;
    }

    public void setKilosSoportados(int kilosSoportados) {
        this.kilosSoportados = kilosSoportados;
    }

    public Camioneta(int kilosSoportados, int canRuedas, String patente) {
        super(canRuedas, patente);
        this.kilosSoportados = kilosSoportados;
    }

    @Override
    public String toString() {
        return "Camioneta{" + "kilosSoportados=" + kilosSoportados + '}';
    }

    public Camioneta(int canRuedas, String patente) {
        super(canRuedas, patente);
        super.desplazarce();
    }
}
