package com.lgx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author LGX_TvT <br>
 * @version 1.0 <br>
 * Create by 2023-08-23 09:29 <br>
 * @description: AppRun <br>
 */
public class AppRun {

    public static void main(String[] args) {
        // retrieves the Spring application context
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
    }

}
