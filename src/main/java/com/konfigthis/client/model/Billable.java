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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * Billable
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Billable {
  public static final String SERIALIZED_NAME_BILLING_DATA_TYPE = "billingDataType";
  @SerializedName(SERIALIZED_NAME_BILLING_DATA_TYPE)
  private String billingDataType;

  public static final String SERIALIZED_NAME_BILLING_CREDIT_TYPE = "billingCreditType";
  @SerializedName(SERIALIZED_NAME_BILLING_CREDIT_TYPE)
  private String billingCreditType;

  public static final String SERIALIZED_NAME_BILLING_CREDIT_COST = "billingCreditCost";
  @SerializedName(SERIALIZED_NAME_BILLING_CREDIT_COST)
  private Double billingCreditCost;

  public Billable() {
  }

  public Billable billingDataType(String billingDataType) {
    
    
    
    
    this.billingDataType = billingDataType;
    return this;
  }

   /**
   * Get billingDataType
   * @return billingDataType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getBillingDataType() {
    return billingDataType;
  }


  public void setBillingDataType(String billingDataType) {
    
    
    
    this.billingDataType = billingDataType;
  }


  public Billable billingCreditType(String billingCreditType) {
    
    
    
    
    this.billingCreditType = billingCreditType;
    return this;
  }

   /**
   * Get billingCreditType
   * @return billingCreditType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getBillingCreditType() {
    return billingCreditType;
  }


  public void setBillingCreditType(String billingCreditType) {
    
    
    
    this.billingCreditType = billingCreditType;
  }


  public Billable billingCreditCost(Double billingCreditCost) {
    
    
    
    
    this.billingCreditCost = billingCreditCost;
    return this;
  }

  public Billable billingCreditCost(Integer billingCreditCost) {
    
    
    
    
    this.billingCreditCost = billingCreditCost.doubleValue();
    return this;
  }

   /**
   * Get billingCreditCost
   * @return billingCreditCost
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Double getBillingCreditCost() {
    return billingCreditCost;
  }


  public void setBillingCreditCost(Double billingCreditCost) {
    
    
    
    this.billingCreditCost = billingCreditCost;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the Billable instance itself
   */
  public Billable putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Billable billable = (Billable) o;
    return Objects.equals(this.billingDataType, billable.billingDataType) &&
        Objects.equals(this.billingCreditType, billable.billingCreditType) &&
        Objects.equals(this.billingCreditCost, billable.billingCreditCost)&&
        Objects.equals(this.additionalProperties, billable.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingDataType, billingCreditType, billingCreditCost, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Billable {\n");
    sb.append("    billingDataType: ").append(toIndentedString(billingDataType)).append("\n");
    sb.append("    billingCreditType: ").append(toIndentedString(billingCreditType)).append("\n");
    sb.append("    billingCreditCost: ").append(toIndentedString(billingCreditCost)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("billingDataType");
    openapiFields.add("billingCreditType");
    openapiFields.add("billingCreditCost");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("billingDataType");
    openapiRequiredFields.add("billingCreditType");
    openapiRequiredFields.add("billingCreditCost");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Billable
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Billable.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Billable is not found in the empty JSON string", Billable.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Billable.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("billingDataType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `billingDataType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("billingDataType").toString()));
      }
      if (!jsonObj.get("billingCreditType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `billingCreditType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("billingCreditType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Billable.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Billable' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Billable> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Billable.class));

       return (TypeAdapter<T>) new TypeAdapter<Billable>() {
           @Override
           public void write(JsonWriter out, Billable value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public Billable read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Billable instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Billable given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Billable
  * @throws IOException if the JSON string is invalid with respect to Billable
  */
  public static Billable fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Billable.class);
  }

 /**
  * Convert an instance of Billable to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

