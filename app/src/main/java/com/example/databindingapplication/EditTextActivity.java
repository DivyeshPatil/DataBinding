package com.example.databindingapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.databindingapplication.databinding.ActivityEditTextBinding;

public class EditTextActivity extends AppCompatActivity {

    //Initialize variable
    ActivityEditTextBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);

        //Assign Variable
        binding = DataBindingUtil.setContentView(this, R.layout.activity_edit_text);

        binding.btSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Get text from editText
                String sText = binding.etInput.getText().toString().trim();
                //Check Condition
                if (!sText.equals("")){
                    //When text is not empty
                    //Set text on textView
                    binding.tvOutput.setText(sText);
                } else {
                    //When text is empty
                    //Display toast
                    Toast.makeText(getApplicationContext(), "Please Enter Text", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
