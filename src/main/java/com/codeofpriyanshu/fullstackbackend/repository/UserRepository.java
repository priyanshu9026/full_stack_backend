package com.codeofpriyanshu.fullstackbackend.repository;

import com.codeofpriyanshu.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
