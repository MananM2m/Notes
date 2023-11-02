package com.mycompany.notes;

import java.util.HashMap;

/**
 *
 * @author manan
 */
public class Data implements java.io.Serializable{
    private Person loggedIn;
    private HashMap<Integer, Person> data;
    
    public Data(){
        
    }
}
