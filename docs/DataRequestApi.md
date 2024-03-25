# DataRequestApi

All URIs are relative to *https://api-test.agrimetrics.co.uk/catalog*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSingleAccessRequest**](DataRequestApi.md#createSingleAccessRequest) | **POST** /data-requests | create a single access request |
| [**getGeoJsonGeometry**](DataRequestApi.md#getGeoJsonGeometry) | **GET** /data-requests/{uniqueLinkId}/geometry | Get geometry for data request as GeoJSON |
| [**getRequestedData**](DataRequestApi.md#getRequestedData) | **GET** /data-requests/{requestId} | gets the data for the approved request |
| [**getResults**](DataRequestApi.md#getResults) | **GET** /data-requests/{requestId}/download | Get the results of your data request |
| [**grantUserAccess**](DataRequestApi.md#grantUserAccess) | **GET** /data-requests/{uniqueLinkId}/approve | approve data access |
| [**listUserAccessRequests**](DataRequestApi.md#listUserAccessRequests) | **GET** /data-requests | lists a users data requests |
| [**rejectUserAccess**](DataRequestApi.md#rejectUserAccess) | **GET** /data-requests/{uniqueLinkId}/reject | reject data access |
| [**updateRequest**](DataRequestApi.md#updateRequest) | **PATCH** /data-requests/{requestId} | updates a data request |


<a name="createSingleAccessRequest"></a>
# **createSingleAccessRequest**
> DataRequestCreateSingleAccessRequestResponse createSingleAccessRequest(projectName, projectManagerName, projectManagerEmail, datasetId, datasetName, requestedFormat).geoJsonAOI(geoJsonAOI).shapefileAOI(shapefileAOI).dataRequest(dataRequest).execute();

create a single access request

Create a single access request for an authenticated user

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Agrimetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DataRequestApi;
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
    String projectName = "projectName_example"; // The name of the project the data is for
    String projectManagerName = "projectManagerName_example"; // The name of the project manager who can approve the request
    String projectManagerEmail = "projectManagerEmail_example"; // The email address of the project manager who can approve the request
    UUID datasetId = UUID.randomUUID(); // The ID of the dataset that the data request relates to
    String datasetName = "datasetName_example"; // The name of the dataset that the data request relates to
    String requestedFormat = "application/geo+json"; // The format the user would like the data to be provided in
    String geoJsonAOI = "geoJsonAOI_example"; // The area of interest that the user is requesting access to as a stringified GeoJSON
    File shapefileAOI = new File("/path/to/file"); // The area of interest that the user is requesting access to as a zipped shapefile
    try {
      DataRequestCreateSingleAccessRequestResponse result = client
              .dataRequest
              .createSingleAccessRequest(projectName, projectManagerName, projectManagerEmail, datasetId, datasetName, requestedFormat)
              .geoJsonAOI(geoJsonAOI)
              .shapefileAOI(shapefileAOI)
              .execute();
      System.out.println(result);
      System.out.println(result.getMessage());
    } catch (ApiException e) {
      System.err.println("Exception when calling DataRequestApi#createSingleAccessRequest");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DataRequestCreateSingleAccessRequestResponse> response = client
              .dataRequest
              .createSingleAccessRequest(projectName, projectManagerName, projectManagerEmail, datasetId, datasetName, requestedFormat)
              .geoJsonAOI(geoJsonAOI)
              .shapefileAOI(shapefileAOI)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DataRequestApi#createSingleAccessRequest");
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
| **projectName** | **String**| The name of the project the data is for | |
| **projectManagerName** | **String**| The name of the project manager who can approve the request | |
| **projectManagerEmail** | **String**| The email address of the project manager who can approve the request | |
| **datasetId** | **UUID**| The ID of the dataset that the data request relates to | |
| **datasetName** | **String**| The name of the dataset that the data request relates to | |
| **requestedFormat** | **String**| The format the user would like the data to be provided in | [enum: application/geo+json, application/gml+xml; version=3.2, application/vnd.google-earth.kml+xml, application/zipped-shapefile, application/x.gdb+zip, application/x.mid-mif+zip, application/x.tab+zip, application/dxf, image/tiff] |
| **geoJsonAOI** | **String**| The area of interest that the user is requesting access to as a stringified GeoJSON | [optional] |
| **shapefileAOI** | **File**| The area of interest that the user is requesting access to as a zipped shapefile | [optional] |
| **dataRequest** | [**DataRequest**](DataRequest.md)|  | [optional] |

### Return type

[**DataRequestCreateSingleAccessRequestResponse**](DataRequestCreateSingleAccessRequestResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getGeoJsonGeometry"></a>
# **getGeoJsonGeometry**
> GeoJSONPolygon getGeoJsonGeometry(uniqueLinkId).execute();

Get geometry for data request as GeoJSON

Returns the geometry of the data request as GeoJSON

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Agrimetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DataRequestApi;
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
    String uniqueLinkId = "uniqueLinkId_example";
    try {
      GeoJSONPolygon result = client
              .dataRequest
              .getGeoJsonGeometry(uniqueLinkId)
              .execute();
      System.out.println(result);
      System.out.println(result.getType());
      System.out.println(result.getCoordinates());
    } catch (ApiException e) {
      System.err.println("Exception when calling DataRequestApi#getGeoJsonGeometry");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GeoJSONPolygon> response = client
              .dataRequest
              .getGeoJsonGeometry(uniqueLinkId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DataRequestApi#getGeoJsonGeometry");
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
| **uniqueLinkId** | **String**|  | |

### Return type

[**GeoJSONPolygon**](GeoJSONPolygon.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | GeoJSON Polygon |  -  |
| **404** | Data Access request not found |  -  |

<a name="getRequestedData"></a>
# **getRequestedData**
> List&lt;DataRequestDetailsInner&gt; getRequestedData(requestId).execute();

gets the data for the approved request

Returns the users requested data

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Agrimetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DataRequestApi;
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
    UUID requestId = UUID.randomUUID();
    try {
      List<DataRequestDetailsInner> result = client
              .dataRequest
              .getRequestedData(requestId)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataRequestApi#getRequestedData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<DataRequestDetailsInner>> response = client
              .dataRequest
              .getRequestedData(requestId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DataRequestApi#getRequestedData");
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
| **requestId** | **UUID**|  | |

### Return type

[**List&lt;DataRequestDetailsInner&gt;**](DataRequestDetailsInner.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Result |  -  |

<a name="getResults"></a>
# **getResults**
> File getResults(requestId).execute();

Get the results of your data request

Once a data access request has been approved, this endpoint returns the data requested.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Agrimetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DataRequestApi;
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
    UUID requestId = UUID.randomUUID();
    try {
      File result = client
              .dataRequest
              .getResults(requestId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DataRequestApi#getResults");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<File> response = client
              .dataRequest
              .getResults(requestId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DataRequestApi#getResults");
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
| **requestId** | **UUID**|  | |

### Return type

[**File**](File.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/geo+json, application/gml+xml; version=3.2, application/vnd.google-earth.kml+xml, application/zipped-shapefile, application/x.gdb+zip, application/x.mid-mif+zip, application/x.tab+zip, application/dxf, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Authentication required. |  -  |
| **403** | The request has not been approved yet OR it has been rejected OR you are not authorised for this data access request. |  -  |
| **404** | No request found by that ID. |  -  |
| **410** | This data access request has expired. |  -  |

<a name="grantUserAccess"></a>
# **grantUserAccess**
> grantUserAccess(uniqueLinkId).execute();

approve data access

Grants access to a user on a given data request

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Agrimetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DataRequestApi;
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
    String uniqueLinkId = "uniqueLinkId_example";
    try {
      client
              .dataRequest
              .grantUserAccess(uniqueLinkId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DataRequestApi#grantUserAccess");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .dataRequest
              .grantUserAccess(uniqueLinkId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DataRequestApi#grantUserAccess");
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
| **uniqueLinkId** | **String**|  | |

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
| **204** | OK |  -  |
| **404** | Data Access request not found |  -  |

<a name="listUserAccessRequests"></a>
# **listUserAccessRequests**
> List&lt;DataRequestResponseInner&gt; listUserAccessRequests().execute();

lists a users data requests

Query the given users data access requests 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Agrimetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DataRequestApi;
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
      List<DataRequestResponseInner> result = client
              .dataRequest
              .listUserAccessRequests()
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataRequestApi#listUserAccessRequests");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<DataRequestResponseInner>> response = client
              .dataRequest
              .listUserAccessRequests()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DataRequestApi#listUserAccessRequests");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;DataRequestResponseInner&gt;**](DataRequestResponseInner.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="rejectUserAccess"></a>
# **rejectUserAccess**
> rejectUserAccess(uniqueLinkId).execute();

reject data access

Rejects access to a user on a given data request

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Agrimetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DataRequestApi;
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
    String uniqueLinkId = "uniqueLinkId_example";
    try {
      client
              .dataRequest
              .rejectUserAccess(uniqueLinkId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DataRequestApi#rejectUserAccess");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .dataRequest
              .rejectUserAccess(uniqueLinkId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DataRequestApi#rejectUserAccess");
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
| **uniqueLinkId** | **String**|  | |

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
| **204** | OK |  -  |
| **404** | Data Access request not found |  -  |

<a name="updateRequest"></a>
# **updateRequest**
> DataRequestUpdateRequestResponse updateRequest(requestId).dataRequestUpdateRequestRequest(dataRequestUpdateRequestRequest).execute();

updates a data request

Allows updating of the given data request | - For example: cancelling the request 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Agrimetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DataRequestApi;
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
    UUID requestId = UUID.randomUUID();
    String status = "cancelled"; // The status of the data request
    try {
      DataRequestUpdateRequestResponse result = client
              .dataRequest
              .updateRequest(requestId)
              .status(status)
              .execute();
      System.out.println(result);
      System.out.println(result.getMessage());
    } catch (ApiException e) {
      System.err.println("Exception when calling DataRequestApi#updateRequest");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DataRequestUpdateRequestResponse> response = client
              .dataRequest
              .updateRequest(requestId)
              .status(status)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DataRequestApi#updateRequest");
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
| **requestId** | **UUID**|  | |
| **dataRequestUpdateRequestRequest** | [**DataRequestUpdateRequestRequest**](DataRequestUpdateRequestRequest.md)|  | [optional] |

### Return type

[**DataRequestUpdateRequestResponse**](DataRequestUpdateRequestResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Result |  -  |

