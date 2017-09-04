package com.bwie.test;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * 类描述 ：
 * 姓名 ：喻荣强
 * 时间 ：2017-
 */

public class MyView extends View {
    private Canvas myCanvas;
    private int width;
    private int height;
    private Paint mpaint;


    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        TypedArray typedArray = context.obtainStyledAttributes(R.styleable.MyView);
        int color = typedArray.getColor(R.styleable.MyView_color, Color.BLACK);
        float radiuswidth = typedArray.getDimension(R.styleable.MyView_width, 10);
        typedArray.recycle();
        mpaint = new Paint();
        mpaint.setStyle(Paint.Style.STROKE);
        mpaint.setColor(color);
        mpaint.setStrokeWidth(radiuswidth);
        mpaint.setAntiAlias(true);
    }


    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        width = getMeasuredWidth();
        height = getMeasuredHeight();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.myCanvas = canvas;
        canvas.drawCircle(width / 2, height / 2, 100, mpaint);


        Path path = new Path();
        path.moveTo(width / 2, height / 2 - 100);// 此点为多边形的起点
        path.lineTo(width / 2 - 40, height / 2 - 120);
        path.lineTo(width / 2 - 20, height / 2 - 100);
        path.lineTo(width / 2 - 40, height / 2 - 80);
        path.close(); // 使这些点构成封闭的多边形
        canvas.drawPath(path, mpaint);
    }

}
