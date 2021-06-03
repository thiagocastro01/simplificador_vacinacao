package dao;

import java.util.List;

import javax.persistence.EntityManager;

import javax.persistence.Query;

import java.util.List;

import javax.persistence.EntityManager;

import entidades.Vacina;
import util.JPAUtil;

public class VacinaDao {
	static EntityManager em;
	
	public static List<Vacina> listar(){
		em = JPAUtil.criarEM();
		Query q = em.createQuery("select v from Vacina v");
		List<Vacina> vacinas = q.getResultList();
		em.close();
		return vacinas; 
	}
	
	public static List<Vacina> listarVacinasTomadas(){
		em = JPAUtil.criarEM();
		Query q = em.createQuery("select vt from Vacinas_tomadas vt");
		List<Vacina> vacinas = q.getResultList();
		em.close();
		return vacinas; 
	}
	
	public static List<Vacina> listarVacinasVencidas(){
		em = JPAUtil.criarEM();
		Query q = em.createQuery("select v from Vacina v where id not in (select vt from Vacinas_tomadas vt) and faixaetariainicial < 21");
		List<Vacina> vacinas = q.getResultList();
		em.close();
		return vacinas; 
	}
	
	public static List<Vacina> listarVacinasTomar(){
		em = JPAUtil.criarEM();
		Query q = em.createQuery("select v from Vacina v where faixaetariainicial > 21");
		List<Vacina> vacinas = q.getResultList();
		em.close();
		return vacinas; 
	}

}
