
package com.mycompany.notes;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;




/**
 * Notes class - handles all notes reading and writing and user management
 * @author manan
 */
public class Notes{
    private Data data;
    
    public Notes(){
        try{
            FileInputStream fis = new FileInputStream(new File("data.notes"));
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object dataObject = ois.readObject();
            data = (Data)dataObject;
            fis.close();
            ois.close();
        }catch(FileNotFoundException e){  
            data = new Data();
            System.out.println("error");
        } catch (IOException | ClassNotFoundException ex) {System.out.println(ex);}
    }
    
    
    public boolean newUser(String username, String password){
        if(!data.userExists(username.hashCode())){
            data.newUser(username, password);
            return true;
        }
        return false;
    }
    
    public boolean logIn(String username, String password){
        return data.checkCombo(username.hashCode(),password);
    }
    
    public void setLoggedIn(int username){
        data.setLoggedIn(username);
    }
    
    public int getLoggedIn(){
        if(data.hasLoggedIn())
            return data.getLoggedIn();
        return -1;
    }
    
    public Note writeNote(int user, String note){
        Note n = data.getUser(user).newNote(note);
        if(note.equals(""))
            return null;
        try {
            write();
        } catch (IOException ex) {
            
        }
        
        return n;
    }
    
    public void updateNote(int user, Note note, String newNote){
        data.getUser(user).updateNote(note,newNote);
        try {
            write();
        } catch (IOException ex) {
            
        }
    }
    
    public ArrayList<Note> getNotes(int username){
        return data.getUser(username).getNotes();
    }
    
    public void write() throws IOException{
        try {
            FileOutputStream fos = new FileOutputStream(new File("data.notes"));
            
            try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(data);
                
                fos.close();
            }
            
            fos.close();
        } catch (FileNotFoundException ex) {
            File file = new File("data.notes");
            file.createNewFile();
            write();
        } 
    }
    
    public void deleteNote(int username, Note note){
        data.getUser(username).deleteNote(note);
    }
}
