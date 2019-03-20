package dao;

import javax.persistence.EntityManager;

import model.DiaDaSemana;

public class DiaDaSeamanaDao {
	
	public void creat(DiaDaSemana dia) {
		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(dia);
		em.getTransaction().commit();
		em.close();
	}
	

}
