package com.example.bungalovrehberi2;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.Url;

public interface BungalowService {
    @GET("bungalov/liste")
    Call<BungalovList> getBungalows();

    @GET("bungalov/liste")
    Call<BungalovList> getBungalows(@Url String url);
}

