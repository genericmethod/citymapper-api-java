package com.citymapper;

import com.citymapper.domain.Points;
import com.citymapper.domain.TravelTime;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface CitymapperService {

  @GET("/traveltime")
  Call<TravelTime> transitTime(@Path("startcoord") String startcoord,
                               @Path("endcoord") String endcoord,
                               @Path("time") String time,
                               @Path("timeType") String timeType,
                               @Path("userKey") String userKey);

  @GET("/singlepointcoverage")
  Call<Points> singlePointCoverage(@Path("coord") String coord, @Path("key") String key);

  @POST("/coverage/?key={key}")
  Call<Points> coverage(@Body Points points, @Path("key") String key);
}
