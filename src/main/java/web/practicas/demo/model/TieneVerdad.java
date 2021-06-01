package web.practicas.demo.model;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity

public class TieneVerdad {
	@Id
	Long id_tNumeros;
	@OneToOne
	Proyecto proyectofk;

	@OneToOne
	Atributo fkatributo;

}
