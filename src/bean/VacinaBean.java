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
	private List<Vacina> vacinasSelecionadas;
	private List<Vacina> vacinasTomadas = new ArrayList<Vacina>();
	private List<Vacina> vacinasVencidas = new ArrayList<Vacina>();
	private List<Vacina> vacinasTomar = new ArrayList<Vacina>();

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
	
	public List<Vacina> getVacinasSelecionadas() {
        return vacinasSelecionadas;
    }

    public void setVacinasSelecionadas(List<Vacina> vacinasSelecionadas) {
        this.vacinasSelecionadas = vacinasSelecionadas;
    }
    
    public List<Vacina> getVacinasTomadas() {
		if(vacinasTomadas==null) {
			vacinasTomadas = VacinaDao.listarVacinasTomadas();
		}
		vacinasTomadas = VacinaDao.listarVacinasTomadas();
		return vacinasTomadas;
	}

	public void setVacinasTomadas(List<Vacina> vacinasTomadas) {
		this.vacinasTomadas = vacinasTomadas;
	}
	
	public List<Vacina> getVacinasVencidas() {
		if(vacinasVencidas==null) {
			vacinasVencidas = VacinaDao.listarVacinasVencidas();
		}
		vacinasVencidas = VacinaDao.listarVacinasVencidas();
		return vacinasVencidas;
	}

	public void setVacinasVencidas(List<Vacina> vacinasVencidas) {
		this.vacinasVencidas = vacinasVencidas;
	}
	
	public List<Vacina> getVacinasTomar() {
		if(vacinasTomar==null) {
			vacinasTomar = VacinaDao.listarVacinasTomar();
		}
		vacinasTomar = VacinaDao.listarVacinasTomar();
		return vacinasTomar;
	}

	public void setVacinasTomar(List<Vacina> vacinasTomar) {
		this.vacinasTomar = vacinasTomar;
	}

}
