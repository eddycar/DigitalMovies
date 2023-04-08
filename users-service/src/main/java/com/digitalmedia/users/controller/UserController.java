package com.digitalmedia.users.controller;

import com.digitalmedia.users.model.User;
import com.digitalmedia.users.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/users")
public class UserController {

  private UserService userService;

  @GetMapping("/admin")
  public List<User> getUserExtra() {
    return userService.getUsers();
  }

  @GetMapping("/me")
  public String getUser() {
    return "hola mundo";
  }

}
