package com.travel.Tuorist.Repository;

import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travel.Tuorist.Model.TuoristModel;

@Repository
public interface TuoristRepository extends JpaRepository<TuoristModel, Integer> {

	
	 
}
