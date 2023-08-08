package com.solvd.automationtestingmain.api.dummyjson;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.RequestTemplatePath;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.config.Configuration;

@Endpoint(url= "${base_url}/products/add", methodType = HttpMethodType.POST)
@RequestTemplatePath(path="api_automationTesting/dummyjson/_post/rq.json")
@ResponseTemplatePath(path= "api_automationTesting/dummyjson/_post/rs.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.CREATED_201)
public class PostProductMethod extends AbstractApiMethodV2 {
    public PostProductMethod() {
    super("api_automationTesting/dummyjson/_post/rq.json",
            "api_automationTesting/dummyjson/_post/rs.json",
            "api_automationTesting/dummyjson/data1.properties" );
    replaceUrlPlaceholder("base_url", Configuration.getRequired("api_url"));
    }
}

