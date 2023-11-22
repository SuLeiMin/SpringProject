package com.slm.balance.model.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.slm.balance.model.domain.entity.BalanceItem;

public interface BalanceItemRepo extends JpaRepository<BalanceItem,Integer>{

}
