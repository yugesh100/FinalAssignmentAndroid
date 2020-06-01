package com.example.finalassignment;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import com.example.finalassignment.Models.User;

public class UserActivity extends AppCompatActivity {
    private TextView tvUser;

    private User user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        user = (User) getIntent().getSerializableExtra("User");

        tvUser = findViewById(R.id.tvUser);

        if (user != null) {
            tvUser.setText("WELCOME "+user.getName() +" "+user.getLastName());
        }
    }
}
