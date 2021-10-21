package com.example.rayhandaskamukhlis;

import android.os.Parcel;
import android.os.Parcelable;

public class Mobil implements Parcelable {
    private String namamobil;
    private String tahun;
    private String seri;
    private String rating;
    private String keterangan;
    private String harga;
    private int gambar;

    public Mobil() {

    }

    public String getNamamobil() {
        return namamobil;
    }

    public void setNamamobil(String namamobil) {
        this.namamobil = namamobil;
    }

    public String getSeri()  {
        return seri;
    }

    public void setSeri(String seri) {
        this.seri = seri;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.namamobil);
        dest.writeString(this.seri);
        dest.writeString(this.rating);
        dest.writeString(this.keterangan);
        dest.writeString(this.tahun);
        dest.writeString(this.harga);
        dest.writeInt(this.gambar);
    }

    public void readFromParcel(Parcel source) {
        this.namamobil = source.readString();
        this.seri = source.readString();
        this.rating = source.readString();
        this.keterangan = source.readString();
        this.tahun = source.readString();
        this.harga = source.readString();
        this.gambar = source.readInt();
    }

    protected Mobil(Parcel in) {
        this.namamobil = in.readString();
        this.seri = in.readString();
        this.rating = in.readString();
        this.keterangan = in.readString();
        this.tahun = in.readString();
        this.harga = in.readString();
        this.gambar = in.readInt();
    }

    public static final Creator<Mobil> CREATOR = new Creator<Mobil>() {
        @Override
        public Mobil createFromParcel(Parcel source) {
            return new Mobil(source);
        }

        @Override
        public Mobil[] newArray(int size) {
            return new Mobil[size];
        }
    };

}
