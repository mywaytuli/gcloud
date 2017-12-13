package com.tuli.gcloud.test.service.hystrix;

import com.tuli.gcloud.test.service.TestService;
import org.springframework.stereotype.Component;

/**
 * Created by c_yangmingming-002 on 2017/12/6.
 */
@Component
public class TestServiceHystrix implements TestService {
    @Override
    public String test(String name, Integer age) {
        return null;
    }
}
