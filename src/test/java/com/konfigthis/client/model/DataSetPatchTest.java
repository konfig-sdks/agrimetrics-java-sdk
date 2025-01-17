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


package com.konfigthis.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.CategoryValue;
import com.konfigthis.client.model.Contact;
import com.konfigthis.client.model.DataFormat;
import com.konfigthis.client.model.DataSetDistributionsInner;
import com.konfigthis.client.model.DataSetPatchGeospatialExtent;
import com.konfigthis.client.model.DataSetPatchLicence;
import com.konfigthis.client.model.DataSetPatchMetadataContact;
import com.konfigthis.client.model.DataSetPatchTemporalExtent;
import com.konfigthis.client.model.PublishedStatus;
import com.konfigthis.client.model.Resource;
import com.konfigthis.client.model.TaxonomyKeywords;
import com.konfigthis.client.model.Topic;
import com.konfigthis.client.model.WorkflowKeywords;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


/**
 * Model tests for DataSetPatch
 */
public class DataSetPatchTest {
    private final DataSetPatch model = new DataSetPatch();

    /**
     * Model tests for DataSetPatch
     */
    @Test
    public void testDataSetPatch() {
        // TODO: test DataSetPatch
    }

    /**
     * Test the property 'tags'
     */
    @Test
    public void tagsTest() {
        // TODO: test tags
    }

    /**
     * Test the property 'summary'
     */
    @Test
    public void summaryTest() {
        // TODO: test summary
    }

    /**
     * Test the property 'title'
     */
    @Test
    public void titleTest() {
        // TODO: test title
    }

    /**
     * Test the property 'description'
     */
    @Test
    public void descriptionTest() {
        // TODO: test description
    }

    /**
     * Test the property 'alternativeTitles'
     */
    @Test
    public void alternativeTitlesTest() {
        // TODO: test alternativeTitles
    }

    /**
     * Test the property 'scoringURI'
     */
    @Test
    public void scoringURITest() {
        // TODO: test scoringURI
    }

    /**
     * Test the property 'endpointKey'
     */
    @Test
    public void endpointKeyTest() {
        // TODO: test endpointKey
    }

    /**
     * Test the property 'derivedFrom'
     */
    @Test
    public void derivedFromTest() {
        // TODO: test derivedFrom
    }

    /**
     * Test the property 'creator'
     */
    @Test
    public void creatorTest() {
        // TODO: test creator
    }

    /**
     * Test the property 'dataReliability'
     */
    @Test
    public void dataReliabilityTest() {
        // TODO: test dataReliability
    }

    /**
     * Test the property 'license'
     */
    @Test
    public void licenseTest() {
        // TODO: test license
    }

    /**
     * Test the property 'licence'
     */
    @Test
    public void licenceTest() {
        // TODO: test licence
    }

    /**
     * Test the property 'resources'
     */
    @Test
    public void resourcesTest() {
        // TODO: test resources
    }

    /**
     * Test the property 'dataFormats'
     */
    @Test
    public void dataFormatsTest() {
        // TODO: test dataFormats
    }

    /**
     * Test the property 'spatialCoverage'
     */
    @Test
    public void spatialCoverageTest() {
        // TODO: test spatialCoverage
    }

    /**
     * Test the property 'spatialResolution'
     */
    @Test
    public void spatialResolutionTest() {
        // TODO: test spatialResolution
    }

    /**
     * Test the property 'geospatialExtent'
     */
    @Test
    public void geospatialExtentTest() {
        // TODO: test geospatialExtent
    }

    /**
     * Test the property 'temporalCoverage'
     */
    @Test
    public void temporalCoverageTest() {
        // TODO: test temporalCoverage
    }

    /**
     * Test the property 'temporalExtent'
     */
    @Test
    public void temporalExtentTest() {
        // TODO: test temporalExtent
    }

    /**
     * Test the property 'temporalResolution'
     */
    @Test
    public void temporalResolutionTest() {
        // TODO: test temporalResolution
    }

