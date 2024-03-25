# DatasetApi

All URIs are relative to *https://api-test.agrimetrics.co.uk/catalog*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createFileDataset**](DatasetApi.md#createFileDataset) | **POST** /data-sets/{dataSetId}/fileDataset | Create and attach file dataset |
| [**createSingleCatalogEntry**](DatasetApi.md#createSingleCatalogEntry) | **POST** /data-sets | Create a single data set catalog entry. |
| [**deleteSingleDataSet**](DatasetApi.md#deleteSingleDataSet) | **DELETE** /data-sets/{dataSetId} | Delete a Data Set |
| [**discardDraftChanges**](DatasetApi.md#discardDraftChanges) | **DELETE** /data-sets/{dataSetId}/draft | Discards the draft changes on a data set catalog entry. |
| [**getDraftChanges**](DatasetApi.md#getDraftChanges) | **GET** /data-sets/{dataSetId}/draft | Get the draft changes on a data set catalog entry. |
| [**getEntitlements**](DatasetApi.md#getEntitlements) | **GET** /data-sets/{dataSetId}/access | Get the entitlements on a data set. |
| [**getFileDatasetId**](DatasetApi.md#getFileDatasetId) | **GET** /data-sets/{dataSetId}/fileDataset | Get file dataset id from dataset |
| [**getNonSpatialDataForGroup**](DatasetApi.md#getNonSpatialDataForGroup) | **GET** /harvest/{group}/dcat | Get the DCAT metadata for the given group. This will retrieve metadata for all the non spatial datasets in the public domain. |
| [**getSingleCatalogEntry**](DatasetApi.md#getSingleCatalogEntry) | **GET** /data-sets/{dataSetId} | Get a single data set catalog entry. |
| [**getValidationReport**](DatasetApi.md#getValidationReport) | **GET** /data-sets/{dataSetId}/validationReport | Get the schematron validation report using the data sets validation profile |
| [**getValidationReport_0**](DatasetApi.md#getValidationReport_0) | **GET** /data-sets/{dataSetId}/draft/validationReport | Get the schematron validation report using the data sets validation profile |
| [**listAllDataSets**](DatasetApi.md#listAllDataSets) | **GET** /data-sets | List all data sets. |
| [**listValidCategories**](DatasetApi.md#listValidCategories) | **GET** /categories | List all the valid categories of datasets. |
| [**listValidTags**](DatasetApi.md#listValidTags) | **GET** /tags | List all the valid tags that can be set on a data set. |
| [**setEntitlements**](DatasetApi.md#setEntitlements) | **PATCH** /data-sets/{dataSetId}/access | Set the entitlements and on a data set for all identities. |
| [**setImage**](DatasetApi.md#setImage) | **PUT** /data-sets/{dataSetId}/image | Set the image for a data set. |
| [**updateSingleCatalogEntry**](DatasetApi.md#updateSingleCatalogEntry) | **PATCH** /data-sets/{dataSetId} | Update a single data set catalog entry. |
| [**updateSingleEntry**](DatasetApi.md#updateSingleEntry) | **PUT** /data-sets/{dataSetId} | Update a single data set catalog entry. |


<a name="createFileDataset"></a>
# **createFileDataset**
> DatasetCreateFileDatasetResponse createFileDataset(dataSetId).execute();

Create and attach file dataset

Create and attach file dataset. If the file dataset already exists, this will not do anything. Note this should usually be automatically created when creating a catalogue entry. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Agrimetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DatasetApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-test.agrimetrics.co.uk/catalog";
    Agrimetrics client = new Agrimetrics(configuration);
    UUID dataSetId = UUID.randomUUID();
    try {
      DatasetCreateFileDatasetResponse result = client
              .dataset
              .createFileDataset(dataSetId)
              .execute();
      System.out.println(result);
      System.out.println(result.getFileDatasetId());
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#createFileDataset");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DatasetCreateFileDatasetResponse> response = client
              .dataset
              .createFileDataset(dataSetId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#createFileDataset");
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

### Return type

[**DatasetCreateFileDatasetResponse**](DatasetCreateFileDatasetResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the file management Id for this dataset |  -  |

<a name="createSingleCatalogEntry"></a>
# **createSingleCatalogEntry**
> EntryUpdateResponse createSingleCatalogEntry().body(body).execute();

Create a single data set catalog entry.

Creates a single catalog entry.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Agrimetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DatasetApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-test.agrimetrics.co.uk/catalog";
    Agrimetrics client = new Agrimetrics(configuration);
    try {
      EntryUpdateResponse result = client
              .dataset
              .createSingleCatalogEntry()
              .execute();
      System.out.println(result);
      System.out.println(result.getStatus());
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#createSingleCatalogEntry");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EntryUpdateResponse> response = client
              .dataset
              .createSingleCatalogEntry()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#createSingleCatalogEntry");
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
| **body** | **Object**| The data set to create. | [optional] |

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
| **201** | Creates a single catalog entry for a data set. |  -  |

<a name="deleteSingleDataSet"></a>
# **deleteSingleDataSet**
> DatasetDeleteSingleDataSetResponse deleteSingleDataSet(dataSetId).execute();

Delete a Data Set

Delete a single Data Set

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Agrimetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DatasetApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-test.agrimetrics.co.uk/catalog";
    Agrimetrics client = new Agrimetrics(configuration);
    UUID dataSetId = UUID.randomUUID();
    try {
      DatasetDeleteSingleDataSetResponse result = client
              .dataset
              .deleteSingleDataSet(dataSetId)
              .execute();
      System.out.println(result);
      System.out.println(result.getStatus());
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#deleteSingleDataSet");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DatasetDeleteSingleDataSetResponse> response = client
              .dataset
              .deleteSingleDataSet(dataSetId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#deleteSingleDataSet");
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

### Return type

[**DatasetDeleteSingleDataSetResponse**](DatasetDeleteSingleDataSetResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response if deleted properly |  -  |

<a name="discardDraftChanges"></a>
# **discardDraftChanges**
> discardDraftChanges(dataSetId).execute();

Discards the draft changes on a data set catalog entry.

Discards the draft changes on a data set catalog entry.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Agrimetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DatasetApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-test.agrimetrics.co.uk/catalog";
    Agrimetrics client = new Agrimetrics(configuration);
    UUID dataSetId = UUID.randomUUID();
    try {
      client
              .dataset
              .discardDraftChanges(dataSetId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#discardDraftChanges");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .dataset
              .discardDraftChanges(dataSetId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#discardDraftChanges");
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
| **200** | Draft changes were discarded. |  -  |

<a name="getDraftChanges"></a>
# **getDraftChanges**
> DataSet getDraftChanges(dataSetId).execute();

Get the draft changes on a data set catalog entry.

Get the draft changes on a data set catalog entry.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Agrimetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DatasetApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-test.agrimetrics.co.uk/catalog";
    Agrimetrics client = new Agrimetrics(configuration);
    UUID dataSetId = UUID.randomUUID();
    try {
      DataSet result = client
              .dataset
              .getDraftChanges(dataSetId)
              .execute();
      System.out.println(result);
      System.out.println(result.getTags());
      System.out.println(result.getSummary());
      System.out.println(result.getTitle());
      System.out.println(result.getDescription());
      System.out.println(result.getId());
      System.out.println(result.getEntryType());
      System.out.println(result.getExchange());
      System.out.println(result.getAlternativeTitles());
      System.out.println(result.getScoringURI());
      System.out.println(result.getEndpointKey());
      System.out.println(result.getIsOwner());
      System.out.println(result.getPublisher());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getPublished());
      System.out.println(result.getMetadataModified());
      System.out.println(result.getUsedBy());
      System.out.println(result.getDerivedFrom());
      System.out.println(result.getEntitlements());
      System.out.println(result.getEntitlementsByIdentity());
      System.out.println(result.getCreator());
      System.out.println(result.getDataReliability());
      System.out.println(result.getLicense());
      System.out.println(result.getLicence());
      System.out.println(result.getLandingPage());
      System.out.println(result.getResources());
      System.out.println(result.getDataFormats());
      System.out.println(result.getPricingDescription());
      System.out.println(result.getSpatialCoverage());
      System.out.println(result.getSpatialResolution());
      System.out.println(result.getGeospatialExtent());
      System.out.println(result.getTemporalCoverage());
      System.out.println(result.getTemporalResolution());
      System.out.println(result.getAccrualPeriodicity());
      System.out.println(result.getDistributions());
      System.out.println(result.getIssued());
      System.out.println(result.getModified());
      System.out.println(result.getKeywords());
      System.out.println(result.getTopics());
      System.out.println(result.getWorkflowKeywords());
      System.out.println(result.getTaxonomyKeywords());
      System.out.println(result.getCategory());
      System.out.println(result.getVisibility());
      System.out.println(result.getConcepts());
      System.out.println(result.getDataSet());
      System.out.println(result.getServices());
      System.out.println(result.getSampleData());
      System.out.println(result.getImage());
      System.out.println(result.getCoordinateReferenceSystemId());
      System.out.println(result.getSpatialRepresentationType());
      System.out.println(result.getLineage());
      System.out.println(result.getFromTemplate());
      System.out.println(result.getContacts());
      System.out.println(result.getMetadataContact());
      System.out.println(result.getPublicContact());
      System.out.println(result.getApprovalForAccessNumber());
      System.out.println(result.getApprovalForAccessStatus());
      System.out.println(result.getLanguage());
      System.out.println(result.getCharacterSet());
      System.out.println(result.getHierarchyLevel());
      System.out.println(result.getMetadataLanguage());
      System.out.println(result.getMetadataCharacterSet());
      System.out.println(result.getMetadataStandardName());
      System.out.println(result.getMetadataStandardVersion());
      System.out.println(result.getDraftStatus());
      System.out.println(result.getDraftNotes());
      System.out.println(result.getPublishedStatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#getDraftChanges");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DataSet> response = client
              .dataset
              .getDraftChanges(dataSetId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#getDraftChanges");
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

### Return type

[**DataSet**](DataSet.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the draft changes on a data set. |  -  |

<a name="getEntitlements"></a>
# **getEntitlements**
> DatasetGetEntitlementsResponse getEntitlements(dataSetId).execute();

Get the entitlements on a data set.

Gets the entitlements on a data set.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Agrimetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DatasetApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-test.agrimetrics.co.uk/catalog";
    Agrimetrics client = new Agrimetrics(configuration);
    UUID dataSetId = UUID.randomUUID();
    try {
      DatasetGetEntitlementsResponse result = client
              .dataset
              .getEntitlements(dataSetId)
              .execute();
      System.out.println(result);
      System.out.println(result.getEntitlements());
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#getEntitlements");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DatasetGetEntitlementsResponse> response = client
              .dataset
              .getEntitlements(dataSetId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#getEntitlements");
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

### Return type

[**DatasetGetEntitlementsResponse**](DatasetGetEntitlementsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The access set on the data set |  -  |

<a name="getFileDatasetId"></a>
# **getFileDatasetId**
> DatasetGetFileDatasetIdResponse getFileDatasetId(dataSetId).execute();

Get file dataset id from dataset

Get file dataset id from dataset

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Agrimetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DatasetApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-test.agrimetrics.co.uk/catalog";
    Agrimetrics client = new Agrimetrics(configuration);
    UUID dataSetId = UUID.randomUUID();
    try {
      DatasetGetFileDatasetIdResponse result = client
              .dataset
              .getFileDatasetId(dataSetId)
              .execute();
      System.out.println(result);
      System.out.println(result.getFileDatasetId());
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#getFileDatasetId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DatasetGetFileDatasetIdResponse> response = client
              .dataset
              .getFileDatasetId(dataSetId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#getFileDatasetId");
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

### Return type

[**DatasetGetFileDatasetIdResponse**](DatasetGetFileDatasetIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the file management Id for this dataset |  -  |

<a name="getNonSpatialDataForGroup"></a>
# **getNonSpatialDataForGroup**
> Object getNonSpatialDataForGroup(group).execute();

Get the DCAT metadata for the given group. This will retrieve metadata for all the non spatial datasets in the public domain.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Agrimetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DatasetApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-test.agrimetrics.co.uk/catalog";
    Agrimetrics client = new Agrimetrics(configuration);
    GroupCode group = GroupCode.fromValue("apha");
    try {
      Object result = client
              .dataset
              .getNonSpatialDataForGroup(group)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#getNonSpatialDataForGroup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .dataset
              .getNonSpatialDataForGroup(group)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#getNonSpatialDataForGroup");
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

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/turtle

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Metadata as DCAT |  -  |

<a name="getSingleCatalogEntry"></a>
# **getSingleCatalogEntry**
> DataSet getSingleCatalogEntry(dataSetId).execute();

Get a single data set catalog entry.

Get a single data set catalog entry.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Agrimetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DatasetApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-test.agrimetrics.co.uk/catalog";
    Agrimetrics client = new Agrimetrics(configuration);
    UUID dataSetId = UUID.randomUUID();
    try {
      DataSet result = client
              .dataset
              .getSingleCatalogEntry(dataSetId)
              .execute();
      System.out.println(result);
      System.out.println(result.getTags());
      System.out.println(result.getSummary());
      System.out.println(result.getTitle());
      System.out.println(result.getDescription());
      System.out.println(result.getId());
      System.out.println(result.getEntryType());
      System.out.println(result.getExchange());
      System.out.println(result.getAlternativeTitles());
      System.out.println(result.getScoringURI());
      System.out.println(result.getEndpointKey());
      System.out.println(result.getIsOwner());
      System.out.println(result.getPublisher());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getPublished());
      System.out.println(result.getMetadataModified());
      System.out.println(result.getUsedBy());
      System.out.println(result.getDerivedFrom());
      System.out.println(result.getEntitlements());
      System.out.println(result.getEntitlementsByIdentity());
      System.out.println(result.getCreator());
      System.out.println(result.getDataReliability());
      System.out.println(result.getLicense());
      System.out.println(result.getLicence());
      System.out.println(result.getLandingPage());
      System.out.println(result.getResources());
      System.out.println(result.getDataFormats());
      System.out.println(result.getPricingDescription());
      System.out.println(result.getSpatialCoverage());
      System.out.println(result.getSpatialResolution());
      System.out.println(result.getGeospatialExtent());
      System.out.println(result.getTemporalCoverage());
      System.out.println(result.getTemporalResolution());
      System.out.println(result.getAccrualPeriodicity());
      System.out.println(result.getDistributions());
      System.out.println(result.getIssued());
      System.out.println(result.getModified());
      System.out.println(result.getKeywords());
      System.out.println(result.getTopics());
      System.out.println(result.getWorkflowKeywords());
      System.out.println(result.getTaxonomyKeywords());
      System.out.println(result.getCategory());
      System.out.println(result.getVisibility());
      System.out.println(result.getConcepts());
      System.out.println(result.getDataSet());
      System.out.println(result.getServices());
      System.out.println(result.getSampleData());
      System.out.println(result.getImage());
      System.out.println(result.getCoordinateReferenceSystemId());
      System.out.println(result.getSpatialRepresentationType());
      System.out.println(result.getLineage());
      System.out.println(result.getFromTemplate());
      System.out.println(result.getContacts());
      System.out.println(result.getMetadataContact());
      System.out.println(result.getPublicContact());
      System.out.println(result.getApprovalForAccessNumber());
      System.out.println(result.getApprovalForAccessStatus());
      System.out.println(result.getLanguage());
      System.out.println(result.getCharacterSet());
      System.out.println(result.getHierarchyLevel());
      System.out.println(result.getMetadataLanguage());
      System.out.println(result.getMetadataCharacterSet());
      System.out.println(result.getMetadataStandardName());
      System.out.println(result.getMetadataStandardVersion());
      System.out.println(result.getDraftStatus());
      System.out.println(result.getDraftNotes());
      System.out.println(result.getPublishedStatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#getSingleCatalogEntry");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DataSet> response = client
              .dataset
              .getSingleCatalogEntry(dataSetId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#getSingleCatalogEntry");
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

### Return type

[**DataSet**](DataSet.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a single catalog entry from catalog. |  -  |

<a name="getValidationReport"></a>
# **getValidationReport**
> DatasetGetValidationReportResponse getValidationReport(dataSetId).execute();

Get the schematron validation report using the data sets validation profile

Get the schematron validation report using the data sets validation profile. Throws an error if there is no validation profile

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Agrimetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DatasetApi;
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
    UUID dataSetId = UUID.randomUUID();
    try {
      DatasetGetValidationReportResponse result = client
              .dataset
              .getValidationReport(dataSetId)
              .execute();
      System.out.println(result);
      System.out.println(result.getValid());
      System.out.println(result.getErrorMessages());
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#getValidationReport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DatasetGetValidationReportResponse> response = client
              .dataset
              .getValidationReport(dataSetId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#getValidationReport");
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

### Return type

[**DatasetGetValidationReportResponse**](DatasetGetValidationReportResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The image for the data set. |  -  |

<a name="getValidationReport_0"></a>
# **getValidationReport_0**
> DatasetGetValidationReport200Response getValidationReport_0(dataSetId).execute();

Get the schematron validation report using the data sets validation profile

Get the schematron validation report using the data sets validation profile. Throws an error if there is no validation profile

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Agrimetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DatasetApi;
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
    UUID dataSetId = UUID.randomUUID();
    try {
      DatasetGetValidationReport200Response result = client
              .dataset
              .getValidationReport_0(dataSetId)
              .execute();
      System.out.println(result);
      System.out.println(result.getValid());
      System.out.println(result.getErrorMessages());
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#getValidationReport_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DatasetGetValidationReport200Response> response = client
              .dataset
              .getValidationReport_0(dataSetId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#getValidationReport_0");
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

### Return type

[**DatasetGetValidationReport200Response**](DatasetGetValidationReport200Response.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The image for the data set. |  -  |

<a name="listAllDataSets"></a>
# **listAllDataSets**
> DataSets listAllDataSets().ids(ids).creator(creator).keywords(keywords).tags(tags).tagRelationship(tagRelationship).category(category).spatialCoverage(spatialCoverage).text(text).extendedText(extendedText).identities(identities).onlyFeatured(onlyFeatured).showEditable(showEditable).showHidden(showHidden).pageNum(pageNum).pageSize(pageSize).offset(offset).searchType(searchType).limit(limit).legacyConcepts(legacyConcepts).sort(sort).exchange(exchange).metadataStandardName(metadataStandardName).draftStatus(draftStatus).publishedStatus(publishedStatus).licence(licence).execute();

List all data sets.

List all data sets.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Agrimetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DatasetApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-test.agrimetrics.co.uk/catalog";
    Agrimetrics client = new Agrimetrics(configuration);
    List<String> ids = Arrays.asList(); // List of data set ids
    List<String> creator = Arrays.asList(); // The creator of the data set.
    List<String> keywords = Arrays.asList(); // Tags describing the data set. keywords is deprecated - use tags instead
    List<String> tags = Arrays.asList(); // Tags describing the data set.
    Relationship tagRelationship = Relationship.fromValue("narrower"); // Note - This feature will no longer be available as we are in the process of moving to a different backend and will soon be removed. If provided, include data sets that have been tagged with concepts that are related to the values provided in the `tags` parameter. If not provided, only include data sets tagged with exact matches.
    List<CategoryValue> category = Arrays.asList(); // Indicates the type of data
    List<SpatialCoverage> spatialCoverage = Arrays.asList(); // The region the data is applicable to.
    String text = "Weather"; // Note - Use extendedText. This field has been deprecated. Free text search for data sets.
    String extendedText = "Soil"; // Free text search for data sets matching title; summary; description; tags; concepts; and source.
    List<String> identities = Arrays.asList(); // Only show datasets accessible by these identities. Can be 'PUBLIC', a user ID or an organisation ID.
    Boolean onlyFeatured = true; // Defines whether to return only featured data sets
    Boolean showEditable = true; // Defines whether my editable data sets should be shown.
    Boolean showHidden = true; // Defines whether hidden data sets should be shown.
    Integer pageNum = 56; // Set the page number. Should not be specified in conjunction with offset or limit.
    Integer pageSize = 56; // Set the page size. Should not be specified in conjunction with offset or limit.
    Integer offset = 56; // Set the pagination offset. Should not be specified in conjunction with pageNum or pageSize.
    String searchType = "title"; // Choose whether to search across all metadata on a data set, or just the title.
    Integer limit = 56; // Set the pagination limit. Should not be specified in conjunction with pageNum or pageSize.
    Boolean legacyConcepts = true; // Note - This feature will no longer be available once we move to a different backend. \"Format response to convert any new concepts to legacy concepts\"
    String sort = "title"; // Criterion by which to order the results
    Exchange exchange = Exchange.fromValue("agrimetrics"); // The private data exchange for which to retrieve records
    List<String> metadataStandardName = Arrays.asList();
    List<DraftStatus> draftStatus = Arrays.asList();
    List<Object> publishedStatus = null;
    List<String> licence = Arrays.asList();
    try {
      DataSets result = client
              .dataset
              .listAllDataSets()
              .ids(ids)
              .creator(creator)
              .keywords(keywords)
              .tags(tags)
              .tagRelationship(tagRelationship)
              .category(category)
              .spatialCoverage(spatialCoverage)
              .text(text)
              .extendedText(extendedText)
              .identities(identities)
              .onlyFeatured(onlyFeatured)
              .showEditable(showEditable)
              .showHidden(showHidden)
              .pageNum(pageNum)
              .pageSize(pageSize)
              .offset(offset)
              .searchType(searchType)
              .limit(limit)
              .legacyConcepts(legacyConcepts)
              .sort(sort)
              .exchange(exchange)
              .metadataStandardName(metadataStandardName)
              .draftStatus(draftStatus)
              .publishedStatus(publishedStatus)
              .licence(licence)
              .execute();
      System.out.println(result);
      System.out.println(result.getDataSets());
      System.out.println(result.getConcepts());
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#listAllDataSets");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DataSets> response = client
              .dataset
              .listAllDataSets()
              .ids(ids)
              .creator(creator)
              .keywords(keywords)
              .tags(tags)
              .tagRelationship(tagRelationship)
              .category(category)
              .spatialCoverage(spatialCoverage)
              .text(text)
              .extendedText(extendedText)
              .identities(identities)
              .onlyFeatured(onlyFeatured)
              .showEditable(showEditable)
              .showHidden(showHidden)
              .pageNum(pageNum)
              .pageSize(pageSize)
              .offset(offset)
              .searchType(searchType)
              .limit(limit)
              .legacyConcepts(legacyConcepts)
              .sort(sort)
              .exchange(exchange)
              .metadataStandardName(metadataStandardName)
              .draftStatus(draftStatus)
              .publishedStatus(publishedStatus)
              .licence(licence)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#listAllDataSets");
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
| **ids** | [**List&lt;String&gt;**](String.md)| List of data set ids | [optional] |
| **creator** | [**List&lt;String&gt;**](String.md)| The creator of the data set. | [optional] |
| **keywords** | [**List&lt;String&gt;**](String.md)| Tags describing the data set. keywords is deprecated - use tags instead | [optional] |
| **tags** | [**List&lt;String&gt;**](String.md)| Tags describing the data set. | [optional] |
| **tagRelationship** | [**Relationship**](.md)| Note - This feature will no longer be available as we are in the process of moving to a different backend and will soon be removed. If provided, include data sets that have been tagged with concepts that are related to the values provided in the &#x60;tags&#x60; parameter. If not provided, only include data sets tagged with exact matches. | [optional] [enum: narrower, broader] |
| **category** | [**List&lt;CategoryValue&gt;**](CategoryValue.md)| Indicates the type of data | [optional] |
| **spatialCoverage** | [**List&lt;SpatialCoverage&gt;**](SpatialCoverage.md)| The region the data is applicable to. | [optional] |
| **text** | **String**| Note - Use extendedText. This field has been deprecated. Free text search for data sets. | [optional] |
| **extendedText** | **String**| Free text search for data sets matching title; summary; description; tags; concepts; and source. | [optional] |
| **identities** | [**List&lt;String&gt;**](String.md)| Only show datasets accessible by these identities. Can be &#39;PUBLIC&#39;, a user ID or an organisation ID. | [optional] |
| **onlyFeatured** | **Boolean**| Defines whether to return only featured data sets | [optional] |
| **showEditable** | **Boolean**| Defines whether my editable data sets should be shown. | [optional] |
| **showHidden** | **Boolean**| Defines whether hidden data sets should be shown. | [optional] |
| **pageNum** | **Integer**| Set the page number. Should not be specified in conjunction with offset or limit. | [optional] |
| **pageSize** | **Integer**| Set the page size. Should not be specified in conjunction with offset or limit. | [optional] |
| **offset** | **Integer**| Set the pagination offset. Should not be specified in conjunction with pageNum or pageSize. | [optional] |
| **searchType** | **String**| Choose whether to search across all metadata on a data set, or just the title. | [optional] [enum: title, all] |
| **limit** | **Integer**| Set the pagination limit. Should not be specified in conjunction with pageNum or pageSize. | [optional] |
| **legacyConcepts** | **Boolean**| Note - This feature will no longer be available once we move to a different backend. \&quot;Format response to convert any new concepts to legacy concepts\&quot; | [optional] |
| **sort** | **String**| Criterion by which to order the results | [optional] [enum: title, title-descending, relevance] |
| **exchange** | [**Exchange**](.md)| The private data exchange for which to retrieve records | [optional] [enum: agrimetrics, defra] |
| **metadataStandardName** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **draftStatus** | [**List&lt;DraftStatus&gt;**](DraftStatus.md)|  | [optional] |
| **publishedStatus** | [**List&lt;Object&gt;**](Object.md)|  | [optional] |
| **licence** | [**List&lt;String&gt;**](String.md)|  | [optional] |

### Return type

[**DataSets**](DataSets.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List all data sets. |  -  |

<a name="listValidCategories"></a>
# **listValidCategories**
> List&lt;Category&gt; listValidCategories().execute();

List all the valid categories of datasets.

List all the valid categories of datasets.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Agrimetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DatasetApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-test.agrimetrics.co.uk/catalog";
    Agrimetrics client = new Agrimetrics(configuration);
    try {
      List<Category> result = client
              .dataset
              .listValidCategories()
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#listValidCategories");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Category>> response = client
              .dataset
              .listValidCategories()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#listValidCategories");
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

[**List&lt;Category&gt;**](Category.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of categories |  -  |

<a name="listValidTags"></a>
# **listValidTags**
> DatasetListValidTagsResponse listValidTags().execute();

List all the valid tags that can be set on a data set.

List all the valid tags that can be set on a data set.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Agrimetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DatasetApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-test.agrimetrics.co.uk/catalog";
    Agrimetrics client = new Agrimetrics(configuration);
    try {
      DatasetListValidTagsResponse result = client
              .dataset
              .listValidTags()
              .execute();
      System.out.println(result);
      System.out.println(result.getTags());
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#listValidTags");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DatasetListValidTagsResponse> response = client
              .dataset
              .listValidTags()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#listValidTags");
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

[**DatasetListValidTagsResponse**](DatasetListValidTagsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of tags the user can use |  -  |

<a name="setEntitlements"></a>
# **setEntitlements**
> Object setEntitlements(dataSetId).datasetSetEntitlementsRequest(datasetSetEntitlementsRequest).execute();

Set the entitlements and on a data set for all identities.

Set the entitlements and on a data set for all identities.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Agrimetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DatasetApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-test.agrimetrics.co.uk/catalog";
    Agrimetrics client = new Agrimetrics(configuration);
    List<BatchIdentityInputEntitlementsInner> entitlements = Arrays.asList();
    UUID dataSetId = UUID.randomUUID();
    try {
      Object result = client
              .dataset
              .setEntitlements(entitlements, dataSetId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#setEntitlements");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .dataset
              .setEntitlements(entitlements, dataSetId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#setEntitlements");
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
| **datasetSetEntitlementsRequest** | [**DatasetSetEntitlementsRequest**](DatasetSetEntitlementsRequest.md)| The access to update. | [optional] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The access set on the data set |  -  |

<a name="setImage"></a>
# **setImage**
> setImage(dataSetId).execute();

Set the image for a data set.

Set the image for a data set. Can either be an image upload a plain text string representing the unsplash image id.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Agrimetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DatasetApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-test.agrimetrics.co.uk/catalog";
    Agrimetrics client = new Agrimetrics(configuration);
    UUID dataSetId = UUID.randomUUID();
    try {
      client
              .dataset
              .setImage(dataSetId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#setImage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .dataset
              .setImage(dataSetId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#setImage");
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
| **200** | The imageUrl for the data set. |  -  |

<a name="updateSingleCatalogEntry"></a>
# **updateSingleCatalogEntry**
> DataSet updateSingleCatalogEntry(dataSetId, dataSetPatch).execute();

Update a single data set catalog entry.

Updates a single catalog entry.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Agrimetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DatasetApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-test.agrimetrics.co.uk/catalog";
    Agrimetrics client = new Agrimetrics(configuration);
    UUID dataSetId = UUID.randomUUID();
    List<String> tags = Arrays.asList(); // List of tags on this data set.
    String summary = "summary_example"; // Summary of the data set.
    String title = "title_example"; // Title for the data set.
    String description = "description_example"; // Description of the data set.
    List<String> alternativeTitles = Arrays.asList();
    String scoringURI = "scoringURI_example"; // ScoringURI for the model.
    String endpointKey = "endpointKey_example"; // Endpoint key for the model.
    List<Object> derivedFrom = Arrays.asList(null); // Data sets used to generate this data set. When updating a data set, use an array of IDs. When GETting the data set, the return type will be `BasicDataSetInfo`. 
    String creator = "creator_example"; // Creator of the data set.
    String dataReliability = "dataReliability_example"; // Free text description about the reliability of this dataset.
    String license = "license_example"; // License of the data set.
    DataSetPatchLicence licence = new DataSetPatchLicence();
    List<Resource> resources = Arrays.asList(); // Links containing more information on the data set
    List<DataFormat> dataFormats = Arrays.asList(); // Format of the data set
    String spatialCoverage = "United Kingdom"; // The geo spatial coverage of the data set.
    Double spatialResolution = 3.4D; // The resolution of data set in meters.
    DataSetPatchGeospatialExtent geospatialExtent = new DataSetPatchGeospatialExtent();
    String temporalCoverage = "temporalCoverage_example"; // The time frame this data set covers.
    DataSetPatchTemporalExtent temporalExtent = new DataSetPatchTemporalExtent();
    String temporalResolution = "P1Y"; // The sampling time period of the data set.
    List<Topic> topics = Arrays.asList();
    List<WorkflowKeywords> workflowKeywords = Arrays.asList(); // List of workflow keywords on this data set
    List<TaxonomyKeywords> taxonomyKeywords = Arrays.asList(); // List of keywords based on specific taxonomies
    String accrualPeriodicity = "Hourly"; // The frequency at which data set is published.
    String issued = "issued_example"; // The date when the data set was issued.
    Double createdAt = 3.4D; // Data set creation timestamp.
    Double published = 3.4D; // Data set publication timestamp.
    PublishedStatus publishedStatus = PublishedStatus.fromValue("published");
    Double modified = 3.4D; // An timestamp of when the data in this dataset was last updated
    CategoryValue category = CategoryValue.fromValue("free");
    String visibility = "visible"; // Whether or not this data set should be displayed in the index.
    String pricingDescription = "pricingDescription_example"; // Pricing description of the data set.
    List<DataSetDistributionsInner> distributions = Arrays.asList();
    Double approvalForAccessNumber = 3.4D; // Approval for access status number
    String approvalForAccessStatus = "AfA (Information Requests only)"; // Approval for access status value
    List<Contact> contacts = Arrays.asList(); // List of contacts for this data set
    DataSetPatchMetadataContact metadataContact = new DataSetPatchMetadataContact();
    String lineage = "lineage_example"; // Information about the creation and quality assurance process of the dataset
    String language = "language_example"; // Language used on the data set
    String characterSet = "characterSet_example"; // Character set used on the data set
    String hierarchyLevel = "hierarchyLevel_example"; // Hierarchy level of the data set
    String metadataLanguage = "metadataLanguage_example"; // Language used on the metadata
    String metadataCharacterSet = "metadataCharacterSet_example"; // Character set used on the metadata
    String metadataStandardName = "metadataStandardName_example";
    String metadataStandardVersion = "metadataStandardVersion_example";
    String coordinateReferenceSystemId = "coordinateReferenceSystemId_example"; // URL to the specification of the coordinate system used in the data
    String spatialRepresentationType = "spatialRepresentationType_example"; // Type of the geospatial data
    try {
      DataSet result = client
              .dataset
              .updateSingleCatalogEntry(dataSetId)
              .tags(tags)
              .summary(summary)
              .title(title)
              .description(description)
              .alternativeTitles(alternativeTitles)
              .scoringURI(scoringURI)
              .endpointKey(endpointKey)
              .derivedFrom(derivedFrom)
              .creator(creator)
              .dataReliability(dataReliability)
              .license(license)
              .licence(licence)
              .resources(resources)
              .dataFormats(dataFormats)
              .spatialCoverage(spatialCoverage)
              .spatialResolution(spatialResolution)
              .geospatialExtent(geospatialExtent)
              .temporalCoverage(temporalCoverage)
              .temporalExtent(temporalExtent)
              .temporalResolution(temporalResolution)
              .topics(topics)
              .workflowKeywords(workflowKeywords)
              .taxonomyKeywords(taxonomyKeywords)
              .accrualPeriodicity(accrualPeriodicity)
              .issued(issued)
              .createdAt(createdAt)
              .published(published)
              .publishedStatus(publishedStatus)
              .modified(modified)
              .category(category)
              .visibility(visibility)
              .pricingDescription(pricingDescription)
              .distributions(distributions)
              .approvalForAccessNumber(approvalForAccessNumber)
              .approvalForAccessStatus(approvalForAccessStatus)
              .contacts(contacts)
              .metadataContact(metadataContact)
              .lineage(lineage)
              .language(language)
              .characterSet(characterSet)
              .hierarchyLevel(hierarchyLevel)
              .metadataLanguage(metadataLanguage)
              .metadataCharacterSet(metadataCharacterSet)
              .metadataStandardName(metadataStandardName)
              .metadataStandardVersion(metadataStandardVersion)
              .coordinateReferenceSystemId(coordinateReferenceSystemId)
              .spatialRepresentationType(spatialRepresentationType)
              .execute();
      System.out.println(result);
      System.out.println(result.getTags());
      System.out.println(result.getSummary());
      System.out.println(result.getTitle());
      System.out.println(result.getDescription());
      System.out.println(result.getId());
      System.out.println(result.getEntryType());
      System.out.println(result.getExchange());
      System.out.println(result.getAlternativeTitles());
      System.out.println(result.getScoringURI());
      System.out.println(result.getEndpointKey());
      System.out.println(result.getIsOwner());
      System.out.println(result.getPublisher());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getPublished());
      System.out.println(result.getMetadataModified());
      System.out.println(result.getUsedBy());
      System.out.println(result.getDerivedFrom());
      System.out.println(result.getEntitlements());
      System.out.println(result.getEntitlementsByIdentity());
      System.out.println(result.getCreator());
      System.out.println(result.getDataReliability());
      System.out.println(result.getLicense());
      System.out.println(result.getLicence());
      System.out.println(result.getLandingPage());
      System.out.println(result.getResources());
      System.out.println(result.getDataFormats());
      System.out.println(result.getPricingDescription());
      System.out.println(result.getSpatialCoverage());
      System.out.println(result.getSpatialResolution());
      System.out.println(result.getGeospatialExtent());
      System.out.println(result.getTemporalCoverage());
      System.out.println(result.getTemporalResolution());
      System.out.println(result.getAccrualPeriodicity());
      System.out.println(result.getDistributions());
      System.out.println(result.getIssued());
      System.out.println(result.getModified());
      System.out.println(result.getKeywords());
      System.out.println(result.getTopics());
      System.out.println(result.getWorkflowKeywords());
      System.out.println(result.getTaxonomyKeywords());
      System.out.println(result.getCategory());
      System.out.println(result.getVisibility());
      System.out.println(result.getConcepts());
      System.out.println(result.getDataSet());
      System.out.println(result.getServices());
      System.out.println(result.getSampleData());
      System.out.println(result.getImage());
      System.out.println(result.getCoordinateReferenceSystemId());
      System.out.println(result.getSpatialRepresentationType());
      System.out.println(result.getLineage());
      System.out.println(result.getFromTemplate());
      System.out.println(result.getContacts());
      System.out.println(result.getMetadataContact());
      System.out.println(result.getPublicContact());
      System.out.println(result.getApprovalForAccessNumber());
      System.out.println(result.getApprovalForAccessStatus());
      System.out.println(result.getLanguage());
      System.out.println(result.getCharacterSet());
      System.out.println(result.getHierarchyLevel());
      System.out.println(result.getMetadataLanguage());
      System.out.println(result.getMetadataCharacterSet());
      System.out.println(result.getMetadataStandardName());
      System.out.println(result.getMetadataStandardVersion());
      System.out.println(result.getDraftStatus());
      System.out.println(result.getDraftNotes());
      System.out.println(result.getPublishedStatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#updateSingleCatalogEntry");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DataSet> response = client
              .dataset
              .updateSingleCatalogEntry(dataSetId)
              .tags(tags)
              .summary(summary)
              .title(title)
              .description(description)
              .alternativeTitles(alternativeTitles)
              .scoringURI(scoringURI)
              .endpointKey(endpointKey)
              .derivedFrom(derivedFrom)
              .creator(creator)
              .dataReliability(dataReliability)
              .license(license)
              .licence(licence)
              .resources(resources)
              .dataFormats(dataFormats)
              .spatialCoverage(spatialCoverage)
              .spatialResolution(spatialResolution)
              .geospatialExtent(geospatialExtent)
              .temporalCoverage(temporalCoverage)
              .temporalExtent(temporalExtent)
              .temporalResolution(temporalResolution)
              .topics(topics)
              .workflowKeywords(workflowKeywords)
              .taxonomyKeywords(taxonomyKeywords)
              .accrualPeriodicity(accrualPeriodicity)
              .issued(issued)
              .createdAt(createdAt)
              .published(published)
              .publishedStatus(publishedStatus)
              .modified(modified)
              .category(category)
              .visibility(visibility)
              .pricingDescription(pricingDescription)
              .distributions(distributions)
              .approvalForAccessNumber(approvalForAccessNumber)
              .approvalForAccessStatus(approvalForAccessStatus)
              .contacts(contacts)
              .metadataContact(metadataContact)
              .lineage(lineage)
              .language(language)
              .characterSet(characterSet)
              .hierarchyLevel(hierarchyLevel)
              .metadataLanguage(metadataLanguage)
              .metadataCharacterSet(metadataCharacterSet)
              .metadataStandardName(metadataStandardName)
              .metadataStandardVersion(metadataStandardVersion)
              .coordinateReferenceSystemId(coordinateReferenceSystemId)
              .spatialRepresentationType(spatialRepresentationType)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#updateSingleCatalogEntry");
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
| **dataSetPatch** | [**DataSetPatch**](DataSetPatch.md)| The updated data set information. | |

### Return type

[**DataSet**](DataSet.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Updates a single catalog entry for a data set. |  -  |

<a name="updateSingleEntry"></a>
# **updateSingleEntry**
> DataSet updateSingleEntry(dataSetId, dataSet).execute();

Update a single data set catalog entry.

Updates a single catalog entry.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Agrimetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DatasetApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-test.agrimetrics.co.uk/catalog";
    Agrimetrics client = new Agrimetrics(configuration);
    String title = "title_example"; // Title for the data set.
    String description = "description_example"; // Description of the data set.
    EntryType entryType = EntryType.fromValue("model");
    UUID dataSetId = UUID.randomUUID();
    List<String> tags = Arrays.asList(); // List of tags on this data set.
    String summary = "summary_example"; // Summary of the data set.
    UUID id = UUID.randomUUID(); // The ID of a dataset in the catalog
    Exchange exchange = Exchange.fromValue("agrimetrics");
    List<String> alternativeTitles = Arrays.asList();
    String scoringURI = "scoringURI_example"; // Scoring URI of the model.
    String endpointKey = "endpointKey_example"; // Endpoint key for the model.
    Boolean isOwner = true; // Whether the current user is the owner of this data set.
    String publisher = "publisher_example"; // The ID of the publisher.
    Double createdAt = 3.4D; // Data set creation timestamp.
    Double published = 3.4D; // Data set publication timestamp.
    Double metadataModified = 3.4D; // Metadata last-modification timestmap.
    List<BasicDataSetInfo> usedBy = Arrays.asList(); // Other data sets using this data set.
    List<Object> derivedFrom = Arrays.asList(null); // Data sets used to generate this data set. When updating a data set, use an array of IDs. When GETting the data set, the return type will be `BasicDataSetInfo`. 
    List<Entitlement> entitlements = Arrays.asList(); // Entitlements for the current user.
    Map<String, List<Entitlement>> entitlementsByIdentity = new HashMap(); // Array of entitlements by user identity.
    String creator = "creator_example"; // Creator of the data set.
    String dataReliability = "dataReliability_example"; // Free text description about the reliability of this dataset.
    String license = "license_example"; // License of the data set.
    Licence licence = new Licence();
    String landingPage = "landingPage_example"; // DEPRECATED. This has been replaced with the resources attribute. Reference URI of the data set.
    List<Resource> resources = Arrays.asList(); // Links containing more information on the data set
    List<DataFormat> dataFormats = Arrays.asList(); // Format of the data set
    String pricingDescription = "pricingDescription_example"; // Pricing description of the data set.
    SpatialCoverage spatialCoverage = SpatialCoverage.fromValue("United Kingdom");
    Double spatialResolution = 3.4D; // The resolution of data set in meters.
    GeospatialExtent geospatialExtent = new GeospatialExtent();
    String temporalCoverage = "temporalCoverage_example"; // The time frame this data set covers.
    String temporalResolution = "P1Y"; // The sampling time period of the data set.
    AccrualPeriodicity accrualPeriodicity = AccrualPeriodicity.fromValue("Hourly");
    List<DataSetDistributionsInner> distributions = Arrays.asList();
    String issued = "issued_example"; // The date when the data set was issued.
    Double modified = 3.4D; // An timestamp of when the data in this dataset was last updated
    List<String> keywords = Arrays.asList(); // List of keywords on this data set. keywords is deprecated - use tags instead
    List<Topic> topics = Arrays.asList(); // List of topics on this data set
    List<WorkflowKeywords> workflowKeywords = Arrays.asList(); // List of workflow keywords on this data set
    List<TaxonomyKeywords> taxonomyKeywords = Arrays.asList(); // List of keywords based on specific taxonomies
    CategoryValue category = CategoryValue.fromValue("free");
    String visibility = "visible"; // Whether or not this data set should be displayed in the index.
    List<String> concepts = Arrays.asList(); // List of concepts on this data set. Check the concepts endpoint to see valid values.
    DataSetDataSet dataSet = new DataSetDataSet();
    List<DataSetServicesInner> services = Arrays.asList(); // List of services available on the data set
    DataSetSampleData sampleData = new DataSetSampleData();
    ImageRepresentation image = new ImageRepresentation();
    String coordinateReferenceSystemId = "coordinateReferenceSystemId_example"; // URL to the specification of the coordinate system used in the data
    String spatialRepresentationType = "spatialRepresentationType_example"; // Type of the geospatial data
    String lineage = "lineage_example"; // Information about the creation and quality assurance process of the dataset
    String fromTemplate = "fromTemplate_example"; // Information about which template was used to create the dataset record
    List<Contact> contacts = Arrays.asList(); // List of contacts for this data set
    Contact metadataContact = new Contact();
    PublicContact publicContact = new PublicContact();
    Double approvalForAccessNumber = 3.4D; // Approval for access status number
    String approvalForAccessStatus = "AfA (Information Requests only)"; // Approval for access status value
    String language = "language_example"; // Language used on the data set
    String characterSet = "characterSet_example"; // Character set used on the data set
    String hierarchyLevel = "hierarchyLevel_example"; // Hierarchy level of the data set
    String metadataLanguage = "metadataLanguage_example"; // Language used on the metadata
    String metadataCharacterSet = "metadataCharacterSet_example"; // Character set used on the metadata
    String metadataStandardName = "metadataStandardName_example";
    String metadataStandardVersion = "metadataStandardVersion_example";
    DraftStatus draftStatus = DraftStatus.fromValue("submitted");
    String draftNotes = "draftNotes_example"; // Any notes added during review of the data set
    PublishedStatus publishedStatus = PublishedStatus.fromValue("published");
    try {
      DataSet result = client
              .dataset
              .updateSingleEntry(title, description, entryType, dataSetId)
              .tags(tags)
              .summary(summary)
              .id(id)
              .exchange(exchange)
              .alternativeTitles(alternativeTitles)
              .scoringURI(scoringURI)
              .endpointKey(endpointKey)
              .isOwner(isOwner)
              .publisher(publisher)
              .createdAt(createdAt)
              .published(published)
              .metadataModified(metadataModified)
              .usedBy(usedBy)
              .derivedFrom(derivedFrom)
              .entitlements(entitlements)
              .entitlementsByIdentity(entitlementsByIdentity)
              .creator(creator)
              .dataReliability(dataReliability)
              .license(license)
              .licence(licence)
              .landingPage(landingPage)
              .resources(resources)
              .dataFormats(dataFormats)
              .pricingDescription(pricingDescription)
              .spatialCoverage(spatialCoverage)
              .spatialResolution(spatialResolution)
              .geospatialExtent(geospatialExtent)
              .temporalCoverage(temporalCoverage)
              .temporalResolution(temporalResolution)
              .accrualPeriodicity(accrualPeriodicity)
              .distributions(distributions)
              .issued(issued)
              .modified(modified)
              .keywords(keywords)
              .topics(topics)
              .workflowKeywords(workflowKeywords)
              .taxonomyKeywords(taxonomyKeywords)
              .category(category)
              .visibility(visibility)
              .concepts(concepts)
              .dataSet(dataSet)
              .services(services)
              .sampleData(sampleData)
              .image(image)
              .coordinateReferenceSystemId(coordinateReferenceSystemId)
              .spatialRepresentationType(spatialRepresentationType)
              .lineage(lineage)
              .fromTemplate(fromTemplate)
              .contacts(contacts)
              .metadataContact(metadataContact)
              .publicContact(publicContact)
              .approvalForAccessNumber(approvalForAccessNumber)
              .approvalForAccessStatus(approvalForAccessStatus)
              .language(language)
              .characterSet(characterSet)
              .hierarchyLevel(hierarchyLevel)
              .metadataLanguage(metadataLanguage)
              .metadataCharacterSet(metadataCharacterSet)
              .metadataStandardName(metadataStandardName)
              .metadataStandardVersion(metadataStandardVersion)
              .draftStatus(draftStatus)
              .draftNotes(draftNotes)
              .publishedStatus(publishedStatus)
              .execute();
      System.out.println(result);
      System.out.println(result.getTags());
      System.out.println(result.getSummary());
      System.out.println(result.getTitle());
      System.out.println(result.getDescription());
      System.out.println(result.getId());
      System.out.println(result.getEntryType());
      System.out.println(result.getExchange());
      System.out.println(result.getAlternativeTitles());
      System.out.println(result.getScoringURI());
      System.out.println(result.getEndpointKey());
      System.out.println(result.getIsOwner());
      System.out.println(result.getPublisher());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getPublished());
      System.out.println(result.getMetadataModified());
      System.out.println(result.getUsedBy());
      System.out.println(result.getDerivedFrom());
      System.out.println(result.getEntitlements());
      System.out.println(result.getEntitlementsByIdentity());
      System.out.println(result.getCreator());
      System.out.println(result.getDataReliability());
      System.out.println(result.getLicense());
      System.out.println(result.getLicence());
      System.out.println(result.getLandingPage());
      System.out.println(result.getResources());
      System.out.println(result.getDataFormats());
      System.out.println(result.getPricingDescription());
      System.out.println(result.getSpatialCoverage());
      System.out.println(result.getSpatialResolution());
      System.out.println(result.getGeospatialExtent());
      System.out.println(result.getTemporalCoverage());
      System.out.println(result.getTemporalResolution());
      System.out.println(result.getAccrualPeriodicity());
      System.out.println(result.getDistributions());
      System.out.println(result.getIssued());
      System.out.println(result.getModified());
      System.out.println(result.getKeywords());
      System.out.println(result.getTopics());
      System.out.println(result.getWorkflowKeywords());
      System.out.println(result.getTaxonomyKeywords());
      System.out.println(result.getCategory());
      System.out.println(result.getVisibility());
      System.out.println(result.getConcepts());
      System.out.println(result.getDataSet());
      System.out.println(result.getServices());
      System.out.println(result.getSampleData());
      System.out.println(result.getImage());
      System.out.println(result.getCoordinateReferenceSystemId());
      System.out.println(result.getSpatialRepresentationType());
      System.out.println(result.getLineage());
      System.out.println(result.getFromTemplate());
      System.out.println(result.getContacts());
      System.out.println(result.getMetadataContact());
      System.out.println(result.getPublicContact());
      System.out.println(result.getApprovalForAccessNumber());
      System.out.println(result.getApprovalForAccessStatus());
      System.out.println(result.getLanguage());
      System.out.println(result.getCharacterSet());
      System.out.println(result.getHierarchyLevel());
      System.out.println(result.getMetadataLanguage());
      System.out.println(result.getMetadataCharacterSet());
      System.out.println(result.getMetadataStandardName());
      System.out.println(result.getMetadataStandardVersion());
      System.out.println(result.getDraftStatus());
      System.out.println(result.getDraftNotes());
      System.out.println(result.getPublishedStatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#updateSingleEntry");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DataSet> response = client
              .dataset
              .updateSingleEntry(title, description, entryType, dataSetId)
              .tags(tags)
              .summary(summary)
              .id(id)
              .exchange(exchange)
              .alternativeTitles(alternativeTitles)
              .scoringURI(scoringURI)
              .endpointKey(endpointKey)
              .isOwner(isOwner)
              .publisher(publisher)
              .createdAt(createdAt)
              .published(published)
              .metadataModified(metadataModified)
              .usedBy(usedBy)
              .derivedFrom(derivedFrom)
              .entitlements(entitlements)
              .entitlementsByIdentity(entitlementsByIdentity)
              .creator(creator)
              .dataReliability(dataReliability)
              .license(license)
              .licence(licence)
              .landingPage(landingPage)
              .resources(resources)
              .dataFormats(dataFormats)
              .pricingDescription(pricingDescription)
              .spatialCoverage(spatialCoverage)
              .spatialResolution(spatialResolution)
              .geospatialExtent(geospatialExtent)
              .temporalCoverage(temporalCoverage)
              .temporalResolution(temporalResolution)
              .accrualPeriodicity(accrualPeriodicity)
              .distributions(distributions)
              .issued(issued)
              .modified(modified)
              .keywords(keywords)
              .topics(topics)
              .workflowKeywords(workflowKeywords)
              .taxonomyKeywords(taxonomyKeywords)
              .category(category)
              .visibility(visibility)
              .concepts(concepts)
              .dataSet(dataSet)
              .services(services)
              .sampleData(sampleData)
              .image(image)
              .coordinateReferenceSystemId(coordinateReferenceSystemId)
              .spatialRepresentationType(spatialRepresentationType)
              .lineage(lineage)
              .fromTemplate(fromTemplate)
              .contacts(contacts)
              .metadataContact(metadataContact)
              .publicContact(publicContact)
              .approvalForAccessNumber(approvalForAccessNumber)
              .approvalForAccessStatus(approvalForAccessStatus)
              .language(language)
              .characterSet(characterSet)
              .hierarchyLevel(hierarchyLevel)
              .metadataLanguage(metadataLanguage)
              .metadataCharacterSet(metadataCharacterSet)
              .metadataStandardName(metadataStandardName)
              .metadataStandardVersion(metadataStandardVersion)
              .draftStatus(draftStatus)
              .draftNotes(draftNotes)
              .publishedStatus(publishedStatus)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#updateSingleEntry");
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
| **dataSet** | [**DataSet**](DataSet.md)| The updated data set information. | |

### Return type

[**DataSet**](DataSet.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Updates a single catalog entry for a data set. |  -  |

