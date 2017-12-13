package com.tuli.gcloud.test.service.impl;

import com.tuli.gcloud.test.service.TestService;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by c_yangmingming-002 on 2017/12/6.
 */
@Api(value = "API - TestServiceImpl", description = "测试")
@RestController
public class TestServiceImpl implements TestService {

    @Override
    @ApiOperation("接口测试")
    @ApiImplicitParams(
            {
                    @ApiImplicitParam(name = "name", value = "", required = true, dataType = "String"),
                    @ApiImplicitParam(name = "age", value = "", required = true, dataType = "Integer")
            }
    )
    @ApiResponses(
        {
            @ApiResponse(code = 200, message = "Successful — 请求已完成"),
            @ApiResponse(code = 400, message = "请求中有语法问题，或不能满足请求"),
            @ApiResponse(code = 401, message = "未授权客户机访问数据"),
            @ApiResponse(code = 404, message = "服务器找不到给定的资源；文档不存在"),
            @ApiResponse(code = 500, message = "服务器不能完成请求")
        }
    )
    public String test(String name, Integer age) {
        return name + ":" + age;
    }
}
