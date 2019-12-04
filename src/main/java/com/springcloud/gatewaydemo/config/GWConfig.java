package com.springcloud.gatewaydemo.config;

import com.springcloud.gatewaydemo.Filters.MyGlobalFilter;
import com.springcloud.gatewaydemo.predicates.JiangzhAfterRoutePredicateFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : jiangzh
 * @program : com.springcloud.gatewaydemo.config
 * @description : 网关配置
 **/
@Configuration
public class GWConfig {

  @Bean
  public JiangzhAfterRoutePredicateFactory authorizationRoutePredicateFactory(){
    return new JiangzhAfterRoutePredicateFactory();
  }

  @Bean
  public MyGlobalFilter myGlobalFilter(){
    return new MyGlobalFilter();
  }

}
