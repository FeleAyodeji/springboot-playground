package net.javaguides.springboot_restful_webservices_dto.service;

import net.javaguides.springboot_restful_webservices_dto.dto.UserDto;

import java.util.List;

public interface UserService {
    UserDto createUser(UserDto user);

    UserDto getUserById(Long userId);

    List<UserDto> getAllUsers();

    UserDto updateUser(UserDto user);

    void deleteUser(Long userId);
}
