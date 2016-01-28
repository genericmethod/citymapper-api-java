package com.citymapper.api;

import com.citymapper.client.ApiClient;
import com.citymapper.model.TravelTime;
import org.junit.Test;
import java.io.IOException;
import retrofit.Retrofit;
import static org.junit.Assert.assertNotNull;


public class ApiTest {

  @Test
  public void traveltimeGet() throws IOException {
    Retrofit retrofit = new ApiClient().getAdapterBuilder().build();
    TravelTimeApi travelTimeApi = retrofit.create(TravelTimeApi.class);
    final TravelTime time = travelTimeApi.traveltimeGet("51.5258156,-0.08833669999999999",
            "51.5094,-0.002124",
            null,
            null,
            "561b831b3b0cb3a98d9bba92397c7a34").execute().body();
    assertNotNull(time);

  }
}
