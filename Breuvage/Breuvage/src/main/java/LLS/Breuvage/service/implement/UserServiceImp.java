package LLS.Breuvage.service.implement;

import LLS.Breuvage.exception.UserNotFoundException;
import LLS.Breuvage.model.dto.request.UserRequestDto;
import LLS.Breuvage.model.dto.response.UserResponseDto;
import LLS.Breuvage.model.entity.User;
import LLS.Breuvage.model.mapper.UserMapper;
import LLS.Breuvage.repository.UserRepository;
import LLS.Breuvage.service.IUserService;
import jakarta.validation.constraints.NotNull;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@DependsOn({"userRepository"})
public class UserServiceImp extends GService<User, Long, UserRequestDto, UserResponseDto> implements IUserService {

    private final PasswordEncoder encoder;
    @Autowired
    public UserServiceImp(UserRepository repository, UserMapper mapper, PasswordEncoder encoder){
        super(repository, mapper, new UserNotFoundException("There isn't an user with that id"));
        this.encoder = encoder;
    }

    @Override
    public void create(@NonNull UserRequestDto dto){
        User user = super.getMapper().toEntity(dto);
        user.setPassword(encoder.encode(dto.password()));
        super.getRepository().save(user);

    }

    @Override
    public void logoutUser(Long userId) {

    }
}
