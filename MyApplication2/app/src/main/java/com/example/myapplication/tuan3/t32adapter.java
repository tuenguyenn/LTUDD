package com.example.myapplication.tuan3;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.R;

import java.util.ArrayList;

public class t32adapter extends  BaseAdapter{
    private ArrayList<T32contact> ls;
    private Context context;

    public t32adapter(ArrayList<T32contact> ls, Context context) {
        this.ls = ls;
        this.context = context;
    }

    @Override
    public int getCount() {
        return ls.size();
    }

    @Override
    public Object getItem(int position) {
        return ls.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewAX vax;
        if(convertView==null){
            vax= new ViewAX();
            convertView = LayoutInflater.from(context).inflate(R.layout.tuan32_listview_item,null);
            vax.img_image=convertView.findViewById(R.id.t32itemImage);
            vax.tv_age=convertView.findViewById(R.id.t32itemAge);
            vax.tv_name=convertView.findViewById(R.id.t32itemName);
            convertView.setTag(vax);
        }
        else {
            vax=(ViewAX) convertView.getTag();
        }
        vax.img_image.setImageResource(ls.get(position).getImage());
        vax.tv_name.setText(ls.get(position).getName());
        vax.tv_age.setText(ls.get(position).getAge());
        return convertView;
    }
    class ViewAX{
        ImageView img_image;
        TextView tv_name,tv_age;
    }


}
