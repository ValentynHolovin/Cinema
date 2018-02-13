package ua.vholovin.server.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import ua.vholovin.server.domain.User;
import ua.vholovin.server.repository.UserRepository;

public class UserServiceImpl extends SuperService<User, Integer> {
    @Autowired
    private UserRepository userRepository;

    @Override
    protected CrudRepository<User, Integer> getRepository() {
        return userRepository;
    }
}
