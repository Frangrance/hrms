package kk.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="Users")
public class User {
	
	@Id
	@GeneratedValue
	@Column(name="Id")
	private int id;
	
	@Column(name="Email",unique=true)
	private String email;
	
	@Column(name="Password")
	private String password;
	
	@Column(name="EmailVerified")
	private boolean emailVerified;
}
