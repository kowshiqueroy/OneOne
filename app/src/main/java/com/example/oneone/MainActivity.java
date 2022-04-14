package com.example.oneone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int counter=0;
    int b=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1;
        TextView t1;

        t1=findViewById(R.id.t1);

        b1= findViewById(R.id.b1);




        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                t1.setText(String.format("%d", counter));
                if (counter%2==0) {

                    if (b==0)
                    {
                    b1.setText("Sumiya");
                    b1.setTextSize(4);}
                } else {
                    if (b==0)
                    {
                    b1.setTextSize(40);

                    b1.setText("Jahid");}
                }

                if (counter==3) {
                    counter=0;

                    b1.setText("Blocked for 5 mins");
                    b=1;


                }


            }
        });



    }
}