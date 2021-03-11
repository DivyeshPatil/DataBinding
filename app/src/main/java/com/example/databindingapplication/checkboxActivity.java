package com.example.databindingapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

public class checkboxActivity extends AppCompatActivity {

    private CheckBox mCheckmahendrasinghdhoni, mChecksachintendulkar, mCheckvirendersehwag, mCheckrahuldravid, mCheckviratkohli;
    private Button mWriteResultButton;
    private TextView mResultTextView;
    private ArrayList<String> mResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox);

        mCheckmahendrasinghdhoni = findViewById(R.id.check_mahendrasinghdhoni);
        mChecksachintendulkar = findViewById(R.id.check_sachintendulkar);
        mCheckvirendersehwag = findViewById(R.id.check_virendersehwag);
        mCheckrahuldravid = findViewById(R.id.check_rahuldravid);
        mCheckviratkohli = findViewById(R.id.check_viratkohli);

        mWriteResultButton = findViewById(R.id.show_result);
        mResultTextView = findViewById(R.id.result);
        mResult = new ArrayList<>();
        mResultTextView.setEnabled(false);

        mCheckmahendrasinghdhoni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mCheckmahendrasinghdhoni.isChecked())
                    mResult.add("Mahendra Singh Dhoni");
                else
                    mResult.remove("Mahendra Singh Dhoni");
            }
        });

        mChecksachintendulkar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mChecksachintendulkar.isChecked())
                    mResult.add("Sachin Tendulkar");
                else
                    mResult.remove("Sachin Tendulkar");
            }
        });

        mCheckvirendersehwag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mCheckvirendersehwag.isChecked())
                    mResult.add("Virender Sehwag");
                else
                    mResult.remove("Virender Sehwag");
            }
        });

        mCheckrahuldravid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mCheckrahuldravid.isChecked())
                    mResult.add("Rahul Dravid");
                else
                    mResult.remove("Rahul Dravid");
            }
        });

        mCheckviratkohli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mCheckviratkohli.isChecked())
                    mResult.add("Virat Kohli");
                else
                    mResult.remove("Virat Kohli");
            }
        });


        mWriteResultButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder stringBuilder = new StringBuilder();
                for (String s : mResult)
                    stringBuilder.append(s).append("\n");

                mResultTextView.setText(stringBuilder.toString());
                mResultTextView.setEnabled(false);
            }
        });
    }
}
