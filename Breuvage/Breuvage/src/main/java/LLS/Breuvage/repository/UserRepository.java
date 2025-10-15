package LLS.Breuvage.repository;

import LLS.Breuvage.model.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends GRepository<User, Long>{
}
