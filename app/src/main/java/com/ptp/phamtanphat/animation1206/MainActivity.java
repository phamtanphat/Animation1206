package com.ptp.phamtanphat.animation1206;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    ImageView imgAlpha,imgScale,imgRotate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgAlpha = findViewById(R.id.imageviewAlpha);
        imgScale = findViewById(R.id.imageviewScale);
        imgRotate = findViewById(R.id.imageviewRotate);

        startAnimationFor(imgAlpha,R.anim.custom_image_alpha);
        startAnimationFor(imgScale,R.anim.custom_image_scale);
        startAnimationFor(imgRotate,R.anim.custom_image_rotate);
    }
    //X se tang tu trai sang phai
    //Y se tang tu tren xuong duoi
    public void startAnimationFor(ImageView imageView , int fileAnim){
        final Animation animation = AnimationUtils.loadAnimation(this,fileAnim);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(animation);
            }
        });
    }
}
