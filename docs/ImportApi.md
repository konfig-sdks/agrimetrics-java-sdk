# ImportApi

All URIs are relative to *https://api-test.agrimetrics.co.uk/catalog*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**dataSets**](ImportApi.md#dataSets) | **POST** /import |  |


<a name="dataSets"></a>
# **dataSets**
> dataSets().body(body).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Agrimetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ImportApi;
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
      client
              .import
              .dataSets()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ImportApi#dataSets");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .import
              .dataSets()
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ImportApi#dataSets");
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
| **body** | **File**|  | [optional] |

### Return type

null (empty response body)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/vnd.openxmlformats-officedocument.spreadsheetml.sheet
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Import was successful. |  -  |

