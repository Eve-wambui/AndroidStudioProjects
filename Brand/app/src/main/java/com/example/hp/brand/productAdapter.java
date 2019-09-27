package com.example.hp.brand;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class productAdapter extends RecyclerView.Adapter<productAdapter.ProductViewHolder>{

    private Context mCtx;
    private List<product> productList;

    public productAdapter(Context mCtx, List<product> productList) {
        this.mCtx = mCtx;
        this.productList = productList;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater inflater= LayoutInflater.from(mCtx);
        View view=inflater.inflate(R.layout.arrivals,null);
        return new ProductViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder productViewHolder, int i) {
        product Prod=productList.get(i);

        productViewHolder.textViewTitle.setText(Prod.getTitle());
        productViewHolder.textViewShortDesc.setText(Prod.getDesc());
        productViewHolder.textViewRating.setText(String.valueOf(Prod.getRating()));
        productViewHolder.textViewPrice.setText(String.valueOf(Prod.getPrice()));

        productViewHolder.imageView.setImageDrawable(mCtx.getResources().getDrawable(Prod.getImage()));

    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    class ProductViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView textViewTitle, textViewShortDesc, textViewRating, textViewPrice;

        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.imageView);
            textViewTitle=itemView.findViewById(R.id.textViewTitle);
            textViewShortDesc=itemView.findViewById(R.id.textViewShortDesc);
            textViewRating=itemView.findViewById(R.id.textViewRating);
            textViewPrice=itemView.findViewById(R.id.textViewPrice);
        }
    }
}
