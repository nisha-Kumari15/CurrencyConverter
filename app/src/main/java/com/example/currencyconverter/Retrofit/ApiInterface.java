package com.example.currencyconverter.Retrofit;

import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiInterface {
       @GET("v4/latest/{option}")
       Call<JsonObject> getConverted(@Path("option") String option);
}
