package com.lgx.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author LGX_TvT <br>
 * @version 1.0 <br>
 * Create by 2023-08-17 16:22 <br>
 * @description: WebConfig <br>
 */
@Configuration
@MapperScan("com.lgx.module.mapper")
@EnableTransactionManagement
public class WebConfig {
}
