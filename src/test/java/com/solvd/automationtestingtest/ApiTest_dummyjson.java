package com.solvd.automationtestingtest;

import com.solvd.automationtestingmain.api.dummyjson.GetProductMethod;
import com.solvd.automationtestingmain.api.dummyjson.GetSingleProductMethod;
import com.solvd.automationtestingmain.api.dummyjson.PostProductMethod;
import com.zebrunner.carina.api.apitools.validation.JsonComparatorContext;
import com.zebrunner.carina.api.apitools.validation.JsonCompareKeywords;
import com.zebrunner.carina.utils.config.Configuration;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import java.lang.invoke.MethodHandles;

public class ApiTest_dummyjson {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Test
    public void testGetAllProducts(){
        GetProductMethod getProductMethod= new GetProductMethod();
        getProductMethod.callAPIExpectSuccess();
        getProductMethod.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        getProductMethod.validateResponseAgainstSchema("api_automationTesting/dummyjson/_get/rs.schema");
    }
    @Test
    public void testGetProductDetails(){
        GetSingleProductMethod getSingleProductMethod =  new GetSingleProductMethod();
        getSingleProductMethod.callAPI();
        getSingleProductMethod.validateResponseAgainstSchema("api_automationTesting/dummyjson/_get/rs.schema");
    }
    @Test
    public void testAddProduct(){
        PostProductMethod addproduct = new PostProductMethod();
        addproduct.setProperties("api_automationTesting/dummyjson/data1.properties");
        addproduct.callAPIExpectSuccess();
        addproduct.validateResponse();
    }
}
