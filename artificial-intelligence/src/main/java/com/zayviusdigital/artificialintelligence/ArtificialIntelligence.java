package com.zayviusdigital.artificialintelligence;

import com.zayviusdigital.artificialintelligence.encryption.Encryption;

public class ArtificialIntelligence {

    public static String set_keys(String keys){
        return Encryption.get(keys);
    }
}
