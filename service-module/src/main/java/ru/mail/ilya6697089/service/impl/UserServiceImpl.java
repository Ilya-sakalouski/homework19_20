package ru.mail.ilya6697089.service.impl;

import ru.mail.ilya6697089.service.UserService;
import ru.mail.ilya6697089.service.model.RoleEnum;
import ru.mail.ilya6697089.service.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User loadUserByUsername(String username) {
        User user = null;
        if (username.equals("user")) {
            user = new User();
            user.setUsername("user");
            user.setPassword("$2y$12$HmIKRk.9wf6DWLjUmVsCu.xl6BEbeMQupxZZpoJgFS38Dbz0Q4uRS");
            user.setRole(RoleEnum.USER);
        }
        if (username.equals("admin")) {
            user = new User();
            user.setUsername("admin");
            user.setPassword("$2y$12$T7KLB.TxMaJQsPsIvBFOY.sQnvJmw3O.bO7DeMqTxqWvvwzIM.c5y");
            user.setRole(RoleEnum.ADMIN);
        }
        return user;
    }

}
