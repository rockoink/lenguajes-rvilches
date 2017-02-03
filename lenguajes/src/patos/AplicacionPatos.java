/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patos;

/**
 *
 * @author T-102
 */
public class AplicacionPatos {
    public static void main(String[] args) {
        PatoCanadiense pc1=new PatoCanadiense();
        PatoCanadiense pc2=new PatoCanadiense();
        
        PatoMexicano pm1=new PatoMexicano();
        
        PatoEuropeo pe1=new PatoEuropeo();
        
        System.out.println("pato canadiense " + PatoCanadiense.color+ "," + " pato mexicano "+ PatoMexicano.color + " pato europeo " + PatoEuropeo.color);
        
    pc1.comer();
    pc1.volar();
    pm1.volar();
    
    }
}

    

