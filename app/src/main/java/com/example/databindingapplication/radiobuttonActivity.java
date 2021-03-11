package com.example.databindingapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class radiobuttonActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton selectedRadioBtn;
    private Button submitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radiobutton);

        radioGroup = findViewById(R.id.radioGroup);
        submitBtn = findViewById(R.id.submit);

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedRadioBtn = radioGroup.findViewById(radioGroup.getCheckedRadioButtonId());
                if (selectedRadioBtn != null)
                Toast.makeText(radiobuttonActivity.this, selectedRadioBtn.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
