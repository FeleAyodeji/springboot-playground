package net.javaguides.springboot_restful_webservices_dto.mapper;

import net.javaguides.springboot_restful_webservices_dto.dto.UserDto;
import net.javaguides.springboot_restful_webservices_dto.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AutoUserMapper {
    AutoUserMapper MAPPER = Mappers.getMapper(AutoUserMapper.class);

    UserDto mapToUserDto(User user);

    User mapToUser(UserDto userDto);
}
