package dao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.cartao;

public class cartaoDao {
	
	public void creat(cartao card) {
		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(card);
		em.getTransaction().commit();
		em.close();
	}
	
	public List<cartao> getReadAll(){
		EntityManager em = JPAUtil.getEntityManager();
		Query query = em.createQuery("from cartao");
		List<cartao> cartao = query.getResultList();
		return cartao;
	}
}
