package web.practicas.demo.model;


import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity

public class TieneTexto {
	
	@Id
	Long id_tTexto;
	@OneToOne
	Proyecto proyectofk;

	@OneToOne
	Atributo fkatributo;

}
