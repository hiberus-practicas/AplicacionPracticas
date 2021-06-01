package web.practicas.demo.model;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity

public class TieneFecha {
	@Id
	@OneToOne
	Proyecto proyectofk;
	@Id
	@OneToOne
	Atributo fkatributo;


}
