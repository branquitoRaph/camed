package com.jojora.camed.adapter;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;

import com.jojora.camed.model.Medicamento;

public class MedicamentoComparator extends DiffUtil.ItemCallback<Medicamento> {
    @Override
    public boolean areItemsTheSame(@NonNull Medicamento oldItem, @NonNull Medicamento newItem) {
        return oldItem.idMedicamento.equals(newItem.idMedicamento);
    }

    @Override
    public boolean areContentsTheSame(@NonNull Medicamento oldItem, @NonNull Medicamento newItem) {
        return oldItem.idMedicamento.equals(newItem.idMedicamento) &&
                oldItem.nomeMedicamento.equals(newItem.nomeMedicamento) &&
                oldItem.pmvc.equals(newItem.pmvc);
    }
}
