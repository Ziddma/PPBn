package com.example.listviewbuah;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class AdapterBuah extends ArrayAdapter {
    String namabuah[];
    String ket_buah[];
    int gambar_buah[];
    Activity activity;


    public AdapterBuah(MainBuah activity, String[] nama_buah, int[] gambar_buah,String[] keterangan) {
        super(activity, R.layout.list_item, nama_buah);
        this.namabuah = nama_buah;
        this.ket_buah = ket_buah;
        this.gambar_buah = gambar_buah;
        this.activity = activity;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=activity.getLayoutInflater();
        View v=inflater.inflate(R.layout.list_item, null);

        ImageView gambare;
        TextView nama_buah;

        gambare =v.findViewById(R.id.gambar_buah);
        nama_buah=v.findViewById(R.id.nama_buah);

        gambare.setImageResource(gambar_buah[position]);
        nama_buah.setText(namabuah[position]);

        return v;

    }
}
