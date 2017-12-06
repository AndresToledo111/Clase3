/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase03;

import Entidades.Alumno;
import Entidades.Curso;
import Entidades.Profesor;

/**
 *
 * @author patri
 */
public class Clase03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here

        Alumno al = new Alumno("Cristopher", "Salgado", 'm');
        Alumno al2 = new Alumno("Matula", "asljfhiays", 'm');
        Alumno al3 = new Alumno("Danulo", "asfjbasy", 'm');
//        
        Alumno[] arregloAlumnos = new Alumno[3];
        arregloAlumnos[0] = al;
        arregloAlumnos[1] = al2;
        arregloAlumnos[2] = al3;
//        for (int i = 0; i < arregloAlumnos.length; i++) {
////            arregloAlumnos[i] = al;
//            System.out.println(arregloAlumnos[i].toString());
//        }

//        Alumno al1 = new Alumno("Patricio2", "Toledo2", 'm');
//        System.out.println(al.toString());
//        System.out.println(al1.toString());
        Curso c = new Curso(arregloAlumnos, "java");
        Curso c1 = new Curso(arregloAlumnos, "net");
        Curso[] arregloCursos = new Curso[2];
        arregloCursos[0] = c;
        arregloCursos[1] = c1;

//        System.out.println(c.toString());
        Profesor p = new Profesor("Cristopher", "Salgado", arregloCursos);
        System.out.println(p.toString());
    }

}
