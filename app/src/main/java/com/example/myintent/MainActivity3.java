package com.example.myintent;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    private EditText Exponente;
    private EditText Base;
    private Button btn;
    private TextView Resultado;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Exponente = (EditText) findViewById(R.id.Exponente);
        Base = (EditText) findViewById(R.id.Base);
        Resultado=(TextView) findViewById(R.id.Resultado);

    }

    public void Potencia(View v) {
        potencia();
    }

    public void potencia(){
        //Asignando valores
        int base=Integer.parseInt(Base.getText().toString());
        int exponente=Integer.parseInt(Exponente.getText().toString());
        int p=1;

        //Mientras el exponente sea mayor al cero

        while(exponente>0)
        {
            //calculando potencia

            p=p*base;
            exponente--;
        }
        //mostrando reusltados

        Resultado.setText
                ("La potencia de "+Base.getText().toString()+
                        " elevado al "+Exponente.getText().toString()+" es "+String.valueOf(p));
    }


    public void Tercero(View v){

        Intent tercero = new Intent(this, MainActivity.class);
        startActivity(tercero);
    }
}