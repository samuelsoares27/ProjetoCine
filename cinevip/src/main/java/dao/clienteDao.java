package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.cliente;

public class clienteDao {

	public void creat(cliente cli) {
		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(cli);
		em.getTransaction().commit();
		em.close();
	}
	
	public List<cliente> getReadAll(){
		EntityManager em = JPAUtil.getEntityManager();
		Query query = em.createQuery("from cliente");
		List<cliente> cliente = query.getResultList();
		return cliente;
	}
	
	public cliente ValidaCliente(String cpf, String senha){
		EntityManager em = JPAUtil.getEntityManager();
		Query query = (Query) em.createQuery("Select cpf,senha From cliente Where cliente.cpf = :cpf AND cliente.senha = :senha")
		.setParameter("cpf", cpf)
		.setParameter("senha", senha).getSingleResult();
		return (cliente) query;
	}
}
