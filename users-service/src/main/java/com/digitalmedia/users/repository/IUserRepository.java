package com.digitalmedia.users.repository;

import com.digitalmedia.users.model.User;

import java.util.List;
import java.util.Optional;

public interface IUserRepository {

  List<User> getUsers();

  User validateAndGetUser(String username);

  Optional<User> getUserExtra(String username);

  User saveUserExtra(User userExtra);
}
