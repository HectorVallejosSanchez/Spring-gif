package com.ditocode.giflib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Hector Vallejos Sanchez on 12/10/16.
 */

@EnableAutoConfiguration
@ComponentScan
public class AppConfig {
    public static void main(String[] args){
        SpringApplication.run(AppConfig.class, args);
    }
}
