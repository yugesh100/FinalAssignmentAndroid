package com.example.finalassignment.database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import com.example.finalassignment.Models.User;

import java.util.Date;

@Entity(tableName = "task")
public class TaskEntry {

    @PrimaryKey(autoGenerate = true)
    private int id;
    public int userCreatorId;
    private String description;
    private int priority;




    @Ignore
    public TaskEntry(String description, int priority) {
        this.description = description;
        this.priority = priority;


    }

    public TaskEntry(int id,int userCreatorId,String description, int priority) {
        this.id = id;
        this.userCreatorId = userCreatorId;
        this.description = description;
        this.priority = priority;



    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserCreatorId() {
        return userCreatorId;
    }

    public void setUserCreatorId(int userCreatorId) {
        this.userCreatorId = userCreatorId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }



}
