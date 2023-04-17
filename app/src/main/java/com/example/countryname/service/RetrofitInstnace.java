package com.example.countryname.service;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstnace {

    private static Retrofit retrofit = null;
    private static String BASE_URL = "https://api.printful.com/";

    // singleton instance used to create instance of Retrofit
    public static GetCountryDataService getService() {
        if (retrofit == null) {
            retrofit = new Retrofit
                    .Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit.create(GetCountryDataService.class);
    }
}
