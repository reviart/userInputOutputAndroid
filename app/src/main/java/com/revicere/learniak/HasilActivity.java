package com.revicere.learniak;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HasilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        //get Intent from MainActivity
        String ambilNim = getIntent().getStringExtra("v_nim");
        String ambilAlamat = getIntent().getStringExtra("v_alamat");
        String ambilKelamin = getIntent().getStringExtra("baru");

        //Declare Text View
        TextView nim = (TextView) findViewById(R.id.txt_hasil);
        TextView alamat = (TextView) findViewById(R.id.txt_alamat);
        TextView kelamin = (TextView) findViewById(R.id.txt_kelamin);

        nim.setText(ambilNim);
        alamat.setText(ambilAlamat);
        kelamin.setText(ambilKelamin);

        Button back;
        back = (Button) findViewById(R.id.btn_back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}
