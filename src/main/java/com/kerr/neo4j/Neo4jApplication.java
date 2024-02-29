package com.kerr.neo4j;

import com.kerr.neo4j.entity.Movie;
import com.kerr.neo4j.repository.MovieRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

@SpringBootApplication
@EnableNeo4jRepositories
public class Neo4jApplication {

    private static final Logger log = LoggerFactory.getLogger(Neo4jApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(Neo4jApplication.class, args);
    }

    @Bean
    CommandLineRunner generateData(MovieRepository movieRepository) {
        return args -> {
            log.info("Generating data...");
            movieRepository.deleteAll();
            movieRepository.save(new Movie("The Matrix", "1999", "Welcome to the Real World"));
        };
    }

}
