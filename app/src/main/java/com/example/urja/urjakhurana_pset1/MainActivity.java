package com.example.urja.urjakhurana_pset1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void drawPart(View view) {
        ImageView img = (ImageView) findViewById(R.id.armsImg);
        if (view == findViewById(R.id.armsBox)) {
            img =(ImageView) findViewById(R.id.armsImg);
        } else if (view == findViewById(R.id.earsBox)) {
            img =(ImageView) findViewById(R.id.earsImg);
        } else if (view == findViewById(R.id.eyebrowsBox)) {
            img =(ImageView) findViewById(R.id.eyebrowsImg);
        } else if (view == findViewById(R.id.eyesBox)) {
            img =(ImageView) findViewById(R.id.eyesImg);
        } else if (view == findViewById(R.id.glassesBox)) {
            img =(ImageView) findViewById(R.id.glassesImg);
        } else if (view == findViewById(R.id.hatBox)) {
            img =(ImageView) findViewById(R.id.hatImg);
        } else if (view == findViewById(R.id.mouthBox)) {
            img =(ImageView) findViewById(R.id.mouthImg);
        } else if (view == findViewById(R.id.mustacheBox)) {
            img =(ImageView) findViewById(R.id.mustacheImg);
        } else if (view == findViewById(R.id.noseBox)) {
            img =(ImageView) findViewById(R.id.noseImg);
        } else if (view == findViewById(R.id.shoesBox)) {
            img =(ImageView) findViewById(R.id.shoesImg);
        }
        if (img.getVisibility() == View.INVISIBLE) {
            img.setVisibility(View.VISIBLE);
        }else{
            img.setVisibility(View.INVISIBLE);
        }
    }
}
