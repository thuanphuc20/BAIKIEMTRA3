package com.example.englisk;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class AdapterT extends BaseAdapter {

    private Context context;
    private int layout;
    private List<Thi> arraylist;

    public AdapterT(MainActivity mainActivity, int list_item, ArrayList<Thi> arraylist) {
    }

    @Override
    public int getCount() {
        return arraylist.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout, null);

        Thi thi = arraylist.get(i);

        TextView textV = view.findViewById(R.id.ten);
        TextView textV1 = view.findViewById(R.id.congthuc);


        textV.setText(thi.getTen());
        textV1.setText(thi.getCongthuc());


        return view;

    }
}
