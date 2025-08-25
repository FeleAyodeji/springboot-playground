package net.javaguides.springboot_exception_handling.mapper;

import net.javaguides.springboot_exception_handling.dto.UserDto;
import net.javaguides.springboot_exception_handling.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AutoUserMapper {

    AutoUserMapper MAPPER = Mappers.getMapper(AutoUserMapper.class);

    UserDto mapToUserDto(User user);

    User mapToUser(UserDto userDto);
}
