package com.addLister.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.addLister.models.Ad;

public interface AdRepositoryDao extends JpaRepository<Ad, Long>{

}
