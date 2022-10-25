package com.pucmm.a1erparcialtemasespeciales;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.pucmm.a1erparcialtemasespeciales.databinding.ActivityEnterDataProductBinding;
import com.pucmm.a1erparcialtemasespeciales.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class EnterDataProduct extends AppCompatActivity {

    private ActivityEnterDataProductBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityEnterDataProductBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        EditText articulo = binding.articuloTxt;
        EditText descripcion = binding.descripcionTxt;
        EditText precio = binding.precioTxt;
        Button clean = binding.cleanButton;
        Button addProduct = binding.agregar;
        Button back = binding.volver;

        List<Product> list = new ArrayList<>();

        //list.add(new Product(articulo.getText().toString(), descripcion.getText().toString(), precio.getText().toString()));

        addProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EnterDataProduct.this, MainActivity.class);

                if(articulo.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Digite el articulo.", Toast.LENGTH_LONG)
                            .show();
                }
                if(descripcion.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Digite la descripcion.", Toast.LENGTH_LONG)
                            .show();
                }
                if(precio.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Digite el precio.", Toast.LENGTH_LONG)
                            .show();
                }

                startActivity(intent);
            }
        });

        clean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                articulo.setText("");
                descripcion.setText("");
                precio.setText("");
            }
        });
    }
}