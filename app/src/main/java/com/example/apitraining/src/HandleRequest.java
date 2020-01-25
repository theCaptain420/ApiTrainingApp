package com.example.apitraining.src;

import android.content.Context;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;


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


    public void handleJsonRequest (final TextView textView, String url, final Context context){

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest
                (Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        textView.setText("Response: " + response.toString());
                        HandleJson handleJson = new HandleJson();
                        handleJson.handleTheJson(response.toString());
                    }
                }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {
                        // TODO: Handle error
                        Toast.makeText(context,"Didnt work",Toast.LENGTH_LONG);

                    }
                });

        // Access the RequestQueue through your singleton class.
        MySingleton.getInstance(context).addToRequestQueue(jsonObjectRequest);

    }
}
