/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica.ManejoUsuarios;


import java.util.ArrayList;
/**
 *
 * @author David
 */



public class UsuariosSngl {
    private static UsuariosSngl instance;
    
    private ArrayList<User> usuarios;
    
    private UsuariosSngl(){};
    
    
    public static UsuariosSngl getInstance(){
        if(instance == null){
            instance = new UsuariosSngl();
        }
        
        return instance;
    }
    
    
    public void setUsuarios(ArrayList<User> usuarios){
        this.usuarios=usuarios;
    }
    
    public ArrayList<User> getUsuarios(){
        return this.usuarios;
    }
}
