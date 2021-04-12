package com.bengisu.landmarkbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.TestLooperManager;
import android.widget.ImageView;
import android.widget.TextView;

//import static com.bengisu.landmarkbook.MainActivity.selectedImage;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView imageView = findViewById(R.id.imageView);
        TextView landmarkNameText = findViewById(R.id.landmarkNameText);
        TextView countryNameText = findViewById(R.id.countryNameText);

        Intent intent = getIntent();
        String landmarkName = intent.getStringExtra("name");
        String countryName = intent.getStringExtra("country");
        landmarkNameText.setText(landmarkName);
        countryNameText.setText(countryName);

        /*Singleton singleton = new Singleton();
        imageView.setImageBitmap(singleton.getChosenImage());
        System.out.println(singleton.getChosenImage().getHeight());*///görselin boyutunu yazdırmaya çalıştık ama yok öyle bi obje
        //Singletonın amacı tek bir obje oluşturmak ve böylece hangi activityde oluşturursam oluşturim bana tek bir obje üzerinde
        //islem yapma yetkisi verilsin istiyorum. Bunu yapmak icin constructor i private yapicam
        //o yüzden gidip constructor icinde oluşturduk objeyi

        //imageView.setImageBitmap(selectedImage);
        Singleton singleton = Singleton.getInstance();
        imageView.setImageBitmap(singleton.getChosenImage());
    }
}