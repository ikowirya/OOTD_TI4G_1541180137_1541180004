package com.example.tamaka.ootd_fragment;

import java.util.ArrayList;
import java.util.List;

public class BajuImageAssets {

    //Attribut ini untuk mengumpulkan baju
    private static List<Integer> Baju = new ArrayList<Integer>(){{
        add(R.drawable.baju1);
        add(R.drawable.baju2);
        add(R.drawable.baju3);
        add(R.drawable.baju4);
        add(R.drawable.baju5);
    }};

    //Attribut ini digunakan untuk mengumpulkan kepala
    private static List<Integer> Celana = new ArrayList<Integer>(){{
        add(R.drawable.celana1);
        add(R.drawable.celana2);
        add(R.drawable.celana3);
        add(R.drawable.celana4);
        add(R.drawable.celana5);
    }};

    public static List<Integer> getHeads() {
        return Baju;
    }

    public static List<Integer> getBodies() {
        return Celana;
    }
}
