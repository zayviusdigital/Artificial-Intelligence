package com.zayviusdigital.artificialintelligence;

import android.content.Context;

import com.zayviusdigital.artificialintelligence.encryption.Encryption;
import com.zayviusdigital.artificialintelligence.json.JsonReader;
import com.zayviusdigital.artificialintelligence.txt.TxtReader;

public class ArtificialIntelligence {

    public static String keys_encryption_url(String keys){
        return Encryption.GET(keys);
    }

    public static String txt_from_asset(Context context, String txt_source){
        return TxtReader.TXTFromAsset(context, txt_source);
    }

    public static String json_from_asset(Context context, String json_source){
        return JsonReader.JSONFromAsset(context, json_source);
    }
}
