package com.example.myapplication.tuan4;

import android.content.Context;
import android.view.PixelCopy;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.JsonObject;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.net.IDN;

public class tuan41volleyfn{
    String strJSON="";
    public void getJsonArrayofObject(Context context, TextView textView){
        RequestQueue queue = Volley.newRequestQueue(context);
        String url="https://batdongsanabc.000webhostapp.com/thanglong/array_json_new.json";
        JsonArrayRequest request = new JsonArrayRequest(url,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        for (int i=0;i<response.length();i++){
                            try {
                                JSONObject person =response.getJSONObject(i);
                                String id=person.getString("id");
                                String name=person.getString("name");
                                String email=person.getString("email");
                                String gender=person.getString("gender");

                                strJSON+= "Id: "+id+"\n";
                                strJSON+= "Name: "+name+"\t";
                                strJSON+= "gender: "+gender+"\n";
                                strJSON+= "email: "+email+"\n";

                            } catch (JSONException e) {
                                throw new RuntimeException(e);
                            }
                            textView.setText(strJSON);

                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                textView.setText(error.getMessage());
            }
        });
        queue.add(request);
    }
}
