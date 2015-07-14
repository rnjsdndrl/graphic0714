/*
    사용자가 화면을 터치하면, MyView상의 터차한 좌표값을 구해서
    그 포인트에 원을 그려보자
 */

package com.study.graphic0714;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by KwonWoongKi on 2015-07-14.
 */
public class MyView extends View{
    ArrayList<Point> list = new ArrayList();
    int posX;
    int posY;
    int width=100;
    int height=100;
    Paint paint;
    Paint paint2;

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        paint = new Paint();
        paint.setColor(Color.RED);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        /*원을 그리자*/
        for(int i=0; i<list.size(); i++){
            Point point = list.get(i);
            canvas.drawOval(new RectF(point.x, point.y, point.x + width, point.y + height), paint);
        }
        //canvas.drawOval(new RectF(posX, posY, posX + width, posY + height), paint);
    }

}
