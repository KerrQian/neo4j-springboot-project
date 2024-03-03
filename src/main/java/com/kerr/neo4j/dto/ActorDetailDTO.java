package com.kerr.neo4j.dto;

import lombok.Data;
import org.springframework.data.neo4j.annotation.QueryResult;

@Data
@QueryResult
public class ActorDetailDTO {

    private String name;
    private int born;
}
