package com.springboot.blog.repository;

import com.springboot.blog.entity.Role;
import lombok.extern.java.Log;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepo extends JpaRepository<Role, Long> {

    Optional<Role> findByName(String name);
}
