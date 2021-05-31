package dao;

import javax.persistence.EntityManager;

import entidades.Usuario;
import util.JPAUtil;

public class UsuarioDao {
	
	static EntityManager em;
	
	public static void salvar(Usuario usuario) {
		em = JPAUtil.criarEM();
		em.getTransaction().begin();
		em.persist(usuario);
		em.getTransaction().commit();
		em.close();
	}

}
