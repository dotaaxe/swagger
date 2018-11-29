package com.example.dota.dao;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * Created by D1M on 2018/11/28.
 */
@ApiModel(value = "student", description = "student对象")
public class StudentDao implements Serializable {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value = "用戶名", dataType = "String")
    private String name;
    @ApiModelProperty(value = "手机号", dataType = "String")
    private String mobile;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
