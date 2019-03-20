package dao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.filmes;

public class filmesDao {

	public void create(filmes autor) {
		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(autor);
		em.getTransaction().commit();
		em.close();
	}
	
	public void update(filmes autor) {
		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();
		em.merge(autor);
		em.getTransaction().commit();
		em.close();
	}
	
	public void delete(filmes autor) {
		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();
		em.remove(em.merge(autor));
		em.getTransaction().commit();
		em.close();
	}
	
	public filmes readId(int id) {
		EntityManager em = JPAUtil.getEntityManager();
		filmes livro = em.find(filmes.class, id);
		em.close();
		return livro;
	}
	
	public List<filmes> readAll(){
		EntityManager em = JPAUtil.getEntityManager();
		Query query = em.createQuery("from filmes");
		List<filmes> autores = query.getResultList();
		return autores;
	}
}
