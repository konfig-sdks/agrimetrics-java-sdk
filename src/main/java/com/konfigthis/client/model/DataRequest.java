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
import java.io.File;
import java.io.IOException;
import java.util.UUID;

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
 * DataRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class DataRequest {
  public static final String SERIALIZED_NAME_PROJECT_NAME = "projectName";
  @SerializedName(SERIALIZED_NAME_PROJECT_NAME)
  private String projectName;

  public static final String SERIALIZED_NAME_PROJECT_MANAGER_NAME = "projectManagerName";
  @SerializedName(SERIALIZED_NAME_PROJECT_MANAGER_NAME)
  private String projectManagerName;

  public static final String SERIALIZED_NAME_PROJECT_MANAGER_EMAIL = "projectManagerEmail";
  @SerializedName(SERIALIZED_NAME_PROJECT_MANAGER_EMAIL)
  private String projectManagerEmail;

  public static final String SERIALIZED_NAME_DATASET_ID = "datasetId";
  @SerializedName(SERIALIZED_NAME_DATASET_ID)
  private UUID datasetId;

  public static final String SERIALIZED_NAME_DATASET_NAME = "datasetName";
  @SerializedName(SERIALIZED_NAME_DATASET_NAME)
  private String datasetName;

  public static final String SERIALIZED_NAME_GEO_JSON_A_O_I = "geoJsonAOI";
  @SerializedName(SERIALIZED_NAME_GEO_JSON_A_O_I)
  private String geoJsonAOI;

  public static final String SERIALIZED_NAME_SHAPEFILE_A_O_I = "shapefileAOI";
  @SerializedName(SERIALIZED_NAME_SHAPEFILE_A_O_I)
  private File shapefileAOI;

  /**
   * The format the user would like the data to be provided in
   */
  @JsonAdapter(RequestedFormatEnum.Adapter.class)
 public enum RequestedFormatEnum {
    APPLICATION_GEO_JSON("application/geo+json"),
    
    APPLICATION_GML_XML_VERSION_3_2("application/gml+xml; version=3.2"),
    
    APPLICATION_VND_GOOGLE_EARTH_KML_XML("application/vnd.google-earth.kml+xml"),
    
    APPLICATION_ZIPPED_SHAPEFILE("application/zipped-shapefile"),
    
    APPLICATION_X_GDB_ZIP("application/x.gdb+zip"),
    
    APPLICATION_X_MID_MIF_ZIP("application/x.mid-mif+zip"),
    
    APPLICATION_X_TAB_ZIP("application/x.tab+zip"),
    
    APPLICATION_DXF("application/dxf"),
    
    IMAGE_TIFF("image/tiff");

    private String value;

    RequestedFormatEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RequestedFormatEnum fromValue(String value) {
      for (RequestedFormatEnum b : RequestedFormatEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RequestedFormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RequestedFormatEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RequestedFormatEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RequestedFormatEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_REQUESTED_FORMAT = "requestedFormat";
  @SerializedName(SERIALIZED_NAME_REQUESTED_FORMAT)
  private RequestedFormatEnum requestedFormat;

  public DataRequest() {
  }

  public DataRequest projectName(String projectName) {
    
    
    
    
    this.projectName = projectName;
    return this;
  }

   /**
   * The name of the project the data is for
   * @return projectName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of the project the data is for")

  public String getProjectName() {
    return projectName;
  }


  public void setProjectName(String projectName) {
    
    
    
    this.projectName = projectName;
  }


  public DataRequest projectManagerName(String projectManagerName) {
    
    
    
    
    this.projectManagerName = projectManagerName;
    return this;
  }

   /**
   * The name of the project manager who can approve the request
   * @return projectManagerName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of the project manager who can approve the request")

  public String getProjectManagerName() {
    return projectManagerName;
  }


  public void setProjectManagerName(String projectManagerName) {
    
    
    
    this.projectManagerName = projectManagerName;
  }


  public DataRequest projectManagerEmail(String projectManagerEmail) {
    
    
    
    
    this.projectManagerEmail = projectManagerEmail;
    return this;
  }

   /**
   * The email address of the project manager who can approve the request
   * @return projectManagerEmail
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The email address of the project manager who can approve the request")

  public String getProjectManagerEmail() {
    return projectManagerEmail;
  }


  public void setProjectManagerEmail(String projectManagerEmail) {
    
    
    
    this.projectManagerEmail = projectManagerEmail;
  }


  public DataRequest datasetId(UUID datasetId) {
    
    
    
    
    this.datasetId = datasetId;
    return this;
  }

   /**
   * The ID of the dataset that the data request relates to
   * @return datasetId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The ID of the dataset that the data request relates to")

  public UUID getDatasetId() {
    return datasetId;
  }


  public void setDatasetId(UUID datasetId) {
    
    
    
    this.datasetId = datasetId;
  }


  public DataRequest datasetName(String datasetName) {
    
    
    
    
    this.datasetName = datasetName;
    return this;
  }

   /**
   * The name of the dataset that the data request relates to
   * @return datasetName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of the dataset that the data request relates to")

  public String getDatasetName() {
    return datasetName;
  }


  public void setDatasetName(String datasetName) {
    
    
    
    this.datasetName = datasetName;
  }


  public DataRequest geoJsonAOI(String geoJsonAOI) {
    
    
    
    
    this.geoJsonAOI = geoJsonAOI;
    return this;
  }

   /**
   * The area of interest that the user is requesting access to as a stringified GeoJSON
   * @return geoJsonAOI
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The area of interest that the user is requesting access to as a stringified GeoJSON")

  public String getGeoJsonAOI() {
    return geoJsonAOI;
  }


  public void setGeoJsonAOI(String geoJsonAOI) {
    
    
    
    this.geoJsonAOI = geoJsonAOI;
  }


  public DataRequest shapefileAOI(File shapefileAOI) {
    
    
    
    
    this.shapefileAOI = shapefileAOI;
    return this;
  }

   /**
   * The area of interest that the user is requesting access to as a zipped shapefile
   * @return shapefileAOI
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The area of interest that the user is requesting access to as a zipped shapefile")

  public File getShapefileAOI() {
    return shapefileAOI;
  }


  public void setShapefileAOI(File shapefileAOI) {
    
    
    
    this.shapefileAOI = shapefileAOI;
  }


  public DataRequest requestedFormat(RequestedFormatEnum requestedFormat) {
    
    
    
    
    this.requestedFormat = requestedFormat;
    return this;
  }

   /**
   * The format the user would like the data to be provided in
   * @return requestedFormat
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The format the user would like the data to be provided in")

  public RequestedFormatEnum getRequestedFormat() {
    return requestedFormat;
  }


  public void setRequestedFormat(RequestedFormatEnum requestedFormat) {
    
    
    
    this.requestedFormat = requestedFormat;
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
   * @return the DataRequest instance itself
   */
  public DataRequest putAdditionalProperty(String key, Object value) {
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
    DataRequest dataRequest = (DataRequest) o;
    return Objects.equals(this.projectName, dataRequest.projectName) &&
        Objects.equals(this.projectManagerName, dataRequest.projectManagerName) &&
        Objects.equals(this.projectManagerEmail, dataRequest.projectManagerEmail) &&
        Objects.equals(this.datasetId, dataRequest.datasetId) &&
        Objects.equals(this.datasetName, dataRequest.datasetName) &&
        Objects.equals(this.geoJsonAOI, dataRequest.geoJsonAOI) &&
        Objects.equals(this.shapefileAOI, dataRequest.shapefileAOI) &&
        Objects.equals(this.requestedFormat, dataRequest.requestedFormat)&&
        Objects.equals(this.additionalProperties, dataRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectName, projectManagerName, projectManagerEmail, datasetId, datasetName, geoJsonAOI, shapefileAOI, requestedFormat, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataRequest {\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    projectManagerName: ").append(toIndentedString(projectManagerName)).append("\n");
    sb.append("    projectManagerEmail: ").append(toIndentedString(projectManagerEmail)).append("\n");
    sb.append("    datasetId: ").append(toIndentedString(datasetId)).append("\n");
    sb.append("    datasetName: ").append(toIndentedString(datasetName)).append("\n");
    sb.append("    geoJsonAOI: ").append(toIndentedString(geoJsonAOI)).append("\n");
    sb.append("    shapefileAOI: ").append(toIndentedString(shapefileAOI)).append("\n");
    sb.append("    requestedFormat: ").append(toIndentedString(requestedFormat)).append("\n");
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
    openapiFields.add("projectName");
    openapiFields.add("projectManagerName");
    openapiFields.add("projectManagerEmail");
    openapiFields.add("datasetId");
    openapiFields.add("datasetName");
    openapiFields.add("geoJsonAOI");
    openapiFields.add("shapefileAOI");
    openapiFields.add("requestedFormat");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("projectName");
    openapiRequiredFields.add("projectManagerName");
    openapiRequiredFields.add("projectManagerEmail");
    openapiRequiredFields.add("datasetId");
    openapiRequiredFields.add("datasetName");
    openapiRequiredFields.add("requestedFormat");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DataRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DataRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DataRequest is not found in the empty JSON string", DataRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DataRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("projectName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `projectName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("projectName").toString()));
      }
      if (!jsonObj.get("projectManagerName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `projectManagerName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("projectManagerName").toString()));
      }
      if (!jsonObj.get("projectManagerEmail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `projectManagerEmail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("projectManagerEmail").toString()));
      }
      if (!jsonObj.get("datasetId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `datasetId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("datasetId").toString()));
      }
      if (!jsonObj.get("datasetName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `datasetName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("datasetName").toString()));
      }
      if ((jsonObj.get("geoJsonAOI") != null && !jsonObj.get("geoJsonAOI").isJsonNull()) && !jsonObj.get("geoJsonAOI").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `geoJsonAOI` to be a primitive type in the JSON string but got `%s`", jsonObj.get("geoJsonAOI").toString()));
      }
      if (!jsonObj.get("requestedFormat").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `requestedFormat` to be a primitive type in the JSON string but got `%s`", jsonObj.get("requestedFormat").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DataRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DataRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DataRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DataRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<DataRequest>() {
           @Override
           public void write(JsonWriter out, DataRequest value) throws IOException {
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
           public DataRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             DataRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of DataRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DataRequest
  * @throws IOException if the JSON string is invalid with respect to DataRequest
  */
  public static DataRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DataRequest.class);
  }

 /**
  * Convert an instance of DataRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

