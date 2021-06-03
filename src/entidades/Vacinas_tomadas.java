package entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Vacinas_tomadas {
	@Id
	@GeneratedValue
	private int id_vacina;
	private int id_usuario;
	private String nome;
	private String descricao;
	private int qtdDoses;
	private int intervaloEntreDoses;
	private int faixaEtariaInicial;
	private int faixaEtariaFinal;
	
	public int getId_usuario() {
		return id_usuario ;
	}
	
	public void setId_usuario(int id) {
		this.id_usuario = id;
	}
	
	public int getId_vacina() {
		return id_vacina;
	}
	
	public void setId_vacina(int id) {
		this.id_vacina = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public int getQtdDoses() {
		return qtdDoses;
	}
	
	public void setQtdDoses(int qtdDoses) {
		this.qtdDoses = qtdDoses;
	}
	
	public int getIntervaloEntreDoses() {
		return intervaloEntreDoses;
	}
	
	public void setIntervaloEntreDoses(int intervaloEntreDoses) {
		this.intervaloEntreDoses = intervaloEntreDoses;
	}
	
	public int getFaixaEtariaInicial() {
		return faixaEtariaInicial;
	}
	
	public void setFaixaEtariaInicial(int faixaEtariaInicial) {
		this.faixaEtariaInicial = faixaEtariaInicial;
	}
	
	public int getFaixaEtariaFinal() {
		return faixaEtariaFinal;
	}
	
	public void setFaixaEtariaFinal(int faixaEtariaFinal) {
		this.faixaEtariaFinal = faixaEtariaFinal;
	}
	
}
