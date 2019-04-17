package com.guitar.db.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guitar.db.model.Model;

public interface ModelJpaRepository extends JpaRepository<Model, Long> {

	List<Model> findByPriceGreaterThanEqualAndPriceLessThanEqual(BigDecimal low, BigDecimal high);
	
	
//	List<Model> findByModelTypeIn(List<ModelType> types); // this works
//	List<Model> findByModelTypeIn(List<String> types); // this does not works
	List<Model> findByModelTypeNameIn(List<String> types); // this works


}
