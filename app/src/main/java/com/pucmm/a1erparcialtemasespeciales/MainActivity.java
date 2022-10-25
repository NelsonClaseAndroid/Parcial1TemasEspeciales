package com.pucmm.a1erparcialtemasespeciales;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.Button;

import com.pucmm.a1erparcialtemasespeciales.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    List<Product> list = new ArrayList<>();

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

        int spanCount = 1;

        if (this.getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            spanCount = 2;
        }

        recyclerView1.setHasFixedSize(true);
        recyclerView1.setLayoutManager(new GridLayoutManager(getApplicationContext(), spanCount));

        //recyclerView1.setAdapter();
    }
}