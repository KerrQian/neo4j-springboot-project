package com.kerr.neo4j.service;

import com.kerr.neo4j.dto.ActorDetailDTO;
import com.kerr.neo4j.dto.ActorRoleMovieDTO;
import com.kerr.neo4j.entity.Movie;

import java.util.List;

public interface MovieService {
    List<Movie> queryMovieByActorName(String actorName);

    List<ActorDetailDTO> queryActorDetail(String title);

    List<ActorRoleMovieDTO> queryActorNameAndRoleByTitle(String title);
}
