# OgcApiTilesApi

All URIs are relative to *https://api-test.agrimetrics.co.uk/catalog*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getConformance**](OgcApiTilesApi.md#getConformance) | **GET** /datasets/{datasetId}/ogc/tiles/v1/conformance | OGC API Tiles query |
| [**getQueryTilesCollection**](OgcApiTilesApi.md#getQueryTilesCollection) | **GET** /datasets/{datasetId}/ogc/tiles/v1/collections/{collectionId}/map/tiles/{tileMatrixSetId}/{tileMatrix}/{tileRow}/{tileCol} | OGC API Tiles query |
| [**getTilesCollection**](OgcApiTilesApi.md#getTilesCollection) | **GET** /datasets/{datasetId}/ogc/tiles/v1/collections/{collectionId}/tiles/{tileMatrixSetId} | OGC API Tiles query |
| [**queryCollectionById**](OgcApiTilesApi.md#queryCollectionById) | **GET** /datasets/{datasetId}/ogc/tiles/v1/collections/{collectionId} | OGC API Tiles query |
| [**queryCollectionQueryables**](OgcApiTilesApi.md#queryCollectionQueryables) | **GET** /datasets/{datasetId}/ogc/tiles/v1/collections/{collectionId}/queryables | OGC API Tiles query |
| [**queryCollections**](OgcApiTilesApi.md#queryCollections) | **GET** /datasets/{datasetId}/ogc/tiles/v1/collections | OGC API Tiles query |
| [**queryTileMatrixSets**](OgcApiTilesApi.md#queryTileMatrixSets) | **GET** /datasets/{datasetId}/ogc/tiles/v1/tileMatrixSets | OGC API Tiles query |
| [**queryTileMatrixSets_0**](OgcApiTilesApi.md#queryTileMatrixSets_0) | **GET** /datasets/{datasetId}/ogc/tiles/v1/tileMatrixSets/{tileMatrixSetId} | OGC API Tiles query |
| [**queryTilesV1**](OgcApiTilesApi.md#queryTilesV1) | **GET** /datasets/{datasetId}/ogc/tiles/v1 | OGC API Tiles query |


<a name="getConformance"></a>
# **getConformance**
> String getConformance(datasetId).execute();

OGC API Tiles query

Query the given data set with OGC API Tiles standard 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Agrimetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OgcApiTilesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-test.agrimetrics.co.uk/catalog";
    Agrimetrics client = new Agrimetrics(configuration);
    UUID datasetId = UUID.randomUUID();
    try {
      String result = client
              .ogcApiTiles
              .getConformance(datasetId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OgcApiTilesApi#getConformance");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .ogcApiTiles
              .getConformance(datasetId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OgcApiTilesApi#getConformance");
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

<a name="getQueryTilesCollection"></a>
# **getQueryTilesCollection**
> String getQueryTilesCollection(datasetId, collectionId, tileMatrixSetId, tileMatrix, tileRow, tileCol, f).execute();

OGC API Tiles query

Query the given data set with OGC API Tiles standard 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Agrimetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OgcApiTilesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-test.agrimetrics.co.uk/catalog";
    Agrimetrics client = new Agrimetrics(configuration);
    UUID datasetId = UUID.randomUUID();
    String collectionId = "collectionId_example";
    String tileMatrixSetId = "tileMatrixSetId_example";
    String tileMatrix = "tileMatrix_example";
    Integer tileRow = 56;
    Integer tileCol = 56;
    String f = "f_example";
    try {
      String result = client
              .ogcApiTiles
              .getQueryTilesCollection(datasetId, collectionId, tileMatrixSetId, tileMatrix, tileRow, tileCol, f)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OgcApiTilesApi#getQueryTilesCollection");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .ogcApiTiles
              .getQueryTilesCollection(datasetId, collectionId, tileMatrixSetId, tileMatrix, tileRow, tileCol, f)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OgcApiTilesApi#getQueryTilesCollection");
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
| **collectionId** | **String**|  | |
| **tileMatrixSetId** | **String**|  | |
| **tileMatrix** | **String**|  | |
| **tileRow** | **Integer**|  | |
| **tileCol** | **Integer**|  | |
| **f** | **String**|  | |

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

<a name="getTilesCollection"></a>
# **getTilesCollection**
> String getTilesCollection(datasetId, collectionId, tileMatrixSetId).execute();

OGC API Tiles query

Query the given data set with OGC API Tiles standard 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Agrimetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OgcApiTilesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-test.agrimetrics.co.uk/catalog";
    Agrimetrics client = new Agrimetrics(configuration);
    UUID datasetId = UUID.randomUUID();
    String collectionId = "collectionId_example";
    String tileMatrixSetId = "tileMatrixSetId_example";
    try {
      String result = client
              .ogcApiTiles
              .getTilesCollection(datasetId, collectionId, tileMatrixSetId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OgcApiTilesApi#getTilesCollection");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .ogcApiTiles
              .getTilesCollection(datasetId, collectionId, tileMatrixSetId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OgcApiTilesApi#getTilesCollection");
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
| **collectionId** | **String**|  | |
| **tileMatrixSetId** | **String**|  | |

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

<a name="queryCollectionById"></a>
# **queryCollectionById**
> String queryCollectionById(datasetId, collectionId).execute();

OGC API Tiles query

Query the given data set with OGC API Tiles standard 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Agrimetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OgcApiTilesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-test.agrimetrics.co.uk/catalog";
    Agrimetrics client = new Agrimetrics(configuration);
    UUID datasetId = UUID.randomUUID();
    String collectionId = "collectionId_example";
    try {
      String result = client
              .ogcApiTiles
              .queryCollectionById(datasetId, collectionId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OgcApiTilesApi#queryCollectionById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .ogcApiTiles
              .queryCollectionById(datasetId, collectionId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OgcApiTilesApi#queryCollectionById");
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
| **collectionId** | **String**|  | |

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

<a name="queryCollectionQueryables"></a>
# **queryCollectionQueryables**
> String queryCollectionQueryables(datasetId, collectionId).execute();

OGC API Tiles query

Query the given data set with OGC API Tiles standard 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Agrimetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OgcApiTilesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-test.agrimetrics.co.uk/catalog";
    Agrimetrics client = new Agrimetrics(configuration);
    UUID datasetId = UUID.randomUUID();
    String collectionId = "collectionId_example";
    try {
      String result = client
              .ogcApiTiles
              .queryCollectionQueryables(datasetId, collectionId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OgcApiTilesApi#queryCollectionQueryables");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .ogcApiTiles
              .queryCollectionQueryables(datasetId, collectionId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OgcApiTilesApi#queryCollectionQueryables");
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
| **collectionId** | **String**|  | |

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

<a name="queryCollections"></a>
# **queryCollections**
> String queryCollections(datasetId).execute();

OGC API Tiles query

Query the given data set with OGC API Tiles standard 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Agrimetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OgcApiTilesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-test.agrimetrics.co.uk/catalog";
    Agrimetrics client = new Agrimetrics(configuration);
    UUID datasetId = UUID.randomUUID();
    try {
      String result = client
              .ogcApiTiles
              .queryCollections(datasetId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OgcApiTilesApi#queryCollections");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .ogcApiTiles
              .queryCollections(datasetId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OgcApiTilesApi#queryCollections");
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

<a name="queryTileMatrixSets"></a>
# **queryTileMatrixSets**
> String queryTileMatrixSets(datasetId).execute();

OGC API Tiles query

Query the given data set with OGC API Tiles standard 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Agrimetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OgcApiTilesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-test.agrimetrics.co.uk/catalog";
    Agrimetrics client = new Agrimetrics(configuration);
    UUID datasetId = UUID.randomUUID();
    try {
      String result = client
              .ogcApiTiles
              .queryTileMatrixSets(datasetId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OgcApiTilesApi#queryTileMatrixSets");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .ogcApiTiles
              .queryTileMatrixSets(datasetId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OgcApiTilesApi#queryTileMatrixSets");
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

<a name="queryTileMatrixSets_0"></a>
# **queryTileMatrixSets_0**
> String queryTileMatrixSets_0(datasetId, tileMatrixSetId).execute();

OGC API Tiles query

Query the given data set with OGC API Tiles standard 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Agrimetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OgcApiTilesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-test.agrimetrics.co.uk/catalog";
    Agrimetrics client = new Agrimetrics(configuration);
    UUID datasetId = UUID.randomUUID();
    String tileMatrixSetId = "tileMatrixSetId_example";
    try {
      String result = client
              .ogcApiTiles
              .queryTileMatrixSets_0(datasetId, tileMatrixSetId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OgcApiTilesApi#queryTileMatrixSets_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .ogcApiTiles
              .queryTileMatrixSets_0(datasetId, tileMatrixSetId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OgcApiTilesApi#queryTileMatrixSets_0");
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
| **tileMatrixSetId** | **String**|  | |

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

<a name="queryTilesV1"></a>
# **queryTilesV1**
> String queryTilesV1(datasetId).execute();

OGC API Tiles query

Query the given data set with OGC API Tiles standard 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Agrimetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OgcApiTilesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-test.agrimetrics.co.uk/catalog";
    Agrimetrics client = new Agrimetrics(configuration);
    UUID datasetId = UUID.randomUUID();
    try {
      String result = client
              .ogcApiTiles
              .queryTilesV1(datasetId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OgcApiTilesApi#queryTilesV1");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .ogcApiTiles
              .queryTilesV1(datasetId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OgcApiTilesApi#queryTilesV1");
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

