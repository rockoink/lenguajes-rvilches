/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializar;
import java.io.*;
import java.util.ArrayList;

public class PersistenciaUsuario {
    
    ArrayList<Usuario> usuarios;
    public PersistenciaUsuario(){
        usuarios=new ArrayList<Usuario>();
    }
    /*
    primer metodo de tipo accion guardar
    
    */
    
    public void guardar(Usuario u) throws Exception{
        File file=new File("basesita-usuarios");
     
        if (file.exists()){
        usuarios =busquedaT();
        
        
    }
        
        FileOutputStream fos=new FileOutputStream(file);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        usuarios.add(u);
        oos.writeObject(usuarios);
         
    }
    
    public Usuario buscarNombre(String nombre) throws Exception{
        File file=new File("basesita-usuarios");
       // String nombre=u.getNombre();
        FileInputStream fis=new FileInputStream(file);
        ObjectInputStream ois=new ObjectInputStream(fis);
        Usuario encontrado=null;
        Usuario us=(Usuario)ois.readObject();
        if(us.getNombre().equals(nombre))encontrado=us;
            
            return encontrado;
            }
    
    public ArrayList<Usuario> busquedaT() throws Exception {
        Usuario u=new Usuario();
        File file=new File("base");
        FileInputStream fis= new FileInputStream(file);
        ObjectInputStream ois= new ObjectInputStream(fis);
        usuarios=(ArrayList<Usuario>) ois.readObject();
        return usuarios;
        
        
    }
}
