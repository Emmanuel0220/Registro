package com.example.asteriscos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView1=findViewById(R.id.textView1);
        textView1.setText("* * * *");
        TextView textView2=findViewById(R.id.textView2);
        textView2.setText("* * * *");
        TextView textView3=findViewById(R.id.textView3);
        textView3.setText("* * * *");
        TextView textView4=findViewById(R.id.textView4);
        textView4.setText("* * * *");

        Button boton1=findViewById(R.id.boton1);
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView1.setText(String.format("* * * *"));
                textView2.setText(String.format("* * * *"));
                textView3.setText(String.format("* * * *"));
                textView4.setText(String.format("* * * *"));
            }
        });
        Button boton2=findViewById(R.id.boton2);
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView1.setText(String.format("* "));
                textView2.setText(String.format("* * "));
                textView3.setText(String.format("* * * "));
                textView4.setText(String.format("* * * *"));
            }
        });
    }
}