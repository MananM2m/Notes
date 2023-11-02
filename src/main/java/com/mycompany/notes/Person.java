
package com.mycompany.notes;

/**
 * Class person represents a person, each person has a set of notes
 * @author manan
 */
public class Person implements java.io.Serializable{
    
    private String username;
    
    public Person(String username){
        this.username = username;
    }
}
