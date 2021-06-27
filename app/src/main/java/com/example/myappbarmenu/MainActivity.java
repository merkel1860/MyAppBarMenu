package com.example.myappbarmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button nextButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instantiateLocalWidgets();
        wiringWidgetListener();


    }

    private void instantiateLocalWidgets() {
        nextButton = findViewById(R.id.next_button);
        DAO.getInstance().aPerson.setFname("Muller");
        DAO.getInstance().aPerson.setLname("Merkel");
    }

    private void wiringWidgetListener() {
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),NextActivity.class);
                intent.putExtra("user",DAO.getInstance().aPerson);
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_app, menu);
        return super.onCreateOptionsMenu(menu);
    }
}