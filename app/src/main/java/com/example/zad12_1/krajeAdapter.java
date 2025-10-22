package com.example.zad12_1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class krajeAdapter extends RecyclerView.Adapter<krajeAdapter.krajeViewHolder> {

    private List<kraje> krajeList;

    public krajeAdapter(List<kraje> krajeList) {
        this.krajeList = krajeList;
    }

    @NonNull
    @Override
    public krajeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_kraje, parent, false);
        return new krajeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull krajeViewHolder holder, int position) {
        kraje currentkraj = krajeList.get(position);
        holder.firstKrajText.setText(currentkraj.getnazwaKraju());
    }

    @Override
    public int getItemCount() {
        return krajeList.size();
    }

    public static class krajeViewHolder extends RecyclerView.ViewHolder {
        public TextView firstKrajText;

        public krajeViewHolder(@NonNull View itemView) {
            super(itemView);
            firstKrajText = itemView.findViewById(R.id.firstkraj);
        }
    }
}
