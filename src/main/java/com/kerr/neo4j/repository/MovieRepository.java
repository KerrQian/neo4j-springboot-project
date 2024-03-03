package com.kerr.neo4j.repository;

import com.kerr.neo4j.entity.Movie;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends Neo4jRepository<Movie, Long> {

    @Query("MATCH(person:Person {name:$actorName})-[r:ACTED_IN]->(movie:Movie) RETURN movie,r.roles")
    List<Movie> queryDemo(@Param("actorName") String actorName);
}
