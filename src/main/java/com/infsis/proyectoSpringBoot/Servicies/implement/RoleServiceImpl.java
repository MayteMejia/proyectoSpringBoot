package com.infsis.proyectoSpringBoot.Servicies.implement;

import com.infsis.proyectoSpringBoot.DTOs.RoleDTO;
import com.infsis.proyectoSpringBoot.Models.Role;
import com.infsis.proyectoSpringBoot.Servicies.RoleService;

import java.util.Optional;

public class RoleServiceImpl implements RoleService {
    public RoleServiceImpl() {
        super();
    }

    @Override
    public Optional<RoleDTO> getRoleById(Integer roleId) {
        return Optional.empty();
    }

    @Override
    public RoleDTO saveRole(RoleDTO roleDTO) {
        return null;
    }

    @Override
    public RoleDTO updateRole(Integer roleId, RoleDTO userDTO) {
        return null;
    }

    @Override
    public void delete(Integer roleId) {

    }
    private RoleDTO roletoDTO(Role role){
        RoleDTO roleDTO = new RoleDTO(
                role.getName()
        );
        return roleDTO;
    }
    private Role DTOtoRole(RoleDTO roleDTO){
        Role role = new Role();
        role.setName(roleDTO.getName());
        return role;
    }
}
