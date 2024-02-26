package com.infsis.proyectoSpringBoot.Servicies;

import com.infsis.proyectoSpringBoot.DTOs.BlogDTO;

import java.util.Optional;

public interface BlogService {
    Optional<BlogDTO> getBlogById(Integer blogId);
    BlogDTO saveBlog(BlogDTO blogDTO);
    BlogDTO updateBlog(Integer blogId, BlogDTO blogDTO);
    void delete(Integer blogId);
}
