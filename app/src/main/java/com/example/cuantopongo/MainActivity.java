package com.example.cuantopongo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etCantidadpersonas;
    EditText etP1, etP2, etP3, etP4;
    TextView tvTotalnum, tvCadauno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etCantidadpersonas= findViewById(R.id.etCantidadpersonas);
        etP1 = findViewById(R.id.etP1);
        etP2 = findViewById(R.id.etP2);
        etP3 = findViewById(R.id.etP3);
        etP4 = findViewById(R.id.etP4);
        tvTotalnum = findViewById(R.id.tvTotalnum);
        tvCadauno = findViewById(R.id.tvCadauno);
    }


    public void BotonGenerar(View view){
    String etCantPers = etCantidadpersonas.getText().toString();
    int etCantPersonas = Integer.parseInt(etCantPers);
    String etPers1 = etP1.getText().toString();
    String etPers2 = etP2.getText().toString();
    String etPers3 = etP3.getText().toString();
    String etPers4 = etP4.getText().toString();
    int etP1_int = Integer.parseInt(etPers1);
    int etP2_int = Integer.parseInt(etPers2);
    int etP3_int = Integer.parseInt(etPers3);
    int etP4_int = Integer.parseInt(etPers4);
    int total = etP1_int + etP2_int + etP3_int + etP4_int;
    int promedio = (etP1_int + etP2_int + etP3_int + etP4_int) / etCantPersonas;
    String total_string = String.valueOf(total);

    tvTotalnum.setText("$" + total_string);
    tvCadauno.setText("Cada uno pone: $" + promedio);
    }
}
