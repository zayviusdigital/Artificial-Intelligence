package com.zayviusdigital.libraryzayvius;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.zayviusdigital.artificialintelligence.ArtificialIntelligence;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("hash_key",  ArtificialIntelligence.set_keys(""));
    }
}