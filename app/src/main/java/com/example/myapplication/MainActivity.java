package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button followButton = findViewById(R.id.button);

        followButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String buttonTextString = followButton.getText().toString();
                if (buttonTextString.equals("FOLLOW")) {
                    followButton.setText("UNFOLLOW");
                }
                else{
                    followButton.setText("FOLLOW");
                }
            }
        });

    }
}