package com.example.auditing.springboot2_jpa_auditing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.auditing.springboot2_jpa_auditing.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
