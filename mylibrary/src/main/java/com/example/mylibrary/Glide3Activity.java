package com.example.mylibrary;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class Glide3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glide3);
        ImageView iv = findViewById(R.id.iv);

        //方法常量池存在V3的引用
        Glide.with((Activity) this).load("").into(iv);
    }
}