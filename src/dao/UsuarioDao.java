package dao;

import javax.persistence.Query;

import java.util.List;

import javax.persistence.EntityManager;

import entidades.Usuario;
import util.JPAUtil;


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
	
	public static List<Usuario> listar(){
		em = JPAUtil.criarEM();
		Query q = em.createQuery("select u from Usuario u");
		List<Usuario> users = q.getResultList();
		em.close();
		return users; 
	}

}
