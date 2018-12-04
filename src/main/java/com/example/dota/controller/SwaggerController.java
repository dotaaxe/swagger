package com.example.dota.controller;

import com.example.dota.dao.StudentDao;
import com.example.dota.util.LogUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;


import java.io.UnsupportedEncodingException;
import java.util.UUID;

/**
 */

@RestController
@Api("swaggerDemoController相关的api")
public class SwaggerController {
    @ApiOperation(value = "根据id查询学生信息", notes = "查询数据库中某个的学生信息")
    @ApiImplicitParam(name = "id", value = "学生ID",paramType = "query",required = true, dataType = "Integer")
    @RequestMapping(value ="/swagger",method = RequestMethod.POST)
    public String send(@RequestBody @ApiParam (required = false) StudentDao studentDao)throws UnsupportedEncodingException {
        String uuid = UUID.randomUUID().toString();
        Logger log = LogUtils.getExceptionLogger();
        Logger log1 = LogUtils.getBussinessLogger();
        Logger log2 = LogUtils.getDBLogger();
        log.error("getExceptionLogger===日志测试");
        log1.info("getBussinessLogger===日志测试");
        log2.debug("getDBLogger===日志测试");
        return uuid;
        }

}

