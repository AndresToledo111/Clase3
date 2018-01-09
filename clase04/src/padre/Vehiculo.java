/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padre;

/**
 *
 * @author patri
 */
public class Vehiculo {
    
    private int canRuedas;
    private String patente;

    public Vehiculo(int canRuedas, String patente) {
        this.canRuedas = canRuedas;
        this.patente = patente;
    }

    public int getCanRuedas() {
        return canRuedas;
    }

    public void setCanRuedas(int canRuedas) {
        this.canRuedas = canRuedas;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }
    
//    protected void desplazarce(){
    protected void desplazarce(){
        System.out.println("el vehiculo se está moviendo");
    }
    
    

    @Override
    public String toString() {
        return "Vehiculo{" + "canRuedas=" + canRuedas + ", patente=" + patente + '}';
    }
    
    
    
}
