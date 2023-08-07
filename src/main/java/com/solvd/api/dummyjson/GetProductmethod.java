package com.solvd.api.dummyjson;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.config.Configuration;

@Endpoint(url = "${base_url}/products/1" , methodType = HttpMethodType.GET)
@ResponseTemplatePath(path = "api/_get/rs.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class GetProductmethod extends AbstractApiMethodV2 {
    public GetProductmethod() {
        replaceUrlPlaceholder("base_url", Configuration.getRequired("api_url"));

    }
}
