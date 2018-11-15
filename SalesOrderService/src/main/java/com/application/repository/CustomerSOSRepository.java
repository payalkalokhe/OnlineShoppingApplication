package com.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.application.model.CustomerSOS;

@Repository
public interface CustomerSOSRepository extends JpaRepository<CustomerSOS, Long> {

}
