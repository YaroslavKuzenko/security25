package edu.kuzenko.security25.security;

/*
    @author yaroslavkuzenko
    @project security25
    @class UserDetailsServiceImpl
    @since 04.05.2025 - 22.48
*/

import edu.kuzenko.security25.user.Role;
import edu.kuzenko.security25.user.User;
import edu.kuzenko.security25.user.UserRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {

    private final UserRepository repository;
//  private final PasswordEncoder passwordEncoder;
//
//    @PostConstruct
//  void init() {
//      User user = User.builder()
//              .firstName("John")
//              .lastName("Lennon")
//              .email("john@mail.com")
//              .password(passwordEncoder.encode("password"))
//              .enabled(true)
//              .accountLocked(false)
//              .roles(List.of(Role.USER))
//              .build();
//     repository.save(user);
//  }

    @Override
    public UserDetails loadUserByUsername(String userEmail) throws UsernameNotFoundException {
        return repository.findByEmail(userEmail)
                .orElseThrow(() -> new UsernameNotFoundException("user not found"));
    }
}