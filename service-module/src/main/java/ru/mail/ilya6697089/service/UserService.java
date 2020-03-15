package ru.mail.ilya6697089.service;

import ru.mail.ilya6697089.service.model.User;

public interface UserService {

    User loadUserByUsername(String username);

}
