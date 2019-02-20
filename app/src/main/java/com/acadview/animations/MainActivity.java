package com.acadview.animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(View view){

        boolean barkShowing = true;

        ImageView imageView = (ImageView) findViewById(R.id.imageView2);
        ImageView imageView1 = (ImageView) findViewById(R.id.imageView3);

        if(barkShowing){
            barkShowing = false;

            imageView.animate().alpha(0).setDuration(2000);
            imageView1.animate().alpha(1).setDuration(2000);

        }else{
            barkShowing = true;

            imageView.animate().alpha(1).setDuration(2000);
            imageView1.animate().alpha(0).setDuration(2000);

        }

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
