
package com.mycompany.notes;


import java.time.LocalDateTime;
import java.util.HashMap;




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
        return data.checkCombo(username,password);
    }
    
    public void writeNote(Person user, String note){
        
        
    }
    
    public HashMap getNotes(Person user){return new HashMap<LocalDateTime, String>();}
    
    
    
    
}
