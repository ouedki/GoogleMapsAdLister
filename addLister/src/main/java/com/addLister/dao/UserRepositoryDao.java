package com.addLister.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.addLister.models.User;

public interface UserRepositoryDao extends JpaRepository<User, Long>{

}
