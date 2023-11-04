package com.mycompany.notes;


import java.util.HashMap;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author manan
 */
public class Data implements java.io.Serializable{
    private int loggedIn;
    private boolean hasLoggedIn;
    private HashMap<Integer , Person> people;
    private HashMap<Integer, String> users;
    
    public Data(){
        loggedIn = -1;
        people = new HashMap<>();
        users = new HashMap<>();
        hasLoggedIn = false;
    }
    
    public boolean checkCombo(int username, String password){
        if(users.containsKey(username)){
            if(BCrypt.checkpw(password, users.get(username)))
                return true;
        }
        return false;
    }
    
    public void newUser(String username, String password){
        people.put(username.hashCode(), new Person(username));
        users.put(username.hashCode(),BCrypt.hashpw(password, BCrypt.gensalt()));
    }
    
    public Person getUser(int username){
        return people.get(username);
    }
    
    public void changePass(int username, String newPass){
        users.put(username, newPass);
    }
    
    public boolean userExists(int username){
        return users.containsKey(username);
    }
    
    public void setLoggedIn(int username){
        loggedIn = username;
        if(username != -1)
            hasLoggedIn = true;
    }
    
    public boolean hasLoggedIn(){
        return hasLoggedIn;
    }
    
    public int getLoggedIn(){
        return loggedIn;
    }
}
