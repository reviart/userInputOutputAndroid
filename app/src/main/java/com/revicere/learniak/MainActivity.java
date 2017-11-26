package com.revicere.learniak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    //declare properties with varb
    EditText nim, alamat;
    RadioButton pria, wanita;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get value from id, then passing it into new varb
        nim = (EditText) findViewById(R.id.txt_nim);
        alamat = (EditText) findViewById(R.id.txt_alamat);
        pria = (RadioButton) findViewById(R.id.pria);
        wanita = (RadioButton) findViewById(R.id.wanita);
        submit = (Button) findViewById(R.id.btn_submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //final it's mean the variable will be sent to different activity
                String tampung = null;
                final String baru;
                final double v_nim = Double.parseDouble(nim.getText().toString());
                final String v_alamat = alamat.getText().toString();

                //Radio isChecked
                if (pria.isChecked()){
                    tampung = pria.getText().toString();
                }
                if (wanita.isChecked()){
                    tampung = wanita.getText().toString();
                }

                baru = tampung;

                Intent passingBro = new Intent(getApplicationContext(), HasilActivity.class);
                passingBro.putExtra("v_nim", String.valueOf(v_nim));
                passingBro.putExtra("v_alamat", String.valueOf(v_alamat));
                passingBro.putExtra("baru", String.valueOf(baru));
                startActivity(passingBro);
                finish();
            }
        });
    }
}
