package web.practicas.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuarios {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_Usuario")
	public Long Id;
	@Column(name = "email",unique=true)
	String email;
	@Column(name = "Username", unique = true)
	String username;
	@Column(name = "password")
	String pass;
	
	

	public Usuarios(Long id, String email, String pass,String username) {
		this.username=username;
		this.email = email;
		this.pass = pass;
	}

	public Usuarios() {

	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

}
