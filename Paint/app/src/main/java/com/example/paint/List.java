   

package com.example.paint;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

public class List extends View {
    private Paint mPaint = new Paint();
    private Rect mRect = new Rect();
    private Bitmap mBitmap;
    Canvas canvas;
    public List(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        this.canvas = canvas;
        int width = canvas.getWidth();
        int height = canvas.getHeight();

        Paint paint = new Paint();
        paint.setColor(Color.WHITE);
        canvas.drawPaint(paint);
        paint.setAntiAlias(true);
        paint.setColor(Color.RED);
        canvas.drawCircle(30, 30, 25, paint);

    }
}
