

# DataRequestDetailsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**requestId** | **UUID** | The ID of the data request |  |
|**datasetId** | **UUID** | The ID of the dataset that the data request relates to |  |
|**datasetName** | **String** | The name of the dataset that the data request relates to |  |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the data request |  |
|**requestedDate** | **String** | The date the data request was made |  |
|**reviewedDate** | **Object** | The date the data request was approved or rejected |  [optional] |
|**requestedFormat** | [**RequestedFormatEnum**](#RequestedFormatEnum) | The format the user would like the data to be provided in |  [optional] |
|**projectName** | **String** | The name of the project the data is for |  [optional] |
|**projectManagerName** | **String** | The name of the project manager who can approve the request |  [optional] |
|**projectManagerEmail** | **String** | The email address of the project manager who can approve the request |  [optional] |
|**requesterEmail** | **String** | The email of the person who made the data request |  [optional] |
|**expiryDate** | **String** | The date until which the data from an approved request can be downloaded |  [optional] |
|**uniqueLinkId** | **String** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;pending&quot; |
| APPROVED | &quot;approved&quot; |
| DENIED | &quot;denied&quot; |
| CANCELLED | &quot;cancelled&quot; |



## Enum: RequestedFormatEnum

| Name | Value |
|---- | -----|
| APPLICATION_GEO_JSON | &quot;application/geo+json&quot; |
| APPLICATION_GML_XML_VERSION_3_2 | &quot;application/gml+xml; version&#x3D;3.2&quot; |
| APPLICATION_VND_GOOGLE_EARTH_KML_XML | &quot;application/vnd.google-earth.kml+xml&quot; |
| APPLICATION_ZIPPED_SHAPEFILE | &quot;application/zipped-shapefile&quot; |
| APPLICATION_X_GDB_ZIP | &quot;application/x.gdb+zip&quot; |
| APPLICATION_X_MID_MIF_ZIP | &quot;application/x.mid-mif+zip&quot; |
| APPLICATION_X_TAB_ZIP | &quot;application/x.tab+zip&quot; |
| APPLICATION_DXF | &quot;application/dxf&quot; |
| IMAGE_TIFF | &quot;image/tiff&quot; |



