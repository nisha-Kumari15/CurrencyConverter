package com.example.currencyconverter.Retrofit;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

    public class ApiClient {
        public static Retrofit retrofit;
        public static final String BASE_URL = "https://api.exchangerate-api.com/";
        public static Retrofit getRetrofitInstance(){
            if (retrofit == null) {
                retrofit = new Retrofit.Builder()
                        .baseUrl(BASE_URL)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();
            }
            return retrofit;
        }
    }


