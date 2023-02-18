package com.postgres.codelabpostgres.data.repository;

import com.postgres.codelabpostgres.data.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
}


