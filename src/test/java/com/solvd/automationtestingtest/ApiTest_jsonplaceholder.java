package com.solvd.automationtestingtest;

import com.solvd.automationtestingmain.api.jsonplaceholder.GetSingleUserMethod;

import com.zebrunner.carina.api.apitools.validation.JsonCompareKeywords;

import org.skyscreamer.jsonassert.JSONCompareMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import java.lang.invoke.MethodHandles;

public class ApiTest_jsonplaceholder {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
    @Test()
    public void testGetUser() {
        GetSingleUserMethod getSingleUserMethod= new GetSingleUserMethod();
        getSingleUserMethod.callAPIExpectSuccess();
        getSingleUserMethod.validateResponse(JSONCompareMode.LENIENT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        getSingleUserMethod.validateResponseAgainstSchema("api_automationTesting/jsonplaceholder/_get/rs.schema");
    }

}
