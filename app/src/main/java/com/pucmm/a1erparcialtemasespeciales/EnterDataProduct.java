package com.pucmm.a1erparcialtemasespeciales;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

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
    }
}