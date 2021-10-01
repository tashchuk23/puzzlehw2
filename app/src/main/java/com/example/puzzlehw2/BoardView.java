package com.example.puzzlehw2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.SurfaceView;
import android.view.View;
import android.widget.TextView;

public class BoardView extends SurfaceView{

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



    }




