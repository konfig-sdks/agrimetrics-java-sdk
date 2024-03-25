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
import com.konfigthis.client.model.ManageDatasetIngestFileNewLayerRequest;
import com.konfigthis.client.model.NewLayers;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ManageDatasetApi
 */
@Disabled
public class ManageDatasetApiTest {

    private static ManageDatasetApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new ManageDatasetApi(apiClient);
    }

    /**
     * Ingest file to new layer
     *
     * &gt; :warning: **This is an Agrimetrics internal operation. It relies on information which is not exposed externally.**  Ingest a file that has been uploaded to the catalog to create a new layer. See [supported ingest formats](doc:supported-ingest-formats) for supported formats. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ingestFileNewLayerTest() throws ApiException {
        String fileUri = null;
        UUID datasetId = null;
        NewLayers response = api.ingestFileNewLayer(fileUri, datasetId)
                .execute();
        // TODO: test validations
    }

}