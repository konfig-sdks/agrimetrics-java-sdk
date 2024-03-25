

# DataSet


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tags** | **List&lt;String&gt;** | List of tags on this data set. |  [optional] |
|**summary** | **String** | Summary of the data set. |  [optional] |
|**title** | **String** | Title for the data set. |  |
|**description** | **String** | Description of the data set. |  |
|**id** | **UUID** | The ID of a dataset in the catalog |  [optional] |
|**entryType** | **EntryType** |  |  |
|**exchange** | **Exchange** |  |  [optional] |
|**alternativeTitles** | **List&lt;String&gt;** |  |  [optional] |
|**scoringURI** | **String** | Scoring URI of the model. |  [optional] |
|**endpointKey** | **String** | Endpoint key for the model. |  [optional] |
|**isOwner** | **Boolean** | Whether the current user is the owner of this data set. |  [optional] |
|**publisher** | **String** | The ID of the publisher. |  [optional] |
|**createdAt** | **Double** | Data set creation timestamp. |  [optional] |
|**published** | **Double** | Data set publication timestamp. |  [optional] |
|**metadataModified** | **Double** | Metadata last-modification timestmap. |  [optional] |
|**usedBy** | [**List&lt;BasicDataSetInfo&gt;**](BasicDataSetInfo.md) | Other data sets using this data set. |  [optional] |
|**derivedFrom** | **List&lt;Object&gt;** | Data sets used to generate this data set. When updating a data set, use an array of IDs. When GETting the data set, the return type will be &#x60;BasicDataSetInfo&#x60;.  |  [optional] |
|**entitlements** | **List&lt;Entitlement&gt;** | Entitlements for the current user. |  [optional] |
|**entitlementsByIdentity** | **Map&lt;String, List&lt;Entitlement&gt;&gt;** | Array of entitlements by user identity. |  [optional] |
|**creator** | **String** | Creator of the data set. |  [optional] |
|**dataReliability** | **String** | Free text description about the reliability of this dataset. |  [optional] |
|**license** | **String** | License of the data set. |  [optional] |
|**licence** | [**Licence**](Licence.md) |  |  [optional] |
|**landingPage** | **String** | DEPRECATED. This has been replaced with the resources attribute. Reference URI of the data set. |  [optional] |
|**resources** | [**List&lt;Resource&gt;**](Resource.md) | Links containing more information on the data set |  [optional] |
|**dataFormats** | [**List&lt;DataFormat&gt;**](DataFormat.md) | Format of the data set |  [optional] |
|**pricingDescription** | **String** | Pricing description of the data set. |  [optional] |
|**spatialCoverage** | **SpatialCoverage** |  |  [optional] |
|**spatialResolution** | **Double** | The resolution of data set in meters. |  [optional] |
|**geospatialExtent** | [**GeospatialExtent**](GeospatialExtent.md) |  |  [optional] |
|**temporalCoverage** | **String** | The time frame this data set covers. |  [optional] |
|**temporalResolution** | [**TemporalResolutionEnum**](#TemporalResolutionEnum) | The sampling time period of the data set. |  [optional] |
|**accrualPeriodicity** | **AccrualPeriodicity** |  |  [optional] |
|**distributions** | [**List&lt;DataSetDistributionsInner&gt;**](DataSetDistributionsInner.md) |  |  [optional] |
|**issued** | **String** | The date when the data set was issued. |  [optional] |
|**modified** | **Double** | An timestamp of when the data in this dataset was last updated |  [optional] |
|**keywords** | **List&lt;String&gt;** | List of keywords on this data set. keywords is deprecated - use tags instead |  [optional] |
|**topics** | **List&lt;Topic&gt;** | List of topics on this data set |  [optional] |
|**workflowKeywords** | **List&lt;WorkflowKeywords&gt;** | List of workflow keywords on this data set |  [optional] |
|**taxonomyKeywords** | [**List&lt;TaxonomyKeywords&gt;**](TaxonomyKeywords.md) | List of keywords based on specific taxonomies |  [optional] |
|**category** | **CategoryValue** |  |  [optional] |
|**visibility** | [**VisibilityEnum**](#VisibilityEnum) | Whether or not this data set should be displayed in the index. |  [optional] |
|**concepts** | **List&lt;String&gt;** | List of concepts on this data set. Check the concepts endpoint to see valid values. |  [optional] |
|**dataSet** | [**DataSetDataSet**](DataSetDataSet.md) |  |  [optional] |
|**services** | [**List&lt;DataSetServicesInner&gt;**](DataSetServicesInner.md) | List of services available on the data set |  [optional] |
|**sampleData** | [**DataSetSampleData**](DataSetSampleData.md) |  |  [optional] |
|**image** | [**ImageRepresentation**](ImageRepresentation.md) |  |  [optional] |
|**coordinateReferenceSystemId** | **String** | URL to the specification of the coordinate system used in the data |  [optional] |
|**spatialRepresentationType** | **String** | Type of the geospatial data |  [optional] |
|**lineage** | **String** | Information about the creation and quality assurance process of the dataset |  [optional] |
|**fromTemplate** | **String** | Information about which template was used to create the dataset record |  [optional] |
|**contacts** | [**List&lt;Contact&gt;**](Contact.md) | List of contacts for this data set |  [optional] |
|**metadataContact** | [**Contact**](Contact.md) |  |  [optional] |
|**publicContact** | [**PublicContact**](PublicContact.md) |  |  [optional] |
|**approvalForAccessNumber** | **Double** | Approval for access status number |  [optional] |
|**approvalForAccessStatus** | [**ApprovalForAccessStatusEnum**](#ApprovalForAccessStatusEnum) | Approval for access status value |  [optional] |
|**language** | **String** | Language used on the data set |  [optional] |
|**characterSet** | **String** | Character set used on the data set |  [optional] |
|**hierarchyLevel** | **String** | Hierarchy level of the data set |  [optional] |
|**metadataLanguage** | **String** | Language used on the metadata |  [optional] |
|**metadataCharacterSet** | **String** | Character set used on the metadata |  [optional] |
|**metadataStandardName** | **String** |  |  [optional] |
|**metadataStandardVersion** | **String** |  |  [optional] |
|**draftStatus** | **DraftStatus** |  |  [optional] |
|**draftNotes** | **String** | Any notes added during review of the data set |  [optional] |
|**publishedStatus** | **PublishedStatus** |  |  [optional] |



## Enum: TemporalResolutionEnum

| Name | Value |
|---- | -----|
| P1Y | &quot;P1Y&quot; |
| P1M | &quot;P1M&quot; |
| P1D | &quot;P1D&quot; |
| PT1H | &quot;PT1H&quot; |
| PT1M | &quot;PT1M&quot; |
| PT1S | &quot;PT1S&quot; |



## Enum: VisibilityEnum

| Name | Value |
|---- | -----|
| VISIBLE | &quot;visible&quot; |
| HIDDEN | &quot;hidden&quot; |



## Enum: ApprovalForAccessStatusEnum

| Name | Value |
|---- | -----|
| AFA_INFORMATION_REQUESTS_ONLY_ | &quot;AfA (Information Requests only)&quot; |
| AFA_PUBLIC_REGISTER_ | &quot;AfA (Public Register)&quot; |
| AFA_PUBLICATION_SCHEME_AND_INFORMATION_FOR_RE_USE_REGISTER_ | &quot;AfA (Publication Scheme and Information for Re-Use Register)&quot; |
| AFA_PUBLICATION_SCHEME_ | &quot;AfA (Publication Scheme)&quot; |
| NOT_AFA_TO_BE_ASSESSESSED_WITH_GUIDANCE_ | &quot;Not AfA (To be Assessessed with Guidance)&quot; |
| NOT_AFA_TO_BE_ASSESSED_ | &quot;Not AfA (To be Assessed)&quot; |
| NOT_APPLICABLE_THIRD_PARTY_DATASET | &quot;Not Applicable - Third Party Dataset&quot; |
| OPEN_DATA_RISK_ASSESSMENT | &quot;Open Data Risk Assessment&quot; |



