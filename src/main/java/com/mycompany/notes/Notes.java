
package com.mycompany.notes;

import java.io.InputStream;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Scanner;



/**
 * Notes class - handles all notes reading and writing and user management
 * @author manan
 */
public class Notes{
    
    
    Data data;
    
    public Notes(){
        data = new Data();
    }
    
    
    public void newUser(String username, String password){
        
    }
    
    public boolean logIn(int username, String password){
        if(Data.checkCombo(username,password)){
            return true;
        }
        return false;
    }
    
    public void writeNote(Person user, String note){
        
        
    }
    
    public HashMap getNotes(Person user){return new HashMap<LocalDateTime, String>();}
    
    
    
    
}
