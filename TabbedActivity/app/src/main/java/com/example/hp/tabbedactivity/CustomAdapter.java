package com.example.hp.tabbedactivity;

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

public class CustomAdapter extends ArrayAdapter<Here> {
Context mCtx;
int resource;
List<Here> hereList;
    public CustomAdapter(Context mCtx, int resource, List<Here> hereList){
        super(mCtx,resource,hereList);
        //initialize all yhe variables
        this.mCtx=mCtx;
        this.resource=resource;
        this.hereList=hereList;
    }
    //override method to return view for all items on the list

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //create a layout inflater to inflate the layout resource file(eve)
        LayoutInflater inflater=LayoutInflater.from(mCtx);
        View view=inflater.inflate(R.layout.evie,null);
        TextView nameit=view.findViewById(R.id.name);
        TextView teamit=view.findViewById(R.id.team);
        ImageView imax=view.findViewById(R.id.image);
        //get object on list based on position
        Here here=hereList.get(position);
        nameit.setText(here.getName());
        teamit.setText(here.getTeam());
        imax.setImageDrawable(mCtx.getResources().getDrawable(here.getImage()));
        view.findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    removeItem(position);
            }
        });
        return view;
    }
    public void removeItem(final int position){
        AlertDialog.Builder builder=new AlertDialog.Builder(mCtx);
        builder.setTitle("Are you sure you want to delete?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                hereList.remove(position);
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
