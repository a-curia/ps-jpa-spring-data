package com.guitar.db.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guitar.db.model.Location;

// used for tests
public interface LocationJpaRepository extends JpaRepository<Location, Long> {
	
	List<Location> findByStateLike(String stateName);
	
	List<Location> findByStateIgnoreCaseStartingWith(String stateName);
	
	List<Location> findByStateNotLikeOrderByStateAsc(String stateName);
	
	List<Location> findFirstByStateOrCountry(String value, String value2);
	List<Location> findByStateAndCountry(String value, String value2);
	
	List<Location> findByStateIsOrCountryEquals(String value, String value2);
	List<Location> findByStateNot(String value);


}
