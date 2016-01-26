package com.citymapper.domain;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class TravelTime {

  @SerializedName("travel_time_minutes")
  @Expose
  private Integer travelTimeMinutes;
  @SerializedName("diagnostic")
  @Expose
  private Diagnostic diagnostic;

  /**
   * @return The travelTimeMinutes
   */
  public Integer getTravelTimeMinutes() {
    return travelTimeMinutes;
  }

  /**
   * @param travelTimeMinutes The travel_time_minutes
   */
  public void setTravelTimeMinutes(Integer travelTimeMinutes) {
    this.travelTimeMinutes = travelTimeMinutes;
  }

  /**
   * @return The diagnostic
   */
  public Diagnostic getDiagnostic() {
    return diagnostic;
  }

  /**
   * @param diagnostic The diagnostic
   */
  public void setDiagnostic(Diagnostic diagnostic) {
    this.diagnostic = diagnostic;
  }

}