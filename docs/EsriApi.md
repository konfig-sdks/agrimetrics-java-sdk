# EsriApi

All URIs are relative to *https://api-test.agrimetrics.co.uk/catalog*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**restServiceQuery**](EsriApi.md#restServiceQuery) | **GET** /rest/services/{datasetId}/{paramOne} | ESRI REST Service query |
| [**restServiceQuery_0**](EsriApi.md#restServiceQuery_0) | **GET** /rest/services/{datasetId}/{paramOne}/{paramTwo} | ESRI REST Service query |


<a name="restServiceQuery"></a>
# **restServiceQuery**
> String restServiceQuery(datasetId, paramOne).execute();

ESRI REST Service query

Query the given dataset using ESRI Rest Services 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Agrimetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EsriApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-test.agrimetrics.co.uk/catalog";
    Agrimetrics client = new Agrimetrics(configuration);
    UUID datasetId = UUID.randomUUID();
    String paramOne = "paramOne_example"; // Additional path element
    try {
      String result = client
              .esri
              .restServiceQuery(datasetId, paramOne)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling EsriApi#restServiceQuery");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .esri
              .restServiceQuery(datasetId, paramOne)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EsriApi#restServiceQuery");
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
| **datasetId** | **UUID**|  | |
| **paramOne** | **String**| Additional path element | |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="restServiceQuery_0"></a>
# **restServiceQuery_0**
> String restServiceQuery_0(datasetId, paramOne, paramTwo).execute();

ESRI REST Service query

Query the given dataset using ESRI Rest Services 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Agrimetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EsriApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-test.agrimetrics.co.uk/catalog";
    Agrimetrics client = new Agrimetrics(configuration);
    UUID datasetId = UUID.randomUUID();
    String paramOne = "paramOne_example"; // Additional path element
    String paramTwo = "paramTwo_example"; // Additional path element
    try {
      String result = client
              .esri
              .restServiceQuery_0(datasetId, paramOne, paramTwo)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling EsriApi#restServiceQuery_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .esri
              .restServiceQuery_0(datasetId, paramOne, paramTwo)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EsriApi#restServiceQuery_0");
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
| **datasetId** | **UUID**|  | |
| **paramOne** | **String**| Additional path element | |
| **paramTwo** | **String**| Additional path element | |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

