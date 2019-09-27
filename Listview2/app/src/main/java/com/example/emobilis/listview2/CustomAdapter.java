package com.example.emobilis.listview2;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by emobilis on 7/10/18.
 */

public class CustomAdapter extends ArrayAdapter<Custom> {
    Context mCtx;
    int resource;
    List<Custom> listhere;
    public CustomAdapter(Context mCtx, int resource,List<Custom> listhere) {
        super(mCtx, resource, listhere);
        this.mCtx=mCtx;
        this.resource=resource;
        this.listhere=listhere;
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater=LayoutInflater.from(mCtx);
        View view=inflater.inflate(R.layout.brian,null);
        TextView name=view.findViewById(R.id.textView);
        TextView descipt=view.findViewById(R.id.textView2);
        ImageView d=view.findViewById(R.id.imageView);

        Custom custom=listhere.get(position);
        name.setText(custom.getName());
        descipt.setText(custom.getDescription());
        d.setImageDrawable(mCtx.getResources().getDrawable(custom.getImages()));
        view.findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            removeItem(position);
            }
        });

     return view;
    }
    private void removeItem(final int position){
        AlertDialog.Builder builder=new AlertDialog.Builder(mCtx);
        builder.setTitle("You sure you want to delete?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                listhere.remove(position);
                notifyDataSetChanged();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
       AlertDialog alertDialog=builder.create();
       alertDialog.show();
    }
}
