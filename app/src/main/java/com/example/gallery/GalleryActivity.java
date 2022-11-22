package com.example.gallery;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class GalleryActivity extends AppCompatActivity {

    GridView gridView;
    MyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        gridView = findViewById(R.id.images_gv);
        adapter = new MyAdapter(this);

        gridView.setAdapter(adapter);

    }
}