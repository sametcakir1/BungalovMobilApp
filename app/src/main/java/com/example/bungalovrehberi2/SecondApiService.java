package com.example.bungalovrehberi2;

import retrofit2.Call;
import retrofit2.http.GET;

public interface SecondApiService {
    @GET("bungalov/detay")
    Call<BungalovDetail> getBungalovDetail();
}
