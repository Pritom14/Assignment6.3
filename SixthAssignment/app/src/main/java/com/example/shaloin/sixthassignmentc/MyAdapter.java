package com.example.shaloin.sixthassignmentc;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by shaloin on 22/1/17.
 */

public class MyAdapter extends ArrayAdapter<DataHandler> {
    private Context context;
    int layoutResourceID;
    DataHandler data[]=null;

    public MyAdapter(Context context, int layoutResourceID, DataHandler[] data) {
        super(context, layoutResourceID, data);
        this.context=context;
        this.layoutResourceID=layoutResourceID;
        this.data=data;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row=convertView;
        ViewHolder holder=null;
        if(row==null){
            LayoutInflater inflater=((Activity)context).getLayoutInflater();
            row=inflater.inflate(layoutResourceID,parent,false);
            holder=new ViewHolder();
            holder.imageView=(ImageView)row.findViewById(R.id.imageID);
            holder.title_Text=(TextView)row.findViewById(R.id.titleID);
            holder.description_Text=(TextView)row.findViewById(R.id.descriptionID);
            row.setTag(holder);
        }
        else{
            holder=(ViewHolder)row.getTag();
        }
        DataHandler dataHandler=data[position];
        holder.imageView.setImageResource(dataHandler.icon);
        holder.title_Text.setText(dataHandler.title);
        holder.description_Text.setText(dataHandler.description);
        return row;
    }

    static class ViewHolder{
        ImageView imageView;
        TextView title_Text,description_Text;
    }
}
