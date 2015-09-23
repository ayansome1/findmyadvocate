package com.example.this_is_ayan.findmyadvocate.Widgets;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by this_is_ayan on 14-07-2015.
 */
public class MyTextViewLightFont extends TextView {

    public MyTextViewLightFont(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public MyTextViewLightFont(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyTextViewLightFont(Context context) {
        super(context);
        init();
    }

    public void init() {
        Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/DINPro_Light.ttf");
        setTypeface(tf ,1);

    }

}
