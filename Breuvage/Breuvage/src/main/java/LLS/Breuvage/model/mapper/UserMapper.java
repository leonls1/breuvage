package LLS.Breuvage.model.mapper;

import LLS.Breuvage.model.dto.request.UserRequestDto;
import LLS.Breuvage.model.dto.response.UserResponseDto;
import LLS.Breuvage.model.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper extends GMapper<User, UserRequestDto, UserResponseDto> {
}
