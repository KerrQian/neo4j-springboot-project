package com.kerr.neo4j;

import lombok.Data;

import java.util.List;

@Data
public class DemoDTO {

    private String title;

    private String name;

    private List<String> roles;
}
