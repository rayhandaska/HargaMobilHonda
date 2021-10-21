package com.example.rayhandaskamukhlis;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MobilAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Mobil> mobils = new ArrayList<>();

    public void setMobils(ArrayList<Mobil> mobils) {
        this.mobils = mobils;
    }

    public MobilAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return mobils.size();
    }

    @Override
    public Object getItem(int i) {
        return mobils.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.item_mobil, viewGroup, false);
        }
        ViewHolder viewHolder = new ViewHolder(view);
        Mobil mobil = (com.example.rayhandaskamukhlis.Mobil) getItem(i);
        viewHolder.bind(mobil);
        return view;
    }

    private static class ViewHolder {
        private TextView txtNamaMobil, txtKeterangan, txtSeri, txtRating, txtHarga, txtTahun;
        private ImageView imgGambar;

        ViewHolder(View view) {
            txtNamaMobil = view.findViewById(R.id.txt_namamobil);
  //          txtKeterangan = view.findViewById(R.id.txt_keterangan);
            txtSeri = view.findViewById(R.id.txt_seri);
            imgGambar = view.findViewById(R.id.img_gambar);
  //          txtTahun = view.findViewById(R.id.txt_tahun);
            txtHarga = view.findViewById(R.id.txt_harga);
            txtRating = view.findViewById(R.id.rating);
        }

        void bind(Mobil mobil) {
            txtNamaMobil.setText(mobil.getNamamobil());
   //         txtKeterangan.setText(mobil.getKeterangan());
            imgGambar.setImageResource(mobil.getGambar());
            txtSeri.setText(mobil.getSeri());
            txtRating.setText(mobil.getRating());
            txtHarga.setText(mobil.getHarga());
  //          txtTahun.setText(mobil.getTahun());
        }
    }

}
