package com.konfigthis.client;

import com.konfigthis.client.api.AccessRequestApi;
import com.konfigthis.client.api.AdminApi;
import com.konfigthis.client.api.AuthenticationApi;
import com.konfigthis.client.api.DatasetApi;
import com.konfigthis.client.api.EsriApi;
import com.konfigthis.client.api.GraphApi;
import com.konfigthis.client.api.HarvestApi;
import com.konfigthis.client.api.ImageApi;
import com.konfigthis.client.api.ImportApi;
import com.konfigthis.client.api.ManageDatasetApi;
import com.konfigthis.client.api.ManageLayerApi;
import com.konfigthis.client.api.OgcApiTilesApi;
import com.konfigthis.client.api.OgcapiApi;
import com.konfigthis.client.api.QueryDatasetApi;
import com.konfigthis.client.api.QueryLayerApi;
import com.konfigthis.client.api.ServiceDefinitionApi;
import com.konfigthis.client.api.ShapefileApi;
import com.konfigthis.client.api.StatusApi;
import com.konfigthis.client.api.TemplateApi;
import com.konfigthis.client.api.WcsApi;
import com.konfigthis.client.api.WfsApi;
import com.konfigthis.client.api.WmsApi;
import com.konfigthis.client.api.WmtsApi;
import com.konfigthis.client.api.WmtsRestApi;
import com.konfigthis.client.api.DataRequestApi;

public class Agrimetrics {
    private ApiClient apiClient;
    public final AccessRequestApi accessRequest;
    public final AdminApi admin;
    public final AuthenticationApi authentication;
    public final DatasetApi dataset;
    public final EsriApi esri;
    public final GraphApi graph;
    public final HarvestApi harvest;
    public final ImageApi image;
    public final ImportApi import;
    public final ManageDatasetApi manageDataset;
    public final ManageLayerApi manageLayer;
    public final OgcApiTilesApi ogcApiTiles;
    public final OgcapiApi ogcapi;
    public final QueryDatasetApi queryDataset;
    public final QueryLayerApi queryLayer;
    public final ServiceDefinitionApi serviceDefinition;
    public final ShapefileApi shapefile;
    public final StatusApi status;
    public final TemplateApi template;
    public final WcsApi wcs;
    public final WfsApi wfs;
    public final WmsApi wms;
    public final WmtsApi wmts;
    public final WmtsRestApi wmtsRest;
    public final DataRequestApi dataRequest;

    public Agrimetrics() {
        this(null);
    }

    public Agrimetrics(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.accessRequest = new AccessRequestApi(this.apiClient);
        this.admin = new AdminApi(this.apiClient);
        this.authentication = new AuthenticationApi(this.apiClient);
        this.dataset = new DatasetApi(this.apiClient);
        this.esri = new EsriApi(this.apiClient);
        this.graph = new GraphApi(this.apiClient);
        this.harvest = new HarvestApi(this.apiClient);
        this.image = new ImageApi(this.apiClient);
        this.import = new ImportApi(this.apiClient);
        this.manageDataset = new ManageDatasetApi(this.apiClient);
        this.manageLayer = new ManageLayerApi(this.apiClient);
        this.ogcApiTiles = new OgcApiTilesApi(this.apiClient);
        this.ogcapi = new OgcapiApi(this.apiClient);
        this.queryDataset = new QueryDatasetApi(this.apiClient);
        this.queryLayer = new QueryLayerApi(this.apiClient);
        this.serviceDefinition = new ServiceDefinitionApi(this.apiClient);
        this.shapefile = new ShapefileApi(this.apiClient);
        this.status = new StatusApi(this.apiClient);
        this.template = new TemplateApi(this.apiClient);
        this.wcs = new WcsApi(this.apiClient);
        this.wfs = new WfsApi(this.apiClient);
        this.wms = new WmsApi(this.apiClient);
        this.wmts = new WmtsApi(this.apiClient);
        this.wmtsRest = new WmtsRestApi(this.apiClient);
        this.dataRequest = new DataRequestApi(this.apiClient);
    }

}
