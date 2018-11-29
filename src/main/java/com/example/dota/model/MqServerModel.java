package com.example.dota.model;

/**
 * Created by D1M on 2018/11/27.
 */

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "spring")
public class MqServerModel {

}
