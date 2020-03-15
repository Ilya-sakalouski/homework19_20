package ru.mail.ilya6697089.service.impl;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ru.mail.ilya6697089.service.UserService;
import ru.mail.ilya6697089.service.model.AppUser;
import ru.mail.ilya6697089.service.model.User;

@Service
public class MyUserDetailsService implements UserDetailsService {

    private final UserService userService;

    public MyUserDetailsService(UserService userService) {this.userService = userService;}

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userService.loadUserByUsername(username);
        if (user == null){
            throw new UsernameNotFoundException("User is not found!");
        }

        return new AppUser(user);
    }

}
