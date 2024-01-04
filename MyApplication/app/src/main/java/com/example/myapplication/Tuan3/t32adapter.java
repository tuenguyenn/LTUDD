package com.example.myapplication.Tuan3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.R;

import java.util.ArrayList;

public class t32adapter extends BaseAdapter {
    private ArrayList<T32contact> ls;

    private Context context;

    public t32adapter(ArrayList<T32contact> ls, Context context) {
        this.ls = ls;
        this.context = context;
    }

    //lay ve size
    @Override
    public int getCount() {
        return ls.size();
    }
    //lay ve item
    @Override
    public Object getItem(int position) {
        return ls.get(position);
    }
    //lay id item
    @Override
    public long getItemId(int position) {
        return position;
    }
    // tao view
    // gan du lieu
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewAX vax;
        // neu chua co view
        if (convertView == null) {
            vax = new ViewAX();
            // anh xa layout
            convertView = LayoutInflater.from(context).inflate(R.layout.tuan32_listview_item, null);
            vax.img_hinh = convertView.findViewById(R.id.t32itemHinh);
            vax.tv_ten = convertView.findViewById(R.id.t32itemTen);
            vax.tv_tuoi = convertView.findViewById(R.id.t32itemTuoi);
            // tao template de lan sau su dung
            convertView.setTag(vax);
        } else {
            vax = (ViewAX) convertView.getTag();
        }
        vax.img_hinh.setImageResource(ls.get(position).getHinh());
        vax.tv_ten.setText(ls.get(position).getTen());
        vax.tv_tuoi.setText(ls.get(position).getTuoi());

        return convertView;
    }


    class ViewAX{
        ImageView img_hinh;
        TextView tv_ten,tv_tuoi;

    }
}
