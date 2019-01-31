package br.com.jwtangular.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import br.com.jwtangular.enums.ProfileEnum;

/**
 * The persistent class for the "USER" database table.
 * 
 */
@Entity
@Table(name = "USUARIO")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Long id;

	@NotBlank(message = "Email requerido")
	@Email(message = "Email inválido")
	private String email;

	private String password;

	@Enumerated(EnumType.STRING)
	@Column(name = "PERFIL")
	private ProfileEnum profile;

	public User() {
	}

	public User(Long id, @NotBlank(message = "Email requerido") @Email(message = "Email inválido") String email, String password, ProfileEnum profile) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.profile = profile;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public ProfileEnum getProfile() {
		return this.profile;
	}

	public void setProfile(ProfileEnum profile) {
		this.profile = profile;
	}

}