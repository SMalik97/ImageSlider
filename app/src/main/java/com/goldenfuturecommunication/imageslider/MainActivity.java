package com.goldenfuturecommunication.imageslider;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import technolifestyle.com.imageslider.FlipperLayout;
import technolifestyle.com.imageslider.FlipperView;

public class MainActivity extends AppCompatActivity {

    FlipperLayout flipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        flipper=(FlipperLayout)findViewById(R.id.flipper);
        setLayout();
    }

    private void setLayout(){
        String url[]=new String[]{
         "https://images.pexels.com/photos/257360/pexels-photo-257360.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500",
                "http://www.photobackgroundhd.com/wp-content/uploads/2018/08/3D-Nature-Wallpapers.jpg",
                "https://cdn.guidingtech.com/media/assets/WordPress-Import/2017/06/img_04.jpg"
        };
        for(int i=0;i<3;i++){
            FlipperView view=new FlipperView(getBaseContext());
        view.setImageUrl(url[i])
                .setDescription("Image"+(i+1));
        flipper.addFlipperView(view);
        view.setOnFlipperClickListener(new FlipperView.OnFlipperClickListener() {
            @Override
            public void onFlipperClick(FlipperView flipperView) {
                Toast.makeText(MainActivity.this, ""+(flipper.getCurrentPagePosition()+1), Toast.LENGTH_SHORT).show();

            }
        });
    }
}}
