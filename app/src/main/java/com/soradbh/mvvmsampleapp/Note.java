package com.soradbh.mvvmsampleapp;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "note_table")
public class Note {

    @PrimaryKey(autoGenerate = true)
    private int id;

    private String titlle;

    private String description;

    private int priority;

    public Note(String titlle, String description, int priority) {
        this.titlle = titlle;
        this.description = description;
        this.priority = priority;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setTitlle(String titlle) {
        this.titlle = titlle;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public String getTitlle() {
        return titlle;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }
}
