package com.example.opet.exercicios;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private EditText editIdade;
        private TextView textCategoria;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }
    public void categoria(View view){
        int idade = Integer.parseInt(editIdade.getText().toString());
        if (idade>=8 & idade<12){
            String suaCategoria = "INFANTIL";
            textCategoria.setText(suaCategoria);

        }

    }
}
