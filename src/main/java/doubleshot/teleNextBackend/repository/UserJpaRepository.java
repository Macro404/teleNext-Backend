package doubleshot.teleNextBackend.repository;

import doubleshot.teleNextBackend.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserJpaRepository extends CrudRepository<User, String> {
    User findUserById(String id);
    Iterable<User> findUsersByEmail(String email);

    void deleteUserByEmail(String email);
}
