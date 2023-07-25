package com.solvd.api;

import com.solvd.api.dummyjson.GetProductmethod;
import com.zebrunner.carina.api.apitools.validation.JsonComparatorContext;
import com.zebrunner.carina.core.IAbstractTest;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.testng.annotations.Test;

public class apiTestDummyJson implements IAbstractTest {
    @Test
    public void tetsGetProduct() {
        GetProductmethod getProductmethod = new GetProductmethod();
        getProductmethod.callAPIExpectSuccess();
      //  getProductmethod.validateResponse(JSONCompareMode.LENIENT, JsonComparatorContext.context());
        getProductmethod.validateResponseAgainstSchema("api/_get/rs.schema");
    }



}
