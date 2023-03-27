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
 * FishingData
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-27T10:00:28.709678+02:00[Europe/Warsaw]")
public class FishingData {

  @JsonProperty("id")
  private Long id;

  @JsonProperty("genus")
  private String genus;

  @JsonProperty("longtitude")
  private Float longtitude;

  @JsonProperty("altitude")
  private Float altitude;

  @JsonProperty("length")
  private Long length;

  @JsonProperty("weight")
  private Long weight;

  @JsonProperty("fishingSpot")
  private String fishingSpot;

  public FishingData id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @NotNull 
  @Schema(name = "id", example = "15", requiredMode = Schema.RequiredMode.REQUIRED)
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public FishingData genus(String genus) {
    this.genus = genus;
    return this;
  }

  /**
   * Get genus
   * @return genus
  */
  @NotNull 
  @Schema(name = "genus", example = "Cyprinus", requiredMode = Schema.RequiredMode.REQUIRED)
  public String getGenus() {
    return genus;
  }

  public void setGenus(String genus) {
    this.genus = genus;
  }

  public FishingData longtitude(Float longtitude) {
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

  public FishingData altitude(Float altitude) {
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

  public FishingData length(Long length) {
    this.length = length;
    return this;
  }

  /**
   * Get length
   * @return length
  */
  @NotNull 
  @Schema(name = "length", requiredMode = Schema.RequiredMode.REQUIRED)
  public Long getLength() {
    return length;
  }

  public void setLength(Long length) {
    this.length = length;
  }

  public FishingData weight(Long weight) {
    this.weight = weight;
    return this;
  }

  /**
   * Get weight
   * @return weight
  */
  @NotNull 
  @Schema(name = "weight", requiredMode = Schema.RequiredMode.REQUIRED)
  public Long getWeight() {
    return weight;
  }

  public void setWeight(Long weight) {
    this.weight = weight;
  }

  public FishingData fishingSpot(String fishingSpot) {
    this.fishingSpot = fishingSpot;
    return this;
  }

  /**
   * Get fishingSpot
   * @return fishingSpot
  */
  @NotNull 
  @Schema(name = "fishingSpot", requiredMode = Schema.RequiredMode.REQUIRED)
  public String getFishingSpot() {
    return fishingSpot;
  }

  public void setFishingSpot(String fishingSpot) {
    this.fishingSpot = fishingSpot;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FishingData fishingData = (FishingData) o;
    return Objects.equals(this.id, fishingData.id) &&
        Objects.equals(this.genus, fishingData.genus) &&
        Objects.equals(this.longtitude, fishingData.longtitude) &&
        Objects.equals(this.altitude, fishingData.altitude) &&
        Objects.equals(this.length, fishingData.length) &&
        Objects.equals(this.weight, fishingData.weight) &&
        Objects.equals(this.fishingSpot, fishingData.fishingSpot);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, genus, longtitude, altitude, length, weight, fishingSpot);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FishingData {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    genus: ").append(toIndentedString(genus)).append("\n");
    sb.append("    longtitude: ").append(toIndentedString(longtitude)).append("\n");
    sb.append("    altitude: ").append(toIndentedString(altitude)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    fishingSpot: ").append(toIndentedString(fishingSpot)).append("\n");
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

