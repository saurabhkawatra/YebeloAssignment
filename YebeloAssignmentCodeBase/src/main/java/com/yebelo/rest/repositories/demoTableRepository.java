package com.yebelo.rest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yebelo.rest.models.demoTable;

@Repository
public interface demoTableRepository extends JpaRepository<demoTable, Integer> {
	
	public demoTable findByCategoryCode(int categoryCode);

}
