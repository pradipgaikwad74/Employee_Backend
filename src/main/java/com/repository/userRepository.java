package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.users;

@Repository
public interface userRepository extends JpaRepository<users,Integer>{

	
}
