package com.example.urja.urjakhurana_pset1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void drawPart(View view) {
        // initialize img to random image to prevent error
        ImageView img = (ImageView) findViewById(R.id.armsImg);
        // decide which checkbox is clicked and get corresponding image of that part
        switch(view.getId()) {
            case R.id.armsBox:
                img = (ImageView) findViewById(R.id.armsImg);
                break;
            case R.id.earsBox:
                img = (ImageView) findViewById(R.id.earsImg);
                break;
            case R.id.eyebrowsBox:
                img = (ImageView) findViewById(R.id.eyebrowsImg);
                break;
            case R.id.eyesBox:
                img = (ImageView) findViewById(R.id.eyesImg);
                break;
            case R.id.glassesBox:
                img = (ImageView) findViewById(R.id.glassesImg);
                break;
            case R.id.hatBox:
                img = (ImageView) findViewById(R.id.hatImg);
                break;
            case R.id.mouthBox:
                img =(ImageView) findViewById(R.id.mouthImg);
                break;
            case R.id.mustacheBox:
                img =(ImageView) findViewById(R.id.mustacheImg);
                break;
            case R.id.noseBox:
                img =(ImageView) findViewById(R.id.noseImg);
                break;
            case R.id.shoesBox:
                img =(ImageView) findViewById(R.id.shoesImg);
                break;
        }

        // if checkbox is checked or not
        boolean checked = ((CheckBox) view).isChecked();
        // only show image if checkbox is checked and image is invisible
        if (img.getVisibility() == View.INVISIBLE && checked) {
            img.setVisibility(View.VISIBLE);
        }else{
            img.setVisibility(View.INVISIBLE);
        }
    }
}
