# QueryDatasetApi

All URIs are relative to *https://api-test.agrimetrics.co.uk/catalog*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listLayersWithinDataset**](QueryDatasetApi.md#listLayersWithinDataset) | **GET** /datasets/{datasetId} | List layers within dataset |


<a name="listLayersWithinDataset"></a>
# **listLayersWithinDataset**
> QueryDatasetListLayersWithinDatasetResponse listLayersWithinDataset(datasetId).execute();

List layers within dataset

Get the list of layers contained in a geospatial data set.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Agrimetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.QueryDatasetApi;
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
    UUID datasetId = UUID.randomUUID(); // This parameter corresponds to the Agrimetrics Catalogue dataset ID.
    try {
      QueryDatasetListLayersWithinDatasetResponse result = client
              .queryDataset
              .listLayersWithinDataset(datasetId)
              .execute();
      System.out.println(result);
      System.out.println(result.getLayers());
    } catch (ApiException e) {
      System.err.println("Exception when calling QueryDatasetApi#listLayersWithinDataset");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<QueryDatasetListLayersWithinDatasetResponse> response = client
              .queryDataset
              .listLayersWithinDataset(datasetId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling QueryDatasetApi#listLayersWithinDataset");
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
| **datasetId** | **UUID**| This parameter corresponds to the Agrimetrics Catalogue dataset ID. | |

### Return type

[**QueryDatasetListLayersWithinDatasetResponse**](QueryDatasetListLayersWithinDatasetResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful. Retrived a list of layers for this dataset. |  -  |

