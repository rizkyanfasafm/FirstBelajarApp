package com.example.firstbelajarapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

//    ImageView iconpicture;
//    TextView labelcheck;

//    Coba git

    ImageView applogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        applogo = findViewById(R.id.applogo);

//        applogo.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                menuju halaman lain
//                Intent abc = new Intent(MainActivity.this, GetStartedAct.class);
//                startActivity(abc);
//                finish();
//            }
//        });

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent abcd = new Intent(MainActivity.this, GetStartedAct.class);
                startActivity(abcd);
                finish();
            }
        },2000);

//        iconpicture = findViewById(R.id.iconpicture);
//        labelcheck = findViewById(R.id.labelcheck);
//
////        Merubah text
//        labelcheck.setText("haii dunia");
//        labelcheck.setTextColor(Color.parseColor("#3456f0"));
//
////        Merubah warna
//        iconpicture.setBackgroundColor(Color.parseColor("#FFFFC107"));
    }
}
