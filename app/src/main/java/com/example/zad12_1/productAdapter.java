package com.example.zad12_1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class productAdapter extends RecyclerView.Adapter<productAdapter.ProductViewHolder> {

    private List<Product> productList;

    public productAdapter(List<Product> productList) {
        this.productList = productList;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_product, parent, false);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        Product currentProduct = productList.get(position);
        holder.firstProdukt.setText(currentProduct.getFirstProdukt());
        holder.cena.setText(String.format("%.2f zł", currentProduct.getCena()));
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    public static class ProductViewHolder extends RecyclerView.ViewHolder {
        public TextView firstProdukt;
        public TextView cena;

        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);
            firstProdukt = itemView.findViewById(R.id.firstProdukt);
            cena = itemView.findViewById(R.id.cena);
        }
    }
}
