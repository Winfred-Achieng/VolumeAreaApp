package com.winfred.volumecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    ArrayList<Shape> shapesArrayList;
    CustomGridViewAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //adapter view
        gridView= findViewById(R.id.gridview);

        //data source
        shapesArrayList = new ArrayList<>();
        Shape shape1= new Shape("Sphere",R.drawable.sphere);
        Shape shape2 = new Shape("Cylinder",R.drawable.cylinder);
        Shape shape3 = new Shape("Cube",R.drawable.cube);
        Shape shape4 = new Shape("Prism",R.drawable.prism);

        shapesArrayList.add(shape1);
        shapesArrayList.add(shape2);
        shapesArrayList.add(shape3);
        shapesArrayList.add(shape4);

        //adapter
        adapter= new CustomGridViewAdapter(shapesArrayList,getApplicationContext());
        gridView.setAdapter(adapter);


        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(getApplicationContext(), SphereActivity.class);
                startActivity(intent);

            }
        });



    }
}