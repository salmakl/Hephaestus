package com.youcode.hephaestus.security;

import com.youcode.hephaestus.entities.User;
import lombok.RequiredArgsConstructor;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.youcode.hephaestus.repositories.UserReository;

import java.util.Collection;


@Service
@RequiredArgsConstructor
public class MyUserDetails implements UserDetailsService {

    private final UserReository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        final User appUser = userRepository.findByUsername(username);

        if (appUser == null) {
            throw new UsernameNotFoundException("User '" + username + "' not found");
        }

        return org.springframework.security.core.userdetails.User
                .withUsername(username)
                .password(appUser.getPassword())
                .authorities((Collection<? extends GrantedAuthority>) appUser.getRole())
                .accountExpired(false)
                .accountLocked(false)
                .credentialsExpired(false)
                .disabled(false)
                .build();
    }

}