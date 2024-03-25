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
import com.konfigthis.client.model.AccessRequestCreateNewRequestRequest;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AccessRequestApi
 */
@Disabled
public class AccessRequestApiTest {

    private static AccessRequestApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new AccessRequestApi(apiClient);
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createNewRequestTest() throws ApiException {
        UUID dataSetId = null;
        String requestingEntityId = null;
        String requestMessage = null;
        String requesterName = null;
        String requesterEmail = null;
        api.createNewRequest(dataSetId, requestingEntityId, requestMessage)
                .requesterName(requesterName)
                .requesterEmail(requesterEmail)
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteRequestByIdTest() throws ApiException {
        String requestId = null;
        UUID dataSetId = null;
        Boolean accepted = null;
        api.deleteRequestById(requestId, dataSetId)
                .accepted(accepted)
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listTest() throws ApiException {
        UUID dataSetId = null;
        String requestingEntityId = null;
        List<String> entityId = null;
        api.list()
                .dataSetId(dataSetId)
                .requestingEntityId(requestingEntityId)
                .entityId(entityId)
                .execute();
        // TODO: test validations
    }

}