package com.solvd.automationtestingmain.api.dummyjson;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.config.Configuration;

@Endpoint(url="${base_url}/products/1", methodType = HttpMethodType.GET)
@ResponseTemplatePath(path= "api_automationTesting/dummyjson/_get/rs.json")
@SuccessfulHttpStatus(status= HttpResponseStatusType.OK_200)
public class GetSingleProductMethod extends AbstractApiMethodV2 {
    public GetSingleProductMethod() {
    replaceUrlPlaceholder("base_url", Configuration.getRequired("api_url"));
    }
}
