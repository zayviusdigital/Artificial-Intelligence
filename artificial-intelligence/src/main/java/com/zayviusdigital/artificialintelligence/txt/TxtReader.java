package com.zayviusdigital.artificialintelligence.txt;

import android.content.Context;

import com.zayviusdigital.artificialintelligence.ArtificialIntelligence;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

public class TxtReader {
    public static String TXTFromAsset(Context context,String txt_source){
        InputStream inputStream = null;
        try {
            inputStream = context.getAssets().open(txt_source);
        } catch (IOException e) {
            e.printStackTrace();
        }
        int size = 0;
        try {
            size = Objects.requireNonNull(inputStream).available();
        } catch (IOException e) {
            e.printStackTrace();
        }
        byte[] buffer = new byte[size];
        try {
            if (inputStream != null) {
                int read = inputStream.read(buffer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new String(buffer);
    }
}
