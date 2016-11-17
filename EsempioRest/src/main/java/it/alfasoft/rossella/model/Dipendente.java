package it.alfasoft.rossella.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Dipendente {
	
	private String nome;
	private String cognome;
	private double stipendio;
	private String codiceAziendale;
	
	
	public Dipendente() {
		
	}



	public Dipendente(String nome, String cognome, double stipendio,String codiceAziendale) {
		
		this.nome = nome;
		this.cognome = cognome;
		this.stipendio = stipendio;
		this.codiceAziendale = codiceAziendale;
	}



	public String getCodiceAziendale() {
		return codiceAziendale;
	}



	public void setCodiceAziendale(String codiceAziendale) {
		this.codiceAziendale = codiceAziendale;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getCognome() {
		return cognome;
	}



	public void setCognome(String cognome) {
		this.cognome = cognome;
	}



	public double getStipendio() {
		return stipendio;
	}



	public void setStipendio(double stipendio) {
		this.stipendio = stipendio;
	}
	
	
	
}
