package com.citymapper;

import com.citymapper.domain.TravelTime;

import retrofit2.Call;
import retrofit2.Retrofit;

public class Citymapper {

  private String apiKey;
  private Retrofit retrofit;

  public Citymapper(String apiKey) {
    this.apiKey = apiKey;
    this.retrofit = new Retrofit.Builder()
            .baseUrl("https://developer.citymapper.com/api/1")
            .build();
  }

  public Call<TravelTime> transitTime(String startcoord, String endcoord, String time, String timeType) {
    CitymapperService service = retrofit.create(CitymapperService.class);
    return service.transitTime(startcoord, endcoord, time, timeType, apiKey);
  }

}
