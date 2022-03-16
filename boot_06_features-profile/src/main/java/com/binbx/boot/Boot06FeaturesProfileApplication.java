package com.binbx.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Map;

@SpringBootApplication
public class Boot06FeaturesProfileApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Boot06FeaturesProfileApplication.class, args);

        ConfigurableEnvironment environment = run.getEnvironment();

        Map<String, Object> systemEnvironment = environment.getSystemEnvironment();

        Map<String, Object> systemProperties = environment.getSystemProperties();

        System.out.println(systemEnvironment);
        System.out.println(systemProperties);
    }

}
