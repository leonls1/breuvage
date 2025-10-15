package LLS.Breuvage.controller;

import LLS.Breuvage.model.dto.request.UserRequestDto;
import LLS.Breuvage.model.dto.response.UserResponseDto;
import LLS.Breuvage.model.entity.User;
import LLS.Breuvage.service.implement.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
public class UserController extends GController<User, Long, UserRequestDto, UserResponseDto> {
    @Autowired
    public UserController(UserServiceImp service){
        super(service);
    }
}
