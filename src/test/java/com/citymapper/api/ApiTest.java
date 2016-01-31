package com.citymapper.api;

import com.citymapper.client.ApiClient;
import com.citymapper.model.Coverage;
import com.citymapper.model.Point;
import com.citymapper.model.TravelTime;
import org.junit.Test;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import retrofit.Retrofit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;


public class ApiTest {

  @Test
  public void traveltimeGet() throws IOException {
    Retrofit retrofit = new ApiClient("apikey","561b831b3b0cb3a98d9bba92397c7a34").getAdapterBuilder().build();
    TravelTimeApi travelTimeApi = retrofit.create(TravelTimeApi.class);
    final TravelTime time = travelTimeApi.traveltimeGet("51.5258156,-0.08833669999999999",
            "51.5094,-0.002124",
            null,
            null).execute().body();
    assertNotNull(time);

  }

  @Test
  public void singlePointCoverageGet() throws IOException {
    Retrofit retrofit = new ApiClient("apikey","561b831b3b0cb3a98d9bba92397c7a34").getAdapterBuilder().build();
    CoverageApi coverageApi = retrofit.create(CoverageApi.class);
    final Coverage coverage = coverageApi.singlepointcoverageGet("51.5258156,-0.08833669999999999").execute().body();
    assertNotNull(coverage);
    assertTrue(coverage.getPoints().get(0).getCovered());
  }

  @Test
  public void coveragePost() throws IOException {
    Retrofit retrofit = new ApiClient("apikey","561b831b3b0cb3a98d9bba92397c7a34").getAdapterBuilder().build();
    CoverageApi coverageApi = retrofit.create(CoverageApi.class);

    Coverage coverage = new Coverage();
    List<Point> points = new ArrayList<Point>();
    Point londonPoint = new Point();
    londonPoint.setCoord(Arrays.asList(51.5072,0.1275));
    points.add(londonPoint);
    Point pyongyangPoint = new Point();
    pyongyangPoint.setCoord(Arrays.asList(39.0194, 125.7381));
    pyongyangPoint.setId("Pyongyang");
    points.add(pyongyangPoint);

    coverage.setPoints(points);

    final Coverage coverageResult = coverageApi.coveragePost(coverage).execute().body();
    assertNotNull(coverageResult);
    assertTrue(coverageResult.getPoints().get(0).getCovered());
    assertFalse(coverageResult.getPoints().get(1).getCovered());
    assertEquals("Pyongyang", coverageResult.getPoints().get(1).getId());
  }
}
