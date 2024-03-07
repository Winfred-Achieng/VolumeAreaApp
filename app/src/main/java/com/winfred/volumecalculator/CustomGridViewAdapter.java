package com.winfred.volumecalculator;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomGridViewAdapter extends ArrayAdapter<Shape> {
    private ArrayList<Shape> shapesArrayList;
    private Context context;

    public CustomGridViewAdapter( ArrayList<Shape> shapesArrayList, Context context) {
            super(context, R.layout.grid_item_layout,shapesArrayList);
        this.shapesArrayList = shapesArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Shape shapes = getItem(position);
        ViewHolder holder;
//        final View result;

        if (convertView==null){

            convertView= LayoutInflater.from(context).inflate(R.layout.grid_item_layout,parent,false);

            holder= new ViewHolder();
            holder.shapeNameTV = (TextView) convertView.findViewById(R.id.textview);
            holder.shapeImageView= (ImageView) convertView.findViewById(R.id.imageview);

            convertView.setTag(holder);

        }else{
           holder= (ViewHolder) convertView.getTag();
        }

        holder.shapeNameTV.setText(shapes.getShapeName());
        holder.shapeImageView.setImageResource(shapes.getShapeImage());

        return convertView;
    }


    public static class ViewHolder{
        TextView shapeNameTV;
        ImageView shapeImageView;
    }

}
