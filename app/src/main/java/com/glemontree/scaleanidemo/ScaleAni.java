package com.glemontree.scaleanidemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.ScaleAnimation;
import android.widget.LinearLayout;

public class ScaleAni extends AppCompatActivity {
    private LinearLayout llScale;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scale);
        llScale = (LinearLayout) findViewById(R.id.ll_scale);
        beginAnimation();
    }

    private void beginAnimation() {
        ScaleAnimation scale = new ScaleAnimation(0, 2, 0, 2);
        scale.setDuration(3000);
        llScale.startAnimation(scale);
    }
}
