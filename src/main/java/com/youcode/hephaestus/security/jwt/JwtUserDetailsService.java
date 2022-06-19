package com.youcode.hephaestus.security.jwt;

import com.youcode.hephaestus.entities.User;
import com.youcode.hephaestus.repositories.UserReository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

@Service
public class JwtUserDetailsService implements UserDetailsService {
    @Autowired
    UserReository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findByEmail(email);

        if (user.isEmpty()) {
            throw new UsernameNotFoundException("user not found");
        }
        Collection<SimpleGrantedAuthority> authorities = new ArrayList<>();
        return new org.springframework.security.core.userdetails.User(user.get().getEmail(),user.get().getPassword(),authorities);
    }
}
