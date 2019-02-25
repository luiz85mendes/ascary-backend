package br.com.ascary.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.ascary.model.Wheels;

@Repository
public interface WheelsRepository extends JpaRepository<Wheels, Long>, WheelsRepositoryCustom {
	
	  @Query("SELECT a FROM Wheels a WHERE a.name LIKE  lower('%'  || :filtro  || '%' )")
		List<Wheels> findWheelsList(@Param("filtro") String filtro);

}
