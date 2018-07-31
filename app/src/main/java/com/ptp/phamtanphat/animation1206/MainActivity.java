package com.ptp.phamtanphat.animation1206;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    ImageView imgAlpha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgAlpha = findViewById(R.id.imageviewAlpha);

        final Animation animationAlpha = AnimationUtils.loadAnimation(this,R.anim.custom_image_alpha);
        imgAlpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(animationAlpha);
            }
        });
    }
}
