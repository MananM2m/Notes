/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.notes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author manan
 */
public class Note implements java.io.Serializable{
    private String content;
    private LocalDateTime date;
    
    public Note(){
        content = "";
        date = LocalDateTime.now();
    }
    
    public Note(String content){
        this.content = content;
        date = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return content;
    }

    public String getDate(String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return date.format(formatter);
    }
    
    public void updateNote(String updatedNote){
        content = updatedNote;
    }
    
    
}
