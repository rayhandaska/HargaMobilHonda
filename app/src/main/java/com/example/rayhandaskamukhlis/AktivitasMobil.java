package com.example.rayhandaskamukhlis;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AktivitasMobil extends AppCompatActivity {

    String namamobil, tahun, seri, rating, keterangan, harga;
    int path;

    public static final String tambahan_mobil = "test_extra_mobil";

    TextView tViewNamamobil, tViewRating, tViewTahun,
            tViewKeterangan,  tViewSeri, tViewHarga;

    ImageView imageGambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobil);

        tViewNamamobil = findViewById(R.id.txt_namamobil);
        tViewKeterangan = findViewById(R.id.txt_keterangan);
        tViewRating = findViewById(R.id.txt_rating);
        tViewTahun = findViewById(R.id.txt_tahun);
        tViewSeri = findViewById(R.id.txt_seri);
        tViewHarga = findViewById(R.id.txt_harga);
        imageGambar = findViewById(R.id.img_gambar);

        Mobil mobil = this.getIntent().getParcelableExtra(tambahan_mobil);

        namamobil = mobil.getNamamobil();
        tViewNamamobil.setText(namamobil);

        rating = mobil.getRating();
        tViewRating.setText(rating);

        seri = mobil.getSeri();
        tViewSeri.setText(seri);

        keterangan = mobil.getKeterangan();
        tViewKeterangan.setText(keterangan);

        tahun = mobil.getTahun();
        tViewTahun.setText(tahun);

        harga = mobil.getHarga();
        tViewHarga.setText(harga);

        path = mobil.getGambar();
        imageGambar.setImageResource(path);
    }

}
