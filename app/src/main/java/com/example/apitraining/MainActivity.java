package com.example.apitraining;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.apitraining.src.HandleRequest;

public class MainActivity extends AppCompatActivity {

    TextView mainText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainText = findViewById(R.id.mainText);

        String url = "https://hacker-news.firebaseio.com/v0/item/8863.json";
        HandleRequest handleRequest = new HandleRequest();

        //handleRequest.handleStringRequest(mainText, url, this);
        handleRequest.handleJsonRequest(mainText,url,this);

    }
}
