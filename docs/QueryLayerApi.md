# QueryLayerApi

All URIs are relative to *https://api-test.agrimetrics.co.uk/catalog*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**calculateCost**](QueryLayerApi.md#calculateCost) | **POST** /layers/{layerId}/search/cost | Calculate query cost |
| [**calculateStatisticsWithinGeometry**](QueryLayerApi.md#calculateStatisticsWithinGeometry) | **POST** /layers/{layerId}/search/statistics | Get layer statistics |
| [**cutShapeBoundaryAndRetrieve**](QueryLayerApi.md#cutShapeBoundaryAndRetrieve) | **POST** /query | Query and download sections of one or more layers |
| [**metadata**](QueryLayerApi.md#metadata) | **GET** /layers/{layerId} | Get layer metadata |
| [**searchGeometry**](QueryLayerApi.md#searchGeometry) | **POST** /layers/{layerId}/search | Search within layer |


<a name="calculateCost"></a>
# **calculateCost**
> CostSummary calculateCost(layerId, body).execute();

Calculate query cost

Find out the cost of searching a specific geometry within a layer. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Agrimetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.QueryLayerApi;
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
    UUID layerId = UUID.randomUUID();
    try {
      CostSummary result = client
              .queryLayer
              .calculateCost(layerId)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotalCost());
      System.out.println(result.getNumberOfChargeableItems());
      System.out.println(result.getTotalNumberOfItems());
    } catch (ApiException e) {
      System.err.println("Exception when calling QueryLayerApi#calculateCost");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CostSummary> response = client
              .queryLayer
              .calculateCost(layerId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling QueryLayerApi#calculateCost");
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
| **layerId** | **UUID**|  | |
| **body** | **Object**|  | |

### Return type

[**CostSummary**](CostSummary.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful. Retrieved the requested geometry in the default/specified format. |  -  |

<a name="calculateStatisticsWithinGeometry"></a>
# **calculateStatisticsWithinGeometry**
> Statistics calculateStatisticsWithinGeometry(layerId, queryLayerCalculateStatisticsWithinGeometryRequest).execute();

Get layer statistics

&gt; :warning: Search geometries are currently limited to areas up to 500 square km.  Calculates basic statistics of the raster layer within the specified geometry (and optionally time). 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Agrimetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.QueryLayerApi;
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
    Object geometry = null;
    UUID layerId = UUID.randomUUID();
    OffsetDateTime time = OffsetDateTime.now();
    try {
      Statistics result = client
              .queryLayer
              .calculateStatisticsWithinGeometry(geometry, layerId)
              .time(time)
              .execute();
      System.out.println(result);
      System.out.println(result.getBands());
    } catch (ApiException e) {
      System.err.println("Exception when calling QueryLayerApi#calculateStatisticsWithinGeometry");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Statistics> response = client
              .queryLayer
              .calculateStatisticsWithinGeometry(geometry, layerId)
              .time(time)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling QueryLayerApi#calculateStatisticsWithinGeometry");
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
| **layerId** | **UUID**|  | |
| **queryLayerCalculateStatisticsWithinGeometryRequest** | [**QueryLayerCalculateStatisticsWithinGeometryRequest**](QueryLayerCalculateStatisticsWithinGeometryRequest.md)|  | |

### Return type

[**Statistics**](Statistics.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful. Retrieved the requested statistics for the specified geometry |  -  |

<a name="cutShapeBoundaryAndRetrieve"></a>
# **cutShapeBoundaryAndRetrieve**
> File cutShapeBoundaryAndRetrieve(layer).body(body).execute();

Query and download sections of one or more layers

Cut one or more layers to a shape boundary and retrieve the features as multiple layers in a single downloadable file

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Agrimetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.QueryLayerApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-test.agrimetrics.co.uk/catalog";
    Agrimetrics client = new Agrimetrics(configuration);
    List<UUID> layer = Arrays.asList(); // A layer to query
    try {
      File result = client
              .queryLayer
              .cutShapeBoundaryAndRetrieve(layer)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling QueryLayerApi#cutShapeBoundaryAndRetrieve");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<File> response = client
              .queryLayer
              .cutShapeBoundaryAndRetrieve(layer)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling QueryLayerApi#cutShapeBoundaryAndRetrieve");
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
| **layer** | [**List&lt;UUID&gt;**](UUID.md)| A layer to query | |
| **body** | **Object**|  | [optional] |

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/geo+json, application/zipped-shapefile
 - **Accept**: application/geo+json, application/gml+xml; version=3.2, application/vnd.google-earth.kml+xml, application/zipped-shapefile, application/x.gdb+zip, application/x.mid-mif+zip, application/x.tab+zip, application/dxf, application/dxf+zip, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Result |  -  |

<a name="metadata"></a>
# **metadata**
> QueryLayerMetadataResponse metadata(layerId).execute();

Get layer metadata

Get the metadata for a given layer, including the geospatial extent. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Agrimetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.QueryLayerApi;
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
    UUID layerId = UUID.randomUUID();
    try {
      QueryLayerMetadataResponse result = client
              .queryLayer
              .metadata(layerId)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getLayerId());
      System.out.println(result.getLinks());
      System.out.println(result.getGeometry());
      System.out.println(result.getTimes());
      System.out.println(result.getOutputFormats());
    } catch (ApiException e) {
      System.err.println("Exception when calling QueryLayerApi#metadata");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<QueryLayerMetadataResponse> response = client
              .queryLayer
              .metadata(layerId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling QueryLayerApi#metadata");
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
| **layerId** | **UUID**|  | |

### Return type

[**QueryLayerMetadataResponse**](QueryLayerMetadataResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful. Retreived the geospatial and temporal descriptions of the layer |  -  |

<a name="searchGeometry"></a>
# **searchGeometry**
> File searchGeometry(layerId, body).execute();

Search within layer

&gt; :warning: Search geometries are currently limited to areas up to 500 square km.  Search a specific geometry within a layer. You can optionally specify a time range and/or choose the format of the response (file type, or json). 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Agrimetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.QueryLayerApi;
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
    UUID layerId = UUID.randomUUID();
    try {
      File result = client
              .queryLayer
              .searchGeometry(layerId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling QueryLayerApi#searchGeometry");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<File> response = client
              .queryLayer
              .searchGeometry(layerId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling QueryLayerApi#searchGeometry");
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
| **layerId** | **UUID**|  | |
| **body** | **Object**|  | |

### Return type

[**File**](File.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful. Retrieved the requested geometry in the default/specified format. |  -  |

