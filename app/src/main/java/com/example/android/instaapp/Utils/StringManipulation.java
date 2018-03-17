package com.example.android.instaapp.Utils;

/**
 * Created by PRITHVIRAJ on 17-03-2018.
 */

public class StringManipulation {

    public static String expandUsername(String username){
        return username.replace(".","_");
    }

    public static String condenseUsername(String username){
        return username.replace("_",".");
    }
}
