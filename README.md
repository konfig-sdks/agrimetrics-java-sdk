<div align="center">

[![Visit Agrimetrics](./header.png)](https://agrimetrics.co.uk)

# [Agrimetrics](https://agrimetrics.co.uk)

This API lists data sets available on Agrimetrics platform.

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Agrimetrics&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>agrimetrics-java-sdk</artifactId>
  <version></version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:agrimetrics-java-sdk:"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/agrimetrics-java-sdk-.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *https://api-test.agrimetrics.co.uk/catalog*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccessRequestApi* | [**createNewRequest**](docs/AccessRequestApi.md#createNewRequest) | **POST** /access-requests | 
*AccessRequestApi* | [**deleteRequestById**](docs/AccessRequestApi.md#deleteRequestById) | **DELETE** /access-requests/{requestId} | 
*AccessRequestApi* | [**list**](docs/AccessRequestApi.md#list) | **GET** /access-requests | 
*AdminApi* | [**createNewDefinition**](docs/AdminApi.md#createNewDefinition) | **POST** /serviceDefinition | Create new service definition
*AdminApi* | [**deleteById**](docs/AdminApi.md#deleteById) | **DELETE** /serviceDefinition/{layerId} | Delete service definition
*AdminApi* | [**deleteLayer**](docs/AdminApi.md#deleteLayer) | **DELETE** /layers/{layerId} | Delete layer
*AdminApi* | [**getByLayerId**](docs/AdminApi.md#getByLayerId) | **GET** /serviceDefinition/{layerId} | Get service definition
*AdminApi* | [**ingestFile**](docs/AdminApi.md#ingestFile) | **POST** /layers/{layerId}/ingest | Ingest a file to a layer
*AdminApi* | [**ingestFileNewLayer**](docs/AdminApi.md#ingestFileNewLayer) | **POST** /datasets/{datasetId}/layers | Ingest file to new layer
*AdminApi* | [**removeFile**](docs/AdminApi.md#removeFile) | **DELETE** /layers/{layerId}/files | Delete a file from a layer
*AdminApi* | [**updateExistingDefinition**](docs/AdminApi.md#updateExistingDefinition) | **PATCH** /serviceDefinition/{layerId} | Update service definition
*AuthenticationApi* | [**getJwt**](docs/AuthenticationApi.md#getJwt) | **POST** /authenticate | Get JWT
*DatasetApi* | [**createFileDataset**](docs/DatasetApi.md#createFileDataset) | **POST** /data-sets/{dataSetId}/fileDataset | Create and attach file dataset
*DatasetApi* | [**createSingleCatalogEntry**](docs/DatasetApi.md#createSingleCatalogEntry) | **POST** /data-sets | Create a single data set catalog entry.
*DatasetApi* | [**deleteSingleDataSet**](docs/DatasetApi.md#deleteSingleDataSet) | **DELETE** /data-sets/{dataSetId} | Delete a Data Set
*DatasetApi* | [**discardDraftChanges**](docs/DatasetApi.md#discardDraftChanges) | **DELETE** /data-sets/{dataSetId}/draft | Discards the draft changes on a data set catalog entry.
*DatasetApi* | [**getDraftChanges**](docs/DatasetApi.md#getDraftChanges) | **GET** /data-sets/{dataSetId}/draft | Get the draft changes on a data set catalog entry.
*DatasetApi* | [**getEntitlements**](docs/DatasetApi.md#getEntitlements) | **GET** /data-sets/{dataSetId}/access | Get the entitlements on a data set.
*DatasetApi* | [**getFileDatasetId**](docs/DatasetApi.md#getFileDatasetId) | **GET** /data-sets/{dataSetId}/fileDataset | Get file dataset id from dataset
*DatasetApi* | [**getNonSpatialDataForGroup**](docs/DatasetApi.md#getNonSpatialDataForGroup) | **GET** /harvest/{group}/dcat | Get the DCAT metadata for the given group. This will retrieve metadata for all the non spatial datasets in the public domain.
*DatasetApi* | [**getSingleCatalogEntry**](docs/DatasetApi.md#getSingleCatalogEntry) | **GET** /data-sets/{dataSetId} | Get a single data set catalog entry.
*DatasetApi* | [**getValidationReport**](docs/DatasetApi.md#getValidationReport) | **GET** /data-sets/{dataSetId}/validationReport | Get the schematron validation report using the data sets validation profile
*DatasetApi* | [**getValidationReport_0**](docs/DatasetApi.md#getValidationReport_0) | **GET** /data-sets/{dataSetId}/draft/validationReport | Get the schematron validation report using the data sets validation profile
*DatasetApi* | [**listAllDataSets**](docs/DatasetApi.md#listAllDataSets) | **GET** /data-sets | List all data sets.
*DatasetApi* | [**listValidCategories**](docs/DatasetApi.md#listValidCategories) | **GET** /categories | List all the valid categories of datasets.
*DatasetApi* | [**listValidTags**](docs/DatasetApi.md#listValidTags) | **GET** /tags | List all the valid tags that can be set on a data set.
*DatasetApi* | [**setEntitlements**](docs/DatasetApi.md#setEntitlements) | **PATCH** /data-sets/{dataSetId}/access | Set the entitlements and on a data set for all identities.
*DatasetApi* | [**setImage**](docs/DatasetApi.md#setImage) | **PUT** /data-sets/{dataSetId}/image | Set the image for a data set.
*DatasetApi* | [**updateSingleCatalogEntry**](docs/DatasetApi.md#updateSingleCatalogEntry) | **PATCH** /data-sets/{dataSetId} | Update a single data set catalog entry.
*DatasetApi* | [**updateSingleEntry**](docs/DatasetApi.md#updateSingleEntry) | **PUT** /data-sets/{dataSetId} | Update a single data set catalog entry.
*EsriApi* | [**restServiceQuery**](docs/EsriApi.md#restServiceQuery) | **GET** /rest/services/{datasetId}/{paramOne} | ESRI REST Service query
*EsriApi* | [**restServiceQuery_0**](docs/EsriApi.md#restServiceQuery_0) | **GET** /rest/services/{datasetId}/{paramOne}/{paramTwo} | ESRI REST Service query
*GraphApi* | [**listConcepts**](docs/GraphApi.md#listConcepts) | **GET** /linked-data/concepts | List all concepts in linked data graph.
*HarvestApi* | [**xmlDataOnGroup**](docs/HarvestApi.md#xmlDataOnGroup) | **GET** /harvest/{group}/csw | Harvest xml data on the given group
*HarvestApi* | [**xmlDataOnGroupPost**](docs/HarvestApi.md#xmlDataOnGroupPost) | **POST** /harvest/{group}/csw | Harvest xml data on the given group
*ImageApi* | [**getRawImage**](docs/ImageApi.md#getRawImage) | **GET** /images/{imageType}/{imageId} | Get an image used in the catalogue.
*ImportApi* | [**dataSets**](docs/ImportApi.md#dataSets) | **POST** /import | 
*ManageDatasetApi* | [**ingestFileNewLayer**](docs/ManageDatasetApi.md#ingestFileNewLayer) | **POST** /datasets/{datasetId}/layers | Ingest file to new layer
*ManageLayerApi* | [**addGeoTiff**](docs/ManageLayerApi.md#addGeoTiff) | **PATCH** /layers/{layerId} | Add a GeoTIFF to a layer
*ManageLayerApi* | [**autoGenerateStyle**](docs/ManageLayerApi.md#autoGenerateStyle) | **POST** /layers/{layerId}/style | Auto-generate and set layer style
*ManageLayerApi* | [**deleteLayer**](docs/ManageLayerApi.md#deleteLayer) | **DELETE** /layers/{layerId} | Delete layer
*ManageLayerApi* | [**getStyle**](docs/ManageLayerApi.md#getStyle) | **GET** /layers/{layerId}/style | Get the style for a layer, if one has been set
*ManageLayerApi* | [**ingestFile**](docs/ManageLayerApi.md#ingestFile) | **POST** /layers/{layerId}/ingest | Ingest a file to a layer
*ManageLayerApi* | [**removeFile**](docs/ManageLayerApi.md#removeFile) | **DELETE** /layers/{layerId}/files | Delete a file from a layer
*ManageLayerApi* | [**removeStyle**](docs/ManageLayerApi.md#removeStyle) | **DELETE** /layers/{layerId}/style | Delete the style from a layer, if one has been set
*ManageLayerApi* | [**setStyle**](docs/ManageLayerApi.md#setStyle) | **PUT** /layers/{layerId}/style | Set layer style
*OgcApiTilesApi* | [**getConformance**](docs/OgcApiTilesApi.md#getConformance) | **GET** /datasets/{datasetId}/ogc/tiles/v1/conformance | OGC API Tiles query
*OgcApiTilesApi* | [**getQueryTilesCollection**](docs/OgcApiTilesApi.md#getQueryTilesCollection) | **GET** /datasets/{datasetId}/ogc/tiles/v1/collections/{collectionId}/map/tiles/{tileMatrixSetId}/{tileMatrix}/{tileRow}/{tileCol} | OGC API Tiles query
*OgcApiTilesApi* | [**getTilesCollection**](docs/OgcApiTilesApi.md#getTilesCollection) | **GET** /datasets/{datasetId}/ogc/tiles/v1/collections/{collectionId}/tiles/{tileMatrixSetId} | OGC API Tiles query
*OgcApiTilesApi* | [**queryCollectionById**](docs/OgcApiTilesApi.md#queryCollectionById) | **GET** /datasets/{datasetId}/ogc/tiles/v1/collections/{collectionId} | OGC API Tiles query
*OgcApiTilesApi* | [**queryCollectionQueryables**](docs/OgcApiTilesApi.md#queryCollectionQueryables) | **GET** /datasets/{datasetId}/ogc/tiles/v1/collections/{collectionId}/queryables | OGC API Tiles query
*OgcApiTilesApi* | [**queryCollections**](docs/OgcApiTilesApi.md#queryCollections) | **GET** /datasets/{datasetId}/ogc/tiles/v1/collections | OGC API Tiles query
*OgcApiTilesApi* | [**queryTileMatrixSets**](docs/OgcApiTilesApi.md#queryTileMatrixSets) | **GET** /datasets/{datasetId}/ogc/tiles/v1/tileMatrixSets | OGC API Tiles query
*OgcApiTilesApi* | [**queryTileMatrixSets_0**](docs/OgcApiTilesApi.md#queryTileMatrixSets_0) | **GET** /datasets/{datasetId}/ogc/tiles/v1/tileMatrixSets/{tileMatrixSetId} | OGC API Tiles query
*OgcApiTilesApi* | [**queryTilesV1**](docs/OgcApiTilesApi.md#queryTilesV1) | **GET** /datasets/{datasetId}/ogc/tiles/v1 | OGC API Tiles query
*OgcapiApi* | [**featuresQuery**](docs/OgcapiApi.md#featuresQuery) | **GET** /datasets/{datasetId}/ogc/features/v1 | OGC-API-Features query
*OgcapiApi* | [**featuresQueryConformance**](docs/OgcapiApi.md#featuresQueryConformance) | **GET** /datasets/{datasetId}/ogc/features/v1/conformance | OGC-API-Features query
*OgcapiApi* | [**featuresQueryOgc**](docs/OgcapiApi.md#featuresQueryOgc) | **GET** /datasets/{datasetId}/ogc/features/v1/collections/{collectionId} | OGC-API-Features query
*OgcapiApi* | [**featuresQuery_0**](docs/OgcapiApi.md#featuresQuery_0) | **GET** /datasets/{datasetId}/ogc/features/v1/collections/{collectionId}/items/{featureId} | OGC-API-Features query
*OgcapiApi* | [**featuresQueryables**](docs/OgcapiApi.md#featuresQueryables) | **GET** /datasets/{datasetId}/ogc/features/v1/collections/{collectionId}/queryables | OGC-API-Features query
*OgcapiApi* | [**getStyleForCssFile**](docs/OgcapiApi.md#getStyleForCssFile) | **GET** /datasets/apicss/{cssFile} | OGC-API CSS
*OgcapiApi* | [**getSwaggerFile**](docs/OgcapiApi.md#getSwaggerFile) | **GET** /datasets/swagger-ui/{swaggerFile} | OGC-API-Features Swagger
*OgcapiApi* | [**queryFeaturesCollection**](docs/OgcapiApi.md#queryFeaturesCollection) | **GET** /datasets/{datasetId}/ogc/features/v1/collections | OGC-API-Features query
*OgcapiApi* | [**queryFeaturesCollectionItems**](docs/OgcapiApi.md#queryFeaturesCollectionItems) | **GET** /datasets/{datasetId}/ogc/features/v1/collections/{collectionId}/items | OGC-API-Features query
*OgcapiApi* | [**queryFeaturesFunction**](docs/OgcapiApi.md#queryFeaturesFunction) | **GET** /datasets/{datasetId}/ogc/features/v1/functions | OGC-API-Features query
*OgcapiApi* | [**queryFeaturesOpenapi**](docs/OgcapiApi.md#queryFeaturesOpenapi) | **GET** /datasets/{datasetId}/ogc/features/v1/openapi | OGC-API-Features query
*QueryDatasetApi* | [**listLayersWithinDataset**](docs/QueryDatasetApi.md#listLayersWithinDataset) | **GET** /datasets/{datasetId} | List layers within dataset
*QueryLayerApi* | [**calculateCost**](docs/QueryLayerApi.md#calculateCost) | **POST** /layers/{layerId}/search/cost | Calculate query cost
*QueryLayerApi* | [**calculateStatisticsWithinGeometry**](docs/QueryLayerApi.md#calculateStatisticsWithinGeometry) | **POST** /layers/{layerId}/search/statistics | Get layer statistics
*QueryLayerApi* | [**cutShapeBoundaryAndRetrieve**](docs/QueryLayerApi.md#cutShapeBoundaryAndRetrieve) | **POST** /query | Query and download sections of one or more layers
*QueryLayerApi* | [**metadata**](docs/QueryLayerApi.md#metadata) | **GET** /layers/{layerId} | Get layer metadata
*QueryLayerApi* | [**searchGeometry**](docs/QueryLayerApi.md#searchGeometry) | **POST** /layers/{layerId}/search | Search within layer
*ServiceDefinitionApi* | [**createNewDefinition**](docs/ServiceDefinitionApi.md#createNewDefinition) | **POST** /serviceDefinition | Create new service definition
*ServiceDefinitionApi* | [**deleteById**](docs/ServiceDefinitionApi.md#deleteById) | **DELETE** /serviceDefinition/{layerId} | Delete service definition
*ServiceDefinitionApi* | [**getByLayerId**](docs/ServiceDefinitionApi.md#getByLayerId) | **GET** /serviceDefinition/{layerId} | Get service definition
*ServiceDefinitionApi* | [**updateExistingDefinition**](docs/ServiceDefinitionApi.md#updateExistingDefinition) | **PATCH** /serviceDefinition/{layerId} | Update service definition
*ShapefileApi* | [**convertToGeoJson**](docs/ShapefileApi.md#convertToGeoJson) | **POST** /shapefile | Receive a shapefile and return GeoJson
*StatusApi* | [**getCatalogApiStatus**](docs/StatusApi.md#getCatalogApiStatus) | **GET** /status | Get status of catalog API.
*StatusApi* | [**setDraftStatus**](docs/StatusApi.md#setDraftStatus) | **PUT** /data-sets/{dataSetId}/draft-status | Set the draft status for the data set catalog entry.
*TemplateApi* | [**createCatalogEntry**](docs/TemplateApi.md#createCatalogEntry) | **POST** /templates | Create a new template for creating catalogue entries.
*TemplateApi* | [**deleteSpecificTemplate**](docs/TemplateApi.md#deleteSpecificTemplate) | **DELETE** /templates/{templateId} | Delete a specific template
*TemplateApi* | [**getSpecificTemplate**](docs/TemplateApi.md#getSpecificTemplate) | **GET** /templates/{templateId} | Get a specific template
*TemplateApi* | [**listPermissionsToView**](docs/TemplateApi.md#listPermissionsToView) | **GET** /templates | List all templates you have permission to view.
*TemplateApi* | [**updateTemplateItem**](docs/TemplateApi.md#updateTemplateItem) | **PUT** /templates/{templateId} | Update a template
*TemplateApi* | [**updateTemplateItem_0**](docs/TemplateApi.md#updateTemplateItem_0) | **PATCH** /templates/{templateId} | Update a template
*WcsApi* | [**queryData**](docs/WcsApi.md#queryData) | **GET** /datasets/{datasetId}/wcs | Web Coverage Service (WCS) query
*WcsApi* | [**queryData_0**](docs/WcsApi.md#queryData_0) | **HEAD** /datasets/{datasetId}/wcs | Web Coverage Service (WMS) query
*WfsApi* | [**queryDataOpenGis**](docs/WfsApi.md#queryDataOpenGis) | **HEAD** /datasets/{datasetId}/wfs | Web Feature Service (WFS) query
*WfsApi* | [**queryDataOpenGis_0**](docs/WfsApi.md#queryDataOpenGis_0) | **POST** /datasets/{datasetId}/wfs | Web Feature Service (WFS) query
*WfsApi* | [**queryDataWithOpenGis**](docs/WfsApi.md#queryDataWithOpenGis) | **GET** /datasets/{datasetId}/wfs | Web Feature Service (WFS) query
*WmsApi* | [**queryLayerWithOpenGIS**](docs/WmsApi.md#queryLayerWithOpenGIS) | **GET** /datasets/{datasetId}/wms | Web Map Service (WMS) query
*WmsApi* | [**queryWithOpenGis**](docs/WmsApi.md#queryWithOpenGis) | **HEAD** /datasets/{datasetId}/wms | Web Maps Service (WMS) query
*WmtsApi* | [**queryDataSetWmts**](docs/WmtsApi.md#queryDataSetWmts) | **GET** /datasets/{datasetId}/wmts | Web Map Tile Service (WMTS) query
*WmtsRestApi* | [**queryTileMatrixSet**](docs/WmtsRestApi.md#queryTileMatrixSet) | **GET** /datasets/{datasetId}/wmts/rest/{layerName}/{style}/{TileMatrixSet}/{TileMatrix}/{TileRow}/{TileCol} | WMTS Service query
*WmtsRestApi* | [**queryTilejsonImageFormat**](docs/WmtsRestApi.md#queryTilejsonImageFormat) | **GET** /datasets/{datasetId}/wmts/rest/{layerName}/{style}/tilejson/{imageFormat} | WMTS Service query
*WmtsRestApi* | [**serviceQuery**](docs/WmtsRestApi.md#serviceQuery) | **GET** /datasets/{datasetId}/wmts/rest/{layerName}/{style}/{TileMatrixSet}/{TileMatrix}/{TileRow}/{TileCol}/{J}/{I} | WMTS Service query
*DataRequestApi* | [**createSingleAccessRequest**](docs/DataRequestApi.md#createSingleAccessRequest) | **POST** /data-requests | create a single access request
*DataRequestApi* | [**getGeoJsonGeometry**](docs/DataRequestApi.md#getGeoJsonGeometry) | **GET** /data-requests/{uniqueLinkId}/geometry | Get geometry for data request as GeoJSON
*DataRequestApi* | [**getRequestedData**](docs/DataRequestApi.md#getRequestedData) | **GET** /data-requests/{requestId} | gets the data for the approved request
*DataRequestApi* | [**getResults**](docs/DataRequestApi.md#getResults) | **GET** /data-requests/{requestId}/download | Get the results of your data request
*DataRequestApi* | [**grantUserAccess**](docs/DataRequestApi.md#grantUserAccess) | **GET** /data-requests/{uniqueLinkId}/approve | approve data access
*DataRequestApi* | [**listUserAccessRequests**](docs/DataRequestApi.md#listUserAccessRequests) | **GET** /data-requests | lists a users data requests
*DataRequestApi* | [**rejectUserAccess**](docs/DataRequestApi.md#rejectUserAccess) | **GET** /data-requests/{uniqueLinkId}/reject | reject data access
*DataRequestApi* | [**updateRequest**](docs/DataRequestApi.md#updateRequest) | **PATCH** /data-requests/{requestId} | updates a data request


## Documentation for Models

 - [AccessRequestCreateNewRequestRequest](docs/AccessRequestCreateNewRequestRequest.md)
 - [AccrualPeriodicity](docs/AccrualPeriodicity.md)
 - [AuthenticationGetJwtRequest](docs/AuthenticationGetJwtRequest.md)
 - [AuthenticationGetJwtResponse](docs/AuthenticationGetJwtResponse.md)
 - [AuthenticationGetJwtResponseJwts](docs/AuthenticationGetJwtResponseJwts.md)
 - [AuthenticationGetJwtResponseJwtsAgrimetrics](docs/AuthenticationGetJwtResponseJwtsAgrimetrics.md)
 - [Band](docs/Band.md)
 - [BandStats](docs/BandStats.md)
 - [BasicDataSetInfo](docs/BasicDataSetInfo.md)
 - [BatchIdentityInputEntitlementsInner](docs/BatchIdentityInputEntitlementsInner.md)
 - [Billable](docs/Billable.md)
 - [BoundingBox](docs/BoundingBox.md)
 - [BoundingBoxCoordinates](docs/BoundingBoxCoordinates.md)
 - [Category](docs/Category.md)
 - [CategoryValue](docs/CategoryValue.md)
 - [Concept](docs/Concept.md)
 - [Contact](docs/Contact.md)
 - [CostSummary](docs/CostSummary.md)
 - [CreateFromTemplatePayload](docs/CreateFromTemplatePayload.md)
 - [Creator](docs/Creator.md)
 - [DataFormat](docs/DataFormat.md)
 - [DataRequest](docs/DataRequest.md)
 - [DataRequestCreateSingleAccessRequestResponse](docs/DataRequestCreateSingleAccessRequestResponse.md)
 - [DataRequestDetailsInner](docs/DataRequestDetailsInner.md)
 - [DataRequestResponseInner](docs/DataRequestResponseInner.md)
 - [DataRequestUpdateRequestRequest](docs/DataRequestUpdateRequestRequest.md)
 - [DataRequestUpdateRequestResponse](docs/DataRequestUpdateRequestResponse.md)
 - [DataSet](docs/DataSet.md)
 - [DataSetDataSet](docs/DataSetDataSet.md)
 - [DataSetDistributionsInner](docs/DataSetDistributionsInner.md)
 - [DataSetPatch](docs/DataSetPatch.md)
 - [DataSetPatchGeospatialExtent](docs/DataSetPatchGeospatialExtent.md)
 - [DataSetPatchLicence](docs/DataSetPatchLicence.md)
 - [DataSetPatchMetadataContact](docs/DataSetPatchMetadataContact.md)
 - [DataSetPatchTemporalExtent](docs/DataSetPatchTemporalExtent.md)
 - [DataSetSampleData](docs/DataSetSampleData.md)
 - [DataSetServicesInner](docs/DataSetServicesInner.md)
 - [DataSetTemplateEntity](docs/DataSetTemplateEntity.md)
 - [DataSetTemplateEntityAllOf](docs/DataSetTemplateEntityAllOf.md)
 - [DataSetTemplateMetadata](docs/DataSetTemplateMetadata.md)
 - [DataSetTemplatePatchMetadata](docs/DataSetTemplatePatchMetadata.md)
 - [DataSets](docs/DataSets.md)
 - [DatasetCreateFileDatasetResponse](docs/DatasetCreateFileDatasetResponse.md)
 - [DatasetDeleteSingleDataSetResponse](docs/DatasetDeleteSingleDataSetResponse.md)
 - [DatasetGetEntitlementsResponse](docs/DatasetGetEntitlementsResponse.md)
 - [DatasetGetFileDatasetIdResponse](docs/DatasetGetFileDatasetIdResponse.md)
 - [DatasetGetValidationReport200Response](docs/DatasetGetValidationReport200Response.md)
 - [DatasetGetValidationReportResponse](docs/DatasetGetValidationReportResponse.md)
 - [DatasetListValidTagsResponse](docs/DatasetListValidTagsResponse.md)
 - [DatasetSetEntitlementsRequest](docs/DatasetSetEntitlementsRequest.md)
 - [DraftStatus](docs/DraftStatus.md)
 - [Entitlement](docs/Entitlement.md)
 - [Entitlements](docs/Entitlements.md)
 - [EntitlementsCatalog](docs/EntitlementsCatalog.md)
 - [EntitlementsDataSet](docs/EntitlementsDataSet.md)
 - [EntryType](docs/EntryType.md)
 - [EntryUpdateResponse](docs/EntryUpdateResponse.md)
 - [Exchange](docs/Exchange.md)
 - [GeoJSONMultiPolygon](docs/GeoJSONMultiPolygon.md)
 - [GeoJSONPoint](docs/GeoJSONPoint.md)
 - [GeoJSONPolygon](docs/GeoJSONPolygon.md)
 - [GeospatialExtent](docs/GeospatialExtent.md)
 - [GroupCode](docs/GroupCode.md)
 - [IdentityEntitlements](docs/IdentityEntitlements.md)
 - [IdentityEntitlementsIdentity](docs/IdentityEntitlementsIdentity.md)
 - [IdentityInput](docs/IdentityInput.md)
 - [ImageRepresentation](docs/ImageRepresentation.md)
 - [ImageRepresentationAuthor](docs/ImageRepresentationAuthor.md)
 - [Layer](docs/Layer.md)
 - [LayerLinks](docs/LayerLinks.md)
 - [Licence](docs/Licence.md)
 - [ManageDatasetIngestFileNewLayerRequest](docs/ManageDatasetIngestFileNewLayerRequest.md)
 - [ManageLayerAddGeoTiffRequest](docs/ManageLayerAddGeoTiffRequest.md)
 - [ManageLayerAddGeoTiffResponse](docs/ManageLayerAddGeoTiffResponse.md)
 - [ManageLayerIngestFileRequest](docs/ManageLayerIngestFileRequest.md)
 - [ManageLayerSetStyleRequest](docs/ManageLayerSetStyleRequest.md)
 - [NewLayers](docs/NewLayers.md)
 - [OutputFormats](docs/OutputFormats.md)
 - [PointSearch](docs/PointSearch.md)
 - [PointSearchBase](docs/PointSearchBase.md)
 - [PolygonOrBBoxSearch](docs/PolygonOrBBoxSearch.md)
 - [PolygonOrBBoxSearchAllOf](docs/PolygonOrBBoxSearchAllOf.md)
 - [PolygonOrBBoxSearchBase](docs/PolygonOrBBoxSearchBase.md)
 - [PublicContact](docs/PublicContact.md)
 - [PublishedStatus](docs/PublishedStatus.md)
 - [QueryDatasetListLayersWithinDatasetResponse](docs/QueryDatasetListLayersWithinDatasetResponse.md)
 - [QueryLayerCalculateStatisticsWithinGeometryRequest](docs/QueryLayerCalculateStatisticsWithinGeometryRequest.md)
 - [QueryLayerMetadataResponse](docs/QueryLayerMetadataResponse.md)
 - [QueryLayerMetadataResponseLinks](docs/QueryLayerMetadataResponseLinks.md)
 - [Relationship](docs/Relationship.md)
 - [Resource](docs/Resource.md)
 - [RestError](docs/RestError.md)
 - [ServiceDefinition](docs/ServiceDefinition.md)
 - [ServiceDefinitionResponse](docs/ServiceDefinitionResponse.md)
 - [ServiceDefinitionUpdateExistingDefinitionRequest](docs/ServiceDefinitionUpdateExistingDefinitionRequest.md)
 - [SpatialCoverage](docs/SpatialCoverage.md)
 - [Statistics](docs/Statistics.md)
 - [StatusGetCatalogApiStatusResponse](docs/StatusGetCatalogApiStatusResponse.md)
 - [StatusGetCatalogApiStatusResponseLinks](docs/StatusGetCatalogApiStatusResponseLinks.md)
 - [StatusGetCatalogApiStatusResponseLinksSelf](docs/StatusGetCatalogApiStatusResponseLinksSelf.md)
 - [StatusSetDraftStatusRequest](docs/StatusSetDraftStatusRequest.md)
 - [TagOrConcept](docs/TagOrConcept.md)
 - [TaxonomyKeywords](docs/TaxonomyKeywords.md)
 - [TemplateListPermissionsToViewResponse](docs/TemplateListPermissionsToViewResponse.md)
 - [Topic](docs/Topic.md)
 - [WorkflowKeywords](docs/WorkflowKeywords.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
