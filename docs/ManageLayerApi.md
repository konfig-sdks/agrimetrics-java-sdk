# ManageLayerApi

All URIs are relative to *https://api-test.agrimetrics.co.uk/catalog*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addGeoTiff**](ManageLayerApi.md#addGeoTiff) | **PATCH** /layers/{layerId} | Add a GeoTIFF to a layer |
| [**autoGenerateStyle**](ManageLayerApi.md#autoGenerateStyle) | **POST** /layers/{layerId}/style | Auto-generate and set layer style |
| [**deleteLayer**](ManageLayerApi.md#deleteLayer) | **DELETE** /layers/{layerId} | Delete layer |
| [**getStyle**](ManageLayerApi.md#getStyle) | **GET** /layers/{layerId}/style | Get the style for a layer, if one has been set |
| [**ingestFile**](ManageLayerApi.md#ingestFile) | **POST** /layers/{layerId}/ingest | Ingest a file to a layer |
| [**removeFile**](ManageLayerApi.md#removeFile) | **DELETE** /layers/{layerId}/files | Delete a file from a layer |
| [**removeStyle**](ManageLayerApi.md#removeStyle) | **DELETE** /layers/{layerId}/style | Delete the style from a layer, if one has been set |
| [**setStyle**](ManageLayerApi.md#setStyle) | **PUT** /layers/{layerId}/style | Set layer style |


<a name="addGeoTiff"></a>
# **addGeoTiff**
> ManageLayerAddGeoTiffResponse addGeoTiff(layerId, manageLayerAddGeoTiffRequest).datetime(datetime)._file(_file).execute();

Add a GeoTIFF to a layer

&gt; :warning: **The maximum file size accepted for this endpoint to work is 200 MiB.**  This endpoint will add a GeoTIFF to an existing GeoTIFF layer. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Agrimetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ManageLayerApi;
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
    String datetime = "datetime_example";
    File _file = new File("/path/to/file"); // The file to upload.
    try {
      ManageLayerAddGeoTiffResponse result = client
              .manageLayer
              .addGeoTiff(layerId)
              .datetime(datetime)
              ._file(_file)
              .execute();
      System.out.println(result);
      System.out.println(result.getMessage());
    } catch (ApiException e) {
      System.err.println("Exception when calling ManageLayerApi#addGeoTiff");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ManageLayerAddGeoTiffResponse> response = client
              .manageLayer
              .addGeoTiff(layerId)
              .datetime(datetime)
              ._file(_file)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ManageLayerApi#addGeoTiff");
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
| **manageLayerAddGeoTiffRequest** | [**ManageLayerAddGeoTiffRequest**](ManageLayerAddGeoTiffRequest.md)|  | |
| **datetime** | **String**|  | [optional] |
| **_file** | **File**| The file to upload. | [optional] |

### Return type

[**ManageLayerAddGeoTiffResponse**](ManageLayerAddGeoTiffResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful. Tile created on the specified layer. |  -  |

<a name="autoGenerateStyle"></a>
# **autoGenerateStyle**
> RestError autoGenerateStyle(layerId, key).execute();

Auto-generate and set layer style

Generate a new style and apply it to the given layer. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Agrimetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ManageLayerApi;
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
    String key = "LU_CODE";
    try {
      RestError result = client
              .manageLayer
              .autoGenerateStyle(layerId, key)
              .execute();
      System.out.println(result);
      System.out.println(result.getMessage());
    } catch (ApiException e) {
      System.err.println("Exception when calling ManageLayerApi#autoGenerateStyle");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RestError> response = client
              .manageLayer
              .autoGenerateStyle(layerId, key)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ManageLayerApi#autoGenerateStyle");
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
| **key** | **String**|  | |

### Return type

[**RestError**](RestError.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful. Layer style has been updated. |  -  |

<a name="deleteLayer"></a>
# **deleteLayer**
> deleteLayer(layerId).execute();

Delete layer

&gt; :warning: **This is an Agrimetrics internal operation. It relies on information which is not exposed externally.**  Delete the datastore and layer relating to a zip file on a data set. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Agrimetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ManageLayerApi;
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
      client
              .manageLayer
              .deleteLayer(layerId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ManageLayerApi#deleteLayer");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .manageLayer
              .deleteLayer(layerId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ManageLayerApi#deleteLayer");
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

null (empty response body)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successful. Layer Deleted. |  -  |

<a name="getStyle"></a>
# **getStyle**
> getStyle(layerId).execute();

Get the style for a layer, if one has been set

Get the SLD style that has been applied to a layer. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Agrimetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ManageLayerApi;
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
      client
              .manageLayer
              .getStyle(layerId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ManageLayerApi#getStyle");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .manageLayer
              .getStyle(layerId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ManageLayerApi#getStyle");
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

null (empty response body)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.ogc.sld+xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Style applied to the layer |  -  |
| **404** | Query was successful but no style found. |  -  |

<a name="ingestFile"></a>
# **ingestFile**
> ingestFile(layerId, manageLayerIngestFileRequest).execute();

Ingest a file to a layer

&gt; :warning: **This is an Agrimetrics internal operation. It relies on information which is not exposed externally.**  Ingest a file that has been uploaded to a data set. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Agrimetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ManageLayerApi;
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
    String fileId = "fileId_example";
    UUID layerId = UUID.randomUUID();
    String fileName = "fileName_example";
    String datetime = "datetime_example";
    try {
      client
              .manageLayer
              .ingestFile(fileId, layerId)
              .fileName(fileName)
              .datetime(datetime)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ManageLayerApi#ingestFile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .manageLayer
              .ingestFile(fileId, layerId)
              .fileName(fileName)
              .datetime(datetime)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ManageLayerApi#ingestFile");
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
| **manageLayerIngestFileRequest** | [**ManageLayerIngestFileRequest**](ManageLayerIngestFileRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful. Tile ingested correctly. |  -  |

<a name="removeFile"></a>
# **removeFile**
> removeFile(layerId).fileUri(fileUri).filename(filename).execute();

Delete a file from a layer

&gt; :warning: **This is an Agrimetrics internal operation. It relies on information which is not exposed externally.**  Remove a file from a layer. When you are deleting a file from a layer, the layer may remain if any other files were ingested onto the same layer. If removing a raster file, provide the fileName query parameter; if removing a vector file, provide the fileUri. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Agrimetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ManageLayerApi;
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
    URI fileUri = new URI();
    String filename = "example.tif";
    try {
      client
              .manageLayer
              .removeFile(layerId)
              .fileUri(fileUri)
              .filename(filename)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ManageLayerApi#removeFile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .manageLayer
              .removeFile(layerId)
              .fileUri(fileUri)
              .filename(filename)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ManageLayerApi#removeFile");
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
| **fileUri** | **URI**|  | [optional] |
| **filename** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="removeStyle"></a>
# **removeStyle**
> removeStyle(layerId).execute();

Delete the style from a layer, if one has been set

Delete an SLD style that has been applied to a layer. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Agrimetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ManageLayerApi;
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
      client
              .manageLayer
              .removeStyle(layerId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ManageLayerApi#removeStyle");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .manageLayer
              .removeStyle(layerId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ManageLayerApi#removeStyle");
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

null (empty response body)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Style deleted |  -  |
| **400** | You probably tried to delete the style from an unstyled layer. Please verify the layer ID.  |  -  |

<a name="setStyle"></a>
# **setStyle**
> Object setStyle(layerId, manageLayerSetStyleRequest)._file(_file).execute();

Set layer style

Apply a new style to the given layer. The style must be provided as an SLD file (1.0.0 and 1.1.0 supported). 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Agrimetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ManageLayerApi;
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
    File _file = new File("/path/to/file");
    try {
      Object result = client
              .manageLayer
              .setStyle(layerId)
              ._file(_file)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ManageLayerApi#setStyle");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .manageLayer
              .setStyle(layerId)
              ._file(_file)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ManageLayerApi#setStyle");
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
| **manageLayerSetStyleRequest** | [**ManageLayerSetStyleRequest**](ManageLayerSetStyleRequest.md)|  | |
| **_file** | **File**|  | [optional] |

### Return type

**Object**

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful. Layer style has been updated. |  -  |

