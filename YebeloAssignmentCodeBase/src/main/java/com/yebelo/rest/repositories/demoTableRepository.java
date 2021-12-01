package com.yebelo.rest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yebelo.rest.models.demoTable;

public interface demoTableRepository extends JpaRepository<demoTable, Integer> {

}
