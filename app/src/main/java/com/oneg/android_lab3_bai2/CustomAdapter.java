package com.oneg.android_lab3_bai2;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {
    private ArrayList<Cable> arrayList;
    private Context context;
    private int resource;

    //constructor

    public CustomAdapter(ArrayList<Cable> arrayList, Context context, int resource) {
        this.arrayList = arrayList;
        this.context = context;
        this.resource = resource;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = LayoutInflater.from(context).inflate(resource, parent, false);

        Cable cable = arrayList.get(position);

        //initial view

        ImageView img_Cable = (ImageView) convertView.findViewById(R.id.img_Cable);
        TextView tv_Name = (TextView) convertView.findViewById(R.id.tvName);
        TextView tv_Price = (TextView) convertView.findViewById(R.id.tvPrice);
        TextView tv_Discount = (TextView) convertView.findViewById(R.id.tvDiscount);

        //set value

        img_Cable.setImageResource(cable.getImage());
        tv_Name.setText(cable.getName());
        tv_Price.setText(cable.getPrice());
        tv_Discount.setText(cable.getDiscount());
        return convertView;
    }
}
