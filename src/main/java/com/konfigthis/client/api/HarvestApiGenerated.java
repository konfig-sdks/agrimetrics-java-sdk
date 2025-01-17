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


import com.konfigthis.client.model.GroupCode;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class HarvestApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public HarvestApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public HarvestApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call xmlDataOnGroupCall(GroupCode group, String service, String request, String version, Double startPosition, Double maxRecords, List<UUID> id, String outputSchema, String elementsetname, String outputFormat, String typeNames, String resultType, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/harvest/{group}/csw"
            .replace("{" + "group" + "}", localVarApiClient.escapeString(group.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (service != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("service", service));
        }

        if (request != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("request", request));
        }

        if (version != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("version", version));
        }

        if (startPosition != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("startPosition", startPosition));
        }

        if (maxRecords != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("maxRecords", maxRecords));
        }

        if (id != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "id", id));
        }

        if (outputSchema != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("outputSchema", outputSchema));
        }

        if (elementsetname != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("elementsetname", elementsetname));
        }

        if (outputFormat != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("outputFormat", outputFormat));
        }

        if (typeNames != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("typeNames", typeNames));
        }

        if (resultType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("resultType", resultType));
        }

        final String[] localVarAccepts = {
            "application/xml"
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

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call xmlDataOnGroupValidateBeforeCall(GroupCode group, String service, String request, String version, Double startPosition, Double maxRecords, List<UUID> id, String outputSchema, String elementsetname, String outputFormat, String typeNames, String resultType, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'group' is set
        if (group == null) {
            throw new ApiException("Missing the required parameter 'group' when calling xmlDataOnGroup(Async)");
        }

        return xmlDataOnGroupCall(group, service, request, version, startPosition, maxRecords, id, outputSchema, elementsetname, outputFormat, typeNames, resultType, _callback);

    }


    private ApiResponse<Object> xmlDataOnGroupWithHttpInfo(GroupCode group, String service, String request, String version, Double startPosition, Double maxRecords, List<UUID> id, String outputSchema, String elementsetname, String outputFormat, String typeNames, String resultType) throws ApiException {
        okhttp3.Call localVarCall = xmlDataOnGroupValidateBeforeCall(group, service, request, version, startPosition, maxRecords, id, outputSchema, elementsetname, outputFormat, typeNames, resultType, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call xmlDataOnGroupAsync(GroupCode group, String service, String request, String version, Double startPosition, Double maxRecords, List<UUID> id, String outputSchema, String elementsetname, String outputFormat, String typeNames, String resultType, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = xmlDataOnGroupValidateBeforeCall(group, service, request, version, startPosition, maxRecords, id, outputSchema, elementsetname, outputFormat, typeNames, resultType, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class XmlDataOnGroupRequestBuilder {
        private final GroupCode group;
        private String service;
        private String request;
        private String version;
        private Double startPosition;
        private Double maxRecords;
        private List<UUID> id;
        private String outputSchema;
        private String elementsetname;
        private String outputFormat;
        private String typeNames;
        private String resultType;

        private XmlDataOnGroupRequestBuilder(GroupCode group) {
            this.group = group;
        }

        /**
         * Set service
         * @param service  (optional)
         * @return XmlDataOnGroupRequestBuilder
         */
        public XmlDataOnGroupRequestBuilder service(String service) {
            this.service = service;
            return this;
        }
        
        /**
         * Set request
         * @param request  (optional)
         * @return XmlDataOnGroupRequestBuilder
         */
        public XmlDataOnGroupRequestBuilder request(String request) {
            this.request = request;
            return this;
        }
        
        /**
         * Set version
         * @param version  (optional)
         * @return XmlDataOnGroupRequestBuilder
         */
        public XmlDataOnGroupRequestBuilder version(String version) {
            this.version = version;
            return this;
        }
        
        /**
         * Set startPosition
         * @param startPosition  (optional, default to 1)
         * @return XmlDataOnGroupRequestBuilder
         */
        public XmlDataOnGroupRequestBuilder startPosition(Double startPosition) {
            this.startPosition = startPosition;
            return this;
        }
        
        /**
         * Set maxRecords
         * @param maxRecords  (optional, default to 10)
         * @return XmlDataOnGroupRequestBuilder
         */
        public XmlDataOnGroupRequestBuilder maxRecords(Double maxRecords) {
            this.maxRecords = maxRecords;
            return this;
        }
        
        /**
         * Set id
         * @param id  (optional)
         * @return XmlDataOnGroupRequestBuilder
         */
        public XmlDataOnGroupRequestBuilder id(List<UUID> id) {
            this.id = id;
            return this;
        }
        
        /**
         * Set outputSchema
         * @param outputSchema  (optional)
         * @return XmlDataOnGroupRequestBuilder
         */
        public XmlDataOnGroupRequestBuilder outputSchema(String outputSchema) {
            this.outputSchema = outputSchema;
            return this;
        }
        
        /**
         * Set elementsetname
         * @param elementsetname  (optional)
         * @return XmlDataOnGroupRequestBuilder
         */
        public XmlDataOnGroupRequestBuilder elementsetname(String elementsetname) {
            this.elementsetname = elementsetname;
            return this;
        }
        
        /**
         * Set outputFormat
         * @param outputFormat  (optional)
         * @return XmlDataOnGroupRequestBuilder
         */
        public XmlDataOnGroupRequestBuilder outputFormat(String outputFormat) {
            this.outputFormat = outputFormat;
            return this;
        }
        
        /**
         * Set typeNames
         * @param typeNames  (optional)
         * @return XmlDataOnGroupRequestBuilder
         */
        public XmlDataOnGroupRequestBuilder typeNames(String typeNames) {
            this.typeNames = typeNames;
            return this;
        }
        
        /**
         * Set resultType
         * @param resultType  (optional)
         * @return XmlDataOnGroupRequestBuilder
         */
        public XmlDataOnGroupRequestBuilder resultType(String resultType) {
            this.resultType = resultType;
            return this;
        }
        
        /**
         * Build call for xmlDataOnGroup
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Get harvest data </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return xmlDataOnGroupCall(group, service, request, version, startPosition, maxRecords, id, outputSchema, elementsetname, outputFormat, typeNames, resultType, _callback);
        }


        /**
         * Execute xmlDataOnGroup request
         * @return Object
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Get harvest data </td><td>  -  </td></tr>
         </table>
         */
        public Object execute() throws ApiException {
            ApiResponse<Object> localVarResp = xmlDataOnGroupWithHttpInfo(group, service, request, version, startPosition, maxRecords, id, outputSchema, elementsetname, outputFormat, typeNames, resultType);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute xmlDataOnGroup request with HTTP info returned
         * @return ApiResponse&lt;Object&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Get harvest data </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
            return xmlDataOnGroupWithHttpInfo(group, service, request, version, startPosition, maxRecords, id, outputSchema, elementsetname, outputFormat, typeNames, resultType);
        }

        /**
         * Execute xmlDataOnGroup request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Get harvest data </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Object> _callback) throws ApiException {
            return xmlDataOnGroupAsync(group, service, request, version, startPosition, maxRecords, id, outputSchema, elementsetname, outputFormat, typeNames, resultType, _callback);
        }
    }

    /**
     * Harvest xml data on the given group
     * 
     * @param group  (required)
     * @return XmlDataOnGroupRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get harvest data </td><td>  -  </td></tr>
     </table>
     */
    public XmlDataOnGroupRequestBuilder xmlDataOnGroup(GroupCode group) throws IllegalArgumentException {
        if (group == null) throw new IllegalArgumentException("\"group\" is required but got null");
        return new XmlDataOnGroupRequestBuilder(group);
    }
    private okhttp3.Call xmlDataOnGroupPostCall(GroupCode group, String service, String request, String version, Double startPosition, Double maxRecords, List<UUID> id, String outputSchema, String elementsetname, String outputFormat, String typeNames, String resultType, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/harvest/{group}/csw"
            .replace("{" + "group" + "}", localVarApiClient.escapeString(group.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (service != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("service", service));
        }

        if (request != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("request", request));
        }

        if (version != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("version", version));
        }

        if (startPosition != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("startPosition", startPosition));
        }

        if (maxRecords != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("maxRecords", maxRecords));
        }

        if (id != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "id", id));
        }

        if (outputSchema != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("outputSchema", outputSchema));
        }

        if (elementsetname != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("elementsetname", elementsetname));
        }

        if (outputFormat != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("outputFormat", outputFormat));
        }

        if (typeNames != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("typeNames", typeNames));
        }

        if (resultType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("resultType", resultType));
        }

        final String[] localVarAccepts = {
            "application/xml"
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

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call xmlDataOnGroupPostValidateBeforeCall(GroupCode group, String service, String request, String version, Double startPosition, Double maxRecords, List<UUID> id, String outputSchema, String elementsetname, String outputFormat, String typeNames, String resultType, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'group' is set
        if (group == null) {
            throw new ApiException("Missing the required parameter 'group' when calling xmlDataOnGroupPost(Async)");
        }

        return xmlDataOnGroupPostCall(group, service, request, version, startPosition, maxRecords, id, outputSchema, elementsetname, outputFormat, typeNames, resultType, _callback);

    }


    private ApiResponse<String> xmlDataOnGroupPostWithHttpInfo(GroupCode group, String service, String request, String version, Double startPosition, Double maxRecords, List<UUID> id, String outputSchema, String elementsetname, String outputFormat, String typeNames, String resultType) throws ApiException {
        okhttp3.Call localVarCall = xmlDataOnGroupPostValidateBeforeCall(group, service, request, version, startPosition, maxRecords, id, outputSchema, elementsetname, outputFormat, typeNames, resultType, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call xmlDataOnGroupPostAsync(GroupCode group, String service, String request, String version, Double startPosition, Double maxRecords, List<UUID> id, String outputSchema, String elementsetname, String outputFormat, String typeNames, String resultType, final ApiCallback<String> _callback) throws ApiException {

        okhttp3.Call localVarCall = xmlDataOnGroupPostValidateBeforeCall(group, service, request, version, startPosition, maxRecords, id, outputSchema, elementsetname, outputFormat, typeNames, resultType, _callback);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class XmlDataOnGroupPostRequestBuilder {
        private final GroupCode group;
        private String service;
        private String request;
        private String version;
        private Double startPosition;
        private Double maxRecords;
        private List<UUID> id;
        private String outputSchema;
        private String elementsetname;
        private String outputFormat;
        private String typeNames;
        private String resultType;

        private XmlDataOnGroupPostRequestBuilder(GroupCode group) {
            this.group = group;
        }

        /**
         * Set service
         * @param service  (optional)
         * @return XmlDataOnGroupPostRequestBuilder
         */
        public XmlDataOnGroupPostRequestBuilder service(String service) {
            this.service = service;
            return this;
        }
        
        /**
         * Set request
         * @param request  (optional)
         * @return XmlDataOnGroupPostRequestBuilder
         */
        public XmlDataOnGroupPostRequestBuilder request(String request) {
            this.request = request;
            return this;
        }
        
        /**
         * Set version
         * @param version  (optional)
         * @return XmlDataOnGroupPostRequestBuilder
         */
        public XmlDataOnGroupPostRequestBuilder version(String version) {
            this.version = version;
            return this;
        }
        
        /**
         * Set startPosition
         * @param startPosition  (optional, default to 1)
         * @return XmlDataOnGroupPostRequestBuilder
         */
        public XmlDataOnGroupPostRequestBuilder startPosition(Double startPosition) {
            this.startPosition = startPosition;
            return this;
        }
        
        /**
         * Set maxRecords
         * @param maxRecords  (optional, default to 10)
         * @return XmlDataOnGroupPostRequestBuilder
         */
        public XmlDataOnGroupPostRequestBuilder maxRecords(Double maxRecords) {
            this.maxRecords = maxRecords;
            return this;
        }
        
        /**
         * Set id
         * @param id  (optional)
         * @return XmlDataOnGroupPostRequestBuilder
         */
        public XmlDataOnGroupPostRequestBuilder id(List<UUID> id) {
            this.id = id;
            return this;
        }
        
        /**
         * Set outputSchema
         * @param outputSchema  (optional)
         * @return XmlDataOnGroupPostRequestBuilder
         */
        public XmlDataOnGroupPostRequestBuilder outputSchema(String outputSchema) {
            this.outputSchema = outputSchema;
            return this;
        }
        
        /**
         * Set elementsetname
         * @param elementsetname  (optional)
         * @return XmlDataOnGroupPostRequestBuilder
         */
        public XmlDataOnGroupPostRequestBuilder elementsetname(String elementsetname) {
            this.elementsetname = elementsetname;
            return this;
        }
        
        /**
         * Set outputFormat
         * @param outputFormat  (optional)
         * @return XmlDataOnGroupPostRequestBuilder
         */
        public XmlDataOnGroupPostRequestBuilder outputFormat(String outputFormat) {
            this.outputFormat = outputFormat;
            return this;
        }
        
        /**
         * Set typeNames
         * @param typeNames  (optional)
         * @return XmlDataOnGroupPostRequestBuilder
         */
        public XmlDataOnGroupPostRequestBuilder typeNames(String typeNames) {
            this.typeNames = typeNames;
            return this;
        }
        
        /**
         * Set resultType
         * @param resultType  (optional)
         * @return XmlDataOnGroupPostRequestBuilder
         */
        public XmlDataOnGroupPostRequestBuilder resultType(String resultType) {
            this.resultType = resultType;
            return this;
        }
        
        /**
         * Build call for xmlDataOnGroupPost
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Get harvest data </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return xmlDataOnGroupPostCall(group, service, request, version, startPosition, maxRecords, id, outputSchema, elementsetname, outputFormat, typeNames, resultType, _callback);
        }


        /**
         * Execute xmlDataOnGroupPost request
         * @return String
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Get harvest data </td><td>  -  </td></tr>
         </table>
         */
        public String execute() throws ApiException {
            ApiResponse<String> localVarResp = xmlDataOnGroupPostWithHttpInfo(group, service, request, version, startPosition, maxRecords, id, outputSchema, elementsetname, outputFormat, typeNames, resultType);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute xmlDataOnGroupPost request with HTTP info returned
         * @return ApiResponse&lt;String&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Get harvest data </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<String> executeWithHttpInfo() throws ApiException {
            return xmlDataOnGroupPostWithHttpInfo(group, service, request, version, startPosition, maxRecords, id, outputSchema, elementsetname, outputFormat, typeNames, resultType);
        }

        /**
         * Execute xmlDataOnGroupPost request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Get harvest data </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<String> _callback) throws ApiException {
            return xmlDataOnGroupPostAsync(group, service, request, version, startPosition, maxRecords, id, outputSchema, elementsetname, outputFormat, typeNames, resultType, _callback);
        }
    }

    /**
     * Harvest xml data on the given group
     * 
     * @param group  (required)
     * @return XmlDataOnGroupPostRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get harvest data </td><td>  -  </td></tr>
     </table>
     */
    public XmlDataOnGroupPostRequestBuilder xmlDataOnGroupPost(GroupCode group) throws IllegalArgumentException {
        if (group == null) throw new IllegalArgumentException("\"group\" is required but got null");
        return new XmlDataOnGroupPostRequestBuilder(group);
    }
}
