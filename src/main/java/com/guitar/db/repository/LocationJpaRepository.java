package com.guitar.db.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guitar.db.model.Location;

// used for tests
public interface LocationJpaRepository extends JpaRepository<Location, Long> {
	
	List<Location> findByStateLike(String stateName);

}
