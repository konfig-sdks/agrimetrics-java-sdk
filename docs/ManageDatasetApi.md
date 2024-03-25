# ManageDatasetApi

All URIs are relative to *https://api-test.agrimetrics.co.uk/catalog*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**ingestFileNewLayer**](ManageDatasetApi.md#ingestFileNewLayer) | **POST** /datasets/{datasetId}/layers | Ingest file to new layer |


<a name="ingestFileNewLayer"></a>
# **ingestFileNewLayer**
> NewLayers ingestFileNewLayer(datasetId, manageDatasetIngestFileNewLayerRequest).execute();

Ingest file to new layer

&gt; :warning: **This is an Agrimetrics internal operation. It relies on information which is not exposed externally.**  Ingest a file that has been uploaded to the catalog to create a new layer. See [supported ingest formats](doc:supported-ingest-formats) for supported formats. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Agrimetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ManageDatasetApi;
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
    String fileUri = "fileUri_example";
    UUID datasetId = UUID.randomUUID();
    try {
      NewLayers result = client
              .manageDataset
              .ingestFileNewLayer(fileUri, datasetId)
              .execute();
      System.out.println(result);
      System.out.println(result.getLayers());
      System.out.println(result.getLayerId());
    } catch (ApiException e) {
      System.err.println("Exception when calling ManageDatasetApi#ingestFileNewLayer");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<NewLayers> response = client
              .manageDataset
              .ingestFileNewLayer(fileUri, datasetId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ManageDatasetApi#ingestFileNewLayer");
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
| **manageDatasetIngestFileNewLayerRequest** | [**ManageDatasetIngestFileNewLayerRequest**](ManageDatasetIngestFileNewLayerRequest.md)|  | |

### Return type

[**NewLayers**](NewLayers.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful. Layer Created. File ingested correctly and new layer created. |  -  |

