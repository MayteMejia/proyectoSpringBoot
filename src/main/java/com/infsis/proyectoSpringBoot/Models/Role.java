package com.infsis.proyectoSpringBoot.Models;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.ArrayList;
import java.util.List;
@SpringBootApplication
@Entity
@Table(name = "role")
@EntityListeners(AuditingEntityListener.class)
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String name;

    @ManyToMany(mappedBy = "roles")
    private List<UserP> users = new ArrayList<>();

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

    public List<UserP> getUsers() {
        return users;
    }

    public void setUsers(List<UserP> users) {
        this.users = users;
    }
}
