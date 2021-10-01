package com.example.puzzlehw2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView textView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //create a textView that says which button was clicked
        textView = findViewById(R.id.bText);

        //create the buttons
        Button b1 = (Button) findViewById(R.id.b1);
        Button b2 = (Button) findViewById(R.id.b2);
        Button b3 = (Button) findViewById(R.id.b3);
        Button bEmpty = (Button) findViewById(R.id.bEmpty);

        //setOnClickListeners for all buttons
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        bEmpty.setOnClickListener(this);


        //ButtonController controller = new ButtonController(b);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            //testing out how to register clicks for multiple buttons
            //this sets the text to whatever the clicked button's text is
            case R.id.b1:
                textView.setText(R.string._1);
                break;
            case R.id.b2:
                textView.setText(R.string._2);
                break;
            case R.id.b3:
                textView.setText(R.string._3);
                break;
            case R.id.bEmpty:
                textView.setText(R.string.empty);
                break;


            }

        }
    }
