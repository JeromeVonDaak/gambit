package com.gambit.Gambit.Services;

import com.gambit.Gambit.dtos.SignUpDto;
import com.gambit.Gambit.models.User;
import com.gambit.Gambit.repos.UserRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

// services/AuthService.java
@Service
public class AuthService implements UserDetailsService {

  @Autowired
  UserRep repository;

  @Override
  public UserDetails loadUserByUsername(String username) {
    var user = repository.findByLogin(username);
    return user;
  }

  public UserDetails signUp(SignUpDto data) throws Exception {
    if (repository.findByLogin(data.login()) != null) {
      throw new Exception("Username already exists");
    }
    String encryptedPassword = new BCryptPasswordEncoder().encode(data.password());
    User newUser = new User(data.login(), encryptedPassword, data.role());
    return repository.save(newUser);
  }
}
