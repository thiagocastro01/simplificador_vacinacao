package entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Vacina {
	@Id
	@GeneratedValue
	private int id;
	private String nome;
	private String descricao;
	private int qtdDoses;
	private int intervaloEntreDoses;
	private int faixaEtariaInicial;
	private int faixaEtariaFinal;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
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
