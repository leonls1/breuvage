package LLS.Breuvage.service.implement;

import LLS.Breuvage.exception.UserNotFoundException;
import LLS.Breuvage.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserDetailsServiceImp implements UserDetailsService {
    private final UserRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return  repository.findByUsername(username)
                .orElseThrow(() -> new UserNotFoundException("There isn't a user with the username: " + username));
    }
}
