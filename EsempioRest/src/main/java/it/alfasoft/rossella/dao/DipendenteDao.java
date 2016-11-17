package it.alfasoft.rossella.dao;

import it.alfasoft.rossella.model.Dipendente;

import java.util.Map;
import java.util.TreeMap;

public class DipendenteDao {
	
	private Map<String,Dipendente> mappaDipendenti;

	

	public DipendenteDao() {
		
		mappaDipendenti = new TreeMap<String,Dipendente>();
		
		Dipendente d1 = new Dipendente("Mario","Ferri",1500,"4oog");
		Dipendente d2 = new Dipendente("Serena","fff",1700,"87s");
		Dipendente d3 = new Dipendente("Marti","uuu",2500,"98oa");
		Dipendente d4 = new Dipendente("Mirco","jjj",8700,"po7f");
		Dipendente d5 = new Dipendente("Roberto","ooo",8500,"423d");
		
		mappaDipendenti.put(d1.getCodiceAziendale(), d1);
		mappaDipendenti.put(d2.getCodiceAziendale(), d2);
		mappaDipendenti.put(d3.getCodiceAziendale(), d3);
		mappaDipendenti.put(d4.getCodiceAziendale(), d4);
		mappaDipendenti.put(d5.getCodiceAziendale(), d5);
		
	}

	public Map<String, Dipendente> getMappaDipendenti() {
		return mappaDipendenti;
	}

	public void setMappaDipendenti(Map<String, Dipendente> mappaDipendenti) {
		this.mappaDipendenti = mappaDipendenti;
	}
	
	

}
