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
@Table(name = "userP")
@EntityListeners(AuditingEntityListener.class)
public class UserP {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String email;
    @CreatedDate
    private LocalDateTime createdAt;
    @OneToMany(mappedBy = "userP")
    private List<Article> articles = new ArrayList<>();
    @OneToOne(mappedBy = "userP", fetch = FetchType.LAZY)
    private Blog blog;

    @ManyToMany()
    @JoinTable(
            name = "user_role",
            joinColumns = @JoinColumn(name = "userp_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private List<Role> roles = new ArrayList<>();



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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }

    public List<Role> getRole() {
        return roles;
    }

    public void setRole(List<Role> roles) {
        this.roles = roles;
    }

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles){
        this.roles = roles;
    }
}
