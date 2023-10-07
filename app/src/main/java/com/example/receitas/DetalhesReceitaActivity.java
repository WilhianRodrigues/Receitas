package com.example.receitas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetalhesReceitaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes_receita);

        Intent intent = getIntent();
        String nome = intent.getStringExtra("nome");
        String ingredientes = intent.getStringExtra("ingredientes");
        String instrucoes = intent.getStringExtra("instrucoes");
        int imagem = intent.getIntExtra("imagem", R.drawable.ic_launcher_background);

        ImageView imagemDetalhes = findViewById(R.id.imagemDetalhes);
        TextView nomeDetalhes = findViewById(R.id.nomeDetalhes);
        TextView ingredientesDetalhes = findViewById(R.id.ingredientesDetalhes);
        TextView instrucoesDetalhes = findViewById(R.id.instrucoesDetalhes);

        imagemDetalhes.setImageResource(imagem);
        nomeDetalhes.setText(nome);
        ingredientesDetalhes.setText(ingredientes);
        instrucoesDetalhes.setText(instrucoes);
    }
}