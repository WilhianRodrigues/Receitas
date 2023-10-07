package com.example.receitas;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private ArrayList<Receita> listaReceitas;
    private Context context;

    public RecyclerViewAdapter(Context context, ArrayList<Receita> listaReceitas) {
        this.context = context;
        this.listaReceitas = listaReceitas;
    }

    public RecyclerViewAdapter(ArrayList<Receita> listaReceitas) {

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_receita, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Receita receita = listaReceitas.get(position);

        holder.nomeReceita.setText(receita.getNome());
        holder.imagemReceita.setImageResource(receita.getImagem());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DetalhesReceitaActivity.class);
                intent.putExtra("nome", receita.getNome());
                intent.putExtra("ingredientes", receita.getIngredientes());
                intent.putExtra("instrucoes", receita.getInstrucoes());
                intent.putExtra("imagem", receita.getImagem());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return listaReceitas.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imagemReceita;
        TextView nomeReceita;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imagemReceita = itemView.findViewById(R.id.imagemReceita);
            nomeReceita = itemView.findViewById(R.id.nomeReceita);
        }
    }
}
