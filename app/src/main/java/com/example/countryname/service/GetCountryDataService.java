package com.example.countryname.service;

import com.example.countryname.model.Result;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetCountryDataService {
    @GET("countries")
    Call<Result> getResult();

}
