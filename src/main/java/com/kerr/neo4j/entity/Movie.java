package com.kerr.neo4j.entity;

import lombok.Data;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.List;

@NodeEntity("Movie")
@Data
public class Movie {

    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private int released;
    private String tagline;

    @Relationship(type = "ACTED_IN")
    public List<Role> roles;
}
