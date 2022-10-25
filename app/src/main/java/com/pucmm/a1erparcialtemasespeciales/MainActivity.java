package com.pucmm.a1erparcialtemasespeciales;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;

import com.pucmm.a1erparcialtemasespeciales.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        RecyclerView recyclerView1 = binding.recycler1;
        RecyclerView recyclerView2 = binding.recycler2;
        RecyclerView recyclerView3 = binding.recycler3;
        Button agregar = binding.addInfo;
        Button eliminar1;
        Button eliminar2;
        Button eliminar3;
    }
}