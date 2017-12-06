/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author patri
 */
public class Profesor {

    private String nombre, apellido;
    private Curso[] cur = new Curso[2];

    public Curso[] getCur() {
        return cur;
    }

    public void setCur(Curso[] cur) {
        this.cur = cur;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws Exception {
        if (nombre.trim() != "") {
            if (nombre.length() < 50) {
                this.nombre = nombre;
            } else {
                throw new Exception("Nombre no puede exceder los 50 caracteres");
            }
        } else {
            throw new Exception("Nombre no puede estar vacio");
        }
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) throws Exception {
        if (apellido.trim() != "") {
            if (apellido.length() < 50) {
                this.apellido = apellido;
            } else {
                throw new Exception("apellido no puede exceder los 50 caracteres");
            }
        } else {
            throw new Exception("apellido no puede estar vacio");
        }
    }

    public Profesor(String nombre, String apellido, Curso[] cur) throws Exception {
        setNombre(nombre);
        setApellido(apellido);
        setCur(cur);
    }

    
    private String datosProfesor()
    {
        String datos="";
        for (int i = 0; i < cur.length; i++) {
           datos = datos + cur[i].toString();
        }
        return datos;
    }
    @Override
    public String toString() {
        return "Profesor{" + "nombre=" + nombre + ", apellido=" + apellido + ", cur=" + datosProfesor() + '}';
    }

}
