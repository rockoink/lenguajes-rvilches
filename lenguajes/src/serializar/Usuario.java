/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializar;

import java.io.Serializable;

/**
 *
 * @author Sony
 */

//clase usuario inicializar variables
//dsvdsfes
public class Usuario implements Serializable {
    
        private String nombre;
    private String email;
    private int edad;
    
    public Usuario(){
        
    }

    public Usuario(String nombre,String email,int edad){
        this.edad=edad;
        this.email=email;
        this.nombre=nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    
}
