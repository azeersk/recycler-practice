package com.example.recyclerpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    Button redButton, blueButton;
    LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        redButton = findViewById(R.id.Red);
        blueButton = findViewById(R.id.Blue);
        linearLayout = findViewById(R.id.linearLayout);
        redButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RedColor redFrag = new RedColor();
                FragmentManager frm = getSupportFragmentManager();
                FragmentTransaction frt = frm.beginTransaction();
                frt.replace(R.id.linearLayout, redFrag);
                frt.commit();
            }
        });

        blueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BlueColor blueFragment = new BlueColor();
                FragmentManager frm = getSupportFragmentManager();
                FragmentTransaction frt = frm.beginTransaction();
                frt.replace(R.id.linearLayout, blueFragment);
                frt.commit();
            }
        });
    }
}