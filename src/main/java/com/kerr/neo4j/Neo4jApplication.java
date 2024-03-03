package com.kerr.neo4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableNeo4jRepositories
@EnableSwagger2
public class Neo4jApplication {

    private static final Logger log = LoggerFactory.getLogger(Neo4jApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(Neo4jApplication.class, args);
    }


}
