package model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class DiaDaSemana {

	@Id
	private int id;
	private String dia;
	@OneToMany
	private List<refeicao> refei;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public List<refeicao> getRefei() {
		return refei;
	}
	public void setRefei(List<refeicao> refei) {
		this.refei = refei;
	}
	public DiaDaSemana() {}
	
	
	
}
