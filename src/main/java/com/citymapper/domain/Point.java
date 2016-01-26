package com.citymapper.domain;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Point {

  @SerializedName("covered")
  @Expose
  private Boolean covered;
  @SerializedName("coord")
  @Expose
  private List<Double> coord = new ArrayList<Double>();

  /**
   *
   * @return
   * The covered
   */
  public Boolean getCovered() {
    return covered;
  }

  /**
   *
   * @param covered
   * The covered
   */
  public void setCovered(Boolean covered) {
    this.covered = covered;
  }

  /**
   *
   * @return
   * The coord
   */
  public List<Double> getCoord() {
    return coord;
  }

  /**
   *
   * @param coord
   * The coord
   */
  public void setCoord(List<Double> coord) {
    this.coord = coord;
  }

}
