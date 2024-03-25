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


import com.konfigthis.client.model.EntryUpdateResponse;
import com.konfigthis.client.model.StatusGetCatalogApiStatusResponse;
import com.konfigthis.client.model.StatusSetDraftStatusRequest;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class StatusApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public StatusApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public StatusApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call getCatalogApiStatusCall(final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/status";

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
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "apiKeyQuery" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getCatalogApiStatusValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return getCatalogApiStatusCall(_callback);

    }


    private ApiResponse<StatusGetCatalogApiStatusResponse> getCatalogApiStatusWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getCatalogApiStatusValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<StatusGetCatalogApiStatusResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getCatalogApiStatusAsync(final ApiCallback<StatusGetCatalogApiStatusResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getCatalogApiStatusValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<StatusGetCatalogApiStatusResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetCatalogApiStatusRequestBuilder {

        private GetCatalogApiStatusRequestBuilder() {
        }

        /**
         * Build call for getCatalogApiStatus
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Status of catalog API. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getCatalogApiStatusCall(_callback);
        }


        /**
         * Execute getCatalogApiStatus request
         * @return StatusGetCatalogApiStatusResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Status of catalog API. </td><td>  -  </td></tr>
         </table>
         */
        public StatusGetCatalogApiStatusResponse execute() throws ApiException {
            ApiResponse<StatusGetCatalogApiStatusResponse> localVarResp = getCatalogApiStatusWithHttpInfo();
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getCatalogApiStatus request with HTTP info returned
         * @return ApiResponse&lt;StatusGetCatalogApiStatusResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Status of catalog API. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<StatusGetCatalogApiStatusResponse> executeWithHttpInfo() throws ApiException {
            return getCatalogApiStatusWithHttpInfo();
        }

        /**
         * Execute getCatalogApiStatus request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Status of catalog API. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<StatusGetCatalogApiStatusResponse> _callback) throws ApiException {
            return getCatalogApiStatusAsync(_callback);
        }
    }

    /**
     * Get status of catalog API.
     * Get status of catalog API.
     * @return GetCatalogApiStatusRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Status of catalog API. </td><td>  -  </td></tr>
     </table>
     */
    public GetCatalogApiStatusRequestBuilder getCatalogApiStatus() throws IllegalArgumentException {
        return new GetCatalogApiStatusRequestBuilder();
    }
    private okhttp3.Call setDraftStatusCall(UUID dataSetId, StatusSetDraftStatusRequest statusSetDraftStatusRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = statusSetDraftStatusRequest;

        // create path and map variables
        String localVarPath = "/data-sets/{dataSetId}/draft-status"
            .replace("{" + "dataSetId" + "}", localVarApiClient.escapeString(dataSetId.toString()));

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

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call setDraftStatusValidateBeforeCall(UUID dataSetId, StatusSetDraftStatusRequest statusSetDraftStatusRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'dataSetId' is set
        if (dataSetId == null) {
            throw new ApiException("Missing the required parameter 'dataSetId' when calling setDraftStatus(Async)");
        }

        return setDraftStatusCall(dataSetId, statusSetDraftStatusRequest, _callback);

    }


    private ApiResponse<EntryUpdateResponse> setDraftStatusWithHttpInfo(UUID dataSetId, StatusSetDraftStatusRequest statusSetDraftStatusRequest) throws ApiException {
        okhttp3.Call localVarCall = setDraftStatusValidateBeforeCall(dataSetId, statusSetDraftStatusRequest, null);
        Type localVarReturnType = new TypeToken<EntryUpdateResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call setDraftStatusAsync(UUID dataSetId, StatusSetDraftStatusRequest statusSetDraftStatusRequest, final ApiCallback<EntryUpdateResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = setDraftStatusValidateBeforeCall(dataSetId, statusSetDraftStatusRequest, _callback);
        Type localVarReturnType = new TypeToken<EntryUpdateResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class SetDraftStatusRequestBuilder {
        private final Object status;
        private final UUID dataSetId;
        private String notes;

        private SetDraftStatusRequestBuilder(Object status, UUID dataSetId) {
            this.status = status;
            this.dataSetId = dataSetId;
        }

        /**
         * Set notes
         * @param notes Any notes added during review of the data set (optional)
         * @return SetDraftStatusRequestBuilder
         */
        public SetDraftStatusRequestBuilder notes(String notes) {
            this.notes = notes;
            return this;
        }
        
        /**
         * Build call for setDraftStatus
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Updates a single catalog entry for a data set. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            StatusSetDraftStatusRequest statusSetDraftStatusRequest = buildBodyParams();
            return setDraftStatusCall(dataSetId, statusSetDraftStatusRequest, _callback);
        }

        private StatusSetDraftStatusRequest buildBodyParams() {
            StatusSetDraftStatusRequest statusSetDraftStatusRequest = new StatusSetDraftStatusRequest();
            statusSetDraftStatusRequest.status(this.status);
            statusSetDraftStatusRequest.notes(this.notes);
            return statusSetDraftStatusRequest;
        }

        /**
         * Execute setDraftStatus request
         * @return EntryUpdateResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Updates a single catalog entry for a data set. </td><td>  -  </td></tr>
         </table>
         */
        public EntryUpdateResponse execute() throws ApiException {
            StatusSetDraftStatusRequest statusSetDraftStatusRequest = buildBodyParams();
            ApiResponse<EntryUpdateResponse> localVarResp = setDraftStatusWithHttpInfo(dataSetId, statusSetDraftStatusRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute setDraftStatus request with HTTP info returned
         * @return ApiResponse&lt;EntryUpdateResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Updates a single catalog entry for a data set. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<EntryUpdateResponse> executeWithHttpInfo() throws ApiException {
            StatusSetDraftStatusRequest statusSetDraftStatusRequest = buildBodyParams();
            return setDraftStatusWithHttpInfo(dataSetId, statusSetDraftStatusRequest);
        }

        /**
         * Execute setDraftStatus request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Updates a single catalog entry for a data set. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<EntryUpdateResponse> _callback) throws ApiException {
            StatusSetDraftStatusRequest statusSetDraftStatusRequest = buildBodyParams();
            return setDraftStatusAsync(dataSetId, statusSetDraftStatusRequest, _callback);
        }
    }

    /**
     * Set the draft status for the data set catalog entry.
     * Set the draft status for the data set catalog entry.
     * @param dataSetId  (required)
     * @return SetDraftStatusRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Updates a single catalog entry for a data set. </td><td>  -  </td></tr>
     </table>
     */
    public SetDraftStatusRequestBuilder setDraftStatus(Object status, UUID dataSetId) throws IllegalArgumentException {
        
        if (dataSetId == null) throw new IllegalArgumentException("\"dataSetId\" is required but got null");
            

        return new SetDraftStatusRequestBuilder(status, dataSetId);
    }
}