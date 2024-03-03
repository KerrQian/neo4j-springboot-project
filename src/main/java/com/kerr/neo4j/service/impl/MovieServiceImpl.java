package com.kerr.neo4j.service.impl;

import com.alibaba.fastjson.JSON;
import com.kerr.neo4j.dto.ActorDetailDTO;
import com.kerr.neo4j.dto.ActorRoleMovieDTO;
import com.kerr.neo4j.entity.Movie;
import com.kerr.neo4j.repository.MovieRepository;
import com.kerr.neo4j.repository.PersonRepository;
import com.kerr.neo4j.service.MovieService;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    private static final Logger logger = org.slf4j.LoggerFactory.getLogger(MovieServiceImpl.class);
    @Resource
    private MovieRepository movieRepository;

    @Resource
    private PersonRepository personRepository;



    @Override
    public List<Movie> queryMovieByActorName(String actorName) {
        List<Movie> record = movieRepository.queryDemo(actorName);
        logger.info("queryDemo: {}", JSON.toJSONString(record));
        return record;
    }

    @Override
    public List<ActorDetailDTO> queryActorDetail(String title) {
        return personRepository.queryActorDetail(title);
    }

    @Override
    public List<ActorRoleMovieDTO> queryActorNameAndRoleByTitle(String title) {
        return personRepository.queryActorNameAndRoleByTitle(title);
    }
}
