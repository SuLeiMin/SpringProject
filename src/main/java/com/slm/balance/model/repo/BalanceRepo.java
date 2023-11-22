package com.slm.balance.model.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.slm.balance.model.domain.entity.Balance;

public interface BalanceRepo extends JpaRepository<Balance, Integer> {

}
