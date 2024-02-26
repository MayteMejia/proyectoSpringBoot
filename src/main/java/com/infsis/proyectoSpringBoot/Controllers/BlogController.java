package com.infsis.proyectoSpringBoot.Controllers;

import com.infsis.proyectoSpringBoot.DTOs.BlogDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/blog")
public class BlogController {
    @GetMapping()
    public ResponseEntity<BlogDTO> getBlogs(){
        BlogDTO blogDTO = new BlogDTO("name");
        return ResponseEntity.ok().body(blogDTO);
    }
    @GetMapping("/{id}")
    public ResponseEntity<BlogDTO> getBlogs(@PathVariable Integer id){
        BlogDTO blogDTO = new BlogDTO("name");
        return ResponseEntity.ok().body(blogDTO);
    }
    @PostMapping()
    public ResponseEntity<BlogDTO> saverBlogs(){
        BlogDTO blogDTO= new BlogDTO("name");
        return ResponseEntity.ok().body(blogDTO);
    }
    @PutMapping("/{id}")
    public ResponseEntity<BlogDTO> updateBlogs(@PathVariable Integer id, @RequestBody BlogDTO blogDTO){
        return ResponseEntity.ok().body(blogDTO);
    }
    @DeleteMapping("/{id}")
    public void deleteBlogs(@PathVariable Integer id){}
}
