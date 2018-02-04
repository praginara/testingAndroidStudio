package com.example.randypraginara.randypraginara_1106130167_modul1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by User on 04/02/2018.
 */

public class Main2Activity extends AppCompatActivity {
    TextView namaMakanan, porsi, namaRestoran, totalHarga;

    @Override
    protected void onCreate (Bundle savedInstanceStats) {
        super.onCreate(savedInstanceStats);
        setContentView(R.layout.EATBUS);
        namaMakanan = (TextView) findViewById(R.id.nasiuduk12);
        porsi = (TextView) findViewById(R.id.porsi121);
        totalHarga = (TextView) findViewById(R.id.harga121);
        namaRestoran = (TextView) findViewById(R.id.eatbus11);

        Intent a = getIntent();
        String restoran = a.getStringExtra("nama_restoran");
        String makanan = a.getStringExtra("nama_makanan");
        String porsiiii = a.getStringExtra("porsi");
        int w = a.getIntExtra("total_harga");
        String totalHargaa = String.valueOf(w);

        namaRestoran.setText(restoran);
        namaMakanan.setText(makanan);
        porsi.setText(porsiiii);
        totalHarga.setText(totalHargaa);

    }
}