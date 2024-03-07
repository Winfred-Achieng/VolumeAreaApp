package com.winfred.volumecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SphereActivity extends AppCompatActivity {

    TextView title, result;
    EditText sphere_radius;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sphere);

        sphere_radius=findViewById(R.id.editTextSphere);
        result=findViewById(R.id.TextViewResult);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String radius = sphere_radius.getText().toString();
                int r = Integer.parseInt(radius);

                double volume =(4/3) * 3.142 * r*r*r;
                result.setText("V = "+volume+" m^3");
            }
        });


    }
}