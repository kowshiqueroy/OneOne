package com.example.oneone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int counter=0;

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

                    b1.setText("Sumiya");
                } else {

                    b1.setText("Jahid");
                }


            }
        });



    }
}