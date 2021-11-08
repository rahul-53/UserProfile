package com.example.userprofile.models.remote;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetworkResponse {
    private static final String BASE_URL = " https://randomuser.me/";

    public static Retrofit getResult(){
        Retrofit retrofit =  new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(new OkHttpClient.Builder().build())
                .build();
        return  retrofit;
    }
}
