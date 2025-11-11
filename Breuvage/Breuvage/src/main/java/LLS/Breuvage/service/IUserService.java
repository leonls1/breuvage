package LLS.Breuvage.service;

import LLS.Breuvage.model.dto.request.UserRequestDto;
import LLS.Breuvage.model.dto.response.UserResponseDto;
import LLS.Breuvage.model.entity.User;

public interface IUserService extends IGService<User, Long, UserRequestDto, UserResponseDto> {
    void logoutUser(Long userId);
}
