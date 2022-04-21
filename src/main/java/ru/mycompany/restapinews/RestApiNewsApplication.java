package ru.mycompany.restapinews;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("ru.mycompany.restapinews.model")
@SpringBootApplication(scanBasePackages={
        "ru.mycompany.restapinews.repository", "ru.mycompany.restapinews.model",
        "ru.mycompany.restapinews.controller",
        "ru.mycompany.restapinews"},exclude =  {DataSourceAutoConfiguration.class })
public class RestApiNewsApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestApiNewsApplication.class, args);
    }

}
