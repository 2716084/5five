package com.example.lyan;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {



        private ImageView imageView;
        private ImageButton nextButton, prevButton;


        private int[] images = {
                R.drawable.im111,
                R.drawable.im222,
                R.drawable.im333,
                R.drawable.im444,
                R.drawable.im555
        };

        private int currentIndex = 0;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            imageView = findViewById(R.id.imageView);
            nextButton = findViewById(R.id.nextButton);
            prevButton = findViewById(R.id.prevButton);


            nextButton.setOnClickListener(v -> {
                currentIndex = (currentIndex + 1) % images.length;
                imageView.setImageResource(images[currentIndex]);
            });


            prevButton.setOnClickListener(v -> {
                currentIndex = (currentIndex - 1 + images.length) % images.length;
                imageView.setImageResource(images[currentIndex]);

            });
        }}