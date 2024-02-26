package com.infsis.proyectoSpringBoot.Servicies.implement;

import com.infsis.proyectoSpringBoot.DTOs.UserDTO;
import com.infsis.proyectoSpringBoot.Models.UserP;
import com.infsis.proyectoSpringBoot.Servicies.UserService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    public UserServiceImpl() {
        super();
    }

    @Override
    public Optional<UserDTO> getUserById(Integer userId) {
        return Optional.empty();
    }

    @Override
    public UserDTO saveUser(UserDTO userDTO) {
        return null;
    }

    @Override
    public UserDTO updateUser(Integer userId, UserDTO userDTO) {
        return null;
    }

    @Override
    public void delete(Integer userId) {

    }
    private UserDTO usertoDTO(UserP userP){
        UserDTO userDTO = new UserDTO(
                userP.getId(),
                userP.getName(),
                userP.getEmail()
        );
        return userDTO;
    }
    private UserP DTOtoUser(UserDTO userDTO){
        UserP userP = new UserP();
        userP.setName(userDTO.getName());
        userP.setEmail(userDTO.getEmail());
        return userP;
    }
}
