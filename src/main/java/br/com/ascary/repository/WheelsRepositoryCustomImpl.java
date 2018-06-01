package br.com.ascary.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.ascary.model.Wheels;

public class WheelsRepositoryCustomImpl implements WheelsRepositoryCustom {
	
	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Wheels> findWheels() {
		StringBuilder hql = new StringBuilder();
		hql.append("SELECT w FROM Wheels w");
		return entityManager.createQuery(hql.toString(),Wheels.class).getResultList();
	}

	

	

}
