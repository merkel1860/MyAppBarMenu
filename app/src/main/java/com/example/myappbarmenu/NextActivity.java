package com.example.myappbarmenu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;

import android.os.Bundle;

public class NextActivity extends AppCompatActivity {

    AppCompatTextView userTextView;
    Person receivedPerson;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        receivedPerson = (Person) getIntent().getSerializableExtra("user");
        userTextView = findViewById(R.id.received_user_text_view);
        userTextView.setText(receivedPerson.getFullname());
    }
}