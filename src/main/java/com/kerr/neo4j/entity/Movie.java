package com.kerr.neo4j.entity;

import lombok.Data;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node("Movie")
@Data
public class Movie {

    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private String released;
    private String tagline;


    public Movie(String title, String released, String tagline) {
        this.title = title;
        this.released = released;
        this.tagline = tagline;
    }
}
