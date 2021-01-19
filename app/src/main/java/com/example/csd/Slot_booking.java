package com.example.csd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

public class Slot_booking extends AppCompatActivity {

    Spinner spinner;
    EditText mytext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slot_booking);
        spinner=findViewById(R.id.address_spinner);
        mytext=findViewById(R.id.quarter_no);
        String s =String.valueOf(spinner.getSelectedItem());
        if(!s.equals("living in"))
            mytext.setVisibility(View.GONE);

    }

}