package com.example.apitraining.src;

import android.content.Context;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;


public class HandleRequest {
    public void handleStringRequest (final TextView textView, String url, Context context){

        //set up request queue
        RequestQueue queue = Volley.newRequestQueue(context);

        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        //displayText
                        textView.setText("Response is: " + response);
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                textView.setText("Didnt work"+ error.toString());
            }
        }
        );

        queue.add(stringRequest);


    }


    public void handleJsonRequest (TextView textView, String url, Context context){


    }
}
