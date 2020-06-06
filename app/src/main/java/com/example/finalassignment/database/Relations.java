package com.example.finalassignment.database;

import androidx.room.Embedded;
import androidx.room.Relation;

import com.example.finalassignment.Models.User;

public class Relations {
    @Embedded
    public User user;

    @Relation(
            parentColumn = "id",
            entityColumn = "userCreatorId"
    )
   public TaskEntry taskentry;
}
