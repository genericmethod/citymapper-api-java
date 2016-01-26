
package com.citymapper.domain;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Diagnostic {

  @SerializedName("milliseconds")
  @Expose
  private Integer milliseconds;

  /**
   *
   * @return
   * The milliseconds
   */
  public Integer getMilliseconds() {
    return milliseconds;
  }

  /**
   *
   * @param milliseconds
   * The milliseconds
   */
  public void setMilliseconds(Integer milliseconds) {
    this.milliseconds = milliseconds;
  }

}
