
package com.mycompany.notes;

import java.util.HashSet;

/**
 * Class person represents a person, each person has a set of notes
 * @author manan
 */
public class Person implements java.io.Serializable{
    
    private String username;
    private HashSet<Note> notes;
    private HashSet<Note> trash;
    
    public Person(String username){
        this.username = username;
        notes = new HashSet<>();
        trash = new HashSet<>();
    }
    
    public void newNote(String content){
        notes.add(new Note(content));
    }
    
    public void updateNote(Note note, String updatedNote){
        note.updateNote(updatedNote);
    }
    
    public HashSet<Note> getNotes(){
        return notes;
    }
    
    public HashSet<Note> getTrash(){
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
