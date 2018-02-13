package ua.vholovin.server.repository;

import org.springframework.data.repository.CrudRepository;
import ua.vholovin.server.domain.User;

public interface UserRepository extends CrudRepository<User, Integer> {
}
