package com.example.finalassignment.database;


import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;
import androidx.room.Update;

import com.example.finalassignment.Models.User;

import java.util.List;

@Dao
public interface UserDao {
    @Query("SELECT * FROM User where email= :mail and password= :password")
    User getUser(String mail, String password);

    @Transaction
    @Query("SELECT * FROM User")
    public List<Relations> getRelations();

    @Insert
    void insert(User user);

    @Update
    void update(User user);

    @Delete
    void delete(User user);


}
