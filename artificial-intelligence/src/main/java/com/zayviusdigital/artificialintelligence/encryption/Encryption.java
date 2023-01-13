package com.zayviusdigital.artificialintelligence.encryption;

import android.util.Base64;

import java.nio.charset.StandardCharsets;

public class Encryption {


    public static String GET(String string){
        String[] get_key1 = key(string).split("//");
        return get_key1[0]+"//"+hash(string);
    }


    private static String hash(String string){
        String[] get_hash = key(string).split("\\?");
        String hash = get_en(get_en(get_hash[1]));
        String[] get_hash1 = hash.split("~~");
        return get_hash1[0]+get_hash1[1];
    }

    private static String key(String string){
        return get1(string);
    }
    private static String get1(String string){
        return get2(get_en(string));
    }

    private static String get2(String string){
        return get3(get_en(string));
    }

    private static String get3(String string){
        return get4(get_en(string));
    }

    private static String get4(String string){
        return get5(get_en(string));
    }

    private static String get5(String string){
        return get_en(string);
    }

    private static String get_en(String coded){
        byte[] valueDecoded;
        valueDecoded = Base64.decode(coded.getBytes(StandardCharsets.UTF_8), Base64.DEFAULT);
        return new String(valueDecoded);
    }
}
