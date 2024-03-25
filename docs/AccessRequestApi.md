# AccessRequestApi

All URIs are relative to *https://api-test.agrimetrics.co.uk/catalog*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewRequest**](AccessRequestApi.md#createNewRequest) | **POST** /access-requests |  |
| [**deleteRequestById**](AccessRequestApi.md#deleteRequestById) | **DELETE** /access-requests/{requestId} |  |
| [**list**](AccessRequestApi.md#list) | **GET** /access-requests |  |


<a name="createNewRequest"></a>
# **createNewRequest**
> createNewRequest().accessRequestCreateNewRequestRequest(accessRequestCreateNewRequestRequest).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Agrimetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccessRequestApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-test.agrimetrics.co.uk/catalog";
    Agrimetrics client = new Agrimetrics(configuration);
    UUID dataSetId = UUID.randomUUID(); // The ID of a dataset in the catalog
    String requestingEntityId = "requestingEntityId_example"; // ID for the entity which is requesting access.
    String requestMessage = "requestMessage_example"; // Free text message provided by the user when requesting access.
    String requesterName = "requesterName_example"; // Name of the user who requested access.
    String requesterEmail = "requesterEmail_example"; // Contact email address for the user who requested access.
    try {
      client
              .accessRequest
              .createNewRequest(dataSetId, requestingEntityId, requestMessage)
              .requesterName(requesterName)
              .requesterEmail(requesterEmail)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessRequestApi#createNewRequest");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .accessRequest
              .createNewRequest(dataSetId, requestingEntityId, requestMessage)
              .requesterName(requesterName)
              .requesterEmail(requesterEmail)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessRequestApi#createNewRequest");
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
| **accessRequestCreateNewRequestRequest** | [**AccessRequestCreateNewRequestRequest**](AccessRequestCreateNewRequestRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The outstanding access requests for the data set. |  -  |
| **400** | This request is not supported |  -  |

<a name="deleteRequestById"></a>
# **deleteRequestById**
> deleteRequestById(requestId, dataSetId).accepted(accepted).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Agrimetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccessRequestApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-test.agrimetrics.co.uk/catalog";
    Agrimetrics client = new Agrimetrics(configuration);
    String requestId = "requestId_example";
    UUID dataSetId = UUID.randomUUID();
    Boolean accepted = true;
    try {
      client
              .accessRequest
              .deleteRequestById(requestId, dataSetId)
              .accepted(accepted)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessRequestApi#deleteRequestById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .accessRequest
              .deleteRequestById(requestId, dataSetId)
              .accepted(accepted)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessRequestApi#deleteRequestById");
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
| **requestId** | **String**|  | |
| **dataSetId** | **UUID**|  | |
| **accepted** | **Boolean**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Dismiss access requests for the data set. |  -  |

<a name="list"></a>
# **list**
> list().dataSetId(dataSetId).requestingEntityId(requestingEntityId).entityId(entityId).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Agrimetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccessRequestApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-test.agrimetrics.co.uk/catalog";
    Agrimetrics client = new Agrimetrics(configuration);
    UUID dataSetId = UUID.randomUUID();
    String requestingEntityId = "requestingEntityId_example";
    List<String> entityId = Arrays.asList();
    try {
      client
              .accessRequest
              .list()
              .dataSetId(dataSetId)
              .requestingEntityId(requestingEntityId)
              .entityId(entityId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessRequestApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .accessRequest
              .list()
              .dataSetId(dataSetId)
              .requestingEntityId(requestingEntityId)
              .entityId(entityId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessRequestApi#list");
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
| **dataSetId** | **UUID**|  | [optional] |
| **requestingEntityId** | **String**|  | [optional] |
| **entityId** | [**List&lt;String&gt;**](String.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The outstanding access requests for the data set. |  -  |

