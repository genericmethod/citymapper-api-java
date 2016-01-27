package com.citymapper;

import com.citymapper.domain.TravelTime;

import java.io.IOException;

import retrofit2.Retrofit;

public class Citymapper {

  private String apiKey;
  private CitymapperService citymapperService;

  public Citymapper(String apiKey) {
    this.apiKey = apiKey;
    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://developer.citymapper.com/api/1")
            .build();
    this.citymapperService = retrofit.create(CitymapperService.class);
  }

  public TravelTime transitTime(String startcoord, String endcoord, String time, String timeType) throws CitymapperApiException {
    try {
      return citymapperService.transitTime(startcoord, endcoord, time, timeType, apiKey).execute().body();
    } catch (IOException e) {
     throw new CitymapperApiException();
    }
  }

}
