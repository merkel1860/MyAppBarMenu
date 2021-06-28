package com.example.myappbarmenu;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;

public class NextActivity extends AppCompatActivity {

    AppCompatTextView userTextView;
    Person receivedPerson;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        updateViewFromPassedArgs();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_next_page,menu);
        return super.onCreateOptionsMenu(menu);
    }

    private void updateViewFromPassedArgs() {
        receivedPerson = (Person) getIntent().getSerializableExtra("user");
        userTextView = findViewById(R.id.received_user_text_view);
        userTextView.setText(receivedPerson.getFullname());
    }
}