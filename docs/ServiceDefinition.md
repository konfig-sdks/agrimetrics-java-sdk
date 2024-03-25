

# ServiceDefinition


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**datasetId** | **String** |  |  |
|**layerName** | **String** |  |  |
|**service** | [**ServiceEnum**](#ServiceEnum) |  |  |
|**WFS** | [**WFSEnum**](#WFSEnum) |  |  |
|**WCS** | [**WCSEnum**](#WCSEnum) |  |  |
|**WMS** | [**WMSEnum**](#WMSEnum) |  |  |
|**WMTS** | [**WMTSEnum**](#WMTSEnum) |  |  |
|**ogCApiFeatures** | [**OgCApiFeaturesEnum**](#OgCApiFeaturesEnum) |  |  |
|**ogCApiTiles** | [**OgCApiTilesEnum**](#OgCApiTilesEnum) |  |  |
|**temporal** | **Boolean** |  |  [optional] |
|**datastore** | **String** |  |  [optional] |
|**geoserverHostName** | **String** |  |  [optional] |
|**geometryField** | **String** |  |  [optional] |
|**billable** | [**Billable**](Billable.md) |  |  [optional] |
|**defaultEPSGCode** | **Double** |  |  [optional] |



## Enum: ServiceEnum

| Name | Value |
|---- | -----|
| WCS | &quot;WCS&quot; |
| WFS | &quot;WFS&quot; |



## Enum: WFSEnum

| Name | Value |
|---- | -----|
| Y | &quot;Y&quot; |
| N | &quot;N&quot; |



## Enum: WCSEnum

| Name | Value |
|---- | -----|
| Y | &quot;Y&quot; |
| N | &quot;N&quot; |



## Enum: WMSEnum

| Name | Value |
|---- | -----|
| Y | &quot;Y&quot; |
| N | &quot;N&quot; |



## Enum: WMTSEnum

| Name | Value |
|---- | -----|
| Y | &quot;Y&quot; |
| N | &quot;N&quot; |



## Enum: OgCApiFeaturesEnum

| Name | Value |
|---- | -----|
| Y | &quot;Y&quot; |
| N | &quot;N&quot; |



## Enum: OgCApiTilesEnum

| Name | Value |
|---- | -----|
| Y | &quot;Y&quot; |
| N | &quot;N&quot; |



