package com.example.tamaka.ootd_fragment;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FragActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frag);

        if (savedInstanceState == null) {
            //transaksi fragment
            //inisiasi objek bertipe BodyPartsFragment
            BajuPartsFragment bodyPart;
            //inisiasi adaapter untuk mengaktifkan fragment
            FragmentManager fm = getSupportFragmentManager();

            //membuat objek head
            bodyPart = new BajuPartsFragment();
            bodyPart.setmImageIds(BajuImageAssets.getHeads());
            bodyPart.setmListIndex(0);
            //transaksi freagment heads
            fm.beginTransaction().add(R.id.baju_container, bodyPart).commit();

            //membuat objek body
            bodyPart = new BajuPartsFragment();
            bodyPart.setmImageIds(BajuImageAssets.getBodies());
            bodyPart.setmListIndex(0);
            //transaksi freagment body
            fm.beginTransaction().add(R.id.celana_container, bodyPart).commit();

        }
    }
}
