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
 * Gets or Sets Entitlement
 */
@JsonAdapter(Entitlement.Adapter.class)public enum Entitlement {
  
  READ("read"),
  
  WRITE("write"),
  
  GRANT("grant");

  private String value;

  Entitlement(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Entitlement fromValue(String value) {
    for (Entitlement b : Entitlement.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<Entitlement> {
    @Override
    public void write(final JsonWriter jsonWriter, final Entitlement enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Entitlement read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Entitlement.fromValue(value);
    }
  }
}

