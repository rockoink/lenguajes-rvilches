/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializar;
import java.io.*;

public class PersistenciaUsuario {
    
    /*
    primer metodo de tipo accion guardar
    
    */
    
    public void guardar(Usuario u) throws Exception{
        File file=new File("basesita-usuarios");
        FileOutputStream fos=new FileOutputStream(file);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(u);
        
        
    }
}
