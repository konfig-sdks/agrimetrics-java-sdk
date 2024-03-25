# ImageApi

All URIs are relative to *https://api-test.agrimetrics.co.uk/catalog*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getRawImage**](ImageApi.md#getRawImage) | **GET** /images/{imageType}/{imageId} | Get an image used in the catalogue. |


<a name="getRawImage"></a>
# **getRawImage**
> getRawImage(imageType, imageId).thumbnail(thumbnail).execute();

Get an image used in the catalogue.

Get an image referenced on a data set. This will always return the raw image data.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Agrimetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ImageApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-test.agrimetrics.co.uk/catalog";
    Agrimetrics client = new Agrimetrics(configuration);
    String imageType = "custom";
    String imageId = "imageId_example";
    String thumbnail = "true"; // Whether to provide a thumbnail image. If set to true and no thumbnail exists, the full image will be returned
    try {
      client
              .image
              .getRawImage(imageType, imageId)
              .thumbnail(thumbnail)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ImageApi#getRawImage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .image
              .getRawImage(imageType, imageId)
              .thumbnail(thumbnail)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ImageApi#getRawImage");
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
| **imageType** | **String**|  | [enum: custom, unsplash] |
| **imageId** | **String**|  | |
| **thumbnail** | **String**| Whether to provide a thumbnail image. If set to true and no thumbnail exists, the full image will be returned | [optional] [default to false] [enum: true, false] |

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
| **200** | The image for the data set. |  -  |

