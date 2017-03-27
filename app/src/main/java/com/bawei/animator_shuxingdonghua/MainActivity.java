package com.bawei.animator_shuxingdonghua;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageView iv;
    private Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv = (ImageView) findViewById(R.id.iv);
        bt = (Button) findViewById(R.id.bt);


    }

    public void Click(View view) {

        Toast.makeText(this, "我在这里", Toast.LENGTH_SHORT).show();

    }

    public void button(View view) {
        /**属性动画的监听*/
        ObjectAnimator animator = ObjectAnimator.ofFloat(bt, "alpha", 0f, 1f).setDuration(1000);

        animator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                super.onAnimationEnd(animation);
                Toast.makeText(MainActivity.this, "123456", Toast.LENGTH_SHORT).show();
            }
        });
        animator.start();

        /**补间动画*/
//        TranslateAnimation translateAnimation = new TranslateAnimation(0,200,0,0);
//        translateAnimation.setDuration(1000);
//        translateAnimation.setFillAfter(true);
//        iv.startAnimation(translateAnimation);

        /**属性动画*/
//        ObjectAnimator.ofFloat(iv,"rotation",0f,360f).setDuration(1000).start();
//        ObjectAnimator.ofFloat(iv,"translationX",0f,200f).setDuration(1000).start();
//        ObjectAnimator.ofFloat(iv,"translationY",0f,200f).setDuration(1000).start();

//        PropertyValuesHolder p1 = PropertyValuesHolder.ofFloat("rotation", 0f, 360f);
//        PropertyValuesHolder p2 = PropertyValuesHolder.ofFloat("translationX",0f,200f);
//        PropertyValuesHolder p3 = PropertyValuesHolder.ofFloat("translationY",0f,200f);
//        ObjectAnimator.ofPropertyValuesHolder(iv,p1,p2,p3).setDuration(1000).start();

        /**属性动画的集合*/
//        ObjectAnimator o1 = ObjectAnimator.ofFloat(iv, "rotation", 0f, 360f);
//        ObjectAnimator o2 = ObjectAnimator.ofFloat(iv, "translationX", 0f, 200f);
//        ObjectAnimator o3 = ObjectAnimator.ofFloat(iv, "translationY", 0f, 200f);
//        AnimatorSet set = new AnimatorSet();

//        set.playTogether(o1, o2, o3);//同时执行

//        set.playSequentially(o1, o2, o3);//按顺序依次执行

        //先位移，再旋转
//        set.play(o1).after(o2);
//        set.play(o2).with(o3);
//
//        set.setDuration(2000);
//        set.start();

    }

}
