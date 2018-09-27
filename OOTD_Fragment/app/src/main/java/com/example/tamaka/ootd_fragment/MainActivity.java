package com.example.tamaka.ootd_fragment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn_pindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inisiasi tombol
        btn_pindah = (Button) findViewById(R.id.btnPindah);

        //memberikan fungsi intent pada tombol
        btn_pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), FragActivity.class);
                startActivity(i);
            }
        });
    }
}
