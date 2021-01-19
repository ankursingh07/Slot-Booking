package com.example.csd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;

public class MainActivity extends AppCompatActivity {


    int p=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void slot_click(View view)
    {
        Intent intent =new Intent(this,Slot_booking.class);
        startActivity(intent);
        Date c = Calendar.getInstance().getTime();
        Calendar ch= Calendar.getInstance();
       // System.out.println("Current time => " + c);
        //String currentTime = new SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(new Date());
        //char ch=currentTime.charAt(0);
        //char ch1=currentTime.charAt(1);
        //String r = new StringBuilder().append(ch).append(ch1).toString();
        //Toast.makeText(this,currentTime,Toast.LENGTH_SHORT).show();

        SimpleDateFormat df = new SimpleDateFormat("dd-MMM-yyyy", Locale.getDefault());

        String formattedDate = df.format(c.getTime());
        ch.add(Calendar.DATE, 3);  // number of days to add
        String end_date = df.format(ch.getTime());
        //showtoast("end Time : "+end_date);
        Toast.makeText(this,end_date,Toast.LENGTH_LONG).show();

        char cg=formattedDate.charAt(0);
        char cg1=formattedDate.charAt(1);
        String r1=new StringBuilder().append(cg).append(cg1).toString();

        //Toast.makeText(this,formattedDate,Toast.LENGTH_SHORT).show();

    }
    public void cancel_slot(View view)
    {
        if(p==1)
        {
            p=0;
            Toast.makeText(this,"Your slot has been canceled successfully",Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this,"You have no bookings",Toast.LENGTH_SHORT).show();
        }

    }
    public void your_booking(View view)
    {
        if(p==0)
        {
            Toast.makeText(this,"You have no bookings",Toast.LENGTH_SHORT).show();
        }

        else{
        Intent intent = new Intent(this,Your_booking.class);
        startActivity(intent);
    }


    }
}