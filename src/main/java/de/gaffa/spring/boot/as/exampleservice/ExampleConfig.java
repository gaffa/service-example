package de.gaffa.spring.boot.as.exampleservice;

import de.gaffa.spring.boot.as.VersionController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@EnableAutoConfiguration
@ComponentScan
@PropertySource("classpath:/de/gaffa/spring/boot/as/exampleservice/exampleservice.properties")
public class ExampleConfig {

    public static void main(String[] args) {
        SpringApplication.run(ExampleConfig.class, args);
    }

    @Bean
    public VersionController versionController() {
        return new VersionController();
    }
}
