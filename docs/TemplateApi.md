# TemplateApi

All URIs are relative to *https://api-test.agrimetrics.co.uk/catalog*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCatalogEntry**](TemplateApi.md#createCatalogEntry) | **POST** /templates | Create a new template for creating catalogue entries. |
| [**deleteSpecificTemplate**](TemplateApi.md#deleteSpecificTemplate) | **DELETE** /templates/{templateId} | Delete a specific template |
| [**getSpecificTemplate**](TemplateApi.md#getSpecificTemplate) | **GET** /templates/{templateId} | Get a specific template |
| [**listPermissionsToView**](TemplateApi.md#listPermissionsToView) | **GET** /templates | List all templates you have permission to view. |
| [**updateTemplateItem**](TemplateApi.md#updateTemplateItem) | **PUT** /templates/{templateId} | Update a template |
| [**updateTemplateItem_0**](TemplateApi.md#updateTemplateItem_0) | **PATCH** /templates/{templateId} | Update a template |


<a name="createCatalogEntry"></a>
# **createCatalogEntry**
> EntryUpdateResponse createCatalogEntry().dataSetTemplateMetadata(dataSetTemplateMetadata).execute();

Create a new template for creating catalogue entries.

Creates a single template that can be used to create similar catalogue entries.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Agrimetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TemplateApi;
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
    String name = "name_example";
    String description = "description_example";
    DataSetPatch dataSet = new DataSetPatch();
    List<BatchIdentityInputEntitlementsInner> entitlements = Arrays.asList();
    Entitlements creatorEntitlements = new Entitlements();
    Exchange exchange = Exchange.fromValue("agrimetrics");
    try {
      EntryUpdateResponse result = client
              .template
              .createCatalogEntry(name)
              .description(description)
              .dataSet(dataSet)
              .entitlements(entitlements)
              .creatorEntitlements(creatorEntitlements)
              .exchange(exchange)
              .execute();
      System.out.println(result);
      System.out.println(result.getStatus());
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#createCatalogEntry");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EntryUpdateResponse> response = client
              .template
              .createCatalogEntry(name)
              .description(description)
              .dataSet(dataSet)
              .entitlements(entitlements)
              .creatorEntitlements(creatorEntitlements)
              .exchange(exchange)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#createCatalogEntry");
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
| **dataSetTemplateMetadata** | [**DataSetTemplateMetadata**](DataSetTemplateMetadata.md)| The data set to create. | [optional] |

### Return type

[**EntryUpdateResponse**](EntryUpdateResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Creates a single catalog entry for a template. |  -  |

<a name="deleteSpecificTemplate"></a>
# **deleteSpecificTemplate**
> EntryUpdateResponse deleteSpecificTemplate(templateId).execute();

Delete a specific template

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Agrimetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TemplateApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-test.agrimetrics.co.uk/catalog";
    Agrimetrics client = new Agrimetrics(configuration);
    UUID templateId = UUID.randomUUID();
    try {
      EntryUpdateResponse result = client
              .template
              .deleteSpecificTemplate(templateId)
              .execute();
      System.out.println(result);
      System.out.println(result.getStatus());
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#deleteSpecificTemplate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EntryUpdateResponse> response = client
              .template
              .deleteSpecificTemplate(templateId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#deleteSpecificTemplate");
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
| **templateId** | **UUID**|  | |

### Return type

[**EntryUpdateResponse**](EntryUpdateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Creates a single catalog entry for a data set. |  -  |

<a name="getSpecificTemplate"></a>
# **getSpecificTemplate**
> DataSetTemplateEntity getSpecificTemplate(templateId).execute();

Get a specific template

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Agrimetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TemplateApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-test.agrimetrics.co.uk/catalog";
    Agrimetrics client = new Agrimetrics(configuration);
    UUID templateId = UUID.randomUUID();
    try {
      DataSetTemplateEntity result = client
              .template
              .getSpecificTemplate(templateId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDescription());
      System.out.println(result.getName());
      System.out.println(result.getDataSet());
      System.out.println(result.getEntitlements());
      System.out.println(result.getCreatorEntitlements());
      System.out.println(result.getExchange());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#getSpecificTemplate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DataSetTemplateEntity> response = client
              .template
              .getSpecificTemplate(templateId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#getSpecificTemplate");
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
| **templateId** | **UUID**|  | |

### Return type

[**DataSetTemplateEntity**](DataSetTemplateEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get template |  -  |

<a name="listPermissionsToView"></a>
# **listPermissionsToView**
> TemplateListPermissionsToViewResponse listPermissionsToView().execute();

List all templates you have permission to view.

List all templates you have permission to view.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Agrimetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TemplateApi;
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
      TemplateListPermissionsToViewResponse result = client
              .template
              .listPermissionsToView()
              .execute();
      System.out.println(result);
      System.out.println(result.getTemplates());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#listPermissionsToView");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TemplateListPermissionsToViewResponse> response = client
              .template
              .listPermissionsToView()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#listPermissionsToView");
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

[**TemplateListPermissionsToViewResponse**](TemplateListPermissionsToViewResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The template result set. |  -  |

<a name="updateTemplateItem"></a>
# **updateTemplateItem**
> DataSetTemplateEntity updateTemplateItem(templateId).dataSetTemplateMetadata(dataSetTemplateMetadata).execute();

Update a template

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Agrimetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TemplateApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-test.agrimetrics.co.uk/catalog";
    Agrimetrics client = new Agrimetrics(configuration);
    String name = "name_example";
    UUID templateId = UUID.randomUUID();
    String description = "description_example";
    DataSetPatch dataSet = new DataSetPatch();
    List<BatchIdentityInputEntitlementsInner> entitlements = Arrays.asList();
    Entitlements creatorEntitlements = new Entitlements();
    Exchange exchange = Exchange.fromValue("agrimetrics");
    try {
      DataSetTemplateEntity result = client
              .template
              .updateTemplateItem(name, templateId)
              .description(description)
              .dataSet(dataSet)
              .entitlements(entitlements)
              .creatorEntitlements(creatorEntitlements)
              .exchange(exchange)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDescription());
      System.out.println(result.getName());
      System.out.println(result.getDataSet());
      System.out.println(result.getEntitlements());
      System.out.println(result.getCreatorEntitlements());
      System.out.println(result.getExchange());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#updateTemplateItem");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DataSetTemplateEntity> response = client
              .template
              .updateTemplateItem(name, templateId)
              .description(description)
              .dataSet(dataSet)
              .entitlements(entitlements)
              .creatorEntitlements(creatorEntitlements)
              .exchange(exchange)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#updateTemplateItem");
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
| **templateId** | **UUID**|  | |
| **dataSetTemplateMetadata** | [**DataSetTemplateMetadata**](DataSetTemplateMetadata.md)|  | [optional] |

### Return type

[**DataSetTemplateEntity**](DataSetTemplateEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Updates a Template entry |  -  |

<a name="updateTemplateItem_0"></a>
# **updateTemplateItem_0**
> DataSetTemplateEntity updateTemplateItem_0(templateId).dataSetTemplatePatchMetadata(dataSetTemplatePatchMetadata).execute();

Update a template

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Agrimetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TemplateApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-test.agrimetrics.co.uk/catalog";
    Agrimetrics client = new Agrimetrics(configuration);
    UUID templateId = UUID.randomUUID();
    String description = "description_example";
    String name = "name_example";
    DataSetPatch dataSet = new DataSetPatch();
    List<BatchIdentityInputEntitlementsInner> entitlements = Arrays.asList();
    Entitlements creatorEntitlements = new Entitlements();
    try {
      DataSetTemplateEntity result = client
              .template
              .updateTemplateItem_0(templateId)
              .description(description)
              .name(name)
              .dataSet(dataSet)
              .entitlements(entitlements)
              .creatorEntitlements(creatorEntitlements)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDescription());
      System.out.println(result.getName());
      System.out.println(result.getDataSet());
      System.out.println(result.getEntitlements());
      System.out.println(result.getCreatorEntitlements());
      System.out.println(result.getExchange());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#updateTemplateItem_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DataSetTemplateEntity> response = client
              .template
              .updateTemplateItem_0(templateId)
              .description(description)
              .name(name)
              .dataSet(dataSet)
              .entitlements(entitlements)
              .creatorEntitlements(creatorEntitlements)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApi#updateTemplateItem_0");
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
| **templateId** | **UUID**|  | |
| **dataSetTemplatePatchMetadata** | [**DataSetTemplatePatchMetadata**](DataSetTemplatePatchMetadata.md)|  | [optional] |

### Return type

[**DataSetTemplateEntity**](DataSetTemplateEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Updates a Template entry |  -  |

