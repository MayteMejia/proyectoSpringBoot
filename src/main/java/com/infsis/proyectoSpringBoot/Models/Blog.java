package com.infsis.proyectoSpringBoot.Models;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
@SpringBootApplication
@Entity
@Table(name = "blog")
@EntityListeners(AuditingEntityListener.class)
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String name;
    @CreatedDate
    private LocalDateTime createdAt;
    @OneToMany(mappedBy = "blog", fetch = FetchType.LAZY)
    private List<Article> article = new ArrayList<>();
    @OneToOne
    @JoinColumn(name = "userp_id")
    private UserP userP;

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

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public List<Article> getArticle() {
        return article;
    }

    public void setArticle(List<Article> article) {
        this.article = article;
    }

    public UserP getUser() {
        return userP;
    }

    public void setUser(UserP userP) {
        this.userP = userP;
    }
}
