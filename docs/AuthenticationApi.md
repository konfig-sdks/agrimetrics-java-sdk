# AuthenticationApi

All URIs are relative to *https://api-test.agrimetrics.co.uk/catalog*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getJwt**](AuthenticationApi.md#getJwt) | **POST** /authenticate | Get JWT |


<a name="getJwt"></a>
# **getJwt**
> AuthenticationGetJwtResponse getJwt().authenticationGetJwtRequest(authenticationGetJwtRequest).execute();

Get JWT

Retrieve an Agrimetrics JWT to be used as additional authentication on specified endpoints

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Agrimetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AuthenticationApi;
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
    String username = "username_example"; // Agrimetrics Catalog username
    String password = "password_example"; // Agrimetrics Catalog password
    try {
      AuthenticationGetJwtResponse result = client
              .authentication
              .getJwt()
              .username(username)
              .password(password)
              .execute();
      System.out.println(result);
      System.out.println(result.getJwts());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#getJwt");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AuthenticationGetJwtResponse> response = client
              .authentication
              .getJwt()
              .username(username)
              .password(password)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#getJwt");
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
| **authenticationGetJwtRequest** | [**AuthenticationGetJwtRequest**](AuthenticationGetJwtRequest.md)|  | [optional] |

### Return type

[**AuthenticationGetJwtResponse**](AuthenticationGetJwtResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

