# HarvestApi

All URIs are relative to *https://api-test.agrimetrics.co.uk/catalog*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**xmlDataOnGroup**](HarvestApi.md#xmlDataOnGroup) | **GET** /harvest/{group}/csw | Harvest xml data on the given group |
| [**xmlDataOnGroupPost**](HarvestApi.md#xmlDataOnGroupPost) | **POST** /harvest/{group}/csw | Harvest xml data on the given group |


<a name="xmlDataOnGroup"></a>
# **xmlDataOnGroup**
> Object xmlDataOnGroup(group).service(service).request(request).version(version).startPosition(startPosition).maxRecords(maxRecords).id(id).outputSchema(outputSchema).elementsetname(elementsetname).outputFormat(outputFormat).typeNames(typeNames).resultType(resultType).execute();

Harvest xml data on the given group

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Agrimetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HarvestApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-test.agrimetrics.co.uk/catalog";
    Agrimetrics client = new Agrimetrics(configuration);
    GroupCode group = GroupCode.fromValue("apha");
    String service = "CSW";
    String request = "GetRecords";
    String version = "version_example";
    Double startPosition = 1D;
    Double maxRecords = 10D;
    List<UUID> id = Arrays.asList();
    String outputSchema = "http://www.isotc211.org/2005/gmd";
    String elementsetname = "full";
    String outputFormat = "application/xml";
    String typeNames = "gmd:MD_Metadata";
    String resultType = "resultType_example";
    try {
      Object result = client
              .harvest
              .xmlDataOnGroup(group)
              .service(service)
              .request(request)
              .version(version)
              .startPosition(startPosition)
              .maxRecords(maxRecords)
              .id(id)
              .outputSchema(outputSchema)
              .elementsetname(elementsetname)
              .outputFormat(outputFormat)
              .typeNames(typeNames)
              .resultType(resultType)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling HarvestApi#xmlDataOnGroup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .harvest
              .xmlDataOnGroup(group)
              .service(service)
              .request(request)
              .version(version)
              .startPosition(startPosition)
              .maxRecords(maxRecords)
              .id(id)
              .outputSchema(outputSchema)
              .elementsetname(elementsetname)
              .outputFormat(outputFormat)
              .typeNames(typeNames)
              .resultType(resultType)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling HarvestApi#xmlDataOnGroup");
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
| **group** | [**GroupCode**](.md)|  | [enum: apha, defra, ea, ne, rpa] |
| **service** | **String**|  | [optional] [enum: CSW] |
| **request** | **String**|  | [optional] [enum: GetRecords, GetRecordById, GetCapabilities] |
| **version** | **String**|  | [optional] |
| **startPosition** | **Double**|  | [optional] [default to 1] |
| **maxRecords** | **Double**|  | [optional] [default to 10] |
| **id** | [**List&lt;UUID&gt;**](UUID.md)|  | [optional] |
| **outputSchema** | **String**|  | [optional] [enum: http://www.isotc211.org/2005/gmd] |
| **elementsetname** | **String**|  | [optional] [enum: full, brief, summary] |
| **outputFormat** | **String**|  | [optional] [enum: application/xml] |
| **typeNames** | **String**|  | [optional] [enum: gmd:MD_Metadata, csw:Record] |
| **resultType** | **String**|  | [optional] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get harvest data |  -  |

<a name="xmlDataOnGroupPost"></a>
# **xmlDataOnGroupPost**
> String xmlDataOnGroupPost(group).service(service).request(request).version(version).startPosition(startPosition).maxRecords(maxRecords).id(id).outputSchema(outputSchema).elementsetname(elementsetname).outputFormat(outputFormat).typeNames(typeNames).resultType(resultType).execute();

Harvest xml data on the given group

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Agrimetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HarvestApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-test.agrimetrics.co.uk/catalog";
    Agrimetrics client = new Agrimetrics(configuration);
    GroupCode group = GroupCode.fromValue("apha");
    String service = "CSW";
    String request = "GetRecords";
    String version = "version_example";
    Double startPosition = 1D;
    Double maxRecords = 10D;
    List<UUID> id = Arrays.asList();
    String outputSchema = "http://www.isotc211.org/2005/gmd";
    String elementsetname = "full";
    String outputFormat = "application/xml";
    String typeNames = "gmd:MD_Metadata";
    String resultType = "resultType_example";
    try {
      String result = client
              .harvest
              .xmlDataOnGroupPost(group)
              .service(service)
              .request(request)
              .version(version)
              .startPosition(startPosition)
              .maxRecords(maxRecords)
              .id(id)
              .outputSchema(outputSchema)
              .elementsetname(elementsetname)
              .outputFormat(outputFormat)
              .typeNames(typeNames)
              .resultType(resultType)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling HarvestApi#xmlDataOnGroupPost");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .harvest
              .xmlDataOnGroupPost(group)
              .service(service)
              .request(request)
              .version(version)
              .startPosition(startPosition)
              .maxRecords(maxRecords)
              .id(id)
              .outputSchema(outputSchema)
              .elementsetname(elementsetname)
              .outputFormat(outputFormat)
              .typeNames(typeNames)
              .resultType(resultType)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling HarvestApi#xmlDataOnGroupPost");
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
| **group** | [**GroupCode**](.md)|  | [enum: apha, defra, ea, ne, rpa] |
| **service** | **String**|  | [optional] [enum: CSW] |
| **request** | **String**|  | [optional] [enum: GetRecords, GetRecordById, GetCapabilities] |
| **version** | **String**|  | [optional] |
| **startPosition** | **Double**|  | [optional] [default to 1] |
| **maxRecords** | **Double**|  | [optional] [default to 10] |
| **id** | [**List&lt;UUID&gt;**](UUID.md)|  | [optional] |
| **outputSchema** | **String**|  | [optional] [enum: http://www.isotc211.org/2005/gmd] |
| **elementsetname** | **String**|  | [optional] [enum: full, brief, summary] |
| **outputFormat** | **String**|  | [optional] [enum: application/xml] |
| **typeNames** | **String**|  | [optional] [enum: gmd:MD_Metadata, csw:Record] |
| **resultType** | **String**|  | [optional] |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get harvest data |  -  |

