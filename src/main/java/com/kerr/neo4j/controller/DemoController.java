package com.kerr.neo4j.controller;

import com.kerr.neo4j.dto.ActorDetailDTO;
import com.kerr.neo4j.dto.ActorRoleMovieDTO;
import com.kerr.neo4j.entity.Movie;
import com.kerr.neo4j.service.MovieService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags = "DemoController")
public class DemoController {

    @Autowired
    private MovieService movieService;

    @GetMapping("queryMovieByActorName")
    @ApiOperation(value = "query movies by actor name")
    public List<Movie> queryMovieByActorName(@Param("actorName") String actorName){
        return movieService.queryMovieByActorName(actorName);
    }

    @GetMapping("queryActorDetail")
    @ApiOperation(value = "query actor detail by title")
    public List<ActorDetailDTO> queryActorDetail(@Param("title") String title){
        return movieService.queryActorDetail(title);
    }

    @GetMapping("queryActorNameAndRoleByTitle")
    @ApiOperation(value = "query actor name and role by title")
    public List<ActorRoleMovieDTO> queryActorNameAndRoleByTitle(@Param("title") String title){
        return movieService.queryActorNameAndRoleByTitle(title);
    }
}
