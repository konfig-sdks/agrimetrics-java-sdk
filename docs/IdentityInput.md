

# IdentityInput

An entity, such as a user or organisation.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The Auth0 id of a user, or uuid of another identity |  [optional] |
|**email** | **String** | The email address of a user |  [optional] |
|**name** | **String** | The name of the user. Will be ignored, but allowed so GET data can be round-tripped. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of the identity |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| USER | &quot;user&quot; |
| ORGANISATION | &quot;organisation&quot; |
| PUBLIC | &quot;public&quot; |



