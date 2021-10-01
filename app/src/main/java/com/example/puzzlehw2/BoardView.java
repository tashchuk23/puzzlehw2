package com.example.puzzlehw2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.SurfaceView;
import android.view.View;
import android.widget.TextView;

public class BoardView extends SurfaceView implements View.OnClickListener{

    private TextView textView;

    public BoardView(Context context) {
        super(context);
    }

    public void onDraw(Canvas canvas) {



        Paint g = new Paint();
        //Paint r = new Paint();
        g.setColor(Color.GREEN);

        canvas.drawRect(0,0,400,400, g);


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
