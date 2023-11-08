
package com.mycompany.notes;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Class person represents a person, each person has a set of notes
 * @author manan
 */
public class Person implements java.io.Serializable{
    
    String username;
    private ArrayList<Note> notes;
    private ArrayList<Note> trash;
    
    public Person(String username){
        this.username = username;
        notes = new ArrayList<>();
        trash = new ArrayList<>();
    }
    
    public Note newNote(String content){
        notes.add(new Note(content));
        return new Note(content);
    }
    
    public void updateNote(Note note, String updatedNote){
        note.updateNote(updatedNote);
    }
    
    public ArrayList<Note> getNotes(){
        return notes;
    }
    
    public ArrayList<Note> getTrash(){
        return trash;
    }
    
    public void deleteNote(Note note){
        notes.remove(note);
        trash.add(note);
    }
    
    public void deleteForever(Note note){
        trash.remove(note);
    }
    
    
}
