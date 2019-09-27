package com.example.hp.stationerystation;

import android.content.Context;
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
    public CustomAdapter(Context mCtx, int resource,List<Here> hereList){
        //super initializes all the objects/variables created under the parent class
        super(mCtx,resource,hereList);
        //initialize all the variables
        this.mCtx=mCtx;
        this.resource=resource;
        this.hereList=hereList;

    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //create a layout inflater to inflate the layout resource file(eve) you created
        LayoutInflater inflater=LayoutInflater.from(mCtx);
        View view=inflater.inflate(R.layout.items,null);
        //find items based on their ids
        TextView nameit=view.findViewById(R.id.textView);
        ImageView imax=view.findViewById(R.id.image);
        //get object on list based on position
        Here here=hereList.get(position);
        nameit.setText(here.getItem());
        imax.setImageDrawable(mCtx.getResources().getDrawable(here.getImage()));
        return view;
    }
}
