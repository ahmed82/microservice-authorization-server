package com.atr.rent.rentcloud.authorizationserver.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atr.rent.rentcloud.authorizationserver.model.User;

public interface UserDetailRepository extends JpaRepository<User,Integer> {


    Optional<User> findByUsername(String name);

}