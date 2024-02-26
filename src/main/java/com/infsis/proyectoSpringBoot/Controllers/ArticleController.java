package com.infsis.proyectoSpringBoot.Controllers;

import com.infsis.proyectoSpringBoot.DTOs.ArticleDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/article")
public class ArticleController {

    @GetMapping()
    public ResponseEntity<ArticleDTO> getArticles(){
        ArticleDTO articleDTO = new ArticleDTO("title", "reference");
        return ResponseEntity.ok().body(articleDTO);
    }
    @GetMapping("/{id}")
    public ResponseEntity<ArticleDTO> getArticles(@PathVariable Integer id){
        ArticleDTO articleDTO = new ArticleDTO("title", "reference");
        return ResponseEntity.ok().body(articleDTO);
    }
    @PostMapping()
    public ResponseEntity<ArticleDTO> saveArticles(){
        ArticleDTO articleDTO= new ArticleDTO("title", "reference");
        return ResponseEntity.ok().body(articleDTO);
    }
    @PutMapping("/{id}")
    public ResponseEntity<ArticleDTO> updateArticles(@PathVariable Integer id, @RequestBody ArticleDTO articleDTO){
        return ResponseEntity.ok().body(articleDTO);
    }
    @DeleteMapping("/{id}")
    public void deleteArticles(@PathVariable Integer id){}
}
