package it.alfasoft.rossella.EsempioRest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import it.alfasoft.rossella.dao.DipendenteDao;
import it.alfasoft.rossella.model.Dipendente;

@Path("dipendenti")
public class RisorsaDipendente {
	
	private DipendenteDao dDao = new DipendenteDao();
	
//	@Path("/{codiceAziendale}")
//	@GET
//	@Produces(MediaType.APPLICATION_XML)
//	public Dipendente prendiDipendenteConCodice(@PathParam("codiceAziendale") String codiceAziendale ){
//		
//		return dDao.getMappaDipendenti().get(codiceAziendale);
//		
//	}
//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	public List<Dipendente> prendiDipendenti(){
//		
//		
//		return new ArrayList<Dipendente>(dDao.getMappaDipendenti().values());
//		
//	}
//	@Path("/{num}")
//	@GET
//	@Produces(MediaType.TEXT_PLAIN)
//	public String testCoversione(@PathParam("num") long num){
//		
//		
//		return num+" "+(num+num);
//		
//	}
	
	@Path("/{codiceAziendale}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Dipendente prendiDipendenteConCodice(@PathParam("codiceAziendale") String codiceAziendale ){
		
		return dDao.getMappaDipendenti().get(codiceAziendale);
		
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public void aggiungiDipendente(Dipendente d){
		
		dDao.getMappaDipendenti().put(d.getCodiceAziendale(), d);
		System.out.println(d.getNome()+" "+d.getCognome());
		
	}
	
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	public void aggiornaDipendente(Dipendente d2){
		
		dDao.getMappaDipendenti().put(d2.getCodiceAziendale(), d2);
		
		for(Dipendente d : dDao.getMappaDipendenti().values()){
			
			System.out.println(d.getNome()+" "+d.getCognome());
		}
		
	}
	@Path("/{codiceAziendale}")
	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	public void eliminaDipendente(@PathParam("codiceAziendale") String codice){
		
		Dipendente d1 = dDao.getMappaDipendenti().remove(codice);
		
			System.out.println(d1.getNome()+" "+d1.getCognome());
		
	}
	

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Dipendente testPrendereQueryParam(@QueryParam("codice") String codiceAziendale,  
			                                   @QueryParam("num") int n){
		
		System.out.println("Valore ricevuto="+ n);
		return dDao.getMappaDipendenti().get(codiceAziendale);
		
	}
}
