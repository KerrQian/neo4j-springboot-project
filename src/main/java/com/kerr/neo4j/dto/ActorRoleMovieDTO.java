package com.kerr.neo4j.dto;

import lombok.Data;
import org.springframework.data.neo4j.annotation.QueryResult;

@Data
@QueryResult
public class ActorRoleMovieDTO {

    private String actorName;
    private String title;
    private String[] roles;
}
