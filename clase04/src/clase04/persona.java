/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase04;

/**
 *
 * @author patri
 */
public class persona {
    private int edad;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public persona(int edad) {
        this.edad = edad;
    }
    
    public int proximaEdad()
    {
        return getEdad()+10;
    }

    public persona() {
    }
    
    
}
