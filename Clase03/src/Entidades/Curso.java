/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author patri
 */
public class Curso {

    private String nombre;
    private Alumno[] alum = new Alumno[3];

    public Alumno[] getAlum() {
        return alum;
    }

    public void setAlum(Alumno[] alum) {
        this.alum = alum;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws Exception {
        if (nombre.trim() != "") {
            if (nombre.length() < 50) {
                this.nombre = nombre;
            } else {
                throw new Exception("nombre curso no puede exceder los 50 caracteres");
            }
        } else {
            throw new Exception("Nombre no puede estar vacio");
        }
    }

    public Curso(Alumno[] alum, String nombre) throws Exception {
        setAlum(alum);
        setNombre(nombre);
    }

    private String getDataAlumnos() {
        String datos = "";
        for (int i = 0; i < alum.length; i++) {
            datos = datos + alum[i].toString();
        }
        return " || "+datos+" || ";
    }

    @Override
    public String toString() {
        return "Curso{" + "alum=" + getDataAlumnos() + ", nombre=" + nombre + '}';
//        return "Curso{" + "alum=" + alum + ", nombre=" + nombre + '}';
    }

}
