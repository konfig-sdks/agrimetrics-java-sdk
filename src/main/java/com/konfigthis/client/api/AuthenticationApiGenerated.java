/*
 * Catalog API
 * This API lists data sets available on Agrimetrics platform.
 *
 * The version of the OpenAPI document: 
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.konfigthis.client.model.AuthenticationGetJwtRequest;
import com.konfigthis.client.model.AuthenticationGetJwtResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AuthenticationApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AuthenticationApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public AuthenticationApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call getJwtCall(AuthenticationGetJwtRequest authenticationGetJwtRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = authenticationGetJwtRequest;

        // create path and map variables
        String localVarPath = "/authenticate";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "JWT" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getJwtValidateBeforeCall(AuthenticationGetJwtRequest authenticationGetJwtRequest, final ApiCallback _callback) throws ApiException {
        return getJwtCall(authenticationGetJwtRequest, _callback);

    }


    private ApiResponse<AuthenticationGetJwtResponse> getJwtWithHttpInfo(AuthenticationGetJwtRequest authenticationGetJwtRequest) throws ApiException {
        okhttp3.Call localVarCall = getJwtValidateBeforeCall(authenticationGetJwtRequest, null);
        Type localVarReturnType = new TypeToken<AuthenticationGetJwtResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getJwtAsync(AuthenticationGetJwtRequest authenticationGetJwtRequest, final ApiCallback<AuthenticationGetJwtResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getJwtValidateBeforeCall(authenticationGetJwtRequest, _callback);
        Type localVarReturnType = new TypeToken<AuthenticationGetJwtResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetJwtRequestBuilder {
        private String username;
        private String password;

        private GetJwtRequestBuilder() {
        }

        /**
         * Set username
         * @param username Agrimetrics Catalog username (optional)
         * @return GetJwtRequestBuilder
         */
        public GetJwtRequestBuilder username(String username) {
            this.username = username;
            return this;
        }
        
        /**
         * Set password
         * @param password Agrimetrics Catalog password (optional)
         * @return GetJwtRequestBuilder
         */
        public GetJwtRequestBuilder password(String password) {
            this.password = password;
            return this;
        }
        
        /**
         * Build call for getJwt
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            AuthenticationGetJwtRequest authenticationGetJwtRequest = buildBodyParams();
            return getJwtCall(authenticationGetJwtRequest, _callback);
        }

        private AuthenticationGetJwtRequest buildBodyParams() {
            AuthenticationGetJwtRequest authenticationGetJwtRequest = new AuthenticationGetJwtRequest();
            authenticationGetJwtRequest.username(this.username);
            authenticationGetJwtRequest.password(this.password);
            return authenticationGetJwtRequest;
        }

        /**
         * Execute getJwt request
         * @return AuthenticationGetJwtResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public AuthenticationGetJwtResponse execute() throws ApiException {
            AuthenticationGetJwtRequest authenticationGetJwtRequest = buildBodyParams();
            ApiResponse<AuthenticationGetJwtResponse> localVarResp = getJwtWithHttpInfo(authenticationGetJwtRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getJwt request with HTTP info returned
         * @return ApiResponse&lt;AuthenticationGetJwtResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<AuthenticationGetJwtResponse> executeWithHttpInfo() throws ApiException {
            AuthenticationGetJwtRequest authenticationGetJwtRequest = buildBodyParams();
            return getJwtWithHttpInfo(authenticationGetJwtRequest);
        }

        /**
         * Execute getJwt request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<AuthenticationGetJwtResponse> _callback) throws ApiException {
            AuthenticationGetJwtRequest authenticationGetJwtRequest = buildBodyParams();
            return getJwtAsync(authenticationGetJwtRequest, _callback);
        }
    }

    /**
     * Get JWT
     * Retrieve an Agrimetrics JWT to be used as additional authentication on specified endpoints
     * @return GetJwtRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
     </table>
     */
    public GetJwtRequestBuilder getJwt() throws IllegalArgumentException {
        return new GetJwtRequestBuilder();
    }
}
