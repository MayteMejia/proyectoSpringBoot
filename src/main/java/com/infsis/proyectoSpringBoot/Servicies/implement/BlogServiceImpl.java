package com.infsis.proyectoSpringBoot.Servicies.implement;

import com.infsis.proyectoSpringBoot.DTOs.BlogDTO;
import com.infsis.proyectoSpringBoot.Models.Blog;
import com.infsis.proyectoSpringBoot.Servicies.BlogService;

import java.util.Optional;

public class BlogServiceImpl implements BlogService {
    public BlogServiceImpl() {
        super();
    }

    @Override
    public Optional<BlogDTO> getBlogById(Integer blogId) {
        return Optional.empty();
    }

    @Override
    public BlogDTO saveBlog(BlogDTO blogDTO) {
        return null;
    }

    @Override
    public BlogDTO updateBlog(Integer blogId, BlogDTO blogDTO) {
        return null;
    }

    @Override
    public void delete(Integer blogId) {

    }
    private BlogDTO blogtoDTO(Blog blog){
        BlogDTO blogDTO = new BlogDTO(
                blog.getName()
        );
        return blogDTO;
    }
    private Blog DTOtoBlog(BlogDTO blogDTO){
        Blog blog = new Blog();
        blog.setName(blogDTO.getName());
        return blog;
    }
}
