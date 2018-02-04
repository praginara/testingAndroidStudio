package com.example.randypraginara.randypraginara_1106130167_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


    public class MainActivity extends AppCompatActivity {

        EditText edtextmenu, edtextjumlah;
        Button bteatbus;
        Button btabnormal;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            edtextmenu = (EditText) findViewById(R.id.edittextmenu);
            edtextjumlah = (EditText) findViewById(R.id.edittextjumlah);
            bteatbus =  (Button) findViewById(R.id.buttoneatbus);
            btabnormal =  (Button) findViewById(R.id.buttonabnormal);

            bteatbus.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick (View) {
                    final String nasiud = edtextmenu.getText().toString();
                    final String porsi1 = edtextjumlah.getText().toString();
                    int jumlah_integer = Integer.parseInt(edtextjumlah.getText().toString());
                    Intent d = new Intent (getApplicationContext(), Main2Activity.class);
                    d.putExtra("nama_restoran", "Eatbus");
                    d.putExtra("nama_makanan", nasiud);
                    d.putExtra("porsi", porsi1);
                    d.putExtra("total_harga", jumlah_integer*50000);
                    startActivity(d);

                }

            };
