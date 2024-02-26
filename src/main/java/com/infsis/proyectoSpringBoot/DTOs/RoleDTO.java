package com.infsis.proyectoSpringBoot.DTOs;

public class RoleDTO {
    private Integer id;
    private String name;

    public RoleDTO(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
