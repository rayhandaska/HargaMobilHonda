package com.example.rayhandaskamukhlis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private String[] namamobil, tahun, seri, rating, harga, keterangan;
    private TypedArray gambar;
    private MobilAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new MobilAdapter(this);
        ListView listView = findViewById(R.id.mobilhonda);
        listView.setAdapter(adapter);

        persiapan();
        addItem();

        listView.setOnItemClickListener((adapterView, view, i, l) -> {
            Intent intent = new Intent(MainActivity.this, AktivitasMobil.class);

            Mobil mobil = new Mobil();
            mobil.setGambar(gambar.getResourceId(i, -1));
            mobil.setNamamobil(namamobil[i]);
            mobil.setTahun(tahun[i]);
            mobil.setSeri(seri[i]);
            mobil.setRating(rating[i]);
            mobil.setHarga(harga[i]);
            mobil.setKeterangan(keterangan[i]);

            intent.putExtra(AktivitasMobil.tambahan_mobil, mobil);
            startActivity(intent);

        });
    }

    @Override
    public void onClick(View v) {

    }

    private void addItem() {

        ArrayList<Mobil> mobils = new ArrayList<>();

        for (int i = 0; i < namamobil.length; i++) {
            Mobil mobil = new Mobil();
            mobil.setGambar(gambar.getResourceId(i, -1));
            mobil.setNamamobil(namamobil[i]);
            mobil.setTahun(tahun[i]);
            mobil.setSeri(seri[i]);
            mobil.setRating(rating[i]);
            mobil.setHarga(harga[i]);
            mobil.setKeterangan(keterangan[i]);

            mobils.add(mobil);
        }
        adapter.setMobils(mobils);
    }

    private void persiapan() {
        namamobil = getResources().getStringArray(R.array.datanamamobil);
        tahun = getResources().getStringArray(R.array.datatahun);
        seri = getResources().getStringArray(R.array.dataseri);
        rating = getResources().getStringArray(R.array.datarating);
        harga = getResources().getStringArray(R.array.dataharga);
        keterangan = getResources().getStringArray(R.array.dataketerangan);
        gambar = getResources().obtainTypedArray(R.array.datagambar);

    }
}