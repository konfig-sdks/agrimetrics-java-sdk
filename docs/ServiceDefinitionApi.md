# ServiceDefinitionApi

All URIs are relative to *https://api-test.agrimetrics.co.uk/catalog*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewDefinition**](ServiceDefinitionApi.md#createNewDefinition) | **POST** /serviceDefinition | Create new service definition |
| [**deleteById**](ServiceDefinitionApi.md#deleteById) | **DELETE** /serviceDefinition/{layerId} | Delete service definition |
| [**getByLayerId**](ServiceDefinitionApi.md#getByLayerId) | **GET** /serviceDefinition/{layerId} | Get service definition |
| [**updateExistingDefinition**](ServiceDefinitionApi.md#updateExistingDefinition) | **PATCH** /serviceDefinition/{layerId} | Update service definition |


<a name="createNewDefinition"></a>
# **createNewDefinition**
> ServiceDefinitionResponse createNewDefinition(serviceDefinition).execute();

Create new service definition

&gt; :warning: **This is an Agrimetrics internal operation. It relies on information which is not exposed externally.**  Create new service definition within a data set. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Agrimetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ServiceDefinitionApi;
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
    String datasetId = "datasetId_example";
    String layerName = "layerName_example";
    String service = "WCS";
    String WFS = "Y";
    String WCS = "Y";
    String WMS = "Y";
    String WMTS = "Y";
    String ogCApiFeatures = "Y";
    String ogCApiTiles = "Y";
    Boolean temporal = true;
    String datastore = "datastore_example";
    String geoserverHostName = "geoserverHostName_example";
    String geometryField = "geometryField_example";
    Billable billable = new Billable();
    Double defaultEPSGCode = 3.4D;
    try {
      ServiceDefinitionResponse result = client
              .serviceDefinition
              .createNewDefinition(datasetId, layerName, service, WFS, WCS, WMS, WMTS, ogCApiFeatures, ogCApiTiles)
              .temporal(temporal)
              .datastore(datastore)
              .geoserverHostName(geoserverHostName)
              .geometryField(geometryField)
              .billable(billable)
              .defaultEPSGCode(defaultEPSGCode)
              .execute();
      System.out.println(result);
      System.out.println(result.getLayerId());
      System.out.println(result.getDatasetId());
      System.out.println(result.getLayerName());
      System.out.println(result.getService());
      System.out.println(result.getTemporal());
      System.out.println(result.getDatastore());
      System.out.println(result.getGeoserverHostName());
      System.out.println(result.getGeometryField());
      System.out.println(result.getBillable());
      System.out.println(result.getDefaultEPSGCode());
      System.out.println(result.getWMS());
      System.out.println(result.getWMTS());
      System.out.println(result.getWFS());
      System.out.println(result.getWCS());
      System.out.println(result.getOgCApiFeatures());
      System.out.println(result.getOgCApiTiles());
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceDefinitionApi#createNewDefinition");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ServiceDefinitionResponse> response = client
              .serviceDefinition
              .createNewDefinition(datasetId, layerName, service, WFS, WCS, WMS, WMTS, ogCApiFeatures, ogCApiTiles)
              .temporal(temporal)
              .datastore(datastore)
              .geoserverHostName(geoserverHostName)
              .geometryField(geometryField)
              .billable(billable)
              .defaultEPSGCode(defaultEPSGCode)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceDefinitionApi#createNewDefinition");
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
| **serviceDefinition** | [**ServiceDefinition**](ServiceDefinition.md)|  | |

### Return type

[**ServiceDefinitionResponse**](ServiceDefinitionResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful. Created new service definition. |  -  |

<a name="deleteById"></a>
# **deleteById**
> deleteById(layerId).execute();

Delete service definition

&gt; :warning: **This is an Agrimetrics internal operation. It relies on information which is not exposed externally.**  Delete service definition given layer ID 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Agrimetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ServiceDefinitionApi;
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
              .serviceDefinition
              .deleteById(layerId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceDefinitionApi#deleteById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .serviceDefinition
              .deleteById(layerId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceDefinitionApi#deleteById");
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
| **200** | OK |  -  |

<a name="getByLayerId"></a>
# **getByLayerId**
> ServiceDefinitionResponse getByLayerId(layerId).execute();

Get service definition

&gt; :warning: **This is an Agrimetrics internal operation. It relies on information which is not exposed externally.**  Get the service definition for a given layer ID 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Agrimetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ServiceDefinitionApi;
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
      ServiceDefinitionResponse result = client
              .serviceDefinition
              .getByLayerId(layerId)
              .execute();
      System.out.println(result);
      System.out.println(result.getLayerId());
      System.out.println(result.getDatasetId());
      System.out.println(result.getLayerName());
      System.out.println(result.getService());
      System.out.println(result.getTemporal());
      System.out.println(result.getDatastore());
      System.out.println(result.getGeoserverHostName());
      System.out.println(result.getGeometryField());
      System.out.println(result.getBillable());
      System.out.println(result.getDefaultEPSGCode());
      System.out.println(result.getWMS());
      System.out.println(result.getWMTS());
      System.out.println(result.getWFS());
      System.out.println(result.getWCS());
      System.out.println(result.getOgCApiFeatures());
      System.out.println(result.getOgCApiTiles());
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceDefinitionApi#getByLayerId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ServiceDefinitionResponse> response = client
              .serviceDefinition
              .getByLayerId(layerId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceDefinitionApi#getByLayerId");
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

[**ServiceDefinitionResponse**](ServiceDefinitionResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful. |  -  |

<a name="updateExistingDefinition"></a>
# **updateExistingDefinition**
> ServiceDefinitionResponse updateExistingDefinition(layerId).serviceDefinitionUpdateExistingDefinitionRequest(serviceDefinitionUpdateExistingDefinitionRequest).execute();

Update service definition

&gt; :warning: **This is an Agrimetrics internal operation. It relies on information which is not exposed externally.**  Update an existing service definition with billing and coordinates reference system metadata. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Agrimetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ServiceDefinitionApi;
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
    Billable billable = new Billable();
    Double defaultEPSGCode = 3.4D;
    try {
      ServiceDefinitionResponse result = client
              .serviceDefinition
              .updateExistingDefinition(layerId)
              .billable(billable)
              .defaultEPSGCode(defaultEPSGCode)
              .execute();
      System.out.println(result);
      System.out.println(result.getLayerId());
      System.out.println(result.getDatasetId());
      System.out.println(result.getLayerName());
      System.out.println(result.getService());
      System.out.println(result.getTemporal());
      System.out.println(result.getDatastore());
      System.out.println(result.getGeoserverHostName());
      System.out.println(result.getGeometryField());
      System.out.println(result.getBillable());
      System.out.println(result.getDefaultEPSGCode());
      System.out.println(result.getWMS());
      System.out.println(result.getWMTS());
      System.out.println(result.getWFS());
      System.out.println(result.getWCS());
      System.out.println(result.getOgCApiFeatures());
      System.out.println(result.getOgCApiTiles());
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceDefinitionApi#updateExistingDefinition");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ServiceDefinitionResponse> response = client
              .serviceDefinition
              .updateExistingDefinition(layerId)
              .billable(billable)
              .defaultEPSGCode(defaultEPSGCode)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceDefinitionApi#updateExistingDefinition");
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
| **serviceDefinitionUpdateExistingDefinitionRequest** | [**ServiceDefinitionUpdateExistingDefinitionRequest**](ServiceDefinitionUpdateExistingDefinitionRequest.md)|  | [optional] |

### Return type

[**ServiceDefinitionResponse**](ServiceDefinitionResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful. Edited service definition. |  -  |

