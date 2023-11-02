package com.mycompany.notes;

import java.util.HashMap;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author manan
 */
public class Data implements java.io.Serializable{
    private Person loggedIn;
    private HashMap<Integer, Person> data;
    private HashMap<Integer, String> users;
    
    public boolean checkCombo(int username, String password){
        
        if(BCrypt.checkpw(password, users.get(username)))
            return true;
    
        return false;
    }
    
    public Data(){
        
        loggedIn = new Person("");
        
        data = new HashMap<>();
        users = new HashMap<>();
        
    }
}
