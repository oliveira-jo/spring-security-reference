package com.devjoliveira.springsecurityreference.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.devjoliveira.springsecurityreference.entity.Role;
import com.devjoliveira.springsecurityreference.entity.User;
import com.devjoliveira.springsecurityreference.projection.UserDetailsProjection;
import com.devjoliveira.springsecurityreference.repository.UserRepository;

@Service
public class UserService implements UserDetailsService {

  private final UserRepository userRepository;

  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    List<UserDetailsProjection> result = userRepository.searchUserAndRolesByEmail(username);
    if (result.isEmpty()) {
      throw new UsernameNotFoundException("Email not found");
    }

    User user = new User();
    user.setEmail(username);
    user.setPassword(result.get(0).getPassword());

    result.forEach(
        role -> user.getRoles().add(new Role(role.getRoleId(), role.getAuthority())));

    return user;

  }

}