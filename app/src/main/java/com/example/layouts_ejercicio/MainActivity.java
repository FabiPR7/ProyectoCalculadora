package com.example.layouts_ejercicio;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private Button b5;
    private Button b6;
    private Button b7;
    private Button b8;
    private Button b9;
    private Button b0;
    private Button bmas;
    private Button bresto;
    private Button bmulti;
    private Button bdiv;
    private Button bigual;
    private Button bC;
    private EditText resultado;
    private double n1;
    private double n2;
    boolean suma = false;
    boolean resta = false;
    boolean multi = false;
    boolean division = false;
    boolean igual = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.buno);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        b0 = (Button) findViewById(R.id.b0);
        bmas = (Button) findViewById(R.id.bmas);
        bresto = (Button) findViewById(R.id.bresto);
        bmulti = (Button) findViewById(R.id.bmulti);
        bdiv = (Button) findViewById(R.id.bdiv);
        bigual = (Button) findViewById(R.id.bigual);
        bC = (Button) findViewById(R.id.bC);
        resultado = (EditText) findViewById(R.id.resultado);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
@Override
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.buno){
            resultado.setText(resultado.getText().toString()+"1");
        }
        else if (id == R.id.b2){
            resultado.setText(resultado.getText().toString() +"2");
        }
        else if (id == R.id.b3){
            resultado.setText(resultado.getText().toString() +"3");
        }
        else  if (id == R.id.b4){
            resultado.setText(resultado.getText().toString() +"4");
        }
        else  if (id == R.id.b5){
            resultado.setText(resultado.getText().toString() +"5");
        }
        else  if (id == R.id.b6){
            resultado.setText(resultado.getText().toString() +"6");
        }
        else  if (id == R.id.b7){
            resultado.setText(resultado.getText().toString() + "7");
        }
        else if (id == R.id.b8){
            resultado.setText(resultado.getText().toString() + "8");
        }
        else  if (id == R.id.b9){
            resultado.setText(resultado.getText().toString() + "9");
        }
        else  if (id == R.id.b0){
            resultado.setText(resultado.getText().toString() + "0");
        }
        else  if (id == R.id.bmas){
            n1 = Double.parseDouble( resultado.getText().toString());
            suma = true;
            resta = false;
            division = false;
            multi = false;
            resultado.setText("");
        }
        else   if (id == R.id.bresto){
            n1 = Double.parseDouble( resultado.getText().toString());
            suma = false;
            resta = true;
            division = false;
            multi = false;
            resultado.setText("");
        }
        else if (id == R.id.bdiv){
            n1 = Double.parseDouble( resultado.getText().toString());
            suma = false;
            resta = false;
            division = true;
            multi = false;
            resultado.setText("");
        }
        else  if (id == R.id.bmulti){
            n1 = Double.parseDouble( resultado.getText().toString());
            suma = false;
            resta = false;
            division = false;
            multi = true;
            resultado.setText("");
        }
        else  if (id == R.id.bigual){
            n2 = Double.parseDouble( resultado.getText().toString());
            String resultados = "";
            if (suma){
                resultados = String.valueOf((n1+n2));
                resultado.setText(resultados);
            }
            if (resta){
                resultados = String.valueOf((n1-n2));
                resultado.setText(resultados);
            }
            if (division){
                resultados = String.valueOf((n1/n2));
                resultado.setText(resultados);
            }
            if (multi){
                resultados = String.valueOf((n1*n2));
                resultado.setText(resultados);
            }

        }
        else   if (id == R.id.bC){
            n1 = 0;
            n2 = 0;
            resultado.setText("");
        }




    }
}