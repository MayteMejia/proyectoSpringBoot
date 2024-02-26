package com.infsis.proyectoSpringBoot.Controllers;

import com.infsis.proyectoSpringBoot.DTOs.RoleDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/role")
public class RoleController {
    @GetMapping()
    public ResponseEntity<RoleDTO> getRoles(){
        RoleDTO roleDTO = new RoleDTO("name");
        return ResponseEntity.ok().body(roleDTO);
    }
    @GetMapping("/{id}")
    public ResponseEntity<RoleDTO> getRoles(@PathVariable Integer id){
        RoleDTO roleDTO = new RoleDTO("name");
        return ResponseEntity.ok().body(roleDTO);
    }
    @PostMapping()
    public ResponseEntity<RoleDTO> saverRoles(){
        RoleDTO roleDTO = new RoleDTO("name");
        return ResponseEntity.ok().body(roleDTO);
    }
    @PutMapping("/{id}")
    public ResponseEntity<RoleDTO> updateRoles(@PathVariable Integer id, @RequestBody RoleDTO roleDTO){
        return ResponseEntity.ok().body(roleDTO);
    }
    @DeleteMapping("/{id}")
    public void deleteRoles(@PathVariable Integer id){}
}
