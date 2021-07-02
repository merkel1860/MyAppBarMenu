package com.example.myappbarmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.AppCompatEditText;

import android.os.Bundle;
import android.text.InputType;
import android.view.Menu;
import android.view.MenuItem;
//import android.widget.EditText;
//import android.widget.EditText;

public class NextActivity extends AppCompatActivity {

    private LinearLayoutCompat parentContainer;
    AppCompatTextView userTextView;
    AppCompatEditText editTextMultiline;

    Person receivedPerson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        wiringLocalWidgetsToScreenControls();

        parentContainer = findViewById(R.id.next_container);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        updateViewFromPassedArgs();

    }

    private void wiringLocalWidgetsToScreenControls() {
        editTextMultiline = new AppCompatEditText(getApplicationContext());
        editTextMultiline.setInputType(InputType.TYPE_CLASS_TEXT |
                InputType.TYPE_TEXT_FLAG_MULTI_LINE);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_next_page,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_create_memo:
                // TODO configure this function by letting it update UI with a textarea
                // TODO wich should be used to write dowwn memos
                setupEditMultiLineText();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }

    private void setupEditMultiLineText() {

    }

    private void updateViewFromPassedArgs() {
        receivedPerson = (Person) getIntent().getSerializableExtra("user");
        userTextView = findViewById(R.id.received_user_text_view);
        userTextView.setText(receivedPerson.getFullname());
    }
    // Create a LayoutParams
    private LinearLayoutCompat.LayoutParams makeLayoutParams(int weight, int rightMargin, int leftMargin,
                                                             int topMarging, int bottomMarging) {
        LinearLayoutCompat.
                LayoutParams buttonLayoutParams = new LinearLayoutCompat.
                LayoutParams(LinearLayoutCompat.LayoutParams.MATCH_PARENT,
                LinearLayoutCompat.LayoutParams.WRAP_CONTENT);
        buttonLayoutParams.weight = weight;
        buttonLayoutParams.rightMargin = rightMargin;
        buttonLayoutParams.leftMargin = leftMargin;
        buttonLayoutParams.topMargin = topMarging;
        buttonLayoutParams.bottomMargin = bottomMarging;
        return buttonLayoutParams;
    }
}