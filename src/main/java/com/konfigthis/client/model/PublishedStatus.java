/*
 * Catalog API
 * This API lists data sets available on Agrimetrics platform.
 *
 * The version of the OpenAPI document: 
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The publication status of this data set. Published data-sets have been approved by an admin
 */
@JsonAdapter(PublishedStatus.Adapter.class)public enum PublishedStatus {
  
  PUBLISHED("published"),
  
  RETIRED("retired");

  private String value;

  PublishedStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PublishedStatus fromValue(String value) {
    for (PublishedStatus b : PublishedStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<PublishedStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final PublishedStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PublishedStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PublishedStatus.fromValue(value);
    }
  }
}

