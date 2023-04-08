package com.digitalmedia.users.repository;

import com.digitalmedia.users.model.User;
import org.keycloak.admin.client.Keycloak;

import org.keycloak.representations.idm.UserRepresentation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class KeyCloakUserRepository implements IUserRepository {
    @Override
    public List<User> getUsers() {
        return null;
    }

    @Override
    public User validateAndGetUser(String username) {
        return null;
    }

    @Override
    public Optional<User> getUserExtra(String username) {
        return Optional.empty();
    }

    @Override
    public User saveUserExtra(User userExtra) {
        return null;
    }
//    @Autowired
//    private Keycloak keycloakClient;
//
//    @Value("${dh.keycloak.realm}")
//    private String realm;
//
//    public KeyCloakUserRepository(Keycloak keycloakClient, String realm) {
//        this.keycloakClient = keycloakClient;
//        this.realm = realm;
//    }
//
//    @Override
//    public List<User> getUsers() {
//        List<UserRepresentation> users = keycloakClient.realm(realm).users().list();
//        return  users.stream().map(userRepresentation -> toUser(userRepresentation)).collect(Collectors.toList());
//    }
//
//    @Override
//    public User validateAndGetUser(String username) {
//        return null;
//    }
//
//    @Override
//    public Optional<User> getUserExtra(String username) {
//        return Optional.empty();
//    }
//
//    @Override
//    public User saveUserExtra(User userExtra) {
//        return null;
//    }
//
//    private User toUser(UserRepresentation userRepresentation) {
//        return new User(userRepresentation.getUsername(), userRepresentation.getEmail());
//    }
}
