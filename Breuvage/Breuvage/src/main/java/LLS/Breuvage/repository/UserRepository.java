package LLS.Breuvage.repository;

import LLS.Breuvage.model.entity.User;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends GRepository<User, Long>{
    Optional<User> findByUsername(String username);
}
