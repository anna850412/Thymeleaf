/*
 * Swagger Converter 2.0
 * This is a sample server converter.  You can find out more about     Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/).      For this sample, you can use the api key `special-key` to test the authorization     filters.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package pl.ania.converter.demo.client;

import pl.ania.converter.demo.client.model.SwaggerNbp;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RatesApi
 */
@Ignore
public class RatesApiTest {

    private final RatesApi api = new RatesApi();

    
    /**
     * Get current rates
     *
     * Multiple status values can be provided with comma separated strings
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCurrentRatesTest() {
        String format = null;
        SwaggerNbp response = api.getCurrentRates(format);

        // TODO: test validations
    }
    
}
