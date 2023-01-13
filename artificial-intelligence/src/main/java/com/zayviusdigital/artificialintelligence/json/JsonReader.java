package com.zayviusdigital.artificialintelligence.json;

import android.content.Context;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class JsonReader {
    public static String JSONFromAsset(Context context, String json_source) {
        String json;
        try {
            InputStream is = context.getAssets().open(json_source);
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, StandardCharsets.UTF_8);

        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;
    }
}
