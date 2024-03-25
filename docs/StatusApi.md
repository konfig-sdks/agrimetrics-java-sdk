# StatusApi

All URIs are relative to *https://api-test.agrimetrics.co.uk/catalog*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCatalogApiStatus**](StatusApi.md#getCatalogApiStatus) | **GET** /status | Get status of catalog API. |
| [**setDraftStatus**](StatusApi.md#setDraftStatus) | **PUT** /data-sets/{dataSetId}/draft-status | Set the draft status for the data set catalog entry. |


<a name="getCatalogApiStatus"></a>
# **getCatalogApiStatus**
> StatusGetCatalogApiStatusResponse getCatalogApiStatus().execute();

Get status of catalog API.

Get status of catalog API.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Agrimetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.StatusApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-test.agrimetrics.co.uk/catalog";
    
    configuration.apiKeyQuery  = "YOUR API KEY";
    Agrimetrics client = new Agrimetrics(configuration);
    try {
      StatusGetCatalogApiStatusResponse result = client
              .status
              .getCatalogApiStatus()
              .execute();
      System.out.println(result);
      System.out.println(result.getVersion());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling StatusApi#getCatalogApiStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<StatusGetCatalogApiStatusResponse> response = client
              .status
              .getCatalogApiStatus()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling StatusApi#getCatalogApiStatus");
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

[**StatusGetCatalogApiStatusResponse**](StatusGetCatalogApiStatusResponse.md)

### Authorization

[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Status of catalog API. |  -  |

<a name="setDraftStatus"></a>
# **setDraftStatus**
> EntryUpdateResponse setDraftStatus(dataSetId).statusSetDraftStatusRequest(statusSetDraftStatusRequest).execute();

Set the draft status for the data set catalog entry.

Set the draft status for the data set catalog entry.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Agrimetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.StatusApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-test.agrimetrics.co.uk/catalog";
    Agrimetrics client = new Agrimetrics(configuration);
    Object status = null;
    UUID dataSetId = UUID.randomUUID();
    String notes = "notes_example"; // Any notes added during review of the data set
    try {
      EntryUpdateResponse result = client
              .status
              .setDraftStatus(status, dataSetId)
              .notes(notes)
              .execute();
      System.out.println(result);
      System.out.println(result.getStatus());
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling StatusApi#setDraftStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EntryUpdateResponse> response = client
              .status
              .setDraftStatus(status, dataSetId)
              .notes(notes)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling StatusApi#setDraftStatus");
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
| **dataSetId** | **UUID**|  | |
| **statusSetDraftStatusRequest** | [**StatusSetDraftStatusRequest**](StatusSetDraftStatusRequest.md)|  | [optional] |

### Return type

[**EntryUpdateResponse**](EntryUpdateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Updates a single catalog entry for a data set. |  -  |

