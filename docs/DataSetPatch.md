

# DataSetPatch


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tags** | **List&lt;String&gt;** | List of tags on this data set. |  [optional] |
|**summary** | **String** | Summary of the data set. |  [optional] |
|**title** | **String** | Title for the data set. |  [optional] |
|**description** | **String** | Description of the data set. |  [optional] |
|**alternativeTitles** | **List&lt;String&gt;** |  |  [optional] |
|**scoringURI** | **String** | ScoringURI for the model. |  [optional] |
|**endpointKey** | **String** | Endpoint key for the model. |  [optional] |
|**derivedFrom** | **List&lt;Object&gt;** | Data sets used to generate this data set. When updating a data set, use an array of IDs. When GETting the data set, the return type will be &#x60;BasicDataSetInfo&#x60;.  |  [optional] |
|**creator** | **String** | Creator of the data set. |  [optional] |
|**dataReliability** | **String** | Free text description about the reliability of this dataset. |  [optional] |
|**license** | **String** | License of the data set. |  [optional] |
|**licence** | [**DataSetPatchLicence**](DataSetPatchLicence.md) |  |  [optional] |
|**resources** | [**List&lt;Resource&gt;**](Resource.md) | Links containing more information on the data set |  [optional] |
|**dataFormats** | [**List&lt;DataFormat&gt;**](DataFormat.md) | Format of the data set |  [optional] |
|**spatialCoverage** | [**SpatialCoverageEnum**](#SpatialCoverageEnum) | The geo spatial coverage of the data set. |  [optional] |
|**spatialResolution** | **Double** | The resolution of data set in meters. |  [optional] |
|**geospatialExtent** | [**DataSetPatchGeospatialExtent**](DataSetPatchGeospatialExtent.md) |  |  [optional] |
|**temporalCoverage** | **String** | The time frame this data set covers. |  [optional] |
|**temporalExtent** | [**DataSetPatchTemporalExtent**](DataSetPatchTemporalExtent.md) |  |  [optional] |
|**temporalResolution** | [**TemporalResolutionEnum**](#TemporalResolutionEnum) | The sampling time period of the data set. |  [optional] |
|**topics** | **List&lt;Topic&gt;** |  |  [optional] |
|**workflowKeywords** | **List&lt;WorkflowKeywords&gt;** | List of workflow keywords on this data set |  [optional] |
|**taxonomyKeywords** | [**List&lt;TaxonomyKeywords&gt;**](TaxonomyKeywords.md) | List of keywords based on specific taxonomies |  [optional] |
|**accrualPeriodicity** | [**AccrualPeriodicityEnum**](#AccrualPeriodicityEnum) | The frequency at which data set is published. |  [optional] |
|**issued** | **String** | The date when the data set was issued. |  [optional] |
|**createdAt** | **Double** | Data set creation timestamp. |  [optional] |
|**published** | **Double** | Data set publication timestamp. |  [optional] |
|**publishedStatus** | **PublishedStatus** |  |  [optional] |
|**modified** | **Double** | An timestamp of when the data in this dataset was last updated |  [optional] |
|**category** | **CategoryValue** |  |  [optional] |
|**visibility** | [**VisibilityEnum**](#VisibilityEnum) | Whether or not this data set should be displayed in the index. |  [optional] |
|**pricingDescription** | **String** | Pricing description of the data set. |  [optional] |
|**distributions** | [**List&lt;DataSetDistributionsInner&gt;**](DataSetDistributionsInner.md) |  |  [optional] |
|**approvalForAccessNumber** | **Double** | Approval for access status number |  [optional] |
|**approvalForAccessStatus** | [**ApprovalForAccessStatusEnum**](#ApprovalForAccessStatusEnum) | Approval for access status value |  [optional] |
|**contacts** | [**List&lt;Contact&gt;**](Contact.md) | List of contacts for this data set |  [optional] |
|**metadataContact** | [**DataSetPatchMetadataContact**](DataSetPatchMetadataContact.md) |  |  [optional] |
|**lineage** | **String** | Information about the creation and quality assurance process of the dataset |  [optional] |
|**language** | **String** | Language used on the data set |  [optional] |
|**characterSet** | **String** | Character set used on the data set |  [optional] |
|**hierarchyLevel** | **String** | Hierarchy level of the data set |  [optional] |
|**metadataLanguage** | **String** | Language used on the metadata |  [optional] |
|**metadataCharacterSet** | **String** | Character set used on the metadata |  [optional] |
|**metadataStandardName** | **String** |  |  [optional] |
|**metadataStandardVersion** | **String** |  |  [optional] |
|**coordinateReferenceSystemId** | **String** | URL to the specification of the coordinate system used in the data |  [optional] |
|**spatialRepresentationType** | **String** | Type of the geospatial data |  [optional] |



## Enum: SpatialCoverageEnum

| Name | Value |
|---- | -----|
| UNITED_KINGDOM | &quot;United Kingdom&quot; |
| ENGLAND | &quot;England&quot; |
| NORTHERN_IRELAND | &quot;Northern Ireland&quot; |
| SCOTLAND | &quot;Scotland&quot; |
| WALES | &quot;Wales&quot; |
| CANADA | &quot;Canada&quot; |
| ETHIOPIA | &quot;Ethiopia&quot; |
| FRANCE | &quot;France&quot; |
| INDIA | &quot;India&quot; |
| KENYA | &quot;Kenya&quot; |
| MEXICO | &quot;Mexico&quot; |
| NETHERLANDS | &quot;Netherlands&quot; |
| SPAIN | &quot;Spain&quot; |
| TANZANIA | &quot;Tanzania&quot; |
| UGANDA | &quot;Uganda&quot; |
| UNITED_STATES | &quot;United States&quot; |
| GLOBAL_ONLY | &quot;Global only&quot; |
| NULL | &quot;null&quot; |



## Enum: TemporalResolutionEnum

| Name | Value |
|---- | -----|
| P1Y | &quot;P1Y&quot; |
| P1M | &quot;P1M&quot; |
| P1D | &quot;P1D&quot; |
| PT1H | &quot;PT1H&quot; |
| PT1M | &quot;PT1M&quot; |
| PT1S | &quot;PT1S&quot; |
| NULL | &quot;null&quot; |



## Enum: AccrualPeriodicityEnum

| Name | Value |
|---- | -----|
| HOURLY | &quot;Hourly&quot; |
| DAILY | &quot;Daily&quot; |
| THREE_TIMES_A_WEEK | &quot;Three times a week&quot; |
| SEMIWEEKLY | &quot;Semiweekly&quot; |
| WEEKLY | &quot;Weekly&quot; |
| THREE_TIMES_A_MONTH | &quot;Three times a month&quot; |
| BIWEEKLY | &quot;Biweekly&quot; |
| SEMIMONTHLY | &quot;Semimonthly&quot; |
| MONTHLY | &quot;Monthly&quot; |
| BIMONTHLY | &quot;Bimonthly&quot; |
| QUARTERLY | &quot;Quarterly&quot; |
| THREE_TIMES_A_YEAR | &quot;Three times a year&quot; |
| SEMIANNUAL | &quot;Semiannual&quot; |
| ANNUAL | &quot;Annual&quot; |
| BIENNIAL | &quot;Biennial&quot; |
| TRIENNIAL | &quot;Triennial&quot; |
| CONTINUOUS | &quot;Continuous&quot; |
| IRREGULAR | &quot;Irregular&quot; |
| CONTINUAL | &quot;continual&quot; |
| DAILY | &quot;daily&quot; |
| WEEKLY | &quot;weekly&quot; |
| FORTNIGHTLY | &quot;fortnightly&quot; |
| MONTHLY | &quot;monthly&quot; |
| QUARTERLY | &quot;quarterly&quot; |
| BIANNUALLY | &quot;biannually&quot; |
| ANNUALLY | &quot;annually&quot; |
| ASNEEDED | &quot;asNeeded&quot; |
| IRREGULAR | &quot;irregular&quot; |
| NOTPLANNED | &quot;notPlanned&quot; |
| UNKNOWN | &quot;unknown&quot; |
| NULL | &quot;null&quot; |



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
| NULL | &quot;null&quot; |


