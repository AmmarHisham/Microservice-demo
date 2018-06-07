package com.cg.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.app.modal.Orders;

@Repository
public interface OrderDAO extends JpaRepository<Orders, Long> {

	public Orders findByUserName(String userName);

}
