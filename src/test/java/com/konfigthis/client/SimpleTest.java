package com.konfigthis.client;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

public class SimpleTest {
    final String MOCK_SERVER_URL = "http://localhost:4010";

    @Test
    public void initClientTest() {
        Configuration configuration = new Configuration();
        configuration.host = "https://api-test.agrimetrics.co.uk/catalog";
        
        // Configure HTTP bearer authorization: JWT
        configuration.token = "BEARER TOKEN";
        
        configuration.apiKeyHeader  = "YOUR API KEY";
        
        configuration.apiKeyQuery  = "YOUR API KEY";
        
        configuration.sec0  = "YOUR API KEY";
        
        configuration.xUserHeader  = "YOUR API KEY";
        Agrimetrics client = new Agrimetrics(configuration);
        assertNotNull(client);
    }
}
