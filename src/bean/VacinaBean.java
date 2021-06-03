package bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import dao.VacinaDao;
import entidades.Vacina;

@ManagedBean
public class VacinaBean {
	
	private List<Vacina> lista = new ArrayList<Vacina>();
	private List<Vacina> listas = new ArrayList<Vacina>();

	public List<Vacina> getLista() {
		if(lista==null) {
			lista = VacinaDao.listar();
		}
		lista = VacinaDao.listar();
		return lista;
	}

	public void setLista(List<Vacina> lista) {
		this.lista = lista;
	}

	public List<Vacina> getListas() {
		Vacina v = new Vacina();
		v.setNome("Dengue");
		v.setId(2);
		v.setDescricao("Vacina para previnir a doença causada pelo mosquito aedys egypity");
		v.setQtdDoses(3);
		v.setIntervaloEntreDoses(6);
		v.setFaixaEtariaInicial(9);
		v.setFaixaEtariaFinal(45);
		listas.add(v);
		return listas;
	}

	public void setListar(List<Vacina> listar) {
		this.listas = listar;
	}

}
