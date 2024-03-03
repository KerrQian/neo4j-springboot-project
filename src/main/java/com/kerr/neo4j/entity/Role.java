package com.kerr.neo4j.entity;

import lombok.Data;
import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import java.util.List;

@RelationshipEntity
@Data
public class Role {

    @Id
    @GeneratedValue
    private Long id;

    private int earnings;
    private List<String> roles;

    @StartNode
    private Person person;

    @EndNode
    private Movie movie;


}
