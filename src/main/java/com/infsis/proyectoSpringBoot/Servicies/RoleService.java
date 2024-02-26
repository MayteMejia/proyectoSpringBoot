package com.infsis.proyectoSpringBoot.Servicies;

import com.infsis.proyectoSpringBoot.DTOs.RoleDTO;

import java.util.Optional;

public interface RoleService {
    Optional<RoleDTO> getRoleById(Integer roleId);
    RoleDTO saveRole(RoleDTO roleDTO);
    RoleDTO updateRole(Integer roleId, RoleDTO userDTO);
    void delete(Integer roleId);
}
