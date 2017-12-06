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
public class Alumno {

    private String nombre, apellido;
    private char sexo;

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
                throw new Exception("Apellido no puede exceder los 50 caracteres");
            }
        } else {
            throw new Exception("apellido no puede estar vacio");
        }

    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) throws Exception {
        if (sexo == 'f' || sexo == 'm') {
            this.sexo = sexo;
        } else {
            throw new Exception("sexo f o m");
        }

    }

    public Alumno(String nombre, String apellido, char sexo) throws Exception {
        setNombre(nombre);
        setApellido(apellido);
        setSexo(sexo);
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + getNombre() + ", apellido=" + apellido + ", sexo=" + sexo + '}';
    }

}
