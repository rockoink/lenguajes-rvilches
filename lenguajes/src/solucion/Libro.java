/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solucion;

/**
 *
 * @author Sony
 */
//inicializar variables y metodos setters y getters
public class Libro {
    private String titulo;
    
    public Libro(){
        
    }
    
    public Libro(String titulo){
        this.titulo=titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}

