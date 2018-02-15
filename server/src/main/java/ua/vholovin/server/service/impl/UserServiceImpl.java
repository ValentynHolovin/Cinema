package ua.vholovin.server.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import ua.vholovin.server.domain.User;
import ua.vholovin.server.repository.UserRepository;
import ua.vholovin.server.service.api.UserService;

@Service
public class UserServiceImpl extends SuperService<User, Integer> implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    protected CrudRepository<User, Integer> getRepository() {
        return userRepository;
    }
}
