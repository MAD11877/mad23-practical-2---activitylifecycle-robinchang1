package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User user = new User("john", "hi", 0, false);

        Button followButton = findViewById(R.id.button);

        followButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (user.followed == false) {
                    user.followed = true;
                    followButton.setText("UNFOLLOW");
                    Toast toast = Toast.makeText(getApplicationContext(), "FOLLOWED", Toast.LENGTH_SHORT);
                    toast.show();
                }
                else{
                    user.followed = false;
                    followButton.setText("FOLLOW");
                    Toast toast = Toast.makeText(getApplicationContext(), "UNFOLLOWED", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

    }
}