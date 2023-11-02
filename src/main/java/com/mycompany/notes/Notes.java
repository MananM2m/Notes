
package com.mycompany.notes;

import java.io.InputStream;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Scanner;
import org.mindrot.jbcrypt.BCrypt;


/**
 * Notes class - handles all notes reading and writing and user management
 * @author manan
 */
public class Notes{
    
    
    private HashMap<Integer, String> users;
    
    public Notes(){
        users = new HashMap<>();
        loadUsers();
    }
    
    private void loadUsers(){
        InputStream file = Notes.class.getClassLoader().getResourceAsStream("users.txt");
        Scanner scanner = new Scanner(file);
        
        while(scanner.hasNextLine()){
            users.put(scanner.nextInt(), scanner.next());
        }
    }
    
    public void newUser(String username, String password){
        
    }
    
    public Person logIn(int username, String password){
        if(BCrypt.checkpw(password, users.get(username)))
            System.out.println("log in sucess");
        return null;
    }
    
    public void writeNote(Person user, String note){}
    
    public HashMap getNotes(Person user){return new HashMap<LocalDateTime, String>();}
    
    
    
    
}
