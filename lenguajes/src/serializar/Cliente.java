/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializar;

/**
 *
 * @author Sony
 */

//clase cleinte, encapsulada
public class Cliente {
    private String nombre;
    private float sueldo;
    private int edad;
    
    public Cliente(){
        
    }
    public Cliente(String nombre,float sueldo,int edad){
        this.nombre=nombre;
        this.edad=edad;
        this.sueldo=sueldo;
    }

    @Override
    public String toString() {
        return "nombre"+nombre+" sueldo "+sueldo+" edad "+edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    
}
