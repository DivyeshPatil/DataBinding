package com.example.databindingapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    private Button button_edittext; //button for edittext
    private Button button_radiobutton; //button for radiobutton
    private Button button_chackbox;//button for checkbox
    private Button button_dropdown;//button for dropdown

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //for edittext
        button_edittext = (Button) findViewById(R.id.button_edittext);
        button_edittext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.this.OpenEditTextActivity();
            }
        });

        //for radiobutton
        button_radiobutton = (Button) findViewById(R.id.button_radiobutton);
        button_radiobutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.this.openRadioButtonActivity();
            }
        });

        //for checkbox
        button_chackbox = (Button) findViewById(R.id.button_checkbox);
        button_chackbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.this.openCheckBoxActivity();
            }
        });

        //for dropdown
        button_chackbox = (Button) findViewById(R.id.button_checkbox);
        button_chackbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.this.openCheckBoxActivity();
            }
        });

    }

    //for checkbox
    private void openCheckBoxActivity() {
        Intent intent = new Intent(this, checkboxActivity.class);
        startActivity(intent);
    }

    //for radiobutton
    private void openRadioButtonActivity() {
        Intent intent = new Intent(this, radiobuttonActivity.class);
        startActivity(intent);
    }

    //for edittext
    private void OpenEditTextActivity() {
        Intent intent = new Intent(this, EditTextActivity.class);
        startActivity(intent);
    }

}

