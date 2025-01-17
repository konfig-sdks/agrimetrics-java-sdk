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

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.DataRequest;
import com.konfigthis.client.model.DataRequestCreateSingleAccessRequestResponse;
import com.konfigthis.client.model.DataRequestDetailsInner;
import com.konfigthis.client.model.DataRequestResponseInner;
import com.konfigthis.client.model.DataRequestUpdateRequestRequest;
import com.konfigthis.client.model.DataRequestUpdateRequestResponse;
import java.io.File;
import com.konfigthis.client.model.GeoJSONPolygon;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DataRequestApi
 */
@Disabled
public class DataRequestApiTest {

    private static DataRequestApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new DataRequestApi(apiClient);
    }

    /**
     * create a single access request
     *
     * Create a single access request for an authenticated user
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createSingleAccessRequestTest() throws ApiException {
        String projectName = null;
        String projectManagerName = null;
        String projectManagerEmail = null;
        UUID datasetId = null;
        String datasetName = null;
        String requestedFormat = null;
        String geoJsonAOI = null;
        File shapefileAOI = null;
        DataRequestCreateSingleAccessRequestResponse response = api.createSingleAccessRequest(projectName, projectManagerName, projectManagerEmail, datasetId, datasetName, requestedFormat)
                .geoJsonAOI(geoJsonAOI)
                .shapefileAOI(shapefileAOI)
                .execute();
        // TODO: test validations
    }

    /**
     * Get geometry for data request as GeoJSON
     *
     * Returns the geometry of the data request as GeoJSON
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getGeoJsonGeometryTest() throws ApiException {
        String uniqueLinkId = null;
        GeoJSONPolygon response = api.getGeoJsonGeometry(uniqueLinkId)
                .execute();
        // TODO: test validations
    }

    /**
     * gets the data for the approved request
     *
     * Returns the users requested data
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getRequestedDataTest() throws ApiException {
        UUID requestId = null;
        List<DataRequestDetailsInner> response = api.getRequestedData(requestId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get the results of your data request
     *
     * Once a data access request has been approved, this endpoint returns the data requested.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getResultsTest() throws ApiException {
        UUID requestId = null;
        File response = api.getResults(requestId)
                .execute();
        // TODO: test validations
    }

    /**
     * approve data access
     *
     * Grants access to a user on a given data request
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void grantUserAccessTest() throws ApiException {
        String uniqueLinkId = null;
        api.grantUserAccess(uniqueLinkId)
                .execute();
        // TODO: test validations
    }

    /**
     * lists a users data requests
     *
     * Query the given users data access requests 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listUserAccessRequestsTest() throws ApiException {
        List<DataRequestResponseInner> response = api.listUserAccessRequests()
                .execute();
        // TODO: test validations
    }

    /**
     * reject data access
     *
     * Rejects access to a user on a given data request
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void rejectUserAccessTest() throws ApiException {
        String uniqueLinkId = null;
        api.rejectUserAccess(uniqueLinkId)
                .execute();
        // TODO: test validations
    }

    /**
     * updates a data request
     *
     * Allows updating of the given data request | - For example: cancelling the request 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateRequestTest() throws ApiException {
        UUID requestId = null;
        String status = null;
        DataRequestUpdateRequestResponse response = api.updateRequest(requestId)
                .status(status)
                .execute();
        // TODO: test validations
    }

}
