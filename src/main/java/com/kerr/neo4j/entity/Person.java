package com.kerr.neo4j.entity;

import lombok.Data;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.List;

@NodeEntity("Person")
@Data
public class Person {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private int born;

    @Relationship(type = "DIRECTED")
    public List<Movie> directedMovies;

    @Relationship(type = "ACTED_IN")
    public List<String> roles;

    @Relationship(type = "PRODUCED")
    public List<Movie> producedMovies;

}
