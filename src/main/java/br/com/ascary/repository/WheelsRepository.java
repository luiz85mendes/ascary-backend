package br.com.ascary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ascary.model.Wheels;

@Repository
public interface WheelsRepository extends JpaRepository<Wheels, Long>, WheelsRepositoryCustom {

}
