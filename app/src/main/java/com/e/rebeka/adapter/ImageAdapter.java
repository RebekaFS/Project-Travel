package com.e.rebeka.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.e.rebeka.R;

//Digunakan Untuk Mengatur Konten yang Akan Ditampilkan
public class ImageAdapter extends BaseAdapter {

    //List Konten Gambar yang akan ditampilkan pada GridView
    public static int[] gambar = {R.drawable.makassar, R.drawable.parepare1, R.drawable.manado,
            R.drawable.palu1,};

    private Context mContext;

    //Membuat Contructor, dengan parameter Context, Untuk menghubungkan Adapter dengan GridView
    ImageAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        //Menghitung Jumlah/Panjang dari Daftar Konten
        return gambar.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    //Membuat ImageView baru untuk setiap item yang direferensikan oleh Adaptor
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        //Jika tidak di daur ulang
        if (convertView == null) {
            //Menginisialisasi beberapa atribut
            imageView = new ImageView(mContext);
            //Mengatur Panjang dan Lebar pada ImageView
            imageView.setLayoutParams(new GridView.LayoutParams(120, 120));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            //Mengatur Padding
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertView;
        }

        //Mengset Image dari Resource/Sumber berdasarkan posisinya
        imageView.setImageResource(gambar[position]);
        return imageView;
    }
}
