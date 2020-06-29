package com.example.finalassignment.database;

import androidx.room.Embedded;
import androidx.room.Relation;
import com.example.finalassignment.database.TaskEntry;
import com.example.finalassignment.Models.User;

import java.util.List;

public class Relations {
    @Embedded
    public User user;

    @Relation(
            parentColumn = "id",
            entityColumn = "userCreatorId"
    )
   public List<TaskEntry> entryList;


}
