/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica.ManejoUsuarios;

/**
 *
 * @author David
 */
public class UserLoggedSngl {
    
    private static UserLoggedSngl instance;
    private User userLogged;
    
    private UserLoggedSngl() {};
    
    
    
    public static UserLoggedSngl getInstance(){
        if(instance==null){
            instance= new UserLoggedSngl();
        }
        
        return instance;
    }
    
    public void setUserLogged(User usuario){
        this.userLogged= usuario;
    }
    
    
    public User getUserLogged(){
        return this.userLogged;
    }
    
}
