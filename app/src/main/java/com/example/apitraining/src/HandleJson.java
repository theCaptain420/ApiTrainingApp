package com.example.apitraining.src;

import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

public class HandleJson {
    public void handleTheJson (String theJson){
        try{
            JSONObject jsonObject = new JSONObject(theJson);
            Log.d("dataHandle", "handleTheJson: "+jsonObject.get("by"));
        }catch (JSONException err){
            Log.d("dataHandle", "handleTheJson: we messed up");
        }



    }
}
