
package com.mycompany.notes;

import java.util.HashSet;

/**
 * Class person represents a person, each person has a set of notes
 * @author manan
 */
public class Person implements java.io.Serializable{
    
    private String username;
    private HashSet<Note> notes;
    
    public Person(String username){
        this.username = username;
    }
}
