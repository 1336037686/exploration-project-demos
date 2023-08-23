package com.lgx;

import org.pf4j.spring.SpringPluginManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author LGX_TvT <br>
 * @version 1.0 <br>
 * Create by 2023-08-23 09:30 <br>
 * @description: SpringConfiguration <br>
 */
@Configuration
public class SpringConfiguration {

    @Bean
    public SpringPluginManager pluginManager() {
        return new SpringPluginManager();
    }

}
