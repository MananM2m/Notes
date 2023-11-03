
package com.mycompany.notes;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;




/**
 * Notes class - handles all notes reading and writing and user management
 * @author manan
 */
public class Notes{
    Data data;
    
    public Notes(){
        try{
            FileInputStream fis = new FileInputStream(new File("data.notes"));
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object dataObject = ois.readObject();
            data = (Data)dataObject;
        }catch(FileNotFoundException e){  
            data = new Data();
        } catch (IOException | ClassNotFoundException ex) {}
    }
    
    
    public boolean newUser(String username, String password){
        if(data.userExists(username.hashCode())){
            data.newUser(username, password);
            return true;
        }
        return false;
    }
    
    public boolean logIn(String username, String password){
        return data.checkCombo(username.hashCode(),password);
    }
    
    public void writeNote(String user, String note){
        data.getUser(user.hashCode()).newNote(note);
    }
    
    public HashSet<Note> getNotes(int username){
        return data.getUser(username).getNotes();
    }
    
    public void write() throws IOException{
        try {
            FileOutputStream fos = new FileOutputStream(new File("data.notes"));
            
            try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(data);
            }
        } catch (FileNotFoundException ex) {
            File file = new File("data.notes");
            file.createNewFile();
            write();
        } 
    }
}
