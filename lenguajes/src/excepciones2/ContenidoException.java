/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones2;

/**
 *
 * @author T-102
 */
public class ContenidoException extends Exception {
    
    public ContenidoException (){
        super("no contiene nada este archivo");
    }
}
