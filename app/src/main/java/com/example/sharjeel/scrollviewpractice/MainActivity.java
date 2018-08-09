package com.example.sharjeel.scrollviewpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {
    ViewFlipper v_flipper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int images[]={R.drawable.slide1, R.drawable.slide2, R.drawable.slide3 };
        v_flipper = findViewById(R.id.v_flipper);
        //for loop


        for(int image: images)
        {
            flipperImages(image);
        }

    }

    public void flipperImages(int image){
        ImageView ImageView=new ImageView(this);
        ImageView.setBackgroundResource(image);

        v_flipper.addView(ImageView);
        v_flipper.setFlipInterval(3000);
        v_flipper.setAutoStart(true);

        //animation
        v_flipper.setInAnimation(this, android.R.anim.slide_in_left);
        v_flipper.setOutAnimation(this, android.R.anim.slide_out_right);
    }

    public void searchButton(View view) {
    }

    public void showToast1(View view) {
        Toast toast=Toast.makeText(this, "Go to next Activity",Toast.LENGTH_LONG);
        toast.show();
    }

    public void showToast2(View view) {
        Toast toast=Toast.makeText(this, "Added to cart",Toast.LENGTH_SHORT);
        toast.show();
    }


}
