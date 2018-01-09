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
public class Clase04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        persona p = new persona();
        
        
        p.setEdad(-10);
        
        System.out.println("en 10 años mas tendras :"+p.proximaEdad());
    }
    
}
