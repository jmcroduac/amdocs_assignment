package com.training.springmvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.springmvc.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}