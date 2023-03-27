package com.example.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * FishingSpots
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-27T10:00:28.709678+02:00[Europe/Warsaw]")
public class FishingSpots {

  @JsonProperty("id")
  private Long id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("longtitude")
  private Float longtitude;

  @JsonProperty("altitude")
  private Float altitude;

  public FishingSpots id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @NotNull 
  @Schema(name = "id", example = "3", requiredMode = Schema.RequiredMode.REQUIRED)
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public FishingSpots name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @NotNull 
  @Schema(name = "name", example = "Olesnica", requiredMode = Schema.RequiredMode.REQUIRED)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FishingSpots longtitude(Float longtitude) {
    this.longtitude = longtitude;
    return this;
  }

  /**
   * Get longtitude
   * @return longtitude
  */
  @NotNull 
  @Schema(name = "longtitude", requiredMode = Schema.RequiredMode.REQUIRED)
  public Float getLongtitude() {
    return longtitude;
  }

  public void setLongtitude(Float longtitude) {
    this.longtitude = longtitude;
  }

  public FishingSpots altitude(Float altitude) {
    this.altitude = altitude;
    return this;
  }

  /**
   * Get altitude
   * @return altitude
  */
  @NotNull 
  @Schema(name = "altitude", requiredMode = Schema.RequiredMode.REQUIRED)
  public Float getAltitude() {
    return altitude;
  }

  public void setAltitude(Float altitude) {
    this.altitude = altitude;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FishingSpots fishingSpots = (FishingSpots) o;
    return Objects.equals(this.id, fishingSpots.id) &&
        Objects.equals(this.name, fishingSpots.name) &&
        Objects.equals(this.longtitude, fishingSpots.longtitude) &&
        Objects.equals(this.altitude, fishingSpots.altitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, longtitude, altitude);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FishingSpots {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    longtitude: ").append(toIndentedString(longtitude)).append("\n");
    sb.append("    altitude: ").append(toIndentedString(altitude)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

