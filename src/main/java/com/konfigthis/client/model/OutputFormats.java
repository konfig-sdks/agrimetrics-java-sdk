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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets OutputFormats
 */
@JsonAdapter(OutputFormats.Adapter.class)public enum OutputFormats {
  
  SHAPE_ZIP("shape-zip"),
  
  APPLICATION_JSON("application/json"),
  
  CSV("csv"),
  
  GML3("GML3"),
  
  IMAGE_TIFF("image/tiff"),
  
  KML("KML"),
  
  OGR_GDB("OGR-GDB"),
  
  OGR_MIF("OGR-MIF"),
  
  OGR_TAB("OGR-TAB"),
  
  DXF("DXF");

  private String value;

  OutputFormats(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OutputFormats fromValue(String value) {
    for (OutputFormats b : OutputFormats.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<OutputFormats> {
    @Override
    public void write(final JsonWriter jsonWriter, final OutputFormats enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public OutputFormats read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return OutputFormats.fromValue(value);
    }
  }
}

