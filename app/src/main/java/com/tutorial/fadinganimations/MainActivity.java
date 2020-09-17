package com.tutorial.fadinganimations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView conan, conan1;

    public void fade(View view) {

        conan  = findViewById(R.id.conan);
        conan.animate().alpha(0f).setDuration(2000);
        conan1 = findViewById(R.id.conan1);
        conan1.animate().alpha(1f).setDuration(2000);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}