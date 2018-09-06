package com.example.exercicio02;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Exercicio02 extends Activity {
    private EditText editIdade;
    private TextView textCategoria;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercicio02);
    }
    public void categoria(View view){
        int idade = Integer.parseInt(editIdade.getText().toString());

        if(idade<8){
            String suaCategoria = "VOCÊ NÃO PODE PARTICIPAR =(";
            textCategoria.setText(suaCategoria);
        }
        else if (idade==8 || idade<=12){
            String suaCategoria = "INFANTIL";
            textCategoria.setText(suaCategoria);

        }else if(idade==13 || idade<=17){
            String suaCategoria = "JUVENIL";
            textCategoria.setText(suaCategoria);
        }else{
            String suaCategoria = "ADULTO";
            textCategoria.setText(suaCategoria);
        }

    }
}
