package com.example.exercicio06;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Exercicio03 extends Activity {

    private EditText editAltura;
    private TextView textCategoria;
    private Double time[] = new Double[6];
    private Double alturas;
    private Double resultadoMedia;
    private Double resultadoDesvio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio03);
    }

    public void calcularMediaAltura(){
        Double altura = Double.parseDouble(editAltura.getText().toString());

        while (time<6)
       for (i=0; i<time ; i++){
         resultadoMedia = resultadoMedia + v[i];


           String oResultadoMedia= ("MÉDIA DAS ALTURAS: " + (altura/time));
           String oResultadoDesvio = ("O DESVIO PADRÃO DAS ALTURAS: " + (altura));

       }

    }
}