    /**
     * Test the property 'topics'
     */
    @Test
    public void topicsTest() {
        // TODO: test topics
    }

    /**
     * Test the property 'workflowKeywords'
     */
    @Test
    public void workflowKeywordsTest() {
        // TODO: test workflowKeywords
    }

    /**
     * Test the property 'taxonomyKeywords'
     */
    @Test
    public void taxonomyKeywordsTest() {
        // TODO: test taxonomyKeywords
    }

    /**
     * Test the property 'accrualPeriodicity'
     */
    @Test
    public void accrualPeriodicityTest() {
        // TODO: test accrualPeriodicity
    }

    /**
     * Test the property 'issued'
     */
    @Test
    public void issuedTest() {
        // TODO: test issued
    }

    /**
     * Test the property 'createdAt'
     */
    @Test
    public void createdAtTest() {
        // TODO: test createdAt
    }

    /**
     * Test the property 'published'
     */
    @Test
    public void publishedTest() {
        // TODO: test published
    }

    /**
     * Test the property 'publishedStatus'
     */
    @Test
    public void publishedStatusTest() {
        // TODO: test publishedStatus
    }

    /**
     * Test the property 'modified'
     */
    @Test
    public void modifiedTest() {
        // TODO: test modified
    }

    /**
     * Test the property 'category'
     */
    @Test
    public void categoryTest() {
        // TODO: test category
    }

    /**
     * Test the property 'visibility'
     */
    @Test
    public void visibilityTest() {
        // TODO: test visibility
    }

    /**
     * Test the property 'pricingDescription'
     */
    @Test
    public void pricingDescriptionTest() {
        // TODO: test pricingDescription
    }

    /**
     * Test the property 'distributions'
     */
    @Test
    public void distributionsTest() {
        // TODO: test distributions
    }

    /**
     * Test the property 'approvalForAccessNumber'
     */
    @Test
    public void approvalForAccessNumberTest() {
        // TODO: test approvalForAccessNumber
    }

    /**
     * Test the property 'approvalForAccessStatus'
     */
    @Test
    public void approvalForAccessStatusTest() {
        // TODO: test approvalForAccessStatus
    }

    /**
     * Test the property 'contacts'
     */
    @Test
    public void contactsTest() {
        // TODO: test contacts
    }

    /**
     * Test the property 'metadataContact'
     */
    @Test
    public void metadataContactTest() {
        // TODO: test metadataContact
    }

    /**
     * Test the property 'lineage'
     */
    @Test
    public void lineageTest() {
        // TODO: test lineage
    }

    /**
     * Test the property 'language'
     */
    @Test
    public void languageTest() {
        // TODO: test language
    }

    /**
     * Test the property 'characterSet'
     */
    @Test
    public void characterSetTest() {
        // TODO: test characterSet
    }

    /**
     * Test the property 'hierarchyLevel'
     */
    @Test
    public void hierarchyLevelTest() {
        // TODO: test hierarchyLevel
    }

    /**
     * Test the property 'metadataLanguage'
     */
    @Test
    public void metadataLanguageTest() {
        // TODO: test metadataLanguage
    }

    /**
     * Test the property 'metadataCharacterSet'
     */
    @Test
    public void metadataCharacterSetTest() {
        // TODO: test metadataCharacterSet
    }

    /**
     * Test the property 'metadataStandardName'
     */
    @Test
    public void metadataStandardNameTest() {
        // TODO: test metadataStandardName
    }

    /**
     * Test the property 'metadataStandardVersion'
     */
    @Test
    public void metadataStandardVersionTest() {
        // TODO: test metadataStandardVersion
    }

    /**
     * Test the property 'coordinateReferenceSystemId'
     */
    @Test
    public void coordinateReferenceSystemIdTest() {
        // TODO: test coordinateReferenceSystemId
    }

    /**
     * Test the property 'spatialRepresentationType'
     */
    @Test
    public void spatialRepresentationTypeTest() {
        // TODO: test spatialRepresentationType
    }

}
