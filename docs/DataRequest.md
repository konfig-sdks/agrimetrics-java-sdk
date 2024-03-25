

# DataRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**projectName** | **String** | The name of the project the data is for |  |
|**projectManagerName** | **String** | The name of the project manager who can approve the request |  |
|**projectManagerEmail** | **String** | The email address of the project manager who can approve the request |  |
|**datasetId** | **UUID** | The ID of the dataset that the data request relates to |  |
|**datasetName** | **String** | The name of the dataset that the data request relates to |  |
|**geoJsonAOI** | **String** | The area of interest that the user is requesting access to as a stringified GeoJSON |  [optional] |
|**shapefileAOI** | **File** | The area of interest that the user is requesting access to as a zipped shapefile |  [optional] |
|**requestedFormat** | [**RequestedFormatEnum**](#RequestedFormatEnum) | The format the user would like the data to be provided in |  |



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



