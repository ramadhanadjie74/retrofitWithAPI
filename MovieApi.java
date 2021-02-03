package com.example.ezcommerce5;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MovieApi {
    @GET("v3/582112ae-29de-418c-bef3-a8c5b0336900")
    Call<List<Movie>>getMovies();
}
