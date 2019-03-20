package dao;

import javax.persistence.EntityManager;

import model.refeicao;

public class refeicaoDao {
	
	public void creat(refeicao ref) {
		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(ref);
		em.getTransaction().commit();
		em.close();
	}
}
