package com.tuli.gcloud.test.service;

import com.tuli.gcloud.test.service.hystrix.TestServiceHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by c_yangmingming-002 on 2017/12/6.
 */
@FeignClient(value = "gcloud-service-test", fallback = TestServiceHystrix.class)
public interface TestService {

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public String test(
            @RequestParam("name") String name,
            @RequestParam("age")  Integer age
    );
}
