package com.example.quizapp_java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView nameText;
    private Button startBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameText = findViewById(R.id.nameText);
        startBtn = findViewById(R.id.startBtn);

        startBtn.setOnClickListener(__ -> {
            if (nameText.getText().toString().isEmpty())
                Toast.makeText(this, "Name cannot be empty", Toast.LENGTH_LONG).show();
            else {
                Intent intent = new Intent(this, QuizQuestionActivity.class);
                intent.putExtra(Constants.USER_NAME, nameText.getText().toString());
                startActivity(intent);
            }
        });

    }
}