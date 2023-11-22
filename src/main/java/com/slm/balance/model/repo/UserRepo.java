package com.slm.balance.model.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.slm.balance.model.domain.entity.User;


public interface UserRepo extends JpaRepository<User, Integer> {

	@Query("select s from User s")
	Optional<User> findOnebyLoginId(String username);


}
