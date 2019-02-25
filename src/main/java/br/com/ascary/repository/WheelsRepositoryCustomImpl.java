package br.com.ascary.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

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
	
//	@Override
//	public List<Wheels> findWheelsList(String filtro) {
//		
//		Map<String, Object> parameters = new HashMap<>();
//		
//		StringBuilder hql = new StringBuilder();
//		hql.append("select new br.com.ascary.model.Wheels(a.name)");
//		hql.append("from Wheels a ");
//		hql.append(" where a.name like :filtro");
//		
//		
//		TypedQuery<Wheels> query = entityManager.createQuery(hql.toString(),Wheels.class);
//		for (Map.Entry<String,Object> entry : parameters.entrySet()) {
//			query.setParameter(entry.getKey(), parameters.get(entry.getKey()));
//		}
//		
//		if (filtro.isEmpty() && !"null".equalsIgnoreCase(filtro)) {
//			query.setParameter("filtro", "%" + filtro.toUpperCase() + "%");
//		}
//		return query.getResultList();
	

}
