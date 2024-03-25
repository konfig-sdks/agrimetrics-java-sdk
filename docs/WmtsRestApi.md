# WmtsRestApi

All URIs are relative to *https://api-test.agrimetrics.co.uk/catalog*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**queryTileMatrixSet**](WmtsRestApi.md#queryTileMatrixSet) | **GET** /datasets/{datasetId}/wmts/rest/{layerName}/{style}/{TileMatrixSet}/{TileMatrix}/{TileRow}/{TileCol} | WMTS Service query |
| [**queryTilejsonImageFormat**](WmtsRestApi.md#queryTilejsonImageFormat) | **GET** /datasets/{datasetId}/wmts/rest/{layerName}/{style}/tilejson/{imageFormat} | WMTS Service query |
| [**serviceQuery**](WmtsRestApi.md#serviceQuery) | **GET** /datasets/{datasetId}/wmts/rest/{layerName}/{style}/{TileMatrixSet}/{TileMatrix}/{TileRow}/{TileCol}/{J}/{I} | WMTS Service query |


<a name="queryTileMatrixSet"></a>
# **queryTileMatrixSet**
> String queryTileMatrixSet(datasetId, layerName, style, tileMatrixSet, tileMatrix, tileRow, tileCol, format).execute();

WMTS Service query

Query the given data set with theWMTS standard 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Agrimetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WmtsRestApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-test.agrimetrics.co.uk/catalog";
    Agrimetrics client = new Agrimetrics(configuration);
    UUID datasetId = UUID.randomUUID();
    String layerName = "layerName_example";
    String style = "style_example";
    String tileMatrixSet = "tileMatrixSet_example";
    String tileMatrix = "tileMatrix_example";
    Integer tileRow = 56;
    Integer tileCol = 56;
    String format = "format_example";
    try {
      String result = client
              .wmtsRest
              .queryTileMatrixSet(datasetId, layerName, style, tileMatrixSet, tileMatrix, tileRow, tileCol, format)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WmtsRestApi#queryTileMatrixSet");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .wmtsRest
              .queryTileMatrixSet(datasetId, layerName, style, tileMatrixSet, tileMatrix, tileRow, tileCol, format)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WmtsRestApi#queryTileMatrixSet");
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
| **layerName** | **String**|  | |
| **style** | **String**|  | |
| **tileMatrixSet** | **String**|  | |
| **tileMatrix** | **String**|  | |
| **tileRow** | **Integer**|  | |
| **tileCol** | **Integer**|  | |
| **format** | **String**|  | |

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

<a name="queryTilejsonImageFormat"></a>
# **queryTilejsonImageFormat**
> String queryTilejsonImageFormat(datasetId, layerName, style, imageFormat, format).execute();

WMTS Service query

Query the given data set with theWMTS standard 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Agrimetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WmtsRestApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-test.agrimetrics.co.uk/catalog";
    Agrimetrics client = new Agrimetrics(configuration);
    UUID datasetId = UUID.randomUUID();
    String layerName = "layerName_example";
    String style = "style_example";
    String imageFormat = "imageFormat_example";
    String format = "format_example";
    try {
      String result = client
              .wmtsRest
              .queryTilejsonImageFormat(datasetId, layerName, style, imageFormat, format)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WmtsRestApi#queryTilejsonImageFormat");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .wmtsRest
              .queryTilejsonImageFormat(datasetId, layerName, style, imageFormat, format)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WmtsRestApi#queryTilejsonImageFormat");
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
| **layerName** | **String**|  | |
| **style** | **String**|  | |
| **imageFormat** | **String**|  | |
| **format** | **String**|  | |

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

<a name="serviceQuery"></a>
# **serviceQuery**
> String serviceQuery(datasetId, layerName, style, tileMatrixSet, tileMatrix, tileRow, tileCol, J, I, format).execute();

WMTS Service query

Query the given data set with theWMTS standard 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Agrimetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WmtsRestApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-test.agrimetrics.co.uk/catalog";
    Agrimetrics client = new Agrimetrics(configuration);
    UUID datasetId = UUID.randomUUID();
    String layerName = "layerName_example";
    String style = "style_example";
    String tileMatrixSet = "tileMatrixSet_example";
    String tileMatrix = "tileMatrix_example";
    Integer tileRow = 56;
    Integer tileCol = 56;
    Integer J = 56;
    Integer I = 56;
    String format = "format_example";
    try {
      String result = client
              .wmtsRest
              .serviceQuery(datasetId, layerName, style, tileMatrixSet, tileMatrix, tileRow, tileCol, J, I, format)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WmtsRestApi#serviceQuery");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .wmtsRest
              .serviceQuery(datasetId, layerName, style, tileMatrixSet, tileMatrix, tileRow, tileCol, J, I, format)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WmtsRestApi#serviceQuery");
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
| **layerName** | **String**|  | |
| **style** | **String**|  | |
| **tileMatrixSet** | **String**|  | |
| **tileMatrix** | **String**|  | |
| **tileRow** | **Integer**|  | |
| **tileCol** | **Integer**|  | |
| **J** | **Integer**|  | |
| **I** | **Integer**|  | |
| **format** | **String**|  | |

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

