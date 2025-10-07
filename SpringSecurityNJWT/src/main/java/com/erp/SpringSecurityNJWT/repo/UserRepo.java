package com.erp.SpringSecurityNJWT.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erp.SpringSecurityNJWT.Entity.Users;

@Repository
public interface UserRepo extends JpaRepository<Users, Integer> {


	Users findByUsername(String username);

}
