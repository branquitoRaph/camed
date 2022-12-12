package com.jojora.camed.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.paging.PagingDataAdapter;
import androidx.recyclerview.widget.DiffUtil;

import com.jojora.camed.R;
import com.jojora.camed.activity.HomeActivity;
import com.jojora.camed.model.Medicamento;

public class MyAdapter extends PagingDataAdapter<Medicamento, MyViewHolder> {

    HomeActivity homeActivity;

    public MyAdapter(HomeActivity homeActivity, @NonNull DiffUtil.ItemCallback<Medicamento> diffCallback) {
        super(diffCallback);
        this.homeActivity = homeActivity;
    }

    /**
     * Cria os elementos de UI referente a um item da lista
     */
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.list_item, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(v);
        return viewHolder;
    }

    /**
     * Preenche um item da lista
     */
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Medicamento medicamento = this.getItem(position);

        // preenche o campo de nome
        TextView textViewNomeMedicamento = holder.itemView.findViewById(R.id.textViewNomeMedicamento);
        textViewNomeMedicamento.setText(medicamento.nomeMedicamento);

        // preenche o campo de preço
        TextView textViewPmvc = holder.itemView.findViewById(R.id.textViewPmvc);
        textViewPmvc.setText(medicamento.pmvc);

        // preenche o campo de preço
        TextView textViewNecessarioReceita = holder.itemView.findViewById(R.id.textViewNecessarioReceita);
        if (medicamento.necessarioReceita == "1"){
            textViewNecessarioReceita.setText("Necessita de receita");
        }
        else{
            textViewNecessarioReceita.setText("Não necessita de receita");
        }
    }
}
