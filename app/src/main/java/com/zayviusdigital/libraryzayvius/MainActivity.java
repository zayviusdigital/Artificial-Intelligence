package com.zayviusdigital.libraryzayvius;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.zayviusdigital.artificialintelligence.ArtificialIntelligence;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("test_asset",   ArtificialIntelligence.json_from_asset(this,"test.json"));
    }




}