package com.citymapper.domain;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Points {

  @SerializedName("points")
  @Expose
  private List<Point> points = new ArrayList<Point>();

  /**
   *
   * @return
   * The points
   */
  public List<Point> getPoints() {
    return points;
  }

  /**
   *
   * @param points
   * The points
   */
  public void setPoints(List<Point> points) {
    this.points = points;
  }

}