package com.example.sside;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Matrix;
import android.os.Bundle;
import android.widget.ImageView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageSlider imageSlider = findViewById(R.id.image_slider);
        ArrayList<SlideModel> imageList =new ArrayList<>();

       imageList.add(new SlideModel(R.drawable.as,ScaleTypes.FIT));
       imageList.add(new SlideModel(R.drawable.hh,ScaleTypes.FIT));
       imageList.add(new SlideModel(R.drawable.rf,ScaleTypes.FIT));

       imageSlider.setImageList(imageList,ScaleTypes.FIT);

    }
}