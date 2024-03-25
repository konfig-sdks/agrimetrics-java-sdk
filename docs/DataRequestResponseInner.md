

# DataRequestResponseInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**requestId** | **UUID** | The ID of the data request |  |
|**datasetId** | **UUID** | The ID of the dataset that the data request relates to |  |
|**datasetName** | **String** | The name of the dataset that the data request relates to |  |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the data request |  |
|**requestedDate** | **String** | The date the data request was made |  |
|**requesterEmail** | **Object** | The requesters email address |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;pending&quot; |
| APPROVED | &quot;approved&quot; |
| DENIED | &quot;denied&quot; |
| CANCELLED | &quot;cancelled&quot; |



