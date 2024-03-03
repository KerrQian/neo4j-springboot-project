package com.kerr.neo4j.repository;

import com.kerr.neo4j.dto.ActorDetailDTO;
import com.kerr.neo4j.dto.ActorRoleMovieDTO;
import com.kerr.neo4j.entity.Person;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends Neo4jRepository<Person, Long> {


    @Query("MATCH(person:Person) -[r:ACTED_IN]->(movie:Movie {title: $title}) RETURN person")
    List<ActorDetailDTO> queryActorDetail(@Param("title") String title);

    @Query("match (n:Person) -[r:ACTED_IN]->(m:Movie {title:$title}) return n.name as actorName, m.title as title, r.roles as roles")
    List<ActorRoleMovieDTO> queryActorNameAndRoleByTitle(@Param("title") String title);

}
