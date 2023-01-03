package com.zayviusdigital.artificialintelligence;

import android.content.Context;

import com.zayviusdigital.artificialintelligence.encryption.Encryption;
import com.zayviusdigital.artificialintelligence.txtreader.TxtReader;

public class ArtificialIntelligence {

    public static String set_keys(String keys){
        return Encryption.get(keys);
    }

    public static String set_txt_reader(Context context, String txt_source){
        return TxtReader.get(context, txt_source);
    }
}
