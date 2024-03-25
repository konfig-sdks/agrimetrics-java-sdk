# ShapefileApi

All URIs are relative to *https://api-test.agrimetrics.co.uk/catalog*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**convertToGeoJson**](ShapefileApi.md#convertToGeoJson) | **POST** /shapefile | Receive a shapefile and return GeoJson |


<a name="convertToGeoJson"></a>
# **convertToGeoJson**
> GeoJSONPolygon convertToGeoJson(body).execute();

Receive a shapefile and return GeoJson

&gt; :warning: **This is an Agrimetrics internal operation. It relies on information which is not exposed externally.**  Receive a shapefile and return GeoJson for explore page 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Agrimetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ShapefileApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-test.agrimetrics.co.uk/catalog";
    
    // Configure HTTP bearer authorization: JWT
    configuration.token = "BEARER TOKEN";
    Agrimetrics client = new Agrimetrics(configuration);
    try {
      GeoJSONPolygon result = client
              .shapefile
              .convertToGeoJson()
              .execute();
      System.out.println(result);
      System.out.println(result.getType());
      System.out.println(result.getCoordinates());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShapefileApi#convertToGeoJson");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GeoJSONPolygon> response = client
              .shapefile
              .convertToGeoJson()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ShapefileApi#convertToGeoJson");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | **File**|  | |

### Return type

[**GeoJSONPolygon**](GeoJSONPolygon.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/zipped-shapefile
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | GeoJSON Polygon |  -  |

